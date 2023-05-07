import os
from tkinter.simpledialog import askfloat
import sys
import numpy as np
import pygame
from pygame.locals import K_ESCAPE, KEYDOWN, MOUSEBUTTONUP, QUIT, K_p

WHITE = (255, 255, 255)
BOARDCOLOR = (206, 148, 90)
BLACK = (0, 0, 0)
SHOW_HITBOXES = False

class Spot(pygame.sprite.Sprite):
    def __init__(self, array_indexes, location, size, color):
        super(Spot, self).__init__()
        self.surf = pygame.Surface(size)
        self.surf.fill(color)

        self.location = location
        self.array_indexes = array_indexes
        self.occupied = False
        self.color = None

class Main:
    def __init__(self, komi=2.5):
        pygame.init()

        SCREEN_WIDTH = 800
        SCREEN_HEIGHT = 600

        self.sprites = pygame.sprite.Group()
        self.sprite_array = [[0 for _ in range(19)] for _ in range(19)]

        self.screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))

        pygame.display.set_caption('Go Chess | It\'s Black\'s move!')
        pygame.display.set_allow_screensaver(True)

        if os.path.exists('./iconFile.png'):
            pygame.display.set_icon(pygame.image.load('./iconFile.png'))

        self.move = 0
        self.white_move = False

        self.passed_in_a_row = 0
        self.gameover = False
        
        self.komi = komi
    
    def printLog(self, message, message_type='info'):
        if self.gameover:
            msg = f'[INFO]    Game is over, stopping logging messages.'
        elif message_type == 'info':
            msg = f'[INFO]    {message}'
        elif message_type == 'error':
            msg = f'[ERROR]   {message}'
        elif message_type == 'config':
            msg = f'[CONFIG]  {message}'
        
        print(msg)

    def run(self):
        
        self.generateSpriteLocations()
        self.addSprites()

        running = True

        while running:
            for event in pygame.event.get():
                self.screen.fill(BOARDCOLOR)

                self.drawGrid()
                self.drawSprites()

                if event.type == MOUSEBUTTONUP:
                    pos = pygame.mouse.get_pos()
                    self.printLog(f'Position clicked: {pos}', 'info')

                    clicked_sprites = [sprite for sprite in self.sprites if self.spriteCollided(sprite.location, pos)]

                    if clicked_sprites and not self.gameover:
                        self.printLog('Sprite detected.', 'info')
                        clicked_sprite = clicked_sprites[0]

                        if not clicked_sprite.occupied:
                            self.move += 1
                            color = BLACK if self.move % 2 else WHITE

                            self.printLog(f'Clicked sprite\'s location: {clicked_sprite.location}', 'info')

                            x, y = clicked_sprite.location
                            loc = (x + 1, y)

                            pygame.draw.circle(self.screen, color, loc, 10, 0)

                            clicked_sprite.occupied = True
                            clicked_sprite.color = color
                            
                            self.capturePieces(*clicked_sprite.array_indexes)

                            if not clicked_sprite.occupied:
                                self.move -= 1
                                self.white_move = True if not self.white_move else False

                            else:
                                self.passed_in_a_row = 0

                                person = 'Black' if not self.move % 2 else 'White'
                                pygame.display.set_caption(f'Go Chess | It\'s {person}\'s move!')

                    else:
                        self.printLog('No sprite detected.', 'info')

                    print()

                elif event.type == KEYDOWN:
                    if event.key == K_ESCAPE:
                        running = False
                        
                    elif event.key == K_p:
                        player = 'White' if not self.move % 2 else 'Black'

                        self.printLog(f'{player} passed a move.', 'info')
                        self.passMove()

                elif event.type == QUIT:
                    running = False
                    
            
            pygame.display.update()
        #pygame.quit()
        #sys.exit()   
        
        

    def drawGrid(self):
        for y_pos in range(10, 551, 30):
            pygame.draw.line(self.screen, BLACK, (10, y_pos), (551, y_pos), width=2)
        
        for x_pos in range(10, 551, 30):
            pygame.draw.line(self.screen, BLACK, (x_pos, 10), (x_pos, 551), width=2)

        star_spots = \
            [
                (100, 100),
                (100, 280),
                (100, 460),        

                (280, 100),
                (280, 280),
                (280, 460),

                (460, 100),
                (460, 280),
                (460, 460)
            ]
        
        for location in star_spots:
            x, y = location
            loc = (x + 1, y)

            pygame.draw.circle(self.screen, BLACK, loc, 5, width=0)

    def drawSprites(self):
        for entity in self.sprites:
            if SHOW_HITBOXES:
                self.screen.blit(entity.surf, entity.location)
            if entity.occupied:
                x, y = entity.location
                loc = (x+1, y)
                pygame.draw.circle(self.screen, entity.color, loc, 10, 0)

    def generateSpriteLocations(self):
        locations = []

        for y_index, y_pos in enumerate(range(10, 551, 30)):
            for x_index, x_pos in enumerate(range(10, 551, 30)):
                locations.append([[y_index, x_index], [y_pos, x_pos]])
        
        self.locations = locations
    
    def addSprites(self):
        row = 0
        item = 0

        for location in self.locations:
            if item >= 19:
                row += 1
                item = 0
            if row > 18:
                break
            
            sprite = Spot(*location, (10, 10), (255, 32, 1))
            self.sprites.add(sprite)
            self.sprite_array[item][row] = sprite

            item += 1
        
    def spriteCollided(self, sprite_location, clicked_location):        
        sprite_y, sprite_x = sprite_location
        clicked_y, clicked_x = clicked_location

        if sprite_y - 10 < clicked_y < sprite_y + 10:
            if sprite_x - 10 < clicked_x < sprite_x + 10:
                return True
        
        return False
        
    def passMove(self):
        self.passed_in_a_row += 1
        if self.passed_in_a_row == 2:
            self.gameOver()
            return

        self.move += 1
        self.white_move = True if not self.white_move else False

        person = 'Black' if not self.move % 2 else 'White'
        pygame.display.set_caption(f'Go Chess | It\'s {person}\'s move!')
    
    def gameOver(self):
        person_won = self.calculateWhoWon()
        won_string = f'Go Chess | {person_won} won!'

        pygame.display.set_caption(won_string)

        self.gameover = True

    def calculateWhoWon(self):
        white_score = self.komi
        black_score = 0

        white_on_board, black_on_board = self.findPiecesOnBoard()
        white_surrounded, black_surrounded = self.calculateSurroundedSpots()

        white_score += white_on_board
        black_score += black_on_board

        white_score += white_surrounded
        black_score += black_surrounded
        
        print()
        self.printLog('ENDING SCORES:', 'info')
        self.printLog(f'{white_surrounded=}, {black_surrounded=}', 'info')
        self.printLog(f'{white_on_board=}, {black_on_board=}', 'info')
        self.printLog(f'{white_score=}, {black_score=}', 'info')
        print()

        if white_score > black_score:
            return 'White'
        else:
            return 'Black'
        
    def findPiecesOnBoard(self):
        white_count = 0
        black_count = 0

        for row in self.sprite_array:
            for item in row:
                if not item.occupied:
                    continue

                color = item.color

                if color == WHITE:
                    white_count += 1
                else:
                    black_count += 1

        return (white_count, black_count)
    
    def calculateSurroundedSpots(self):
        white_count = 0
        black_count = 0
        
        self.empty_groups = []
        self.empty_counts = []
        self.empty_colors = []

        self.visited = []        

        for y, row in enumerate(self.sprite_array):
            for x, sprite in enumerate(row):
                if sprite.occupied:
                    continue
                
                self.findEmptyLocations(y, x)

        for index in range(len(self.empty_colors)):
            empty_count = self.empty_counts[index]
            empty_colors = self.empty_colors[index]

            if BLACK not in empty_colors and WHITE in empty_colors:
                white_count += empty_count
            if WHITE not in empty_colors and BLACK in empty_colors:
                black_count += empty_count
        
        return (white_count, black_count)
    
    def findEmptyLocations(self, y, x, adding=False):
        if not adding:
            self.empty_groups.append([])
            self.empty_counts.append(0)
            self.empty_colors.append([])

        neighbors = self.getNeighbors(y, x, (19, 19))
        neighbors.append((y, x))

        for location in neighbors:
            sprite = self.sprite_array[location[0]][location[1]]
        
            if sprite.occupied or sprite in self.visited:
                continue

            self.visited.append(sprite)
            self.empty_groups[-1].append(location)
            self.empty_counts[-1] += 1
            self.empty_colors[-1] += self.getNonEmptyColorsOfNeighbors(y, x)

            self.findEmptyLocations(location[0], location[1], adding=True)
    
    def getNonEmptyColorsOfNeighbors(self, y, x):
        colors = []

        neighbors = self.getNeighbors(y, x, (19, 19))
        for location in neighbors:
            sprite = self.sprite_array[location[0]][location[1]]
            if not sprite.occupied:
                continue
            colors.append(sprite.color)
        
        return colors
    
    def testGroup(self, board, opponent_board, y, x, current_group):
        """ Assume the current group is captured. Find it via flood fill
        and if an empty neighboor is encountered, break (group is alive).

        board - 19x19 array of player's stones
        opponent_board - 19x19 array of opponent's stones
        x,y - position to test
        current_group - tested stones in player's color

        """

        pos = (y,x)

        if current_group[pos]:
            # already tested stones are no liberties
            return False

        if opponent_board[pos]:
            current_group[pos] = True
            neighbors = self.getNeighbors(y,x,board.shape)

            for yn, xn in neighbors:
                has_liberties = self.testGroup(board, opponent_board, yn, xn, current_group)
                if has_liberties:
                    return True
            return False

        return not board[pos]

    def floodfill(self, liberties, y, x):
        """
        flood fill a region that is now known to have liberties. 1.0 signals a liberty, 0.0 signals
        undecided and -1.0 a known non-liberty (black stone)
        liberties is an np.array of currently known liberties and non-liberties
        """

        if not liberties[y][x]:
            liberties[y][x] = 1.0 
            if y > 0:
                self.floodfill(liberties, y-1, x)
            if y < liberties.shape[0] - 1:
                self.floodfill(liberties, y+1, x)
            if x > 0:
                self.floodfill(liberties, y, x-1)
            if x < liberties.shape[1] - 1:
                self.floodfill(liberties, y, x+1)

    def capturePieces(self, y, x):
        white_board = np.array([[1.0 if item.color == WHITE and item.occupied else 0.0 for item in row] for row in self.sprite_array], dtype=int)
        black_board = np.array([[1.0 if item.color == BLACK and item.occupied else 0.0 for item in row] for row in self.sprite_array], dtype=int)

        white_move = self.white_move
        self.white_move = True if not self.white_move else False

        resulting_board = self.fastCapturePieces(black_board, white_board, white_move, y, x)

        for index1, row in enumerate(resulting_board):
            for index2, item in enumerate(row):
                color = WHITE if item == 1 else BLACK
                occupied = True if item != 0 else False

                self.sprite_array[index1][index2].occupied = occupied
                self.sprite_array[index1][index2].color = color

    def fastCapturePieces(self, black_board_, white_board_, turn_white, y,x):
        """Remove all pieces from the board that have no liberties.
        black_board is a 19x19 np.array with value 1.0 if a black stone is
        present and 0.0 otherwise.

        white_board is a 19x19 np.array similar to black_board.

        active_player - the player that made a move
        (x,y) - position of the move

        """

        black_board, white_board = black_board_.copy(), white_board_.copy()

        # only test neighbors of current move (other's will have unchanged
        # liberties)
        neighbors = self.getNeighbors(y, x, black_board.shape)

        board = white_board if turn_white else black_board
        opponent_board = black_board if turn_white else white_board

        original_opponent_board = opponent_board.copy()

        # to test suicidal moves
        original_pos = (y, x)
        original_pos = original_pos[::-1]

        # testing suicides

        current_group = np.zeros((19,19), dtype=bool)
        original_pos_has_liberties = self.testGroup(opponent_board, board, *original_pos, current_group)

        # only test adjacent stones in opponent's color
        for pos in neighbors:
            pos = pos[::-1]

            if not opponent_board[pos]:
                continue

            current_group = np.zeros((19,19), dtype=bool)
            has_liberties = self.testGroup(board, opponent_board, *pos, current_group)

            if not has_liberties:
                opponent_board[current_group] = False

        same = True
        break_out = False

        for row_index, row in enumerate(original_opponent_board):
            for item_index, item in enumerate(row):
                if opponent_board[row_index, item_index] != item:
                    same = False
                    break_out = True
                    break
            if break_out:
                break

        out_board = [[i for i in range(19)] for v in range(19)]
        for i in range(19):
            for v in range(19):
                if white_board[i][v]:
                    out_board[i][v] = 1
                elif black_board[i][v]:
                    out_board[i][v] = -1
                else:
                    out_board[i][v] = 0

        if same and not original_pos_has_liberties:
            out_board[original_pos[0]][original_pos[1]] = 0

            return out_board
        else:       
            return out_board

    def getNeighbors(self, y, x, board_shape):
        neighbors = list()

        if y > 0:
            neighbors.append((y-1,x))
        if y < board_shape[0] - 1:
            neighbors.append((y+1,x))
        if x > 0:
            neighbors.append((y,x-1))
        if x < board_shape[1] - 1:
            neighbors.append((y,x+1))

        return neighbors

if __name__ == '__main__':
    komi = askfloat(title='Go Chess', prompt='Enter a komi value:', minvalue=0, maxvalue=100, initialvalue=2.5)
    app = Main(komi=komi)
    app.run()
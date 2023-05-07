import pygame
import sys

# Inicializar pygame
pygame.init()

# Crear una ventana de 800x600 píxeles
screen = pygame.display.set_mode((800, 600))

# Crear un título para la ventana
pygame.display.set_caption("Juego de Go")

# Crear una fuente para el texto
font = pygame.font.SysFont("Arial", 32)

# Crear un color blanco
white = (255, 255, 255)

# Crear un color negro
black = (0, 0, 0)

# Crear un color gris
gray = (128, 128, 128)

# Crear una clase para los botones
class Button(pygame.sprite.Sprite):
    def __init__(self, x, y, width, height, text, color):
        # Llamar al constructor de la clase padre
        pygame.sprite.Sprite.__init__(self)
        # Crear una imagen para el botón con el color dado
        self.image = pygame.Surface((width, height))
        self.image.fill(color)
        # Crear un rectángulo para el botón con la posición y el tamaño dados
        self.rect = self.image.get_rect()
        self.rect.x = x
        self.rect.y = y
        # Crear un texto para el botón con la fuente y el color dados
        self.text = font.render(text, True, white)
        # Centrar el texto en el botón
        self.text_rect = self.text.get_rect()
        self.text_rect.center = self.rect.center

    def draw(self):
        # Dibujar el botón en la pantalla
        screen.blit(self.image, self.rect)
        # Dibujar el texto en el botón
        screen.blit(self.text, self.text_rect)

# Crear un grupo de sprites para los botones
buttons = pygame.sprite.Group()

# Crear un botón para jugar contra otro jugador
button1 = Button(300, 200, 200, 50, "Jugar contra otro jugador", gray)
buttons.add(button1)

# Crear un botón para jugar contra el bot
button2 = Button(300, 300, 200, 50, "Jugar contra el bot", gray)
buttons.add(button2)

# Crear un botón para salir del juego
button3 = Button(300, 400, 200, 50, "Salir del juego", gray)
buttons.add(button3)

# Crear un texto para el título del juego
title = font.render("Juego de Go", True, white)
title_rect = title.get_rect()
title_rect.center = (400, 100)

# Crear un bucle principal
running = True
while running:
    # Procesar los eventos del usuario
    for event in pygame.event.get():
        # Si el usuario cierra la ventana
        if event.type == pygame.QUIT:
            # Salir del bucle principal
            running = False
            # Salir del programa
            sys.exit()
        # Si el usuario hace clic con el ratón
        if event.type == pygame.MOUSEBUTTONDOWN:
            # Obtener la posición del ratón
            mouse_pos = pygame.mouse.get_pos()
            # Si el ratón está sobre el primer botón
            if button1.rect.collidepoint(mouse_pos):
                # Iniciar una partida contra otro jugador
                print("Iniciar una partida contra otro jugador")
            # Si el ratón está sobre el segundo botón
            if button2.rect.collidepoint(mouse_pos):
                # Iniciar una partida contra el bot
                print("Iniciar una partida contra el bot")
            # Si el ratón está sobre el tercer botón
            if button3.rect.collidepoint(mouse_pos):
                # Salir del bucle principal
                running = False
                # Salir del programa
                sys.exit()

    # Rellenar la pantalla con color negro
    screen.fill(black)

    # Dibujar el título del juego en la pantalla
    screen.blit(title, title_rect)

    # Dibujar los botones en la pantalla
    buttons.draw(screen)

    # Actualizar la pantalla
    pygame.display.flip()
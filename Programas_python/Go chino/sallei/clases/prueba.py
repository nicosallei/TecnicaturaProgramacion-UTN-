import os
from tkinter.simpledialog import askfloat
import sys
import numpy as np
import pygame
from pygame.locals import K_ESCAPE, KEYDOWN, MOUSEBUTTONUP, QUIT, K_p

BLANCO = (255, 255, 255)
COLORTABLERO = (206, 148, 90)
NEGRO = (0, 0, 0)
MOSTRAR_HITBOXES = False

class Punto(pygame.sprite.Sprite):
    def __init__(self, indices_array, ubicacion, tamaño, color):
        super(Punto, self).__init__()
        self.surf = pygame.Surface(tamaño)
        self.surf.fill(color)

        self.ubicacion = ubicacion
        self.indices_array = indices_array
        self.ocupado = False
        self.color = None



class Principal():     
    def __init__(self, komi=2.5):
        pygame.init()

        ANCHO_PANTALLA = 563
        ALTO_PANTALLA = 563

        self.sprites = pygame.sprite.Group()
        self.arreglo_sprites = [[0 for _ in range(19)] for _ in range(19)]

        self.pantalla = pygame.display.set_mode((ANCHO_PANTALLA, ALTO_PANTALLA))

        pygame.display.set_caption('Go Chess | ¡Es el turno de las negras!')
        pygame.display.set_allow_screensaver(True)

        if os.path.exists('./iconFile.png'):
          pygame.display.set_icon(pygame.image.load('./iconFile.png'))

        self.movimiento = 0
        self.movimiento_blanco = False

        self.pasando_en_fila = 0
        self.fin_del_juego = False
        
        self.komi = komi        
            
            
    def ejecutar(self):
        
        self.generarUbicacionesSprites()
        self.agregarSprites()

        ejecutando = True

        while ejecutando:
            for evento in pygame.event.get():
                self.pantalla.fill(COLORTABLERO)

                self.dibujarTablero()
                self.dibujarSprites()

                if evento.type == MOUSEBUTTONUP:
                    pos = pygame.mouse.get_pos()
                    self.imprimir(f'Posición clickeada: {pos}', 'info')

                    sprites_click = [sprite for sprite in self.sprites if self.colisionSprite(sprite.ubicacion, pos)]

                    if sprites_click and not self.fin_del_juego:
                        self.imprimir('Sprite detectado.', 'info')
                        sprite_click = sprites_click[0]

                        if not sprite_click.ocupado:
                            self.movimiento += 1
                            color = NEGRO if self.movimiento % 2 else BLANCO

                            self.imprimir(f'Ubicación del sprite click: {sprite_click.ubicacion}', 'info')

                            x, y = sprite_click.ubicacion
                            ubicacion = (x + 1, y)

                            pygame.draw.circle(self.pantalla, color, ubicacion, 10, 0)

                            sprite_click.ocupado = True
                            sprite_click.color = color
                            
                            self.capturarPiezas(*sprite_click.indices_array)

                            if not sprite_click.ocupado:
                                self.movimiento -= 1
                                self.movimiento_blanco = True if not self.movimiento_blanco else False

                            else:
                                self.pasando_en_fila = 0

                                persona = 'Negras' if not self.movimiento % 2 else 'Blancas'
                                pygame.display.set_caption(f'Go Chess | ¡Es el turno de {persona}!')

                    else:
                        self.imprimir('No se detectó ningún sprite.', 'info')

                    print()

                elif evento.type == KEYDOWN:
                    if evento.key == K_ESCAPE:
                        ejecutando = False
                        
                elif evento.key == K_p:
                    jugador = 'Blancas' if not self.movimiento % 2 else 'Negras'

                    self.imprimir(f'{jugador} ha pasado su turno.', 'info')
                    self.pasarTurno()

                elif evento.type == QUIT:
                    ejecutando = False
            
            pygame.display.update()
        
        #pygame.quit()       
        
        
    def dibujarTablero(self):
        for y_pos in range(10, 551, 30):
            pygame.draw.line(self.pantalla, NEGRO, (10, y_pos), (551, y_pos), width=2)
        
        for x_pos in range(10, 551, 30):
            pygame.draw.line(self.pantalla, NEGRO, (x_pos, 10), (x_pos, 551), width=2)

        posiciones_estrella = \
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
        
        for ubicacion in posiciones_estrella:
            x, y = ubicacion
            loc = (x + 1, y)

            pygame.draw.circle(self.pantalla, NEGRO, loc, 5, width=0)    
        
    
    def dibujarSprites(self):
        for entidad in self.sprites:
            if MOSTRAR_HITBOXES:
                self.pantalla.blit(entidad.surf, entidad.ubicacion)
            if entidad.ocupado:
                x, y = entidad.ubicacion
                ubicacion = (x+1, y)
                pygame.draw.circle(self.pantalla, entidad.color, ubicacion, 10, 0)
    
    
        
    def generarUbicacionesSprites(self):
        ubicaciones = []

        for indice_y, y_pos in enumerate(range(10, 551, 30)):
            for indice_x, x_pos in enumerate(range(10, 551, 30)):
                ubicaciones.append([[indice_y, indice_x], [y_pos, x_pos]])
        
        self.ubicaciones = ubicaciones    
    

    
    def pasarTurno(self):
        self.pasando_en_fila += 1
        if self.pasando_en_fila == 2:
            self.FinPartida()
            return

        self.movimiento += 1
        self.movimiento_blanco = True if not self.movimiento_blanco else False

        persona = 'Negras' if not self.movimiento % 2 else 'Blancas'
        pygame.display.set_caption(f'Go Chess | ¡Es el turno de {persona}!')
    
    
    def agregarSprites(self):
        fila = 0
        elemento = 0

        for ubicacion in self.ubicaciones:
            if elemento >= 19:
                fila += 1
                elemento = 0
            if fila > 18:
                break
            
            sprite = Punto(*ubicacion,(10,10),(255, 32, 1))
            self.sprites.add(sprite)
            self.arreglo_sprites[elemento][fila] = sprite

            elemento += 1
         
        
    def colisionSprite(self, ubicacion_sprite, ubicacion_clic):
        sprite_y, sprite_x = ubicacion_sprite
        clic_y, clic_x = ubicacion_clic

        if sprite_y - 10 < clic_y < sprite_y + 10:
            if sprite_x - 10 < clic_x < sprite_x + 10:
                return True
        
        return False 
     
   
              

    
    
    def FinPartida(self):
        persona_gano = self.calcularQuienGano()
        mensaje_ganador = f'Go Chess | ¡{persona_gano} ha ganado!'

        pygame.display.set_caption(mensaje_ganador)

        self.fin_del_juego = True

    def calcularQuienGano(self):
        puntaje_blanco = self.komi
        puntaje_negro = 0

        blancas_en_tablero, negras_en_tablero = self.encontrarPiezasEnTablero()
        blancas_capturadas, negras_capturadas = self.calcularCasillasRodeadas()

        puntaje_blanco += blancas_en_tablero
        puntaje_negro += negras_en_tablero

        puntaje_blanco += blancas_capturadas
        puntaje_negro += negras_capturadas
        
        print()
        self.imprimir('PUNTAJES FINALES:', 'info')
        self.imprimir(f'{blancas_capturadas=}, {negras_capturadas=}', 'info')
        self.imprimir(f'{blancas_en_tablero=}, {negras_en_tablero=}', 'info')
        self.imprimir(f'{puntaje_blanco=}, {puntaje_negro=}', 'info')
        print()

        if puntaje_blanco > puntaje_negro:
            return 'Blancas'
        else:
            return 'Negras'
    
    def encontrarPiezasEnTablero(self):
        cantidad_blancas = 0
        cantidad_negras = 0

        for fila in self.arreglo_sprites:
            for elemento in fila:
                if not elemento.ocupado:
                    continue

            color = elemento.color

            if color == BLANCO:
                cantidad_blancas += 1
            else:
                cantidad_negras += 1

        return (cantidad_blancas, cantidad_negras)

    def calcularCasillasRodeadas(self):
        cantidad_blancas = 0
        cantidad_negras = 0
    
        self.grupos_vacios = []
        self.cuentas_vacias = []
        self.colores_vacios = []

        self.visitados = []        

        for y, fila in enumerate(self.arreglo_sprites):
            for x, sprite in enumerate(fila):
                if sprite.ocupado:
                    continue
            
                self.encontrarCasillasVacias(y, x)

        for indice in range(len(self.colores_vacios)):
            cuenta_vacia = self.cuentas_vacias[indice]
            colores_vacios = self.colores_vacios[indice]

            if NEGRO not in colores_vacios and BLANCO in colores_vacios:
                cantidad_blancas += cuenta_vacia
            if BLANCO not in colores_vacios and NEGRO in colores_vacios:
                cantidad_negras += cuenta_vacia
    
        return (cantidad_blancas, cantidad_negras)

    def encontrarCasillasVacias(self, y, x, agregando=False):
        if not agregando:
            self.grupos_vacios.append([])
            self.cuentas_vacias.append(0)
            self.colores_vacios.append([])

        vecinos = self.obtenerVecinos(y, x, (19, 19))
        vecinos.append((y, x))

        for ubicacion in vecinos:
            sprite = self.arreglo_sprites[ubicacion[0]][ubicacion[1]]
    
            if sprite.ocupado or sprite in self.visitados:
                continue

            self.visitados.append(sprite)
            self.grupos_vacios[-1].append(ubicacion)
            self.cuentas_vacias[-1] += 1
            self.colores_vacios[-1] += self.obtenerColoresNoVaciosDeVecinos(y, x)

            self.encontrarCasillasVacias(ubicacion[0], ubicacion[1], agregando=True)

    def obtenerColoresNoVaciosDeVecinos(self, y, x):
        colores = []

        vecinos = self.obtenerVecinos(y, x, (19, 19))
        for ubicacion in vecinos:
            sprite = self.arreglo_sprites[ubicacion[0]][ubicacion[1]]
            if not sprite.ocupado:
                continue
            colores.append(sprite.color)
    
        return colores

    def probarGrupo(self, tablero, tablero_oponente, y, x, grupo_actual):
        #  Suponer que el grupo actual está capturado. Encontrarlo mediante un recorrido de inundación
        # y si se encuentra una casilla vacía vecina, romper (el grupo está vivo).

        # tablero: matriz de 19x19 de piedras del jugador
        # tablero_oponente: matriz de 19x19 de piedras del oponente
        # x, y: posición a probar
        # grupo_actual: piedras probadas en el color del jugador

        

        pos = (y, x)

        if grupo_actual[pos]:
            # las piedras ya probadas
            return False
        if tablero_oponente[pos]:
            grupo_actual[pos] = True
            vecinos = self.obtenerVecinos(y, x, tablero.shape)

            for yn, xn in vecinos:
                tiene_libertades = self.probarGrupo(tablero, tablero_oponente, yn, xn, grupo_actual)
                if tiene_libertades:
                    return True
            return False

        return not tablero[pos]

    def rellenarInundacion(self, libertades, y, x):
        
        # Rellena de forma recursiva una región que se sabe que tiene libertades.
        # 1.0 indica una libertad, 0.0 indica sin decidir y -1.0 indica una no libertad conocida (piedra negra).
        # `libertades` es una matriz np.array de libertades y no libertades conocidas actualmente.
        

        if not libertades[y][x]:
            libertades[y][x] = 1.0 
            if y > 0:
                self.rellenarInundacion(libertades, y-1, x)
            if y < libertades.shape[0] - 1:
                self.rellenarInundacion(libertades, y+1, x)
            if x > 0:
                self.rellenarInundacion(libertades, y, x-1)
            if x < libertades.shape[1] - 1:
                self.rellenarInundacion(libertades, y, x+1)

    def capturarPiezas(self, y, x):
        tablero_blanco = np.array([[1.0 if elemento.color == BLANCO and elemento.ocupado else 0.0 for elemento in fila] for fila in self.arreglo_sprites], dtype=int)
        tablero_negro = np.array([[1.0 if elemento.color == NEGRO and elemento.ocupado else 0.0 for elemento in fila] for fila in self.arreglo_sprites], dtype=int)

        movimiento_blanco = self.movimiento_blanco
        self.movimiento_blanco = True if not self.movimiento_blanco else False

        tablero_resultante = self.capturarPiezasRapido(tablero_negro, tablero_blanco, movimiento_blanco, y, x)

        for indice1, fila in enumerate(tablero_resultante):
            for indice2, elemento in enumerate(fila):
                color = BLANCO if elemento == 1 else NEGRO
                ocupado = True if elemento != 0 else False

                self.arreglo_sprites[indice1][indice2].ocupado = ocupado
                self.arreglo_sprites[indice1][indice2].color = color

    def capturarPiezasRapido(self, tablero_negro_, tablero_blanco_, turno_blanco, y, x):
        # Eliminar todas las piezas del tablero que no tienen libertades.
        # tablero_negro es una matriz np.array de tamaño 19x19 con valor 1.0 si hay una piedra negra presente
        # y 0.0 en caso contrario.

        # tablero_blanco es una matriz np.array de tamaño 19x19 similar a tablero_negro.

        # turno_blanco: el jugador que hizo un movimiento
        # (x, y): posición del movimiento
        

        tablero_negro, tablero_blanco = tablero_negro_.copy(), tablero_blanco_.copy()

        # Solo probar vecinos del movimiento actual (los demás no tendrán libertades cambiadas)
        vecinos = self.obtenerVecinos(y, x, tablero_negro.shape)

        tablero = tablero_blanco if turno_blanco else tablero_negro
        tablero_oponente = tablero_negro if turno_blanco else tablero_blanco

        tablero_oponente_original = tablero_oponente.copy()

        # Para probar movimientos suicidas
        pos_original = (y, x)
        pos_original = pos_original[::-1]

        # Probar suicidios

        grupo_actual = np.zeros((19, 19), dtype=bool)
        pos_original_tiene_libertades = self.probarGrupo(tablero_oponente, tablero, *pos_original, grupo_actual)

        # Solo probar piedras adyacentes en el color del oponente
        for pos in vecinos:
            pos = pos[::-1]

            if not tablero_oponente[pos]:
                continue

            grupo_actual = np.zeros((19, 19), dtype=bool)
            tiene_libertades = self.probarGrupo(tablero, tablero_oponente, *pos, grupo_actual)

            if not tiene_libertades:
                tablero_oponente[grupo_actual] = False

        mismo = True
        break_out = False

        for indice_fila, fila in enumerate(tablero_oponente_original):
            for indice_item, item in enumerate(fila):
                if tablero_oponente[indice_fila, indice_item] != item:
                    mismo = False
                    break_out = True
                    break
            if break_out:
                break

        tablero_salida = [[i for i in range(19)] for v in range(19)]
        for i in range(19):
            for v in range(19):
                if tablero_blanco[i][v]:
                    tablero_salida[i][v] = 1
                elif tablero_negro[i][v]:
                    tablero_salida[i][v] = -1
                else:
                    tablero_salida[i][v] = 0

        if mismo and not pos_original_tiene_libertades:
            tablero_salida[pos_original[0]][pos_original[1]] = 0

            return tablero_salida
        else:
            return tablero_salida

    def obtenerVecinos(self, y, x, forma_tablero):
        vecinos = list()

        if y > 0:
            vecinos.append((y - 1, x))
        if y < forma_tablero[0] - 1:
            vecinos.append((y + 1, x))
        if x > 0:
                vecinos.append((y, x - 1))
        if x < forma_tablero[1] - 1:
            vecinos.append((y, x + 1))

        return vecinos



    
 
        
        
    
    
    # indica si mueve el jugador blanco o negr, dependiento del movimiento si es par o impar para poder saber quien mueve
    # def passMove(self):
        
    #     self.move += 1
    #     #self.white_move = True if not self.white_move else False

    #     person = 'Black' if not self.move % 2 else 'White'
               
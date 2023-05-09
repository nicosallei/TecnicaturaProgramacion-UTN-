import pygame

# Constantes
ANCHO_PANTALLA = 800
ALTO_PANTALLA = 600
ANCHO_CASILLA = 100
ALTO_CASILLA = 100
COLOR_FONDO = (255, 255, 255)
COLOR_CASILLA = (0, 0, 0)
COLOR_JUGADOR1 = (255, 0, 0)
COLOR_JUGADOR2 = (0, 0, 255)

class Juego:
    def __init__(self):
        pygame.init()
        self.pantalla = pygame.display.set_mode((ANCHO_PANTALLA, ALTO_PANTALLA))
        self.reloj = pygame.time.Clock()
        self.jugadores = pygame.sprite.Group()
        self.casillas = pygame.sprite.Group()
        self.jugador_actual = None
        self.fin_del_juego = False

    def ejecutar(self):
        self._inicializar_juego()
        while not self.fin_del_juego:
            self.reloj.tick(60)
            self._manejar_eventos()
            self._actualizar()
            self._dibujar()

        pygame.quit()

    def _inicializar_juego(self):
        self._crear_casillas()
        self._crear_jugadores()
        self.jugador_actual = self.jugadores.sprites()[0]

    def _crear_casillas(self):
        for y in range(0, ALTO_PANTALLA, ALTO_CASILLA):
            for x in range(0, ANCHO_PANTALLA, ANCHO_CASILLA):
                casilla = Casilla(x, y)
                self.casillas.add(casilla)

    def _crear_jugadores(self):
        jugador1 = Jugador(COLOR_JUGADOR1)
        jugador2 = Jugador(COLOR_JUGADOR2)
        self.jugadores.add(jugador1, jugador2)

    def _manejar_eventos(self):
        for evento in pygame.event.get():
            if evento.type == pygame.QUIT:
                self.fin_del_juego = True

    def _actualizar(self):
        self.jugadores.update()

    def _dibujar(self):
        self.pantalla.fill(COLOR_FONDO)
        self.casillas.draw(self.pantalla)
        self.jugadores.draw(self.pantalla)
        pygame.display.flip()

class Casilla(pygame.sprite.Sprite):
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface((ANCHO_CASILLA, ALTO_CASILLA))
        self.image.fill(COLOR_CASILLA)
        self.rect = self.image.get_rect()
        self.rect.x = x
        self.rect.y = y

class Jugador(pygame.sprite.Sprite):
    def __init__(self, color):
        super().__init__()
        self.image = pygame.Surface((ANCHO_CASILLA, ALTO_CASILLA))
        self.image.fill(color)
        self.rect = self.image.get_rect()

    def update(self):
        self._mover()

    def _mover(self):
        # Lógica de movimiento del jugador
        pass

if __name__ == "__main__":
    juego = Juego()
    juego.ejecutar()

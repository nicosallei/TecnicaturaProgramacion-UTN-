import pygame

WHITE=(255,255,255)

class Bola(pygame.sprite.Sprite):
    def __init__(self):
        super().__init__()
        self.image=pygame.image.load("juego/img/bola_fuego.png").convert()
        self.image.set_colorkey(WHITE)
        width=self.image.get_width()
        height=self.image.get_height()
        self.image=pygame.transform.scale(self.image,(int(width*0.08),int(height*0.08)))
        self.rect=self.image.get_rect()
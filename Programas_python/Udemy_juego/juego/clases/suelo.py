import pygame


class Suelo(pygame.sprite.Sprite):
    def __init__(self):
        super().__init__()
        self.image=pygame.image.load("juego/fondos/suelo.png").convert()
        width=self.image.get_width()
        height=self.image.get_height()
        self.image=pygame.transform.scale(self.image,(int(width*0.5),int(height*0.1)))
        
        self.rect=self.image.get_rect()
        
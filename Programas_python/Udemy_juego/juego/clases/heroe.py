from typing import Any
import pygame
WHITE=(255,255,255)

class Hero(pygame.sprite.Sprite):
    def __init__(self,position):
        self.sheet=pygame.image.load("juego/img/prueba.png").convert()
        self.sheet.set_colorkey(WHITE) #esto es para quitar el color de fondo
        self.sheet.set_clip(pygame.Rect(512,0,256,375.5))
        self.image=self.sheet.subsurface(self.sheet.get_clip())
        
        self.rect=self.image.get_rect()
        self.rect.topleft=position
        self.frame=0
        self.right_states={0:(0,0,256,375.5),1:(256,0,256,375.5),2:(512,0,256,375.5),3:(768,0,256,375.5)}
        self.left_states={0:(0,375.5,256,375.5),1:(256,375.5,256,375.5),2:(512,375.5,256,375.5),3:(768,375.5,256,375.5)}
        #self.up_states={}
        #self.down_states={}
        self.derecha=False
        self.izquierda=False
        self.disparo=False
        
    def get_frames(self,frame_set):
        self.frame +=1
        if self.frame>(len(frame_set)-1):
            self.frame=0
        return frame_set[self.frame]        
    
    def clip(self,clipped_rect):
        if type(clipped_rect) is dict:
            self.sheet.set_clip(pygame.Rect(self.get_frames(clipped_rect)))
        else:
            self.sheet.set_clip(pygame.Rect(clipped_rect))
        return clipped_rect        
    
    def update(self,direccion):
        if direccion=='left':
            self.clip(self.left_states)
            self.izquierda=True
            self.derecha=False
        
        if direccion=='right':
            self.clip(self.right_states)
            self.izquierda=False
            self.derecha=True
            
        if direccion=='stand_left':
            self.clip(self.left_states[0])
            self.izquierda=True
            self.derecha=False
        if direccion=='stand_right':
            self.clip(self.right_states[0])
            self.izquierda=False
            self.derecha=True
        self.image=self.sheet.subsurface(self.sheet.get_clip())
        
    
    def handle_event(self,event):
        
        if event.type==pygame.KEYDOWN:
            if event.key==pygame.K_LEFT:
                self.update('left')
                self.rect.x-=10
            if event.key==pygame.K_RIGHT:
                self.update('right')
                self.rect.x+=10
        if event.type==pygame.KEYUP:
            if event.key==pygame.K_LEFT:
                self.update('stand_left')
            if event.key==pygame.K_RIGHT:
                self.update('stand_right')
        
        if event.type==pygame.MOUSEBUTTONDOWN:
            self.disparo=True        
                            
                
                
                    
        
                        
        
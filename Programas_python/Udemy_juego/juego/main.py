import pygame
import sys
from clases.suelo import Suelo
from clases.heroe import Hero
from clases.lanza import Bola



#variables
ancho_pantalla=800
alto_pantalla=600
color_fondo=(34,121,153) 
size=(ancho_pantalla,alto_pantalla)
clock=pygame.time.Clock() #optimizar las animaciones

#iniciamos pygame
pygame.init() 

#crear ventana
screen=pygame.display.set_mode(size)
screen.fill(color_fondo)

#Titulo
pygame.display.set_caption("Spaguetti Head")

#Imagenes de fondo
inicio=pygame.image.load("juego/fondos/fondo2.png").convert()
fondo=pygame.image.load("juego/fondos/fondo1.png").convert()

#Suelo
lista_suelo=pygame.sprite.Group()
todos_lista=pygame.sprite.Group()

#codigo del suelo
suelo=Suelo()
suelo.rect.x=0
suelo.rect.y=560
lista_suelo.add(suelo)
todos_lista.add(suelo)    

#VARIABLES
puntuacion=0
vidas=3
en_juego=True
en_inicio=any
en_partida=any
heroe=Hero((0,50))


#BOTONES
exit_img=pygame.image.load("juego/img/salir.png").convert()
start_img=pygame.image.load("juego/img/entrar.png").convert()

class Button():
    def __init__(self,x,y,image,scale):
        width=image.get_width()
        height=image.get_height()
        self.image=pygame.transform.scale(image,(int(width*scale),int(height*scale)))
        self.rect=self.image.get_rect()
        self.rect.topleft=(x,y)
        self.clicked=False
    def draw(self):
        action=False
        #posicion del boton
        pos=pygame.mouse.get_pos()
        
        if self.rect.collidepoint(pos):
            if pygame.mouse.get_pressed()[0]==1 and self.clicked==False:
                self.clicked=True
                action=True
                print("Clicked")
        if pygame.mouse.get_pressed()[0]==0:
            self.clicked=False
        #pintar un boton en ventana
        screen.blit(self.image,(self.rect.x,self.rect.y))
        return action
    
    
#Crear instancias
start_button=Button(300,220,start_img,0.1)
exit_button=Button(300,300,exit_img,0.26)

#Codigo bola

bola=Bola()

def update_bola():
    screen.blit(bola.image,bola.rect)
    
    if heroe.disparo:
        bola.rect.y-=15
        if bola.rect.y<20:
            bola.rect.y=heroe.rect.y
            bola.rect.x=heroe.rect.x
            heroe.disparo=False
    else:
        bola.rect.y=heroe.rect.y
        bola.rect.x=heroe.rect.x           
            
#Bucle principal
while en_juego:
    
    if vidas>=0:
        en_inicio=True
        en_partida=False
        
    
            
    while en_inicio:
        #vidas=3
        #puntuacion=0
        
            
        for event in pygame.event.get():
            if(event.type==pygame.QUIT):
                sys.exit()
        screen.blit(inicio,(0,0))
                
        if start_button.draw():
            en_inicio=False
            en_partida=True
        
        if exit_button.draw():
            sys.exit()            
                    
            
        pygame.display.flip()
        clock.tick(30)
        
    while en_partida:
        for event in pygame.event.get():
            if(event.type==pygame.QUIT):
                sys.exit()         
        screen.blit(fondo,(0,0))
        
        screen.blit(heroe.image,heroe.rect)
        heroe.handle_event(event)
        
        #fisicas del jugador
        
        colision_player=pygame.sprite.collide_rect(heroe,suelo)
        
        
        if colision_player:
            heroe.rect.y+=0
        else:
            heroe.rect.y+=5    
        
        #Salto
        
        if event.type==pygame.KEYDOWN:
            if event.key==pygame.K_UP:
                if colision_player:
                    if(heroe.derecha):                    
                        heroe.rect.y-=89
                        heroe.rect.x+=89
                    else:
                        heroe.rect.y-=89
                        heroe.rect.x-=89
        
        update_bola()
        
        todos_lista.draw(screen)
        #disparamos la ventana
        pygame.display.flip()
        clock.tick(10)    
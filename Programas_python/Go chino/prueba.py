# Importamos la librería tkinter para crear la interfaz gráfica
import tkinter as tk

# Definimos el tamaño del tablero y el número de líneas
TAMANO = 600
LINEAS = 19

# Definimos los colores de las piedras y el fondo
BLANCO = "#FFFFFF"
NEGRO = "#000000"
FONDO = "#F5DEB3"

# Definimos el radio de las piedras y el margen del tablero
RADIO = TAMANO // (LINEAS * 2)
MARGEN = RADIO * 2

# Creamos una clase Tablero que representa el estado del tablero y las reglas del juego
class Tablero:

    # Inicializamos el tablero con una matriz vacía y un contador de puntos
    def __init__(self):
        self.matriz = [[None for _ in range(LINEAS)] for _ in range(LINEAS)]
        self.puntos = {BLANCO: 0, NEGRO: 0}

    # Colocamos una piedra en una posición dada si es válida y actualizamos el tablero
    def colocar_piedra(self, i, j, color):
        # Verificamos si la posición está dentro del tablero y está vacía
        if 0 <= i < LINEAS and 0 <= j < LINEAS and self.matriz[i][j] is None:
            # Colocamos la piedra en la matriz
            self.matriz[i][j] = color
            # Capturamos las piedras rodeadas del color opuesto
            self.capturar(i, j, self.opuesto(color))
            # Verificamos si la piedra colocada está rodeada y la eliminamos si es así
            if self.rodeada(i, j, color):
                self.eliminar(i, j)
            # Devolvemos True si la operación fue exitosa
            return True
        # Devolvemos False si la posición no es válida
        return False

    # Verificamos si una posición es válida para colocar una piedra de un color dado
    def posicion_valida(self, i, j, color):
        # Verificamos si la posición está dentro del tablero y está vacía
        if 0 <= i < LINEAS and 0 <= j < LINEAS and self.matriz[i][j] is None:
            # Verificamos si la posición tiene al menos una libertad o captura al menos una piedra opuesta
            if self.libertad(i, j) or self.captura(i, j, self.opuesto(color)):
                # Devolvemos True si la posición es válida
                return True
        # Devolvemos False si la posición no es válida
        return False

    # Verificamos si una posición tiene al menos una libertad (una casilla vacía adyacente)
    def libertad(self, i, j):
        # Recorremos las cuatro direcciones possibles (arriba, abajo, izquierda, derecha)
        for di, dj in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
            # Calculamos la posición adyacente
            ni = i + di
            nj = j + dj
            # Verificamos si la posición adyacente está dentro del tablero y está vacía
            if 0 <= ni < LINEAS and 0 <= nj < LINEAS and self.matriz[ni][nj] is None:
                # Devolvemos True si encontramos una libertad
                return True
        # Devolvemos False si no encontramos ninguna libertad
        return False

    # Verificamos si una posición captura al menos una piedra del color opuesto al colocar una piedra de un color dado
    def captura(self, i, j, color):
        # Recorremos las cuatro direcciones posibles (arriba, abajo, izquierda, derecha)
        for di, dj in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
            # Calculamos la posición adyacente
            ni = i + di
            nj = j + dj
            # Verificamos si la posición adyacente está dentro del tablero y tiene una piedra del color opuesto
            if 0 <= ni < LINEAS and 0 <= nj < LINEAS and self.matriz[ni][nj] == color:
                # Verificamos si la piedra adyacente está rodeada al colocar la piedra en la posición original
                if self.rodeada(ni, nj, color, i, j):
                    # Devolvemos True si encontramos una captura
                    return True
        # Devolvemos False si no encontramos ninguna captura
        return False

    # Capturamos las piedras del color dado que estén rodeadas por la piedra colocada en una posición dada
    def capturar(self, i, j, color):
        # Recorremos las cuatro direcciones posibles (arriba, abajo, izquierda, derecha)
        for di, dj in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
            # Calculamos la posición adyacente
            ni = i + di
            nj = j + dj
            # Verificamos si la posición adyacente está dentro del tablero y tiene una piedra del color dado
            if 0 <= ni < LINEAS and 0 <= nj < LINEAS and self.matriz[ni][nj] == color:
                # Verificamos si la piedra adyacente está rodeada por la piedra colocada en la posición original
                if self.rodeada(ni, nj, color, i, j):
                    # Eliminamos la piedra adyacente y las que estén conectadas a ella
                    self.eliminar(ni, nj)

    # Verificamos si una piedra de un color dado está rodeada por piedras del color opuesto o por el borde del tablero,
    # opcionalmente considerando una posición extra como ocupada por el color opuesto
    def rodeada(self, i, j, color, extra_i=None, extra_j=None):
        # Creamos una cola para recorrer las piedras conectadas del mismo color y un conjunto para marcar las visitadas
        cola = [(i,j)]
        visitados = set()
        # Mientras haya piedras en la cola
        while cola:
            # Sacamos la primera piedra de la cola
            i,j = cola.pop(0)
            # La agregamos al conjunto de visitados
            visitados.add((i,j))
            # Recorremos las cuatro direcciones posibles (arriba,abajo, izquierda, derecha)
            for di, dj in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
                # Calculamos la posición adyacente
                ni = i + di
                nj = j + dj
                # Verificamos si la posición adyacente está dentro del tablero
                if 0 <= ni < LINEAS and 0 <= nj < LINEAS:
                    # Verificamos si la posición adyacente está vacía
                    if self.matriz[ni][nj] is None:
                        # Devolvemos False si encontramos una libertad
                        return False
                    # Verificamos si la posición adyacente tiene una piedra del mismo color y no ha sido visitada
                    elif self.matriz[ni][nj] == color and (ni,nj) not in visitados:
                        # Agregamos la piedra a la cola para seguir explorando
                        cola.append((ni,nj))
                # Verificamos si la posición adyacente es la posición extra
                elif ni == extra_i and nj == extra_j:
                    # Devolvemos False si encontramos una libertad
                    return False
        # Devolvemos True si no encontramos ninguna libertad
        return True

    # Eliminamos una piedra de un color dado y las que estén conectadas a ella, y actualizamos los puntos del color opuesto
    def eliminar(self, i, j):
        # Obtenemos el color de la piedra a eliminar
        color = self.matriz[i][j]
        # Creamos una cola para recorrer las piedras conectadas del mismo color y un contador para llevar la cuenta de las eliminadas
        cola = [(i,j)]
        contador = 0
        # Mientras haya piedras en la cola
        while cola:
            # Sacamos la primera piedra de la cola
            i,j = cola.pop(0)
            # La eliminamos de la matriz
            self.matriz[i][j] = None
            # Incrementamos el contador
            contador += 1
            # Recorremos las cuatro direcciones posibles (arriba, abajo, izquierda, derecha)
            for di, dj in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
                # Calculamos la posición adyacente
                ni = i + di
                nj = j + dj
                # Verificamos si la posición adyacente está dentro del tablero y tiene una piedra del mismo color
                if 0 <= ni < LINEAS and 0 <= nj < LINEAS and self.matriz[ni][nj] == color:
                    # Agregamos la piedra a la cola para seguir eliminando
                    cola.append((ni,nj))
        # Actualizamos los puntos del color opuesto sumando el contador
        self.puntos[self.opuesto(color)] += contador

    # Devolvemos el color opuesto a uno dado
    def opuesto(self, color):
        if color == BLANCO:
            return NEGRO
        elif color == NEGRO:
            return BLANCO

    # Contamos los puntos de cada color al final del juego según el territorio rodeado por cada uno
    def contar_puntos(self):
        # Creamos una copia de la matriz para no modificar el estado original
        copia = [[self.matriz[i][j] for j in range(LINEAS)] for i in range(LINEAS)]
        # Recorremos cada posición de la matriz
        for i in range(LINEAS):
            for j in range(LINEAS):
                # Verificamos si la posición está vacía y no ha sido visitada
                if copia[i][j] is None:
                    # Creamos una cola para recorrer las posiciones vacías conectadas y un conjunto para marcar las visitadas
                    cola = [(i,j)]
                    visitados = set()
                    # Creamos un conjunto para guardar los colores de las piedras adyacentes a las posiciones vacías conectadas 
                    colores = set()
                    # Mientras haya posiciones en la cola 
                    while cola:
                        # Sacamos la primera posición de la cola 
                        i,j = cola.pop(0)
                        # La agregamos al conjunto de visitados 
                        visitados.add((i,j))
                        # Recorremos las cuatro direcciones posibles (arriba, abajo, izquierda, derecha)
                        for di, dj in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
                            # Calculamos la posición adyacente
                            ni = i + di
                            nj = j + dj
                            # Verificamos si la posición adyacente está dentro del tablero
                            if 0 <= ni < LINEAS and 0 <= nj < LINEAS:
                                # Verificamos si la posición adyacente está vacía y no ha sido visitada
                                if copia[ni][nj] is None and (ni,nj) not in visitados:
                                    # Agregamos la posición a la cola para seguir explorando
                                    cola.append((ni,nj))
                                # Verificamos si la posición adyacente tiene una piedra de algún color
                                elif copia[ni][nj] is not None:
                                    # Agregamos el color de la piedra al conjunto de colores
                                    colores.add(copia[ni][nj])
                    # Verificamos si el conjunto de colores tiene un solo elemento
                    if len(colores) == 1:
                        # Obtenemos el único color del conjunto
                        color = colores.pop()
                        # Recorremos las posiciones visitadas y las marcamos con el color correspondiente en la copia de la matriz
                        for i,j in visitados:
                            copia[i][j] = color
        # Recorremos cada posición de la copia de la matriz y sumamos los puntos de cada color según las piedras y el territorio marcado
        for i in range(LINEAS):
            for j in range(LINEAS):
                if copia[i][j] == BLANCO:
                    self.puntos[BLANCO] += 1
                elif copia[i][j] == NEGRO:
                    self.puntos[NEGRO] += 1

    # Determinamos el ganador del juego según los puntos de cada color
    def determinar_ganador(self):
        # Contamos los puntos de cada color al final del juego
        self.contar_puntos()
        # Comparamos los puntos de cada color y devolvemos el ganador o el empate
        if self.puntos[BLANCO] > self.puntos[NEGRO]:
            return BLANCO
        elif self.puntos[BLANCO] < self.puntos[NEGRO]:
            return NEGRO
        else:
            return None

# Creamos una clase Jugador que representa a cada jugador y su color de piedra
class Jugador:

    # Inicializamos el jugador con su color de piedra y un nombre opcional
    def __init__(self, color, nombre=None):
        self.color = color
        self.nombre = nombre

    # Elegimos una posición donde colocar una piedra según algún criterio (aleatorio, manual o inteligente)
    def elegir_posicion(self, tablero):
        # En este ejemplo usaremos un criterio aleatorio, pero se puede modificar para usar otro criterio
        import random
        # Creamos una lista vacía para guardar las posiciones válidas
        posiciones_validas = []
        # Recorremos cada posición del tablero
        for i in range(LINEAS):
            for j in range(LINEAS):
                # Verificamos si la posición es válida para colocar una piedra de nuestro color
                if tablero.posicion_valida(i,j,self.color):
                    # Agregamos la posición a la lista de posiciones válidas
                    posiciones_validas.append((i,j))
        # Elegimos una posición al azar de la lista de posiciones válidas y la devolvemos
        return random.choice(posiciones_validas)

# Creamos una clase Juego que controla el flujo del juego y la interacción con los jugadores
class Juego:

    # Inicializamos el juego con dos jugadores y un tablero vacío
    def __init__(self):
        self.jugador_blanco = Jugador(BLANCO, "Blanco")
        self.jugador_negro = Jugador(NEGRO, "Negro")
        self.tablero = Tablero()
        self.turno = NEGRO

    # Iniciamos el juego y alternamos los turnos hasta que termine el juego
    def iniciar(self):
        # Creamos una ventana para mostrar el juego
        self.ventana = tk.Tk()
        self.ventana.title("Juego de Go Chino")
        # Creamos un lienzo para dibujar el tablero y las piedras
        self.lienzo = tk.Canvas(self.ventana, width=TAMANO, height=TAMANO, bg=FONDO)
        self.lienzo.pack()
        # Dibujamos el tablero vacío
        self.dibujar_tablero()
        # Creamos una etiqueta para mostrar el turno actual y los puntos de cada jugador
        self.etiqueta = tk.Label(self.ventana, text=f"Turno de {self.jugador_negro.nombre} (Negro)\nPuntos: {self.jugador_blanco.nombre} (Blanco): {self.tablero.puntos[BLANCO]} - {self.jugador_negro.nombre} (Negro): {self.tablero.puntos[NEGRO]}")
        self.etiqueta.pack()
        # Creamos un evento para detectar el clic del mouse sobre el lienzo
        self.lienzo.bind("<Button-1>", self.clic)
        # Iniciamos el bucle principal de la ventana
        self.ventana.mainloop()

    # Dibujamos el tablero vacío con las líneas y los puntos de referencia
    def dibujar_tablero(self):
        # Recorremos cada línea horizontal y vertical
        for i in range(LINEAS):
            # Calculamos la coordenada de la línea
            coord = MARGEN + i * (TAMANO - 2 * MARGEN) // (LINEAS - 1)
            # Dibujamos la línea horizontal y vertical
            self.lienzo.create_line(MARGEN, coord, TAMANO - MARGEN, coord)
            self.lienzo.create_line(coord, MARGEN, coord, TAMANO - MARGEN)
        # Definimos las coordenadas de los puntos de referencia según el tamaño del tablero
        if LINEAS == 19:
            puntos = [3, 9, 15]
        elif LINEAS == 13:
            puntos = [3, 6, 9]
        elif LINEAS == 9:
            puntos = [2, 4, 6]
        else:
            puntos = []
        # Recorremos cada punto de referencia
        for i in puntos:
            for j in puntos:
                # Calculamos la coordenada del punto
                coord_i = MARGEN + i * (TAMANO - 2 * MARGEN) // (LINEAS - 1)
                coord_j = MARGEN + j * (TAMANO - 2 * MARGEN) // (LINEAS - 1)
                # Dibujamos el punto con un círculo pequeño
                self.lienzo.create_oval(coord_i - RADIO // 2, coord_j - RADIO // 2, coord_i + RADIO // 2, coord_j + RADIO // 2, fill=NEGRO)

    # Dibujamos una piedra de un color dado en una posición dada
    def dibujar_piedra(self, i, j, color):
        # Calculamos la coordenada de la posición
        coord_i = MARGEN + i * (TAMANO - 2 * MARGEN) // (LINEAS - 1)
        coord_j = MARGEN + j * (TAMANO - 2 * MARGEN) // (LINEAS - 1)
        # Dibujamos la piedra con un círculo grande
        self.lienzo.create_oval(coord_i - RADIO, coord_j - RADIO, coord_i + RADIO, coord_j + RADIO, fill=color)

    # Detectamos el clic del mouse sobre el lienzo y colocamos una piedra si es posible
    def clic(self, evento):
        # Obtenemos las coordenadas del clic
        x = evento.x
        y = evento.y
        # Calculamos la posición más cercana al clic
        i = round((x - MARGEN) / (TAMANO - 2 * MARGEN) * (LINEAS - 1))
        j = round((y - MARGEN) / (TAMANO - 2 * MARGEN) * (LINEAS - 1))
        # Verificamos si la posición es válida
        if self.tablero.posicion_valida(i,j,self.turno):
            # Colocamos una piedra en la posición
            self.tablero.colocar_piedra(i,j,self.turno)
            # Dibujamos la piedra en el lienzo
            self.dibujar_piedra(i,j,self.turno)
            # Cambiamos el turno al color opuesto
            self.turno = self.tablero.opuesto(self.turno)
            # Actualizamos la etiqueta con el turno actual y los puntos de cada jugador
            if self.turno == BLANCO:
                self.etiqueta.config(text=f"Turno de {self.jugador_blanco.nombre} (Blanco)\nPuntos: {self.jugador_blanco.nombre} (Blanco): {self.tablero.puntos[BLANCO]} - {self.jugador_negro.nombre} (Negro): {self.tablero.puntos[NEGRO]}")
            else:
                self.etiqueta.config(text=f"Turno de {self.jugador_negro.nombre} (Negro)\nPuntos: {self.jugador_blanco.nombre} (Blanco): {self.tablero.puntos[BLANCO]} - {self.jugador_negro.nombre} (Negro): {self.tablero.puntos[NEGRO]}")
            # Verificamos si el juego ha terminado
            self.verificar_fin()

    # Verificamos si el juego ha terminado y mostramos el resultado
    def verificar_fin(self):
        # Creamos una bandera para indicar si el juego ha terminado
        fin = True
        # Recorremos cada posición del tablero
        for i in range(LINEAS):
            for j in range(LINEAS):
                # Verificamos si hay alguna posición válida para alguno de los dos colores
                if self.tablero.posicion_valida(i,j,BLANCO) or self.tablero.posicion_valida(i,j,NEGRO):
                    # Cambiamos la bandera a False y salimos del bucle
                    fin = False
                    break
            # Salimos del bucle si ya cambiamos la bandera
            if not fin:
                break
        # Si la bandera es True, el juego ha terminado
        if fin:
            # Determinamos el ganador según los puntos de cada color
            ganador = self.tablero.determinar_ganador()
            # Mostramos el resultado con una ventana emergente
            if ganador == BLANCO:
                tk.messagebox.showinfo("Fin del juego", f"Ha ganado {self.jugador_blanco.nombre} (Blanco) con {self.tablero.puntos[BLANCO]} puntos.")
            elif ganador == NEGRO:
                tk.messagebox.showinfo("Fin del juego", f"Ha ganado {self.jugador_negro.nombre} (Negro) con {self.tablero.puntos[NEGRO]} puntos.")
            else:
                tk.messagebox.showinfo("Fin del juego", f"Ha habido un empate con {self.tablero.puntos[BLANCO]} puntos para cada jugador.")
            # Cerramos la ventana del juego
            self.ventana.destroy()

# Creamos un objeto de la clase Juego e iniciamos el juego
juego = Juego()
juego.iniciar()
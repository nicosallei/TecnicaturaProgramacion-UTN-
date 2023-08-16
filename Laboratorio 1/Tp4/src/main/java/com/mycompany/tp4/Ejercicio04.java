/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú con estas opciones:
a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
c) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
d) Sumar la diagonal principal
e) Sumar la diagonal inversa
f) La media de todos los valores de la matriz

IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se deberán de ejecutar, simplemente 
mostrar un mensaje que diga que debes rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de 
cada una de las opciones del menú.

 */
package com.mycompany.tp4;

import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        while (true) {
            System.out.println("Escriba el tamaño de la matriz cuadrada (valor minimo 4, valor maximo 10)");
            x = sc.nextInt();
            if (x > 3 && x < 11) {
                break;
            } else {
                System.out.println("El tamaño ingresado es incorrecto \n");
            }
        }
        menu(x);
    }

    public static int[][] matriz(int x) {
        System.out.println("Ingrese la matriz");
        int resultado[][] = new int[x][x];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < x; j++) {
                System.out.println("Ingrese el numero [ " + (i + 1) + "," + (j + 1) + "]");
                resultado[i][j] = sc.nextInt();

            }
        }

        return resultado;
    }

    public static void sumaFila(int arreglo[][]) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int resultado = 0;
        while (true) {
            System.out.println("Ingrese la fila de la matriz que quiere sumar (minimo " + 1 + ", maximo " + arreglo.length + ")");
            x = (sc.nextInt() - 1);

            if (x >= 0 && x < arreglo.length) {
                break;
            } else {
                System.out.println("La fila ingresada no existe");
            }
        }

        for (int j = 0; j < arreglo[0].length; j++) {
            resultado += arreglo[x][j];
        }
        System.out.println("La suma de la fila " + (x + 1) + " es: \n" + resultado + "\n-------------");

    }

    public static void sumaColumna(int arreglo[][]) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int resultado = 0;
        while (true) {
            System.out.println("Ingrese la columna de la matriz que quiere sumar (minimo 0, maximo " + arreglo[0].length + ")");
            x = (sc.nextInt() - 1);

            if (x >= 0 && x < arreglo[0].length) {
                break;
            } else {
                System.out.println("La columna ingresada no existe");
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i][x];
        }

        System.out.println("La suma de la columna " + (x + 1) + " es: \n" + resultado + "\n-------------");
    }

    public static void sumaDiagonal(int arreglo[][]) {

        int resultado = 0;

        int i = 0, j = 0;
        while (i < arreglo.length && j < arreglo[0].length) {
            resultado += arreglo[j][i];
            i++;
            j++;
        }

        System.out.println("La suma de la diagonal es: \n" + resultado + "\n-------------");
    }

    public static void sumaDiagonalInversa(int arreglo[][]) {
        int resultado = 0;
        int i = 0, j = arreglo.length - 1;
        while (i < arreglo.length && j >= 0) {
            resultado += arreglo[j][i];
            i++;
            j--;
        }

        System.out.println("La suma de la diagonal inversa es: \n" + resultado + "\n-------------");

    }

    public static void mediaMatriz(int arreglo[][]) {
        int resultado = 0;
        int ite = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {

                resultado += arreglo[i][j];
                ite++;
            }
        }
        resultado = resultado / ite;

        System.out.println("La media de la matriz es: " + resultado);
        System.out.println("-------------");
    }

    public static void menu(int x) {
        Scanner sc = new Scanner(System.in);
        int array[][] = null;
        boolean bandera = true;
        System.out.println("Ingrese el siguiente numero para la opcion que quiera elegir:");
        int numeroIngresado;
        while (true) {
            System.out.println("\n---                ---");
            System.out.println("(1) Rellenar la MATRIZ \n(2) Sumar una fila \n(3) Sumar una columna"
                    + "\n(4) Sumar la diagonal principal \n(5) Sumar la diagonal inversa "
                    + "\n(6) La media de todos los valores de la matriz");
            System.out.println("---                ---");
            numeroIngresado = sc.nextInt();
            if (numeroIngresado == 1) {
                array = matriz(x);
                System.out.println("La matriz ingresada es:");
                mostrarMatriz(array);
                break;
            } else {
                System.out.println("...........................\nEl numero ingresado no es posible ya que tiene que cargar una matriz antes\n...........................");
            }
        }
        while (bandera) {
            System.out.println("\n---                ---");
            System.out.println("(1) Rellenar la MATRIZ \n(2) Sumar una fila \n(3) Sumar una columna"
                    + "\n(4) Sumar la diagonal principal \n(5) Sumar la diagonal inversa "
                    + "\n(6) La media de todos los valores de la matriz \n(7) FINALIZAR EL PROGRAMA");
            System.out.println("---                ---");
            numeroIngresado = sc.nextInt();
            switch (numeroIngresado) {

                case 1:
                    array = matriz(x);
                    System.out.println("La nueva matriz ingresada es:");
                    mostrarMatriz(array);
                    break;
                case 2:
                    sumaFila(array);
                    break;
                case 3:
                    sumaColumna(array);
                    break;
                case 4:
                    sumaDiagonal(array);
                    break;
                case 5:
                    sumaDiagonalInversa(array);

                    break;
                case 6:
                    mediaMatriz(array);
                    break;
                case 7:
                    System.out.println("El programa finalizo, Muchas gracias");
                    bandera = false;
                    break;
                default:
                    System.out.println("...........................\nEl numero ingresado es incorrecto\n...........................");
            }
        }
    }

    public static void mostrarMatriz(int arreglo[][]) {
        System.out.println(" ");
        for (int i = 0; i < arreglo.length; i++) {

            for (int j = 0; j < arreglo[0].length; j++) {
                System.out.print(arreglo[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

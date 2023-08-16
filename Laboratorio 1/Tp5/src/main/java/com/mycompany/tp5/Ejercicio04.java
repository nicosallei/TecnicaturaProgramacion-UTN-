/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5;

import java.util.Scanner;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Ejercicio04 {

    
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los valores enteros del arreglo de 20 elementos");
        int [] arrayOriginal = cargaArray();
        int [] arrayModificado = arrayOriginal;
        String palabra;
        while(true){
         
            System.out.println("¿Como quieren ordenar su arreglo?");
            System.out.println("a ) de forma ASCENDENTE");
            System.out.println("b ) de forma DESCENDENTE");
            
             palabra = sc.nextLine();
            
            if(palabra.equals("a")){
                
                break;
            
            }else if(palabra.equals("b")){
            break;
            }else System.out.println("Error: Opcion no valida");
        }
    
        metodo(arrayModificado, palabra);
        System.out.println("El arreglo original es:");
        System.out.println("-----------------------------");
        mostrarArray(arrayOriginal);
        System.out.println("-----------------------------");
        System.out.println("El nuevo arreglo ordenado es:");
        System.out.println("-----------------------------");
        mostrarArray(arrayModificado);
        System.out.println("-----------------------------");
        
        
        
        
        
    
    
    
    }
    
    
    public static int[] cargaArray() {

        Scanner sc = new Scanner(System.in);
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Cargue el N°" + (i + 1));
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void ordenamientoPorInsercion(int A[], String palabra) {

        if (palabra.equals("a")) {
            for (int i = 1; i < A.length; i++) {
                int valor = A[i];
                int j = i - 1;
                while (j >= 0 && A[j] > valor) {
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = valor;
            }
        } else if (palabra.equals("b")) {
            for (int i = 1; i < A.length; i++) {
                int valor = A[i];
                int j = i - 1;
                while (j >= 0 && A[j] < valor) {
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = valor;
            }

        }
    }

    public static void algoritmoDeLaBurbuja(int A[], String palabra) {

        if (palabra.equals("a")) {
            int i, j, aux;
            for (i = 0; i < A.length - 1; i++) {
                for (j = 0; j < A.length - i - 1; j++) {
                    if (A[j + 1] < A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }
        } else if (palabra.equals("b")) {

            int i, j, aux;
            for (i = 0; i < A.length - 1; i++) {
                for (j = 0; j < A.length - i - 1; j++) {
                    if (A[j + 1] > A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }

        }

    }

    public static void ordenamientoPorSeleccion(int A[], String palabra) {

        if (palabra.equals("a")) {

            for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] > A[j]) {
                        // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                        int temporal = A[i];
                        A[i] = A[j];
                        A[j] = temporal;
                    }
                }
            }

        } else if (palabra.equals("b")) {

            for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] < A[j]) {
                        // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                        int temporal = A[i];
                        A[i] = A[j];
                        A[j] = temporal;
                    }
                }
            }
        }
    }

    public static void metodo(int A[],String palabra){
    Scanner sc = new Scanner (System.in);
        System.out.println("Elija el metodo que quiere utilizar para ordenal el arreglo");
        System.out.println("|||||||||||||||||||||");
        System.out.println(" a : Metodo inserción");
        System.out.println(" b : Metodo burbuja");
        System.out.println(" c : Metodo selección");
        System.out.println("|||||||||||||||||||||");
    String x = sc.nextLine();
    
   
    
   switch(x){
   
       case "a":
   ordenamientoPorInsercion(A,palabra);
   break;
       case "b":
           algoritmoDeLaBurbuja(A,palabra);
           break;
       case "c":
           ordenamientoPorSeleccion(A,palabra);
           break;
       default:
           System.out.println("Error: opcion ingresada no valida");
   }
    
    
    
    }
    
     public static void mostrarArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    
    
}

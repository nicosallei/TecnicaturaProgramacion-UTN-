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
public class Ejercicio03 {
    
    
    
    
     public static void ordenamientoPorInsercion(int A[]) {
 Scanner sc = new Scanner(System.in);
         System.out.println("Escriba ASC si quiere que se ordene de forma ASCENDENTE");
         System.out.println("Escriba DESC si quiere que se ordene de forma DESCENDENTE");
         String x = sc.nextLine();
         
 if( x.equals("ASC")){
        for (int i = 1; i < A.length; i++) {
            int valor = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > valor) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = valor;
        }
     }else if(x.equals("DESC")){
    for (int i = 1; i < A.length; i++) {
            int valor = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] < valor) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = valor;
        }
   
 }else System.out.println("La palabra ingresada es incorrecta");     
    }

  public static void algoritmoDeLaBurbuja(int B[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Escriba ASC si quiere que se ordene de forma ASCENDENTE");
         System.out.println("Escriba DESC si quiere que se ordene de forma DESCENDENTE");
         String x = sc.nextLine();
         
         if( x.equals("ASC")){
        int i, j, aux;
        for (i = 0; i < B.length - 1; i++) {
            for (j = 0; j < B.length - i - 1; j++) {
                if (B[j + 1] < B[j]) {
                    aux = B[j + 1];
                    B[j + 1] = B[j];
                    B[j] = aux;
                }
            }
        }
         }else if(x.equals("DESC")){
             
         int i, j, aux;
        for (i = 0; i < B.length - 1; i++) {
            for (j = 0; j < B.length - i - 1; j++) {
                if (B[j + 1] > B[j]) {
                    aux = B[j + 1];
                    B[j + 1] = B[j];
                    B[j] = aux;
                }
            }
        }
         
         
         }else System.out.println("Error: Palabra incorrecta");
   
    }

    public static void ordenamientoPorSeleccion(int A[]) {
Scanner sc = new Scanner(System.in);
        System.out.println("Escriba ASC si quiere que se ordene de forma ASCENDENTE");
         System.out.println("Escriba DESC si quiere que se ordene de forma DESCENDENTE");
         String palabra = sc.nextLine();
         
        if( palabra.equals("ASC")){ 
            
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
        
        }else if(palabra.equals("DESC")){
        
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
        
        }else System.out.println("Error: Palabra incorrecta");

    }
    


    
    
        public static void main(String[] args) {
boolean seEncontró =false;
        int [] prueba = {2, 5,1,4,9,10,3};
        mostrar(prueba);
        System.out.println(" ");
        System.out.println("-------------------------");
        algoritmoDeLaBurbuja(prueba);
        mostrar(prueba);
        
        
    }

    public static void mostrar(int x[]) {

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }

    }
    
    
    
    
}

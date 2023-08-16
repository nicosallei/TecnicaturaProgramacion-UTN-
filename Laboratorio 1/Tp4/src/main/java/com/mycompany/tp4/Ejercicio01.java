/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class Ejercicio01 {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         String paisCiudad [][] = new String [4][4];
         
     for (int fila=0;fila<paisCiudad.length;fila++){
         System.out.println("Ingrese el pais N°"+(fila+1));
         paisCiudad [fila][0] = sc.nextLine();
     
     }    
         for(int fila=0;fila<paisCiudad.length;fila++){
             System.out.println("Ingrese la ciudades de: "+paisCiudad[fila][0]);
         for (int columna=1;columna<paisCiudad[0].length;columna++){
         
             System.out.println("Ingrese la ciudad N°"+(columna));
          paisCiudad[fila][columna]=sc.nextLine(); 
         }
         }
         for(int fila=0;fila<paisCiudad.length;fila++){
             
             System.out.print("Pais: "+ paisCiudad[fila][0]);
             System.out.print("  Ciudades:");
         for(int columna=1;columna<paisCiudad[0].length;columna++){
             
             System.out.print("  "+paisCiudad[fila][columna]);
         }
             System.out.println(" ");
         }
         
         
         /*
         for(int fila=0;fila<paisCiudad.length;fila++ ){
             System.out.println("Ingrese el pais N°"+fila+1);
          paisCiudad[fila][0] = sc.nextLine();
         for(int columna=1; columna<paisCiudad[0].length;columna++){
             System.out.println("Ingrese la ciudad N°"+columna+" del pais elegido");
             paisCiudad[fila][columna]=sc.nextLine();   
         }
         }
    */
    
    
    }
}

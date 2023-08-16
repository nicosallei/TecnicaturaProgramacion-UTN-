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
public class Ejercicio02 {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor entero para X");
        int x = sc.nextInt();
        System.out.println("Ingrese un valor entero para Y");
        int y = sc.nextInt();   
        int array1[][] = new int [x][y];
        int array2[][] = new int [y][x];
        int array3 [][] = new int [x][y];
        
        
        for(int fila=0;fila<array1.length;fila++ ){
             System.out.println("Ingrese el valor de X"+fila+1);
          array1[fila][0] = sc.nextInt();
         for(int columna=1; columna<array1[0].length;columna++){
             System.out.println("Ingrese el valor de Y"+columna+" del pais elegido");
             array1[fila][columna]=sc.nextInt();   
         }
         }
        
        
    
    }
   public static int[][] matriz(int array[][]){
       Scanner sc = new Scanner(System.in);
    for(int fila=0;fila<array.length;fila++ ){
             System.out.println("Ingrese el valor de X"+fila+1);
          array[fila][0] = sc.nextInt();
         for(int columna=1; columna<array[0].length;columna++){
             System.out.println("Ingrese el valor de Y"+columna+" del pais elegido");
             array[fila][columna]=sc.nextInt();   
         }
         }
    return array;
   }
}

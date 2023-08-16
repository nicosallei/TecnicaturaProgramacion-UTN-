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
public class Ejercicio03 {
    public static void main(String[]args){
    boolean bandera = true;
    int x=0;
    Scanner sc = new Scanner (System.in);
    while(bandera){
        System.out.println("Ingrese el tamaño de la matriz cuadrada ( minimo 3, maximo 10)");
        x=sc.nextInt();
        if(x>2 && x<11){
        bandera=false;
        }else System.out.println("El tamaño ingresado es incorrecto");
    }
    int arreglo[][] = matriz(x);
    int suma[] = sumarColumnas(arreglo);
        System.out.println("La Matriz ingresada es: ");
        mostrarMatriz(arreglo);
        System.out.println(" ");
        System.out.println("El resultado de las suma de sus columnas es: ");
        mostrarArray(suma);
        System.out.println(" ");
        System.out.println("La suma total es: ");
        System.out.println(sumarTotal(suma));
    
    }
  public static int [][] matriz(int x){
Scanner sc = new Scanner(System.in);
int arreglo [][]=new int [x][x];


for (int i=0; i<x;i++){
    System.out.println("........................................");
    System.out.println("Ingrese los valores de la fila "+(i+1));
                    
for (int j=0; j<x;j++){
    System.out.println("Ingrese el valor de la fila "+(i+1)+" y la columna "+(j+1));
arreglo[i][j] = sc.nextInt();
}
}    
return arreglo;
}
  public static int []sumarColumnas(int arreglo[][]){
      
  int suma[] = new int[arreglo.length];
  
  for(int i=0;i<arreglo.length;i++){
      
  for(int j=0;j<arreglo[0].length;j++){
  
      suma [i]+= arreglo[j][i];
  }
  }
  
  return suma;
  }
  public static void mostrarMatriz(int arreglo[][]){
      System.out.println(" ");
  for(int i=0;i<arreglo.length;i++){
     
  for(int j=0;j<arreglo[0].length;j++){
      System.out.print(arreglo[i][j]);
      System.out.print(" ");
  }
      System.out.println(" ");
  }
  
  
  }
  
  public static void mostrarArray(int arreglo[]){
      System.out.println(" ");
  for(int i=0;i<arreglo.length;i++){
      System.out.print(arreglo[i]);
      System.out.print(" ");
  }
      System.out.println(" ");
  }
  
   public static int sumarTotal(int arreglo[]){
  int total=0;
      for(int i=0;i<arreglo.length;i++){
      total += arreglo[i];
      }
  return total;
  }
  }
  
 


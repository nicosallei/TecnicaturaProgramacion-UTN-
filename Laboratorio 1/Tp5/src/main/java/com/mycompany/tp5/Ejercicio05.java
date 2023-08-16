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
public class Ejercicio05 {
    
    
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese 2 valores (x: filas, y: columnas)");
        System.out.println("----------");
    
    int x = pedirFila();
    int y = pedirColumna();
    int [][]arreglo = cargarMatriz(x,y);    
    int prom = promedio(arreglo);
    
        System.out.println("La matriz es:");
        mostrarMatriz(arreglo);
        System.out.println("El promedio de la matriz es:");
        System.out.println(prom);
        buscarElemento(arreglo,prom);
    
    

    }
    
    public static int pedirFila(){
     Scanner sc = new Scanner(System.in);
     int x;
    while(true){
        System.out.println("Ingrese el valor de X: fila");
        x = sc.nextInt();
        if(x>1){
        break;
        }else System.out.println("Error: valor ingresado incorrecto (X => 2)");
        }
    
    return x;
    }
    public static int pedirColumna(){
    Scanner sc = new Scanner(System.in);
     int y;           
    while(true){            
        System.out.println("Ingrese el valor de Y: columna");
        y = sc.nextInt();
    if(y>1){
    break;
    }else System.out.println("Error: valor ingresado incorrecto (Y => 2)");
    }
    return y;
    }
    public static int [][]cargarMatriz(int x, int y){
        System.out.println("Cargar matriz");
        Scanner sc = new Scanner(System.in);
        int [][] arreglo = new int [x][y];
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Fila N°"+(i+1));
            for(int j=0;j<arreglo[0].length;j++){
                System.out.println("Ingrese el valor de la columna "+(j+1));
            arreglo[i][j]=sc.nextInt();
            }
        }
    
    
    return arreglo;
    }
    public static int promedio(int arreglo[][]){
    int suma=0, ite=0;
        for(int i=0;i<arreglo.length;i++){  
            for(int j=0;j<arreglo[0].length;j++){  
            suma += arreglo[i][j];
            ite ++;      
            }
        }  
        int resultado = suma/ite;
    return resultado;
    }
    public static void buscarElemento(int[][]arreglo, int elemento) {
      int bandera =0;
      for (int i = 0; i < arreglo.length; i++) {
         for (int j = 0; j < arreglo[0].length; j++) {  
            if( arreglo[i][j] == elemento){
                System.out.println("El valor del promedio se encuentra: (Fila: "+(i+1)+", Columna: "+(j+1)+")");
                bandera++;
            }
         }
      }
      if(bandera==0){
          System.out.println("No se encontró ninguna coincidencia, con el valor del promedio en la matriz");
      }
   }
    public static void mostrarMatriz(int arreglo[][]){
        System.out.println("---------------------------------------");
         for(int i=0;i<arreglo.length;i++){
             System.out.println(" ");
            for(int j=0;j<arreglo[0].length;j++){
               
                System.out.print(arreglo[i][j]+" ");
            }
        } 
         System.out.println(" ");
        System.out.print("--------------------------------------- \n");
    }
    
    
    
}

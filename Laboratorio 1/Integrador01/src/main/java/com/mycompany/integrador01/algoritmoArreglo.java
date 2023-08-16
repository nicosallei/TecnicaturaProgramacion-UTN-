/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integrador01;

import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class algoritmoArreglo {
    public static void main(String[]args){
    int arreglo[] = array();
    System.out.println("El arreglo es: ");
    for(int i=0; i<10;i++){
        
        System.out.println(arreglo[i]);
    }
    }
    
    public static int [] array (){
        
    // funcion que crea el Arreglo y hace que el valor ingresado no sea menor a 0
    // tambien llama a otra funcion llamada validacionArray para validar que no se repita el numero ingresado
    
    Scanner sc = new Scanner (System.in);
    int arreglo [] = new int [10];
        System.out.println("Ingrese el Array");
    for (int i=0; i<10;i++){
        boolean bandera= true;
    while(bandera){
        System.out.println("N°"+(i+1));
        arreglo[i] = sc.nextInt();
    if(arreglo[i] > 0){
    bandera = validacionArray(arreglo,i);
    }else System.out.println("El valor ingresado tiene que ser mayor a 0");
    }
    }
     return arreglo;
    }
    
    public static boolean validacionArray (int arreglo [],int i){
     // funcion que valida que los numeros no se repitan       
    for(int fila=0; fila<10;fila++ ){
        
        if(i!=fila){       
      if(arreglo[i]==arreglo[fila]){
        System.out.println("El numero ingreso es igual al que ingreso anteriormente");
          System.out.println("---");
        System.out.println("Ingrese un numero distinto");
          System.out.println("..................................");
        return true;
    }
    }
    }
    return false;
    }
      
}

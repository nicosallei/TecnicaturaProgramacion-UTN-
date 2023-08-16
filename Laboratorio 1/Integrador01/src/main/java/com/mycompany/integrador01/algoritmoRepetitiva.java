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
public class algoritmoRepetitiva {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean bandera= true;
   
    while(bandera){
        System.out.println("Ingrese la cantidad de numeros que va ingregar");
        int tamaño = sc.nextInt();
        if (tamaño>0){
        double resultado = promedio(tamaño);
        System.out.println("El promedio de los numeros es: "+resultado);
        bandera=false;
        }else System.out.println("La cantidad de numeros tiene que ser mayor a 0");
    }
        
    
    }
    
    public static double promedio(int tamaño){
    Scanner sc = new Scanner (System.in);
    double resultado=0;
        for(int i=0; i<tamaño;i++){
            System.out.println("Ingrese el N°"+(i+1));
        resultado += sc.nextDouble();
        }
        resultado= resultado/tamaño;
        
        
    return resultado;
    }
}

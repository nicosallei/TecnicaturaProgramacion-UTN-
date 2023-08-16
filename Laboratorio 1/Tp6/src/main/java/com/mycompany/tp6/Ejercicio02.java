/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp6;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Ejercicio02 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> arreglo = new ArrayList<>();
        System.out.println("Va a ingresar 20 numeros que usted quiera.");
    for(int i=0 ; i<20 ;i++){
        System.out.println("Ingrese el N°"+(i+1));
arreglo.add(sc.nextDouble());
}
    // Calculo del mayor y del menor en prueba
   //double pruebaNumeroMayor = Collections.max(arreglo);
   //double pruebaNumeroMenor = Collections.min(arreglo);
   //double pruebaRango = (pruebaNumeroMayor - pruebaNumeroMenor);
        
    double numeroMayor=arreglo.get(0);
    for(int i=0;i<arreglo.size();i++){
    if(numeroMayor<arreglo.get(i)){
    numeroMayor=arreglo.get(i);
    }
    }
        System.out.println("El mayor numero es: "+numeroMayor);
      double numeroMenor=arreglo.get(0);
    for(int i=0;i<arreglo.size();i++){
    if(numeroMenor>arreglo.get(i)){
    numeroMenor=arreglo.get(i);
    
    }
    
    }
        System.out.println("El numero menor es: "+numeroMenor);
        
        System.out.println("El rango es: "+(numeroMayor-numeroMenor));
      
}
}
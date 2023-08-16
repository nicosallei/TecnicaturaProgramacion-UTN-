/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Ejercicio01 {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    ArrayList<Integer> array =new ArrayList<>();
    Integer numero;
    
    do{
        System.out.println("Ingrese un numero para el arreglo");
        numero = sc.nextInt();
    if(numero>=0){
    array.add(numero);
    }else System.out.println("Programa Finalizado");
    }while(numero>=0);
    
        System.out.println("El arreglo quedaria de la siguiente manera: "+array);
    }
    
}

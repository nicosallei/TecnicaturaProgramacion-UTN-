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
public class algoritmoRecursiva {
    public static void main(String[]args){
        System.out.println("Escriba una cadena");
        Scanner sc = new Scanner(System.in);
    String cadena = sc.nextLine();
    mostrarCadena(cadena,0);
    
    }
public static void mostrarCadena(String cadena, int indice){

if (indice == cadena.length()){
}else{
    System.out.println(cadena.charAt(indice));
    mostrarCadena(cadena,indice+1);
}

}
}



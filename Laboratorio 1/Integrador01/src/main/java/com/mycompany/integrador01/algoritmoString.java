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
public class algoritmoString {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la primer cadena");
        String cadenaUno = sc.nextLine();
        boolean bandera = true;
    
        while(bandera){
            System.out.println("Ingrese la segunda cadena");
            System.out.println("Recuerde que tiene que ser menor o igual a la primer cadena"); 
            String cadenaDos = sc.nextLine();
            
            if(cadenaUno.length()> cadenaDos.length()){
            bandera = false;
            if (cadenaUno.contains(cadenaDos)) {
			System.out.println("ENCONTRADO");
		} else {
			System.out.println("NO ENCONTRADO");
		}
            }   
        }
    }
    
    
}

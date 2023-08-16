/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class Ejercicio09 {
    
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de DNI");
        int dni = sc.nextInt();
        int numeroDNI = dni%23;
        System.out.println("El DNI ingresado completo es: ");
        System.out.println(dni+obtenerLetra(numeroDNI));
    
    
    }
    
    
    
    public static String obtenerLetra(int numeroDNI){
    
        
         String cadena = ("T,R,W,A,G,M,Y,F,P,D,X,B,N,J,Z,S,Q,V,H,L,C,K,E");
        
         String [] letras = cadena.split(",");
            
         String letra = letras [numeroDNI];
        
    
    return letra;
    }
}

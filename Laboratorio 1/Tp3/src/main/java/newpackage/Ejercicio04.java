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
public class Ejercicio04 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ahora le vamos a pedir que ingrese 20 numeros");
        System.out.println(" ");
        int [] array = new int[20];
        
        for(int i=0;i<20;i++){
            System.out.println("Ingrese el N°"+(i+1));
        array[i]=sc.nextInt();
       
        }
    int mayor = numeroMayor(array);
    int menor = numeroMenor(array);
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        System.out.println("El rango es: "+(mayor-menor));
    }
    public static int numeroMayor(int array[]){
    int mayor = array[0];
    
        for(int i=0;i<array.length;i++){
           
        if(array[i]>mayor){
        
        mayor = array[i];
        }
        
        }
    
    return mayor;
    }
    
    public static int numeroMenor(int array[]){
    int menor = array[0];
        for(int i=0;i<array.length;i++){
        if(menor>array[i]){
        
            menor=array[i];
        }
        }    
    return menor;
    }
}

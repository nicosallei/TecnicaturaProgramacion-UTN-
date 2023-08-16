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
public class Ejercicio03 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Array");
        int tamaño = sc.nextInt();
        System.out.println("Ahora ingrese un numero para la funcion del array: ");
        int numero = sc.nextInt();
        mostrarPorPantalla(funcion(tamaño,numero));
    
    
    }
    public static int[] funcion(int tamaño, int numero){
    
    int [] array = new int[tamaño];
    
    array[0]=numero;
    
    for(int i=1;i<array.length;i++){
    
        array[i]=array[i-1]+numero;
    
    }
    return array;
    }
    
    public static void mostrarPorPantalla(int array[]){
        System.out.println("El array que queda es el siguiente: ");
        System.out.println(" ");
    for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
    }
    
    }
}

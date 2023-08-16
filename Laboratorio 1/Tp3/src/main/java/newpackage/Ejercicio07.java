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
public class Ejercicio07 {
    public static void main(String[]args){
 
  int [] array1 = new int[10];
  
  
   Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese 10 valores de numeros enteros");
    
    for(int i=0;i<array1.length;i++){
    System.out.println("Ingrese el N°"+(i+1));
    array1[i] = sc.nextInt();
    
    }
    
    System.out.println("El array Ascendente es: ");
    mostrarPorPantalla(arrayAscendente(array1));
    System.out.println("----------------------------");
    System.out.println("El array Descendente es: ");
    mostrarPorPantalla(arrayDescendente(array1));
   

}


public static int[] arrayDescendente(int array[]){

int aux;
    for(int i=0;i<array.length; i++){
        
    for(int j=0;j<array.length;j++){
    if(array[i]>array[j]){
    aux = array[i];
   array[i] =array[j];
  array[j]=aux;
           
    }
    }
    }
return array;
}
public static int[] arrayAscendente(int array[]){
int aux;
    for(int i=0;i<array.length;i++){
    for(int j=0;j<array.length;j++){
    if(array[i]<array[j]){
    aux = array[i];
    array[i]=array[j];
    array[j]=aux;
    }
    }
    }
    

return array;
}



 public static void mostrarPorPantalla(int array[]){
     for(int i=0;i<array.length;i++){
     System.out.println(array[i]);
     
     
     }
 } 
 
}

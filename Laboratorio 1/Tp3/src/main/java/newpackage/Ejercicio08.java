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
public class Ejercicio08 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de numeros separada por - : ");
        String cadena = sc.nextLine();
        
       int [] array=(arreglo(cadena));
       int arraySuma= suma(array);
       int arrayPromedio = promedio(array);
       
        System.out.println("La suma de los numeros ingresado en la cadena es: ");
        System.out.println(arraySuma);
        System.out.println("");
        System.out.println("El promedio de los numeros ingresados en la cadena es: ");
        System.out.println(arrayPromedio);
    }
    
    public static int [] arreglo(String cadena){
    
        String [] arreglo = cadena.split("-");
        int array[] = new int[arreglo.length];
        for(int i =0; i<array.length;i++){
        
        array[i]= Integer.parseInt(arreglo[i]);
        }
    
    return array;
    }
    public static int suma(int sum[]){
    int resultado = 0;
    
      for (int i=0; i<sum.length;i++){
      
           resultado += sum[i];
      }     
    return resultado;
    }
    public static int promedio(int valor[]){
    int prome = (suma(valor))/(valor.length);
    return prome;
    }
}

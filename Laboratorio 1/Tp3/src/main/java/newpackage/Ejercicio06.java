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
public class Ejercicio06 {
     public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        int arreglo[] = cargaDatos(); 
        // Este For sera solo para comprobar la parte de que encuentre el numero.
        System.out.print("[");
        for(int i=0;i<50;i++){
            System.out.print(arreglo[i]+" ");
            }
        System.out.println("]");
        // hasta aca.
        System.out.println("Ingrese el valor a buscar");
            int aBuscar= sc.nextInt();
        int posicion =   buscar(aBuscar,arreglo);
         if(posicion==100){
             System.out.println("El numero no fue encontrado en el arreglo");
         }
         else{
             System.out.println("El numero a buscar: "+aBuscar+", fue encontardo "
                     + "en la posicion: "+posicion);
         }
    }
    
    public static int [] cargaDatos(){
     int i;
     int datos[] = new int[50];
     
     for(i=0;i<50;i++){
         datos[i] = new Double(Math.random() * 100).intValue();
         }
    return datos;
    }
    public static int buscar(int aBuscar, int arreglo[]){
        int posicion=100;
        for(int i=0;i<50;i++){
            if(arreglo[i]== aBuscar){
                posicion= i;
                i=50;
            }
        }
        return posicion;
    }
}

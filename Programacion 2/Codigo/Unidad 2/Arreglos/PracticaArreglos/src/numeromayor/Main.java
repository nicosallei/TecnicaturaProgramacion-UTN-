/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromayor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class Main {

    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamañno del arreglo: ");
        int tamaño=sc.nextInt();
        int [] num = new int [tamaño];
        for(int i=0; i<tamaño;i++){
            System.out.println("Escriba un numero entero: ");
            num[i]=sc.nextInt();    
    }
        
        
      //--------------------ArrayList---------------------
      
      ArrayList prueba = new ArrayList();
      for(int i=0;i<10;i++){
        System.out.println("Ingrese el un numero");
      prueba.add(sc.nextInt());
      }
      
        System.out.println("El numero mayor de mi ArrayList es: "+Collections.max(prueba));
}
    
    public void numeroMayor(int[] num){
    int posicion;
    int numeroMayor=0;
    
    for(int i=0;i<num.length;i++){
    
        if(num[i]>numeroMayor){
            posicion=i;
        numeroMayor = num[i];
        }
    }
        System.out.println("El numero mayor esta en la posicion: ");
    }
}
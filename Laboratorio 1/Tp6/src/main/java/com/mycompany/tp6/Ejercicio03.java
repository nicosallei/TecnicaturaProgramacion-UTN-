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
public class Ejercicio03 {
     Scanner lt= new Scanner(System.in);
     
     
    public static void main(String[]args){
        
        
   /* ArrayList li = new ArrayList();
    ArrayList<Integer> arreglo = new ArrayList<>();
    int it=0;
    
    while(it<20){
        int numeroAletorio =(int)( Math.random()*(100+1));
        if((numeroAletorio%2) == 0){
         arreglo.add(numeroAletorio);
         li.add(numeroAletorio);
         it++;
        }
    }
    System.out.println("El arreglo de numeros aletorio es: "+arreglo);
        System.out.println("Prueba: "+li);
*/

 Scanner lt= new Scanner(System.in);
        ArrayList<Integer> numero= new ArrayList<Integer>();
        Integer suma=0, num, mayores=0,iguales=0, menores=0;
        double promedio;
        System.out.println("Ingrese 20 numeros enteros positivos pares del 1 al 100: ");
        for(int i=0;i<20;i++){
            do{
              System.out.print("Esta ingresando el numero "+(i+1)+" de 20:");
              num=lt.nextInt();
            }while(num<1||num>100);
           suma+=num;
           numero.add(num);
        }
        promedio=suma/20;
       for(Integer numeros: numero){
            if(numeros>promedio){
                mayores++;
            }else{
                if(numeros<promedio){
                    menores++;
                }
                else{
                iguales++;
            }
            }
        }


        System.out.println("Los numero ingresados son:");
        for(Integer numeros: numero){
            System.out.print(numeros+"\t");
        }
        System.out.println("");
        System.out.println("su promedio aritmético es: "+promedio);
        System.out.println("¿cuántos de los números son iguales al promedio aritmético? son:"+iguales);
        System.out.println("¿cuántos de los números son mayores que el promedio aritmético?son: "+mayores);
        System.out.println(" ¿cuántos de los números son menores que el promedio aritmético? son: "+menores);
    }




   
}



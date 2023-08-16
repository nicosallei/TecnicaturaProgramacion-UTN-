/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp6;

import java.util.*;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arreglo = new ArrayList();
        Random random = new Random();

        int prueba = 0;
        for (int i = 0; i < 50; i++) {
            arreglo.add(random.nextInt(1000));
        }
        // para ver cual es el ultimo numero
        for (Integer numero : arreglo) {
            prueba = numero;
        }
        System.out.println("El ultimo numero es:");
        System.out.println(prueba);

        System.out.println("Ingrese un valor del 0 al 1000 que desea buscar");
        Integer num = sc.nextInt();

        // una de las formas de hacer el programa con un for
        /*
        int it=0;
         for(Integer numero:arreglo){
            
             if(Objects.equals(num, numero)){
                 
                 System.out.println("Numero Encontrado");
                 System.out.println("El numero se encuentra en la posicion N°"+it);
                 break;
             }else System.out.println("El numero no se encontro en la lista");
            it++;
            }
         */
        if (arreglo.contains(num)) {
            System.out.println("Se encontro el resultado");
            int indice = arreglo.indexOf(num);
            System.out.println("La posicion que ocupa el numero en la lista es: " + (indice + 1));
        } else {
            System.out.println("No se encontro el numero en la lista");
        }

    }

}

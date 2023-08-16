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
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero entero");
            int numero = sc.nextInt();
            lista1.add(numero);
        }
        
        
        
        // formas de copiar un ArrayList
        // otra manera:
        //ArrayList<Integer> lista4 = new ArrayList<>(lista1);
        ArrayList<Integer> lista2 = (ArrayList<Integer>)lista1.clone();
        ArrayList<Integer> lista3 = new ArrayList();
        lista3.addAll(lista1);
        
        //ordenando el ArrayList
        Collections.sort(lista2);
        Collections.sort(lista3,Collections.reverseOrder());
        
        
        System.out.println("La lista original es : "+lista1);
        System.out.println("La lista ordenada de forma Ascendente es: "+lista2);
        System.out.println("La lista ordenada de forma Descendente es: "+lista3);
        
        
    }
}

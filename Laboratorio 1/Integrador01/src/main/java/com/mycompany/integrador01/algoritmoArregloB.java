/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integrador01;


import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class algoritmoArregloB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 5, 9, 3, 45, 23, 45, 12, 87, 9, 6, 5};
        System.out.println("Ingrese el numero que desea eliminar");
        int numeroEliminado = sc.nextInt();
        

        int x = 0;
        int cantidadNumeros = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numeroEliminado) {
                cantidadNumeros++;
            }
        }
        
        int[] newArr = new int[(arr.length) - cantidadNumeros];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != numeroEliminado) {

                newArr[x] = arr[i];
                x++;
            }
        }
        System.out.println("Elemento a borrar: " + numeroEliminado);
        System.out.print("Array inicial: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println(arr[arr.length-1]);
        System.out.println(" ");
        System.out.print("Array final: ");
        for (int i = 0; i < newArr.length-1; i++) {
            System.out.print(newArr[i] + " - ");
        }
         
        System.out.println(newArr[newArr.length-1]);

    }
}

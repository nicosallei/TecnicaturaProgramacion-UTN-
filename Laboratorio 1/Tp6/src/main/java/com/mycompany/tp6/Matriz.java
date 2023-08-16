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
public class Matriz {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

    public static void main(String[] args) {

        String valorCelda;
        int fila;
        int columna;

        while (true) {
            Celda celdas = new Celda();
            System.out.println("Ingrese FIN para finalizar la carga de datos");
            System.out.println("Ingrese un valor para celda");
            valorCelda = sc.next();

            if ("fin".equals(valorCelda)|| "Fin".equals(valorCelda)||"FIN".equals(valorCelda)) {
                System.out.println("La carga de datos finalizo con exito");
                break;
            } else {
                celdas.setValor(valorCelda);

                System.out.println("Ingrese la fila del valor ingresado");
                fila = sc.nextInt();
                celdas.setFila(fila);

                System.out.println("Ingrese la columna del valor ingresado");
                columna = sc.nextInt();
                celdas.setColumna(columna);

                matrizCuadrada.add(celdas);

            }
        }

        for (Celda al : matrizCuadrada) {
            System.out.println("............................................");
            System.out.println("El valor es: " + al.getValor() + "\nLa fila es: " + al.getFila() + "\nLa columna es: " + al.getColumna());

        }

        busqueda();

    }

    public static void busqueda() {
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.- ");
        System.out.print("Ingrese la fila: ");
        int fila = sc.nextInt();
        System.out.print("Ingrese la columna: ");
        int columna = sc.nextInt();
        int bandera = 0;
        for (Celda it : matrizCuadrada) {

            if (it.getFila() == fila && it.getColumna() == columna) {
                
                System.out.println("\nEl valor encontrado es: " + it.getValor());
            bandera = 1;
            break;
            }
            
        }
        
        if (bandera==0) {
            
            System.out.println("\nLa fila y columna indicada no ha sido asignada");
        }

    }

}

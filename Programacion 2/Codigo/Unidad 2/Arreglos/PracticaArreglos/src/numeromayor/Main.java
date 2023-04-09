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

        int tamaño = 10;

        int num[] = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Escriba un numero entero: ");
            num[i] = sc.nextInt();
        }
        numeroMayor(num);

        //--------------------ArrayList---------------------
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese  un numero");
            prueba.add(sc.nextInt());
        }

        int valor = 0;
        int index;

        for (Integer pr : prueba) {
            if (pr.intValue() >= valor) {
                System.out.println("prueba");
                valor = pr.intValue();
            }
        }
        index = prueba.indexOf(valor) + 1;
        System.out.println("--------------ArrayList---------");
        System.out.println("El mayor valor es: " + valor);
        System.out.println("El indice es: " + index);

        //manera con collections para saber cual es el numero mayor
        //System.out.println("El numero mayor de mi ArrayList es: "+Collections.max(prueba));
    }

    public static void numeroMayor(int num[]) {
        int posicion = 0;
        int numeroMayor = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > numeroMayor) {
                posicion = i;
                numeroMayor = num[i];
            }
        }
        System.out.println("El numero mayor es:" + num[posicion]);
        System.out.println("El numero mayor esta en la posicion: " + posicion + 1);
    }

}

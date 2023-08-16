/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class Ejercicio05 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numAletorio[] = numeros();
        int promedio = promedio(numAletorio);

        System.out.println("El promedio aritmetico es: " + promedio);
        System.out.println("La cantidad de numeros iguales al promedio aritmetico es: " + numIguales(numAletorio, promedio));
        System.out.println("La cantidad de numeros mayores al promedio aritmetico es: " + mayores(numAletorio, promedio));
        System.out.println("La cantidad de numeros menores al promedio aritmetico es: " + menores(numAletorio, promedio));
    }

    public static int[] numeros() {
        Random MiAletorio = new Random();
        int numero[] = new int[20];
        int x = 0;
        while (x == 0) {

            numero[0] = 1 + MiAletorio.nextInt(99);
            if ((numero[0] % 2) != 0) {
            } else {
                x = 1;
            }
        }
        for (int i = 1; i < 20; i++) {
            numero[i] = 1 + MiAletorio.nextInt(99);

            while ((numero[i] % 2) != 0) {

                i--;
            }
        }
        return numero;
    }

    public static int promedio(int numAletorio[]) {

        int promedio = 0;
        for (int i = 0; i < 20; i++) {

            promedio = promedio + numAletorio[i];

        }
        promedio = (promedio / 20);

        return promedio;
    }

    public static int numIguales(int numAletorio[], int promedio) {
        int iguales = 0;
        for (int i = 0; i < 20; i++) {

            if (numAletorio[i] == promedio) {
                iguales = (iguales + 1);
            }
        }
        return iguales;
    }

    public static int mayores(int numAletorio[], int promedio) {
        int mayor = 0;
        for (int i = 0; i < 20; i++) {

            if (numAletorio[i] > promedio) {
                mayor = (mayor + 1);
            }
        }
        return mayor;
    }

    public static int menores(int numAletorio[], int promedio) {
        int menor = 0;
        for (int i = 0; i < 20; i++) {

            if (numAletorio[i] < promedio) {
                menor = (menor + 1);
            }
        }
        return menor;

    }
 
}

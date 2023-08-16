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
public class Ejercicio10 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array1[] = new int[5];
        int array2[] = new int[10];
        
System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero del arreglo 1 en la posicion " + (i+1));
            array1[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero del arreglo 2 en la posicion " + (i+1));
            array2[i] = sc.nextInt();
        }
System.out.println("----------------------------------------------------------------");
        int Array3[] = creacionArray3(array1, array2);
        System.out.println("El Array 3 es :");
        System.out.print("( ");
        for (int i = 0; i < 4; i++) {
            System.out.print(Array3[i] + " , ");
        }
        System.out.print(Array3[4] +" )");
        System.out.println(" ");
    }

    public static int[] creacionArray3(int array1[], int array2[]) {

        int array3[] = new int[5];

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {

                sum = (array1[i] * array2[j]) + sum;

            }
            array3[i] = sum;
        }

        return array3;
    }
}

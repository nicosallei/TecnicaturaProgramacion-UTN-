/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Ejercicio02 {

    public static void ordenamientoPorInsercion(int A[]) {

        for (int i = 1; i < A.length; i++) {
            int valor = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > valor) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = valor;
        }
    }

    public static void algoritmoDeLaBurbuja(int B[]) {

        int i, j, aux;
        for (i = 0; i < B.length - 1; i++) {
            for (j = 0; j < B.length - i - 1; j++) {
                if (B[j + 1] < B[j]) {
                    aux = B[j + 1];
                    B[j + 1] = B[j];
                    B[j] = aux;
                }
            }
        }

        /*  Este Psudocodigo aparece en el resumen y no lo resuelve.
        int n = A.length;
      boolean intercambiado = false;       
for (int i = 1; i < n; i++){ 
// si este par no está ordenado 

if (A[i-1] > A[i]){
// los intercambiamos y recordamos que algo ha cambiado 
int aux = A[i-1]; 
A[i-1] = A[i]; 
A[i] = aux; 
intercambiado = true; 
} 
}
do{
    }while(intercambiado == false); 
    return A;
    
         */
    }

    public static void ordenamientoPorSeleccion(int A[]) {

        
        for (int i = 0; i < A.length - 1; i++) {
        for (int j = i + 1; j < A.length; j++) {
            if (A[i] > A[j]) {
                // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                int temporal = A[i];
                A[i] = A[j];
                A[j] = temporal;
            }
        }
    }
        
        
// Este es el psudocodigo del resumen y no funciona.
       /* 
        int n = A.length;
        for (int i = 1; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
// si este par no está ordenado 
                if (A[j] < A[minimo]) {
// encontramos un nuevo mínimo 
                    minimo = j;
                }
// intercambiamos el actual con el mínimo encontrado 
                int aux = A[minimo];
                A[minimo] = A[j];
                A[j] = aux;
            }
        }
*/
    }
    
    public static void busquedaSecuencial(String L[],String a){
    
 
    
 int n = L.length; 
 boolean seEncontró = false; 
// recorremos la lista, revisando cada elemento de la misma, para ver 
// si es el alumno a. 
for (int i = 1; i < n - 1; i++){ 
// comparamos el alumno de la posición actual con el alumno buscado: a 
if (L[i] == a){ 
// encontramos el alumno buscado 
seEncontró = true; 
} 
   
// si nunca se cumple L[i] == a, entonces la variable que indica si se 
// encontró o no el alumno: seEncontró, quedará valiendo falso. 
        }          
        System.out.println("El estudiantes se encontro? "+seEncontró); 
    }

    public static void main(String[] args) {
boolean seEncontró =false;
        String[] prueba = {"hola", "como estas", "nicolas", "pedro"};
        mostrar(prueba);
        System.out.println(" ");
        System.out.println("-------------------------");
        busquedaSecuencial(prueba,"nicolas");
        
        
    }

    public static void mostrar(String x[]) {

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }

    }

}

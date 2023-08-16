/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parciales;

import java.util.Scanner;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Parciales {

   public static void main(String[]args){
  
    // Ejercicio 1
          // * ingresoNumeros();
    // Ejercicio 2
          // * cadena();
    // Ejercicio 3
          // * ejercicio3();
    // Ejercicio 4
    
       // *ejercicio4();
    
    
   }
  
   
   // Ejercicio 1 parcial A
public static void ingresoNumeros(){
 
 Scanner sc = new Scanner(System.in);
 int numero =0 ,ite=0;
 while(true){
  numero +=validacion();
  ite++;
  if(numero >1000000){
  break;
  }
     System.out.println("El numero acomulado es: "+numero);
     System.out.println("Se necesitaron "+ite+" ingresos para superar el millon");
 }
 
 
 }  
public static int validacion(){
 
     Scanner sc = new Scanner(System.in);
     int numero=0;
 while(true){
     System.out.println("Ingrese un numero X (X>0 Y X<=100000)");
     numero= sc.nextInt();
 if(numero>0 && numero<=100000){
 break;
 }else System.out.println("Error: numero invalido");
 
 }
 
 
 return numero;
 } 
   // Ejercicio 2 parcial 
public static void cadena(){
Scanner sc = new Scanner(System.in);
String palabra, nuevaCadena="";

while(true){
System.out.println("Ingrese la cadena");
palabra = sc.nextLine();

if(palabra.length()>49 && validacionCadena(palabra)== true){
break;
}else System.out.println("Error: cadena no valida");
}

for(int i=0;i<palabra.length();i++){

if(palabra.charAt(i)=='0' || palabra.charAt(i)=='1' || palabra.charAt(i)=='2'
        ||palabra.charAt(i)=='3' || palabra.charAt(i)=='4' 
        || palabra.charAt(i)=='5' || palabra.charAt(i)=='6' 
        || palabra.charAt(i)=='7'|| palabra.charAt(i)=='8' 
        || palabra.charAt(i)=='9'){
    
   nuevaCadena += palabra.charAt(i);

}
}
for (int i=0;i<10;i++){
      
palabra = palabra.replace(String.valueOf(i),"");

}
    
    System.out.println(nuevaCadena);
    System.out.println("----------");
    System.out.println(palabra);

}
public static boolean validacionCadena(String palabra){
boolean resultado=true;

for(int i=0;i<palabra.length();i++){

    if(palabra.charAt(i) == ' '){
    resultado = false;
    }
   
}

return resultado;
}
// Ejercicio 3 parcial
public static void ejercicio3(){
    Scanner sc = new Scanner(System.in);
char [] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
int [] palabras = new int[10];

    System.out.println("Ingrese 10 elementos entre 0 y 26");

for(int i=0;i< palabras.length;i++){  
do{
    System.out.println("Ingrese el elemento "+(i+1));
    palabras[i]=sc.nextInt()-1;

}while(palabras[i]<0 || palabras[i]>26);

}
for(int i=0;i<10;i++){
    System.out.print(alfabeto[palabras[i]]);

}
}
// Ejercicio 4
public static void ejercicio4(){
    Scanner sc = new Scanner(System.in);
    int n = 0;
   

    System.out.println("Ingrese el tamaño del array N");
    n=sc.nextInt();
    int matrizOriginal[] =cargarMatriz(n);
       if(!validacionMatriz(matrizOriginal)){
           System.out.println("Error: la matriz ingresada tiene que tener numeros pares e impares");
       ejercicio4();
       }
      
    int arregloPar[]=matrizPar(matrizOriginal);
    int arregloImpar[] = matrizImpar(matrizOriginal);
    int matrizFinal[] = ultimaMatriz(arregloPar,arregloImpar);
    
    System.out.println("La matriz original es: ");
    mostrarArreglo(matrizOriginal);
    System.out.println("La matriz par es:");
    mostrarArreglo(arregloPar);
    System.out.println("La matriz impar es:");
    mostrarArreglo(arregloImpar);
    System.out.println("El resultado de la matriz par e impar es:");
    mostrarArreglo(matrizFinal);
}

public static int[] cargarMatriz(int n){
    Scanner sc = new Scanner(System.in);
int arreglo[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Ingrese el elemento "+(i+1));
    arreglo[i] =sc.nextInt();
    }
 return arreglo;   
}
public static int[] matrizPar(int arreglo[]){
int n=0;
for(int i=0;i<arreglo.length;i++){

   if((arreglo[i]%2)==0){
   n++;
   } 
}

int resultado[] = new int[n];

int j=0;
for(int i=0; i<arreglo.length;i++){
 if((arreglo[i]%2)==0){
   resultado[j]=arreglo[i];
   j++;
   } 
}
return resultado;
}
public static int[] matrizImpar(int arreglo[]){
int n=0;
for(int i=0;i<arreglo.length;i++){

   if((arreglo[i]%2)!=0){
   n++;
   } 
}

int resultado[] = new int[n];

int j=0;
for(int i=0; i<arreglo.length;i++){
 if((arreglo[i]%2)!=0){
   resultado[j]=arreglo[i];
   j++;
   } 
}
return resultado;
}
public static int[] ultimaMatriz(int arreglo1[],int arreglo2[]){
int [] resultado = new int[arreglo1.length];
    for(int i=0; i<arreglo1.length;i++){
    for(int j=0; j<arreglo2.length;j++){
    int multi = arreglo1[i]*arreglo2[j];
    resultado[i]= resultado[i]+multi;
    }
    }



return resultado;
}  
public static boolean validacionMatriz(int []arreglo){
    boolean bandera=false;
    int n=0, m=0;
    
for(int i=0;i<arreglo.length;i++){

   if((arreglo[i]%2)==0){
    n=2;
   } 
}
for(int i=0;i<arreglo.length;i++){

   if((arreglo[i]%2)!=0){
    m=2;
   } 
}
if(m==2 && n==2){
bandera= true;
}
return bandera;
}
public static void mostrarArreglo(int arreglo[]){
for(int i=0;i<arreglo.length;i++){
    System.out.print(arreglo[i]+" ");
}
    System.out.println(" ");
}
}
   
   
   
   
   
   
   
   
   


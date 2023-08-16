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
public class Ejercicio04 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> arreglo = new ArrayList<>();
    String palabraIngresada;
    
    
    while(true){
        System.out.println("Ingrese la palabra 'salir' para finalizar el programa");
        System.out.println("Ingrese una palabra");
    palabraIngresada=sc.nextLine();
    
    if(palabraIngresada.equals("salir")  /*palabraIngresada == "salir"*/){
        System.out.println("Programa Finalizado, muchas gracias");
    break;
    }else arreglo.add(palabraIngresada);
    }
    
     HashMap<String, Integer> map = new HashMap<String, Integer>();

    for (String palabra : arreglo) {
      if (map.containsKey(palabra)) {
        map.put(palabra, map.get(palabra) + 1);
      } else {
        map.put(palabra, 1);
      }
    }

    for (String palabra : map.keySet()) {
      System.out.println(palabra + " " + map.get(palabra));
    }
  }
}

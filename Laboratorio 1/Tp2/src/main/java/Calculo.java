
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicos
 */
public class Calculo {
    
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
     OperacionMatematica operaciones = new OperacionMatematica();
    
    System.out.println("Ingrese el primer numero: ");
   
    operaciones.setValor1(sc.nextDouble());
    
    System.out.println("Ingrese el segundo numero: ");
  
    operaciones.setValor2(sc.nextDouble());
    
    System.out.println("La suma de los numeros es: "+operaciones.aplicarOperacion("+"));
    System.out.println("La resta de los numeros es: "+operaciones.aplicarOperacion("-"));
    System.out.println("La multiplicacion de los numeros es: "+operaciones.aplicarOperacion("*"));
    System.out.println("La division de los numeros es: "+operaciones.aplicarOperacion("/"));
   
    
    
    }
    }

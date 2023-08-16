
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicos
 */
public class prueba {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Escriba un numero");
        
        int numero = 1596;
        numero = (numero/1000)%10;
        System.out.println("----------");
        System.out.println(numero);
    
    }
    
}

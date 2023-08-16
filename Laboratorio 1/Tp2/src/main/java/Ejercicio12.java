
import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[]args){
    
       Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una cadena");
        String cadena = sc.nextLine();
        String extraccionCadena = cadena.substring(3, 5);
        System.out.println("La 4ta y 5ta letra de la cadena es: "+ extraccionCadena);
        
        
    }
    
}

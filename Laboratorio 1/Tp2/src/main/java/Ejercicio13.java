
import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Escriba la primer cadena");
        String cadena1 = sc.nextLine();
        System.out.println("Escriba la segunda cadena");
        String cadena2 = sc.nextLine();
        
        System.out.println("La segunda cadena se encuentra dentro de la primer cadena?");
        System.out.println(cadena1.contains(cadena2));
    
    
    }
    
}

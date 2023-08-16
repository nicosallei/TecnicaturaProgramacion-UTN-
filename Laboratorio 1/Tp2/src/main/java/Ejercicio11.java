
import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la primer palabra");
        String palabra1 = sc.nextLine();
        System.out.println("Escriba la segunda palabra");
        String palabra2 = sc.nextLine();
        
        if(palabra1.equals(palabra2)){
            System.out.println("Las dos palabras escritas son iguales");
        }else{
            System.out.println("Las dos palabras escritas son distintas");
        }
    
    
    }
    
}

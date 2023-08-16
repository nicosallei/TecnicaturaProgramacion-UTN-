
import java.util.Scanner;


public class Ejercicio08 {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el String anterior");
        String dato = sc.nextLine();
        
        String cambioDeLetra= dato.toLowerCase().replace("a", "e");
        System.out.println("El String cambio todas las letras a por las e : "+cambioDeLetra);
        
    
    }
}


import java.util.Scanner;


public class Ejercicio23 {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String cadena;
Recursividad23 inv = new Recursividad23();
    System.out.println("Ingrese una frase");
    cadena = sc.nextLine();
    System.out.println("La frase invertida es: "+ inv.cadenaInversa(cadena,cadena.length()-1));




}    
}

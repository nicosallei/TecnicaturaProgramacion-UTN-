
import java.util.Scanner;


public class Ejercicio22 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int numero, resultado;
        System.out.println("Ingrese un numero para sumar sus valores:");
        numero = sc.nextInt();
        Recursividad22 recursividad22 = new Recursividad22();
        resultado = recursividad22.Suma(numero);
        System.out.println("El numero ingresado es: "+numero+"El resultado de la suma de sus digitos es: "+resultado);
        
        
                
    
    
    
    
    }
}

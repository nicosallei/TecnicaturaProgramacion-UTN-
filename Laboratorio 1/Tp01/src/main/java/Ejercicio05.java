
import java.util.Scanner;


public class Ejercicio05 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un numero para ver si es divisible entre 2");
        int numero = sc.nextInt();
        int resto = numero%2;
        
        if(resto == 0){
            System.out.println("El numero ingresado es divisible entre 2, ese numero es:"+" "+numero);
            
        }else {
            System.out.println("No es divisible el numero");
        }
    
    }
    
}

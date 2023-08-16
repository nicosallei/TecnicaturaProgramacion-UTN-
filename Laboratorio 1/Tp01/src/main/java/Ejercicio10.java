
import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numero;
    do{
        System.out.println("Escriba un numero mayor o igual a 0");
         numero =sc.nextInt();
        
    }while( numero < 0);
        System.out.println("El numero igual o mayor a cero ingresado es:"+" "+numero);
    }
}


import java.util.Scanner;


public class Ejercicio21 {
    
    public static void main (String[]args){
    
        Scanner sc = new Scanner (System.in);
        RecursividadVeintiuno recursividadVeintiuno = new RecursividadVeintiuno();
        int numero, resultado;
        
        System.out.println("Escriba un numero decimal mayor a 0");
        numero = sc.nextInt();
        if(numero >0){
            resultado=recursividadVeintiuno.Suma(numero);
            System.out.println("la suma anteriores hasta el numero que puso es; "+resultado);
            
        }else{
        
            System.out.println("El numero ingresado es incorrecto, tiene que ser mayor a 0 y un entero");
        }
        
    
    }
    
    


    
}

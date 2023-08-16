
import java.util.Scanner;


public class Ejercicio03 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in); 
     int numeroIngresado;
    do{
        System.out.println("Ingrese un numero de 3 digitos (100-999)");
     numeroIngresado = sc.nextInt();
    if(numeroIngresado>99 && numeroIngresado<1000){
         int b=(numeroIngresado/10)%10;  // Encuentra el primer numero
         int c =(numeroIngresado%10);    // encuentra el segundo numero
         int a =(numeroIngresado/10)/10; // encuentra el tercer numero
         System.out.println("la suma de los tres numeros es: "+(a+c+b));
    }else{
        System.out.println("No es un numero de 3 digitos, vuelva a intentar");
        System.out.println(" ");
    }
    
}while(numeroIngresado <100 || numeroIngresado >999);
    
}
}
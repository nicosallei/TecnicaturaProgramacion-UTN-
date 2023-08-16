
import java.util.Scanner;


public class Ejercicio07 {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una cadena");
        String cadena = sc.nextLine();
        int contador =0;
        cadena = cadena.toLowerCase();
        
        for(int x=0; x<cadena.length();x++){
        if(cadena.charAt(x)== 'a' || cadena.charAt(x)== 'e' ||cadena.charAt(x)== 'i' ||
                cadena.charAt(x)== 'o' || cadena.charAt(x)=='u'){
        
        contador++;
        
        }
        
        
        }
        System.out.println("La cantidad de vocales son: "+ contador);
        System.out.println("La cantidad de caracteres en la cadena(sin espacio en blanco) es: "+ cadena.replace(" ","").length());
    }
    
}

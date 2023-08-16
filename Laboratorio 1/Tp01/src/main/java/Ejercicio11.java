
import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String seguridad="mundo";
    int intentos=0;
    do{
        
        System.out.println("Escriba la contraseña:");
        String contraseña = sc.next();
             
    if(contraseña.equals(seguridad)){
        System.out.println("Acceso Correcto");
        intentos=3;
    }else{
    intentos +=1;
        System.out.println("Contraseña Incorrecto, le quedan "+(3-intentos)+" intentos");
               
    }
    if(intentos == 3){
        System.out.println("Acceso denegado");
    }
        
        
    }while(intentos != 3);
    }
}

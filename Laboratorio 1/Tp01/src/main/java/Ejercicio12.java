
import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner (System.in);
        int dia;
        do{
            System.out.println("Ingrese un numero del 1 al 7, siendo 1 el dia lunes y 7 el domingo");
         dia = sc.nextInt();
        
        
        if(dia>0 && dia<8){
        switch(dia){
        
            case 1,5:
                System.out.println("Es un dia laborable");
                break;
            case 6,7:
                System.out.println("No es un dia laborable");
                break;
        }
        }else{
            System.out.println("El numero ingresao es incorrecto");}
    }while(dia<=0 || dia>8);
    }
}

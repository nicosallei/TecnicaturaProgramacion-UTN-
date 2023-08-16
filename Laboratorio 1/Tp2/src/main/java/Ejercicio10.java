
import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase= sc.nextLine();
        System.out.println(" ");
        System.out.println("Si quiere que la frase este en minuscula escriba a");
        System.out.println("Si quiere que la frase este en mayuscula escriba b");
        System.out.println(" ");
        String valor = sc.nextLine();
        switch(valor){
            case "a":
                frase = frase.toLowerCase();
                break;
            case "b":
                frase = frase.toUpperCase();
                break;
            default:
                System.out.println("letra incorrecta");
     }
        System.out.println("----La frase es----");
        System.out.println(frase);
    
    }
}

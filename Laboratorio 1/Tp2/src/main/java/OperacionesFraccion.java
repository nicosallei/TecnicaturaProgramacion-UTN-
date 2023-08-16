
import java.util.Scanner;


public class OperacionesFraccion {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    Fraccion f1 = new Fraccion();
        System.out.println("Ingrese el numerador de la primera fraccion");
    f1.setNumerador(sc.nextInt());
        System.out.println("Ingrese el denominador de la primera fraccion");
    f1.setDenominador(sc.nextInt());
        System.out.println(" ");
    Fraccion f2 = new Fraccion();    
        System.out.println("Ingrese el numerador de la segunda fraccion");
    f2.setNumerador(sc.nextInt());
        System.out.println("Ingrese el denominador de la segunda fraccion");
    f2.setDenominador(sc.nextInt());
    
    
    Fraccion f = new Fraccion();
        System.out.println(f1+" + "+f2+" = "+ f.sumarFracciones(f1, f2));
        System.out.println(f1+" - "+f2+" = "+ f.restarFracciones(f1, f2));
        System.out.println(f1+" x "+f2+" = "+ f.multiplicarFracciones(f1, f2));
        System.out.println(f1+" / "+f2+" = "+ f.dividirFracciones(f1, f2));
    }
}

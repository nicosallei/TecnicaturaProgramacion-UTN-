
import java.util.Scanner;


public class Ejercicio06 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextFloat();
        double precioConIva = precio + (precio * 0.21);
        System.out.println("El precio a pagar con el iva del 21% es :"+ " " +precioConIva);
    }
}

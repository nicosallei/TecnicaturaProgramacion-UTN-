
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dividir01 {

    public static void main(String[] args) throws Exception {

        calcula();

    }

    public static float divide(float a, float b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        return a / b;
    }

    public static float calcula() {
        float result = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        float a = sc.nextFloat();
        System.out.println("Ingrese el valor de b");
        float b = sc.nextFloat();

        try {
            result = a - b + divide(a, b);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("Error en el metodo dividir, vuelva a escribir los valores");
            calcula();

        } finally {
            //System.out.println(result);
        }
        return result;

    }

}

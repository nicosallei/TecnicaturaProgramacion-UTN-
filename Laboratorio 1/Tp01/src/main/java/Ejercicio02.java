
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio02 {
    public static void main(String[] args){
    
// Pedir el nombre y decir bienvendio + nombre (por consola) 
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String name = sc.nextLine();
        System.out.println("Bienvenido"+" "+name);
        
        
// pedir el nombre y decir bienvenido + nombre  (en una ventana)         
    String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
    JOptionPane.showMessageDialog(null, "Bienvenido"+" "+ nombre);
    }
}

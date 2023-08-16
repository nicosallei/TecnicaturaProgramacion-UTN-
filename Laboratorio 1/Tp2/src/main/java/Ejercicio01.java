
import java.util.Scanner;


public class Ejercicio01 {
    public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
         double valorDecimal = sc.nextDouble();
        
        
        /*
        valorDecimal = (short)valorDecimal;
        System.out.println("El numero de tipo short es:"+ valorDecimal );
        valorDecimal = (int)valorDecimal;
        System.out.println("El numero de tipo int es:"+ valorDecimal);
        valorDecimal = (long)valorDecimal;
        System.out.println("El numero de tipo long es:"+ valorDecimal);
       */
        
    //////////////////////////////////////////////////////////////////////////    
        short s_val = (short)valorDecimal;
        System.out.println("El numero de tipo short es:"+ s_val );
        int i_val =(int)valorDecimal;
        System.out.println("El numero de tipo int es:"+ i_val);
        long l_val = (long)valorDecimal;
        System.out.println("El numero de tipo long es:"+ l_val);
    ///////////////////////////////////////////////////////////////////////////
    
          String dato = String.valueOf(valorDecimal);
          System.out.println("El numero de tipo String es:"+ dato);
          float f_val = Float.valueOf(dato);
          System.out.println("El numero de tipo float es:"+ f_val);
          System.out.println("-------------------------------------");
          float ff_val=(float)valorDecimal;
          System.out.println("El numero de tipo float es:"+ ff_val);
          
          
    }
}

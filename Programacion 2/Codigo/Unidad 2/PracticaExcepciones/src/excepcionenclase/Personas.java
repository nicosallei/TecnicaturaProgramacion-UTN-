
package excepcionenclase;

import java.util.Scanner;


public class Personas {
    String nombre;
   public Documento d;

    public Personas(String N,String tipoDoc,String numeroDoc) {
 
        this.nombre=N;
        try{  
        this.d=new Documento(tipoDoc,numeroDoc);
        }catch (Exception ex){
        
            System.out.println("El tipo o el numero de documento es erroneo");
            System.out.println("Vuelva a escribir los datos");
            Scanner sc = new Scanner(System.in);
            System.out.println("Escriba el tipo de documento");
            String tipo=sc.next();
            System.out.println("Escriba el numero de documento");
            String documento=sc.next();
            new Persona(N,tipo,documento);
        }
    }
   
}

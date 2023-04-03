
package diagrama_01;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total=0;
     
     
     Factura fa = new Factura();
     
     fa.setFecha(new Fecha());
     fa.getFecha().setDia(28);
     fa.getFecha().setMes(03);
     fa.getFecha().setAnio(2023);
     fa.setTipo('A');
     fa.setNumero(1);
     fa.setMcliente(new Cliente(112,"Verduleria S.A"));
     
     fa.AddProducto(new Producto(111,"Banana",65));
     fa.AddProducto(new Producto(18,"Manzana",85));
     fa.AddProducto(new Producto(27,"Pera",33));
     
   
   fa.mostrar();
     
   
    }
    
    
    

}

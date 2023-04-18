package diagrama05;

import java.util.Date;


public class Main {

    
    public static void main(String[] args) {
        
  
        Factura factura1 = new Factura(new Date(),1264,39768444,"Pedro","Sanchez",2039768444,38456847,"Juan","Marin",2038456847,01,new Date(),25879);
        factura1.getClie().get(0).addTarjeta(new Date(), 24586);
        factura1.getClie().get(0).addTarjeta(new Date(), 68975);
        factura1.addCliente(40587984, "Maria", "Blanco", 2040587984);
        factura1.getClie().get(1).addTarjeta(new Date(),78945);
        factura1.addEmpleado(new Date(),1148,4135879, "Mario", "Correa",2041358790);
        
    factura1.mostrar();
    }
    
}

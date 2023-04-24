package diagrama05;

import java.util.Date;


public class Main {

    
    public static void main(String[] args) {
        
  
        //Factura factura1 = new Factura(new Date(),1264,39768444,"Pedro","Sanchez",2039768444,38456847,"Juan","Marin",2038456847,01,new Date(),25879);
        //factura1.getClie().addTarjeta(new Date(), 24586);
        //factura1.getClie().addTarjeta(new Date(), 68975);
        //factura1.mostrar();
        Factura factura01=new Factura();
        factura01.setFecha(new Date());
        factura01.setClie(new Cliente(38456847,"Juan","Perez",2038456847));
        factura01.getClie().addTarjeta(new Date(), 24586);
        factura01.getClie().addTarjeta(new Date(), 68975);
        factura01.setEmp(new Empleado(new Date(),1264,39768444,"Nicolas","Sallei",2039768444));
        factura01.setNro_factura(1);
        factura01.setMonto(255879);
        factura01.mostrar();
        
    
    }
    
}

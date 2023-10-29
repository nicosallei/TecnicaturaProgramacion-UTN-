/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte_B;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Articulo art1= new Articulo(100,"Azucar",20,"U");
        Articulo art2= new Articulo(101,"Leche",30,"U");
        Articulo art3= new Articulo(102,"Aceite",50,"U");
        Articulo art4= new Articulo(103,"Sal",45,"U");
        Articulo art5= new Articulo(104,"Fideos",15,"U");
        Articulo art6= new Articulo(105,"Arroz",28,"U");
        Articulo art7= new Articulo(106,"Galletas",26,"U");
        Articulo art8= new Articulo(107,"Carne Molida",220,"Kg");
        Articulo art9= new Articulo(108,"Shampoo",42,"U");
        Articulo art10= new Articulo(109,"Queso Mantecoso",178,"Kg");
        Articulo art11= new Articulo(110,"Jamon Cocido",320,"Kg");
        Articulo art12= new Articulo(111,"Naranjas",80,"Kg");
        
        
        
        
        Cliente cli = new Cliente();
        Factura fac1= new Factura();
        
        DetalleFactura det01 = new DetalleFactura(100,"Azucar",20,"U");
        //art1.addDetalleFactura(det01);
        det01.setCantidad(4);
        
        System.out.println(det01.getArticulo().getCodigo());
        det01.subtotal();
        
        DetalleFactura det02= new DetalleFactura(110,"Jamon Cocido",320,"Kg");
        //art11.addDetalleFactura(det02);
        det02.setCantidad(2);
        det02.subtotal();
        
        DetalleFactura det03= new DetalleFactura(104,"Fideos",15,"U");
        //art5.addDetalleFactura(det03);
        det03.setCantidad(10);
        det03.subtotal();
        
        
        
        cli.setCuit(2039768444);
        cli.setNumero(01);
        cli.setRazonSocial("Nicolas Sallei");
        cli.addFactura(fac1);
        
        fac1.setLetra("C");
        fac1.setTipoPago("TC");
        fac1.setNumero(01);
        fac1.addDetalleFactura(det01);
        fac1.addDetalleFactura(det03);
        fac1.addDetalleFactura(det02);
        fac1.totalItems();
        fac1.recargo();
        fac1.totalFinal();
        
        cli.mostrar();
        
        
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import facturacion.Articulo;
import facturacion.DetalleFactura;
import facturacion.Factura;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gerardo
 */
public class FacturaManager {
    
    private Factura factura;
    private List<Articulo> articulosDataBase = new ArrayList<Articulo>();
    
    public void cargarArticulosDataBase(){
        this.articulosDataBase.add(new Articulo("100", "Azucar", 20, "U"));
        this.articulosDataBase.add(new Articulo("101", "Leche", 30, "U"));
        this.articulosDataBase.add(new Articulo("102", "Aceite", 50, "U"));
        this.articulosDataBase.add(new Articulo("103", "Sal", 45, "U"));
        this.articulosDataBase.add(new Articulo("104", "Fideos", 15, "U"));
        this.articulosDataBase.add(new Articulo("105", "Arroz", 42, "U"));
        this.articulosDataBase.add(new Articulo("106", "Galletas", 26, "U"));
        this.articulosDataBase.add(new Articulo("107", "Carne Molida", 220, "Kg"));
        this.articulosDataBase.add(new Articulo("108", "Shampoo", 42, "U"));
        this.articulosDataBase.add(new Articulo("109", "Queso Mantecoso", 178, "Kg"));
        this.articulosDataBase.add(new Articulo("110", "Jamon Cocido", 320, "Kg"));
        this.articulosDataBase.add(new Articulo("111", "Naranjas", 80, "Kg"));
    }
    
    public FacturaManager(Factura factura){
        this.factura = factura;
    }
    
    public void imprimirDatosFactura(){
         System.out.println("--------------FACTURA---------------");
        System.out.println("Fecha: " + this.factura.getFechaString());
        System.out.println("Numero: " + this.factura.getNumero());
        if(this.factura.getCliente() != null){
            System.out.println("Cliente: " + this.factura.getCliente().getRazonSocial());
            System.out.println("CUIT/CUIL: " + this.factura.getCliente().getCuit());
        }
        System.out.println("-----------ITEMS FACTURA-----------");
        System.out.println("CodArt\t\t"+rellenarCadena("Articulo")+"\t\tCant\t\tPrecio\t\tSubtotal");
        System.out.println("--------------------------------");
        for(DetalleFactura detalle : this.factura.getDetalles()){
            System.out.println(detalle.getArticulo().getCodigo() + "\t\t" + rellenarCadena(detalle.getArticulo().getDenominacion()) + "\t\t" + detalle.getCantidad() + "\t\t" + detalle.getArticulo().getPrecio() + "\t\t" + detalle.getSubTotal());
        }
        System.out.println("--------------------------------");
        System.out.println("SUBTOTAL: " + this.factura.getTotalItems());
        System.out.println("RECARGO: " + this.factura.getRecargo());
        System.out.println("TOTAL FINAL: " + this.factura.getTotalFinal());
    }
    
    public Articulo getArticuloXCodigo(String codigo){
        for(Articulo art : this.articulosDataBase){
            if(art.getCodigo().equals(codigo)){
                return art;
            }
        }
        return null;
    }
    
    private String rellenarCadena(String cadena){
        if(cadena.length() > 15){
            return cadena.substring(0, 15);
        }else{
            cadena = cadena + " ";
            return rellenarCadena(cadena);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_B;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class DetalleFactura {
    
    private int cantidad;
    private double subtotal;
    private Articulo articulo;

    public DetalleFactura(int codigo, String denominacion, double precio, String unidadMedida) {
        
        this.articulo= new Articulo(codigo,denominacion,precio,unidadMedida);
        
    }
    
   
    
    public void subtotal(){
    
    this.subtotal = this.getCantidad()*this.getArticulo().getPrecio();
    }

    public double getSubtotal() {
        return subtotal;
    }
    
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

   

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

  public void mostrar(){
  
      System.out.println(this.getArticulo().getCodigo()+"  "+this.getArticulo().getDenominacion()+"  "+this.getArticulo().getPrecio()+"  "+this.getCantidad()+"  "+this.getSubtotal());
 
  }
   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.ArrayList;
import java.util.Date;
import util.FuncionApp;

/**
 *
 * @author Alumno
 */
public class Factura {
    
    private Date fecha;
    private int numero;
    private double recargo;
    private String tipoPago;
    private double totalItems;
    private double totalFinal;
    private ArrayList<DetalleFactura> detalles; 
    private Cliente cliente;
  
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    } 

    public ArrayList<DetalleFactura> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleFactura> detalles) {
        this.detalles = detalles;
    }
    
    public void calcularTotalItems(){
    
        for(DetalleFactura detalle : this.getDetalles()){
            detalle.calcularSubTotal();
            this.totalItems += detalle.getSubTotal();
        }
    
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFechaString() {
        return FuncionApp.convertirDateToString(this.fecha);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(double totalItems) {
        this.totalItems = totalItems;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }
    
    public void calcularRecargo(){
        double montoRecargo = this.getTotalItems();
        if(this.tipoPago.equals("C")){
            montoRecargo = 0;
        }else if(this.tipoPago.equals("TD")){
            montoRecargo = montoRecargo * 0.05;
        }else if(this.tipoPago.equals("TC")){
            montoRecargo = montoRecargo * 0.1;
        } else{
            montoRecargo = 0;
        }
        this.setRecargo(montoRecargo);
    }
    
    public void calcularTotalFinal(){
        this.setTotalFinal(this.getTotalItems() + this.getRecargo());
    }
    
    
     
}

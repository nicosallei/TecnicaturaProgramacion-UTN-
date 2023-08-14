/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_B;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Factura {
    
    private String letra;
    private int numero;
    private double recargo;
    private String tipoPago;
    private double totalItem;
    private double totalFinal;
    private Date fecha;
    private ArrayList<DetalleFactura> detalleFactura = new ArrayList();

    public Factura() {
        
        this.setFecha(new Date());
    }

    public void addDetalleFactura(DetalleFactura detFactura){
    this.detalleFactura.add(detFactura);
    }
    
    
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
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

    public double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(ArrayList<DetalleFactura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }
    public void totalItems(){
    double suma=0;
    for (DetalleFactura det:detalleFactura){
    
        suma+=det.getSubtotal();
    
    }
    this.setTotalItem(suma);

    }
    public void recargo(){
    if(this.getTipoPago().toUpperCase()=="C"){
    this.setRecargo(0);
    
    }else if(this.getTipoPago().toUpperCase()=="TC"){
    this.setRecargo(this.getTotalItem()*0.1);
    }else if(this.getTipoPago().toUpperCase()=="TD"){
    this.setRecargo(this.getTotalItem()*0.05);
    }
    }
    
    public void totalFinal(){
    this.setTotalFinal(this.getTotalItem()+this.getRecargo());
    }
    
    public void mostrar(){
    
        System.out.println("Tipo de Factura: "+this.getLetra());
        System.out.println("Numero de Factura: "+this.getNumero());
        System.out.println("Fecha: "+this.getFecha());
        System.out.println("Tipo de pago: "+this.getTipoPago());
        
        for(DetalleFactura det: detalleFactura){
        det.mostrar();
        }
        System.out.println("Total Items: "+this.getTotalItem());
        System.out.println("Recargo: "+this.getRecargo());
        System.out.println("Total Final: "+this.getTotalFinal());
    }
}

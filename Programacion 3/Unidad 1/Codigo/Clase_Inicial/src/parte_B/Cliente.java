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
public class Cliente {
    private int numero;
    private String razonSocial;
    private long cuit;
    private ArrayList <Factura> factura = new ArrayList();

    public Cliente() {
    }
    
    public void addFactura(Factura fac){
    this.factura.add(fac);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Factura> getFactura() {
        return factura;
    }

    public void setFactura(ArrayList<Factura> factura) {
        this.factura = factura;
    }
    
    
    public void mostrar(){
    
        System.out.println("Numero cliente: "+this.getNumero());
        System.out.println("Razon Social: "+this.getRazonSocial());
        System.out.println("Cuit: "+this.getCuit());

        for(Factura fac : factura){
        
        fac.mostrar();
        }
        
        
    }
    
    
    
}

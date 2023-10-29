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
public class Articulo {
    private int codigo;
    private String denominacion;
    private double precio;
    private String unidadMedida;
    private ArrayList<DetalleFactura> detalleFactura = new ArrayList();
    public Articulo() {
    }

    public Articulo(int codigo, String denominacion, double precio, String unidadMedida) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
    }
    
    
    
    
    
    
    public void addDetalleFactura(DetalleFactura detFactura){
    this.detalleFactura.add(detFactura);
    }

    public ArrayList<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(ArrayList<DetalleFactura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}

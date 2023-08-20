package modelo;

import javax.persistence.*;

@Entity
public class FacturaDetalle extends EntityBean implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int cantidad;
    private double subTotal;
    private Factura factura;
    private Articulo articulo;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    // relacion muchos detalles de facturas a una factura: fk = idFactura
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idFactura")
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    // relacion muchos detalles de facturas a un articulo.fk = idArticulo
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idArticulo")
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public FacturaDetalle() {
    }
}

package modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Factura extends EntityApp implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Date fecha;
    private int numero;
    private double total;
    private List<FacturaDetalle> facturasDetalle;
    private Proveedor proveedor;

    @Temporal(TemporalType.DATE)
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    // relacion una factura a muchos detalles de facturas.pk = factura
    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    public List<FacturaDetalle> getFacturasDetalle() {
        return facturasDetalle;
    }

    public void setFacturasDetalle(List<FacturaDetalle> facturasDetalle) {
        this.facturasDetalle = facturasDetalle;
    }
    // relacion muchas facturas a un proveedor.fk = idProveedor
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idProveedor")
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Factura() {
    }
}

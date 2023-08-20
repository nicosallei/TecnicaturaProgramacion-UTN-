package modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Articulo extends EntityApp implements java.io.Serializable {

    private String denominacion;
    private int cantidad;
    private List<FacturaDetalle> facturasDetalle;
    private List<TipoArticulo> tiposDeArticulo;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    // Relacion un articulo muchos detalles de facturas.pk = articulo
    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL)
    public List<FacturaDetalle> getFacturasDetalle() {
        return facturasDetalle;
    }

    public void setFacturasDetalle(List<FacturaDetalle> facturasDetalle) {
        this.facturasDetalle = facturasDetalle;
    }

    public Articulo() {
    }

    @ManyToMany(fetch=FetchType.LAZY,
    targetEntity=TipoArticulo.class,
    cascade=CascadeType.ALL)
    @JoinTable(
    name="ARTICULO_TIPO_ARTICULO",
    joinColumns=@JoinColumn(name="ARTICULO_ID"),
    inverseJoinColumns=@JoinColumn(name="TIPO_ARTICULO_ID")
    )
    public List<TipoArticulo> getTiposDeArticulo() {
        return tiposDeArticulo;
    }

    public void setTiposDeArticulo(List<TipoArticulo> tiposDeArticulo) {
        this.tiposDeArticulo = tiposDeArticulo;
    }





}

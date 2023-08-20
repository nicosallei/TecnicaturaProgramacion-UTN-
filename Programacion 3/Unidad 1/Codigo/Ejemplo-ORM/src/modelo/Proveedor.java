package modelo;

import java.util.List;
import javax.persistence.*;

@Entity // hereda de entitybean
public class Proveedor extends EntityApp implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String cuit;
    private String razonSocial;
    private Domicilio domicilio;
    private List<Factura> facturas;    

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    // relacion un proveedor a un domicilio.pk = idDomicilio
    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "idDomicilio")
    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    // asociacion un proveedor muchas facturas.pk = proveedor
    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL)
    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public Proveedor() {
    }
}

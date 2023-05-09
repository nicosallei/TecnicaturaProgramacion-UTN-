public class Factura extends DocumentoVenta {
    
    private int numeroFactura;
    private TipoFactura tipoFactura;

    public Factura(int numeroFactura, TipoFactura tipoFactura, int numeroDocumentoVenta, double moto, EstadoPedido estado) {
        super(numeroDocumentoVenta, moto, estado);
        this.numeroFactura = numeroFactura;
        this.tipoFactura = tipoFactura;
    }

    public Factura(int numeroFactura, TipoFactura tipoFactura) {
        this.numeroFactura = numeroFactura;
        this.tipoFactura = tipoFactura;
    }

    public Factura() {
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public int getNumeroDocumentoVenta() {
        return numeroDocumentoVenta;
    }

    public void setNumeroDocumentoVenta(int numeroDocumentoVenta) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
    }

    public double getMoto() {
        return moto;
    }

    public void setMoto(double moto) {
        this.moto = moto;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    
    
}

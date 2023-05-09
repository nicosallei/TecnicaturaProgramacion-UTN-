public class Boleta extends DocumentoVenta {
   private int numeroBoleta;

    public Boleta(int numeroBoleta, int numeroDocumentoVenta, double moto, EstadoPedido estado) {
        super(numeroDocumentoVenta, moto, estado);
        this.numeroBoleta = numeroBoleta;
    }

    public Boleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public Boleta() {
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
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

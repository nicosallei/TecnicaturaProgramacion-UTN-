public class Tarjeta extends Pago {
    private int numeroTarjeta;

    public Tarjeta(int numeroTarjeta, int numeroPago, String descripcion, EstadoPedido estado, double montoTotal) {
        super(numeroPago, descripcion, estado, montoTotal);
        this.numeroTarjeta = numeroTarjeta;
    }

    public Tarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Tarjeta() {
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
}

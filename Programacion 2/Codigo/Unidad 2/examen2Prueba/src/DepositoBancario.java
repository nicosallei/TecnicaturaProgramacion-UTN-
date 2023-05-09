public class DepositoBancario extends Pago {
    private int numeroBoucher;

    public DepositoBancario(int numeroBoucher, int numeroPago, String descripcion, EstadoPedido estado, double montoTotal) {
        super(numeroPago, descripcion, estado, montoTotal);
        this.numeroBoucher = numeroBoucher;
    }

    public DepositoBancario(int numeroBoucher) {
        this.numeroBoucher = numeroBoucher;
    }

    public DepositoBancario() {
    }

    public int getNumeroBoucher() {
        return numeroBoucher;
    }

    public void setNumeroBoucher(int numeroBoucher) {
        this.numeroBoucher = numeroBoucher;
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

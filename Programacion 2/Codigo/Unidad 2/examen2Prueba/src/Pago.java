public class Pago implements Estado{

    protected int numeroPago;
    protected String descripcion;
    protected EstadoPedido estado;
    protected double montoTotal;

    public Pago(int numeroPago, String descripcion, EstadoPedido estado, double montoTotal) {
        this.numeroPago = numeroPago;
        this.descripcion = descripcion;
        this.estado = estado;
        this.montoTotal = montoTotal;
    }

    public Pago() {
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
    
    
    @Override
    public boolean estadoPedido(EstadoPedido estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

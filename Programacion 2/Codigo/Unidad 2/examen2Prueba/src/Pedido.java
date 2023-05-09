
import java.util.ArrayList;

public class Pedido implements Estado{

    private Producto producto;
    
    private int numeroPedido;
    private double monto;
    private EstadoPedido estado;
    
    
    private DocumentoVenta documentoVenta = new DocumentoVenta();
    private Pago pago = new Pago();
    private Entrega entrega;
    private ArrayList<DetallePedido> detallePedido = new ArrayList();

    public Pedido(int numeroPedido, double monto, EstadoPedido estado, Entrega entrega) {
        this.numeroPedido = numeroPedido;
        this.monto = monto;
        this.estado = estado;
        this.entrega = entrega;
    }

    public Pedido(int numeroPedido, double monto, EstadoPedido estado) {
        this.numeroPedido = numeroPedido;
        this.monto = monto;
        this.estado = estado;
    }
    

    public Pedido() {
    }

    public void addDetallePedido(DetallePedido detallePedido){
    this.detallePedido.add(detallePedido);
    detallePedido.getProducto().getDetallePedido().add(detallePedido);
    }
    public void removeDetallePedido(int posicion){
    this.detallePedido.remove(posicion);
    this.producto.getDetallePedido().remove(posicion);
    }
    
    
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public DocumentoVenta getDocumentoVenta() {
        return documentoVenta;
    }

    public void setDocumentoVenta(DocumentoVenta documentoVenta) {
        this.documentoVenta = documentoVenta;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public ArrayList<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(ArrayList<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

    @Override
    public boolean estadoPedido(EstadoPedido estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

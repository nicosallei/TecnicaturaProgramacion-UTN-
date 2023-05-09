
public class Delivery extends Entrega implements Estado{
    
    private double precio;
    private EstadoPedido estado;
    
    //private Repartidor repartidor;
    private Repartidor repartidor;

    public Delivery(double precio, EstadoPedido estado, int numeroEntrega, String descripcion) {
        super(numeroEntrega, descripcion);
        this.precio = precio;
        this.estado = estado;
    }

    public Delivery(double precio, EstadoPedido estado) {
        this.precio = precio;
        this.estado = estado;
    }

    public Delivery() {
    }

    
    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public int getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(int numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
    
    
    
    
    @Override
    public boolean estadoPedido(EstadoPedido estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

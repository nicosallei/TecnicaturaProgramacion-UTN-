public class DetallePedido {
    
    private int cantidad;
    private double precio;
    
    private Pedido pedido;
    private Producto producto;

    public DetallePedido(int cantidad, double precio, Pedido pedido, Producto producto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.pedido = pedido;
        this.producto = producto;
    }

    public DetallePedido() {
    }

  
  
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
}

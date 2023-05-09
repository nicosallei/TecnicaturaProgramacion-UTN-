
import java.util.ArrayList;

public class Producto {
    
    private Pedido pedido;
    
    private int numeroProducto;
    private String marca;
    private double precio;
    private int stock;
    
    private ArrayList<DetallePedido> detallePedido=new ArrayList();

    public Producto(int numeroProducto, String marca, double precio, int stock) {
        this.numeroProducto = numeroProducto;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }
    
    public void addDetallePedido(DetallePedido detallePedido){
    this.detallePedido.add(detallePedido);
    detallePedido.getPedido().getDetallePedido().add(detallePedido);
    }
    public void removeDetallePedido(int posicion){
    this.detallePedido.remove(posicion);
    pedido.getDetallePedido().remove(posicion);
    }
    

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(ArrayList<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }
    
    
    
}

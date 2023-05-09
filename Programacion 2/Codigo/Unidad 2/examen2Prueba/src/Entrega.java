
public class Entrega {
   
    protected int numeroEntrega;
    protected String descripcion;
    private Pedido pedido;

    public Entrega(int numeroEntrega, String descripcion) {
        this.numeroEntrega = numeroEntrega;
        this.descripcion = descripcion;
    }

    public Entrega() {
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
}

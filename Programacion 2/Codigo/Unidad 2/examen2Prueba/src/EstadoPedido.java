public enum EstadoPedido {
    
    ABIERTO(45),
    EN_PROCESO(15),
    CERRADO(0);
            
    private int estado;
    
    private EstadoPedido(int estado){
    this.estado=estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

   
    
    public void mostrar() {
        System.out.println("Al pedido le faltan: " + estado + " minutos");
    }

    
    
    
}

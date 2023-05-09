public class Main {

    
    public static void main(String[] args) {
        
      Producto producto1= new Producto(1,"natura",750,10);
      Producto producto2= new Producto(2,"Arcor",466.6,20);
      Producto producto3= new Producto(3,"Aceite",1800,3);
      
      Pedido pedido01= new Pedido(1,12000,EstadoPedido.EN_PROCESO);
      Pedido pedido02= new Pedido(2,4200,EstadoPedido.ABIERTO);
      Pedido pedido03 = new Pedido(3,7854,EstadoPedido.EN_PROCESO);
        
      DetallePedido detalle1 = new DetallePedido(1,950,pedido01,producto1);  
      
      
        Vendedor vendedor1 = new Vendedor(1);
        
        
        Cliente clie1 = new Cliente(1,"modesto lima","2613900633",pedido01);
        clie1.getPedido().addDetallePedido(detalle1);
        clie1.getPedido().addDetallePedido(new DetallePedido(2,1420,pedido01,producto2));
        clie1.getPedido().setEntrega(new Entrega());
        clie1.getPedido().getEntrega().setNumeroEntrega(1);
        clie1.getPedido().getEntrega().setDescripcion("comida para 4");
        //clie1.getPedido().getDocumentoVenta().
        
        pedido01.getEstado().mostrar();
        
        
        
        
                
                
               
                
                
                
                
                
                
      
    }
    
}


package diagrama_02;


public class Recibo extends Comprobante {
    
    private Proveedor proveedor = new Proveedor();
    private float total;
    private String detalle;
    
    public Recibo() {
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }


    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    public void mostrar (Recibo recibo){
  
      System.out.println("Fecha :"+recibo.getFecha().getDia()+"/"+recibo.getFecha().getMes()+"/"+recibo.getFecha().getAnio());
      System.out.println("tipo de comprobante: "+recibo.getTipo());
      System.out.println("numero de comprobante: "+recibo.getNumero());
      System.out.println("codigo de proveedor: "+recibo.getProveedor().getCodigo());
      System.out.println("Razon Social: "+recibo.getProveedor().getRazonSocial());
      System.out.println("Detalle: "+recibo.getDetalle());
      System.out.println("Total: "+recibo.getTotal());
  }  
}

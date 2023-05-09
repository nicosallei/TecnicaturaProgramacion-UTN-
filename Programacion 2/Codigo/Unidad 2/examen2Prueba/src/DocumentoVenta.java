
public class DocumentoVenta implements Estado{
   protected int numeroDocumentoVenta;
   protected double moto;
   protected EstadoPedido estado;

    public DocumentoVenta(int numeroDocumentoVenta, double moto, EstadoPedido estado) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
        this.moto = moto;
        this.estado = estado;
    }

    public DocumentoVenta() {
    }

    public int getNumeroDocumentoVenta() {
        return numeroDocumentoVenta;
    }

    public void setNumeroDocumentoVenta(int numeroDocumentoVenta) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
    }

    public double getMoto() {
        return moto;
    }

    public void setMoto(double moto) {
        this.moto = moto;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }


   
    @Override
    public boolean estadoPedido(EstadoPedido estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

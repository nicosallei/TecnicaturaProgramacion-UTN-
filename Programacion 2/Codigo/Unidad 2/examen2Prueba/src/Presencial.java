public class Presencial extends Entrega {

    public Presencial(int numeroEntrega, String descripcion) {
        super(numeroEntrega, descripcion);
    }

    public Presencial() {
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
    
    
    
}

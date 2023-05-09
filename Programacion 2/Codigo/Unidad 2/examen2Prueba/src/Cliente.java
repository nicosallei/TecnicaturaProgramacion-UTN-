
public class Cliente extends Persona {
    
    private int numeroCliente;
    private String direccionCliente;
    private String telefonoCliente;
    
    private Pedido pedido;

    public Cliente(int numeroCliente, String direccionCliente, String telefonoCliente, int dniPersona, String nombrePersona, String apellidoPersona,Pedido pedido) {
        super(dniPersona, nombrePersona, apellidoPersona);
        this.numeroCliente = numeroCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.pedido=pedido;
    }

    public Cliente(int numeroCliente, String direccionCliente, String telefonoCliente,Pedido pedido) {
        this.numeroCliente = numeroCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.pedido=pedido;
    }

    public Cliente() {
        this.pedido=new Pedido();
    }

    
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(int dniPersona) {
        this.dniPersona = dniPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
    
}

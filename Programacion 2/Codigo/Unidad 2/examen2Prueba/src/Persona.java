
public abstract class Persona {
    
    protected int dniPersona;
    protected String nombrePersona;
    protected String apellidoPersona;

    public Persona(int dniPersona, String nombrePersona, String apellidoPersona) {
        this.dniPersona = dniPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    
    
    public Persona() {
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

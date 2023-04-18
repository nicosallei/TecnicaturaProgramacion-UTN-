package diagrama05;

public class Proveedor extends Persona implements Estado_Cuenta {

    private String nombre_Comercial;

    public Proveedor(String nombre_Comercial, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.nombre_Comercial = nombre_Comercial;
    }

    

    @Override
    public long getCuit() {
        return cuit;
    }

    @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    @Override
    public boolean problemaVerazCodeme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getNombre_Comercial() {
        return nombre_Comercial;
    }

    public void setNombre_Comercial(String nombre_Comercial) {
        this.nombre_Comercial = nombre_Comercial;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}

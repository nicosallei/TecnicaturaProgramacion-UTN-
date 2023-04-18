package diagrama05;

import java.util.ArrayList;
import java.util.Date;


public class Cliente extends Persona implements Estado_Cuenta {
    
    public ArrayList<Tarjeta_de_Credito> credit_Car;//=new ArrayList<Tarjeta_de_Credito>();

    public Cliente(int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        
    }

    public void addTarjeta(Date fecha_Ingreso, double limite){
        if(this.credit_Car==null){
        this.credit_Car = new ArrayList<Tarjeta_de_Credito>();
        }
    credit_Car.add(new Tarjeta_de_Credito(fecha_Ingreso, limite));
    }
    
    @Override
    public long getCuit() {
        return cuit;
    }

    @Override
    public void setCuit(long cuit) {
       this.cuit=cuit; 
    }

    public ArrayList<Tarjeta_de_Credito> getCredit_Car() {
        return credit_Car;
    }

    public void setCredit_Car(ArrayList<Tarjeta_de_Credito> credit_Car) {
        this.credit_Car = credit_Car;
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

    @Override
    public boolean problemaVerazCodeme() {
    return false; 
    }
    
    
}

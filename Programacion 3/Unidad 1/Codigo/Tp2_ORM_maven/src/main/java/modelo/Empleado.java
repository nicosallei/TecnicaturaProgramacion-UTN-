package modelo;

import javax.persistence.Entity;


/**
 * @author Nicolas Sallei Correa
 */
@Entity
public class Empleado extends Persona implements java.io.Serializable {

    private int nroLegajo;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(int nroLegajo, double sueldo) {

        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }

  
    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}

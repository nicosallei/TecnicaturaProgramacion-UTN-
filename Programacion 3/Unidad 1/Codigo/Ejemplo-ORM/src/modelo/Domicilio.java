package modelo;

import javax.persistence.Entity;

@Entity
public class Domicilio extends EntityApp implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int numero;
    private String nombreCalle;

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

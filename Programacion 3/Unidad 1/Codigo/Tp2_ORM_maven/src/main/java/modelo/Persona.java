package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona implements java.io.Serializable {

    private int idPersona;
    private String nombre;
    private String apellido;

    private long dni;

    private Domicilio domicilio;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, long dni) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Id
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    @Column(name = "DNI", unique = true)
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @OneToOne(cascade = (CascadeType.ALL))
    @JoinColumn(name = "idDomicilio")
    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}

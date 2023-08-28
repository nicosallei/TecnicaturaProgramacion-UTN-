package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Nicolas Sallei Correa
 */
@Entity
public class Paciente extends Persona implements java.io.Serializable {

    private int nroSocio;
    private HistoriaClinica historiaClinica;
    private List<Turno> turno = new ArrayList();

    public Paciente() {
    }

    public Paciente(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public Paciente(int nroSocio, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.nroSocio = nroSocio;
    }


    public void addTurno(Turno turn) {
        this.turno.add(turn);
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    @OneToOne(cascade = (CascadeType.ALL))
    @JoinColumn(name = "idHistoriaClinica")
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    public List<Turno> getTurno() {
        return turno;
    }

    public void setTurno(List<Turno> turno) {
        this.turno = turno;
    }

}

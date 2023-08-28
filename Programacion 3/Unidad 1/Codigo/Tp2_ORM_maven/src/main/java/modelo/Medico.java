package modelo;

import java.util.ArrayList;
import util.FuncionApp;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author Nicolas Sallei Correa
 */
@Entity
public class Medico extends Persona implements java.io.Serializable {

    private int matricula;
    private long celular;
    private List<Turno> turno = new ArrayList();
    private List<Especialidad> especialidad= new ArrayList();

    public Medico() {
    }

    public Medico(int matricula, long celular) {
        this.matricula = matricula;
        this.celular = celular;
    }

    public Medico(int matricula, long celular, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.matricula = matricula;
        this.celular = celular;
    }


    public void addTurno(Turno turn) {
        this.turno.add(turn);
    }

    public void addEspecialidad(Especialidad especi) {
        this.especialidad.add(especi);
        especi.addMedico(this);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    public List<Turno> getTurno() {
        return turno;
    }

    public void setTurno(List<Turno> turno) {
        this.turno = turno;
    }

    @ManyToMany(fetch = FetchType.LAZY,
            targetEntity = Especialidad.class,
            cascade = CascadeType.ALL)
    @JoinTable(
            name = "MEDICO_ESPECIALIDAD",
            joinColumns = @JoinColumn(name = "MEDICO_ID"),
            inverseJoinColumns = @JoinColumn(name = "TIPO_ESPECIALIDAD_ID")
    )
    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }

}

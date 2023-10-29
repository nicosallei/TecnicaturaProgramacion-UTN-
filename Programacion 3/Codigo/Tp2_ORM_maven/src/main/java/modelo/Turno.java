package modelo;

import util.FuncionApp;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Nicolas Sallei Correa
 */
@Entity
public class Turno implements java.io.Serializable {

    private int idTurno;
    private Date fecha;
    private int hora;
    private int minutos;
    private Paciente paciente;
    private Medico medico;

    public Turno() {
    }

    public Turno(int idTurno, Date fecha, int hora, int minutos) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.hora = hora;
        this.minutos = minutos;
    }

    public Turno(int idTurno, Date fecha, int hora, int minutos, Paciente paciente, Medico medico) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.hora = hora;
        this.minutos = minutos;
        this.paciente = paciente;
        this.medico = medico;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idMedico")
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPaciente")
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Id
    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

}

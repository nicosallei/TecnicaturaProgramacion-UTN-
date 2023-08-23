package modelo;

import util.FuncionApp;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
public class Paciente extends Persona implements java.io.Serializable {

    private int nroSocio;

    private HistoriaClinica historiaClinica;
    private List<Turno> turno;

    public Paciente() {
    }

    public Paciente(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public Paciente(int nroSocio, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.nroSocio = nroSocio;
    }

    public void mostrarPaciente() {

        System.out.println("---- Paciente ----\n");
        System.out.println("Numero Socio: " + this.getNroSocio() + "\n");

        System.out.println("Apellido y Nombre: " + this.getApellido() + " " + this.getNombre());
        System.out.println("DNI: " + this.getDni());
        System.out.println("Localidad: " + this.getDomicilio().getLocalidad() + " Calle: " + this.getDomicilio().getCalle() + " Numero: " + this.getDomicilio().getNumero() + "\n");

    }

    public void mostrarHistorialClinico() {

        System.out.println("Hitoria Clinica ID: " + this.getHistoriaClinica().getIdHistoriaClinica());
        System.out.println("Fecha Alta: " + FuncionApp.convertirDateToString(this.getHistoriaClinica().getFechaAlta()) + "\n");

        System.out.println("-----  Detalle Hitoria Clinica  -----\n");

        for (DetalleHistoriaClinica detalle : this.historiaClinica.getDetalleHistoriaClinica()) {

            detalle.mostrarDetalle();
        }
    }

    public void mostrarTurnos() {

        for (Turno tur : turno) {

            tur.mostrar();
            tur.getMedico().mostrarMedico();

        }
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

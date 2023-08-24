package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
public class HistoriaClinica implements java.io.Serializable {

    private int idHistoriaClinica;
    private int numero;
    private Date fechaAlta;
    private Paciente paciente;
    private List<DetalleHistoriaClinica> detalleHistoriaClinica = new ArrayList();

    public HistoriaClinica() {
    }

    public HistoriaClinica(int idHistoriaClinica, int numero, Date fechaAlta) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.numero = numero;
        this.fechaAlta = fechaAlta;

    }

    public void addDetalleHistoriaClinica(DetalleHistoriaClinica detalle) {
        this.detalleHistoriaClinica.add(detalle);
    }

    @OneToOne(mappedBy = "historiaClinica")
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Id
    public int getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(int idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @OneToMany(mappedBy = "historiaClinica", cascade = CascadeType.ALL)
    public List<DetalleHistoriaClinica> getDetalleHistoriaClinica() {
        return detalleHistoriaClinica;
    }

    public void setDetalleHistoriaClinica(List<DetalleHistoriaClinica> detalleHistoriaClinica) {
        this.detalleHistoriaClinica = detalleHistoriaClinica;
    }

}

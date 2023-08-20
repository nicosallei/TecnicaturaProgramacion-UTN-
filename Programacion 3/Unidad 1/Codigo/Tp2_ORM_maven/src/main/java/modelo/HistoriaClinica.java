package modelo;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
public class HistoriaClinica {
    
    private int idHistoriaClinica;
    private int numero;
    private Date fechaAlta;
    
    private Paciente paciente;
    private ArrayList<DetalleHistoriaClinica> detalleHistoriaClinica = new ArrayList();

    public HistoriaClinica() {
    }

    public HistoriaClinica(int idHistoriaClinica, int numero, Date fechaAlta) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.numero = numero;
        this.fechaAlta = fechaAlta;
        
    }
    
    
    
    public void addDetalleHistoriaClinica(DetalleHistoriaClinica detalle){
    this.detalleHistoriaClinica.add(detalle);
    }

    @OneToOne(mappedBy="paciente")
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
    
    @OneToMany(mappedBy = "historiaClinica",cascade = CascadeType.ALL)
    public ArrayList<DetalleHistoriaClinica> getDetalleHistoriaClinica() {
        return detalleHistoriaClinica;
    }

    public void setDetalleHistoriaClinica(ArrayList<DetalleHistoriaClinica> detalleHistoriaClinica) {
        this.detalleHistoriaClinica = detalleHistoriaClinica;
    }
    
    
    
    
}

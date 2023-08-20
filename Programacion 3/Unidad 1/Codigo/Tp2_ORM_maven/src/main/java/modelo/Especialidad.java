package modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
public class Especialidad {
    
    private int idEspecialidad;
    private String denominacion;
    
    private ArrayList<Medico> medico = new ArrayList();

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String denominacion) {
        this.idEspecialidad = idEspecialidad;
        this.denominacion = denominacion;
    }
    
    
    public void addMedico(Medico medic){
    this.medico.add(medic);
    }
    
    @Id
    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public ArrayList<Medico> getMedico() {
        return medico;
    }

    public void setMedico(ArrayList<Medico> medico) {
        this.medico = medico;
    }
    
    
    
    
}

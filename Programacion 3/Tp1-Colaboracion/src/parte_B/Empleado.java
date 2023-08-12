/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_B;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Empleado {
    private String nombre;
    private long cuit;
    private String domicilio;
    private String email;
    
    private RegimenHorario regimenHorario;
    
    private ArrayList<Tardanza> tardanza = new ArrayList();
    private ArrayList<Asistencia> asistencia = new ArrayList();

    public Empleado() {
    }

    public void addTardanza(Tardanza tardanza){
    this.tardanza.add(tardanza);
    }
    public void addAsistencia(Asistencia asistencia){
    this.asistencia.add(asistencia);
    }
    
    public RegimenHorario getRegimenHorario() {
        return regimenHorario;
    }

    public void setRegimenHorario(RegimenHorario regimenHorario) {
        this.regimenHorario = regimenHorario;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Tardanza> getTardanza() {
        return tardanza;
    }

    public void setTardanza(ArrayList<Tardanza> tardanza) {
        this.tardanza = tardanza;
    }

    public ArrayList<Asistencia> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(ArrayList<Asistencia> asistencia) {
        this.asistencia = asistencia;
    }
    
    
}

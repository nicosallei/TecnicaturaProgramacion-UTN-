
import Util.FuncionApp;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas Sallei Correa
 */
public class DetalleHistoriaClinica {
    
    private int idDetalleHC;
    private Date fechaAtencion;
    private String sintomas;
    private String diagnostico;
    private String observaciones;
    
    private HistoriaClinica historiaClinica;

    public DetalleHistoriaClinica() {
    }

    public DetalleHistoriaClinica(int idDetalleHC, Date fechaAtencion, String sintomas, String diagnostico, String observaciones) {
        this.idDetalleHC = idDetalleHC;
        this.fechaAtencion = fechaAtencion;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
    }
    
    
    
    public void mostrarDetalle(){
    
        System.out.println("--- Detalle Clinico ---\n");
        System.out.println("Detalle ID: "+this.getIdDetalleHC());
        System.out.println("Fecha Atencion: "+FuncionApp.convertirDateToString(this.fechaAtencion));
        System.out.println("Sintomas: "+this.getSintomas());
        System.out.println("Diagnostico: "+this.getDiagnostico());
        System.out.println("Observaciones: "+this.getObservaciones());
    
    }

    public int getIdDetalleHC() {
        return idDetalleHC;
    }

    public void setIdDetalleHC(int idDetalleHC) {
        this.idDetalleHC = idDetalleHC;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    
    
            
    
    
}

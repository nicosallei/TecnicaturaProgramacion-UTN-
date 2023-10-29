/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_A;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Control {
    
    private int id;
    private String denominacion;
    private boolean esObligatorio;
    
    private ArrayList <Expediente> expediente = new ArrayList();
    private EstadoControl estadoControl;

    public EstadoControl getEstadoControl() {
        return estadoControl;
    }

    public void setEstadoControl(EstadoControl estadoControl) {
        this.estadoControl = estadoControl;
    }
    
    
    public Control() {
    }

    public Control(int id, String denominacion, boolean esObligatorio) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
    }
    
    
    public void addExpediente(Expediente expediente){
    this.expediente.add(expediente);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean isEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public ArrayList<Expediente> getExpediente() {
        return expediente;
    }

    public void setExpediente(ArrayList<Expediente> expediente) {
        this.expediente = expediente;
    }
    
    
    private String rellenarCadena(String cadena){
        if(cadena.length() > 15){
            return cadena.substring(0, 15);
        }else{
            cadena = cadena + " ";
            return rellenarCadena(cadena);
        }
    }
    
}

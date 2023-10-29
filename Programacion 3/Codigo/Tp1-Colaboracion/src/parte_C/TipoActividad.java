/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_C;

import java.util.ArrayList;
import util.FuncionApp;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class TipoActividad {
    
    private int codigo;
    private String denominacion;
    private double puntosAsignados;
    
    private ArrayList<Actividad> actividad = new ArrayList();

    public TipoActividad() {
    }

    public TipoActividad(int codigo, String denominacion, double puntosAsignados) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.puntosAsignados = puntosAsignados;
    }
    
    
    public void mostrar(){
    
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Denominacion: "+this.denominacion);
        System.out.println("Puntos Asignados: "+this.puntosAsignados);
        
        
        //duda de si se usa o no
        /*
        for(Actividad act: actividad){
        
        System.out.println("Fecha Inicio: "+FuncionApp.convertirDateToString(act.getFechaInicio()));
        System.out.println("Fecha Fin: "+FuncionApp.convertirDateToString(act.getFechaFin()));
        System.out.println("Nombre: "+act.getNombre());
        System.out.println("Descripcion: "+act.getDescripcion());
        
        }
    */
    }

    public void addActividad(Actividad actividad){
    this.actividad.add(actividad);
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPuntosAsignados() {
        return puntosAsignados;
    }

    public void setPuntosAsignados(double puntosAsignados) {
        this.puntosAsignados = puntosAsignados;
    }

    public ArrayList<Actividad> getActividad() {
        return actividad;
    }

    public void setActividad(ArrayList<Actividad> actividad) {
        this.actividad = actividad;
    }
    
    
    
}

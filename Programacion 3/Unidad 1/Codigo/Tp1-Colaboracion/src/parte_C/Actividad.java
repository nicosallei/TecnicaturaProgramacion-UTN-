/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_C;

import java.util.Date;
import util.FuncionApp;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Actividad {
    private Date fechaInicio;
    private Date fechaFin;
    private String nombre;
    private String descripcion;
    
    private TipoActividad tipoActividad;
    private Persona persona;

    public Actividad() {
    }

    public Actividad(Date fechaInicio, Date fechaFin, String nombre, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
       
    }
    
    public void mostrar(){
    
        System.out.println("Fecha Inicio: "+FuncionApp.convertirDateToString(this.fechaInicio));
        System.out.println("Fecha Fin: "+FuncionApp.convertirDateToString(this.fechaFin));
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Descripcion: "+this.descripcion);
        System.out.println(" ");
        System.out.println("-->Tipo actividad");
        System.out.println(" ");
        this.tipoActividad.mostrar();
    
    
    }
    

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
    
    
    
}

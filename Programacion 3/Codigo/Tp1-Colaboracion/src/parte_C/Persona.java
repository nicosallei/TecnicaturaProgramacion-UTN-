/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_C;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Persona {
    
    private String nombre;
    private String tipoDocumento;
    private long nroDocumento;
    private int telefono;
    private String email;
    private String celular;
    
    private Sector sector;
    private ArrayList<Actividad> actividad = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String tipoDocumento, long nroDocumento, int telefono, String email, String celular) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.telefono = telefono;
        this.email = email;
        this.celular = celular;
     
    }
    
    
    public void addActividad(Actividad actividad){
    this.actividad.add(actividad);
    }
    
    public void mostrar(){
    
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Tipo Documento: "+ this.tipoDocumento);
        System.out.println("Nro Documento: "+this.nroDocumento);
        System.out.println("Telefono: "+this.telefono);
        System.out.println("Email: "+this.email);
        System.out.println("Celular: "+this.celular);

            
        System.out.println(" ");
        for(Actividad act: actividad){
            System.out.println("--Actividad");
            System.out.println(" ");
            act.mostrar();
            
        }
        
    
    
    }

    // Metodo C.1
    public double totalPuntosAsignados(){
    double totalPuntos=0;
    for(Actividad act:actividad){
    totalPuntos+=act.getTipoActividad().getPuntosAsignados();
    }
    return totalPuntos;
    }
    
    // Metodo C.2
    public double totalPuntosAsignados(int codigo){
    double puntos=0;
        for(Actividad act:actividad){
        
        if(codigo == act.getTipoActividad().getCodigo()){
        puntos +=act.getTipoActividad().getPuntosAsignados();
        
        }
        }
    return puntos;    
    }
    
    // Metodo C.3
    public double totalPuntosAsignados(int codigo,int anio){
    
    double puntos=0;
        for(Actividad act:actividad){
        
        //if(codigo == act.getTipoActividad().getCodigo() && anio==act.getFechaFin().getYear()){
            if(codigo == act.getTipoActividad().getCodigo()){
                if(anio==act.getFechaFin().getYear()+1900){
        puntos +=act.getTipoActividad().getPuntosAsignados();
                }
        }
        }
    
    return puntos;
    }
    
//-------------------------------------------------------------------------------------------
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public ArrayList<Actividad> getActividad() {
        return actividad;
    }

    public void setActividad(ArrayList<Actividad> actividad) {
        this.actividad = actividad;
    }
    
    
    
}
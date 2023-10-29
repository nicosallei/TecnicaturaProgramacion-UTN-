/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_B;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public Empleado(String nombre, long cuit, String domicilio, String email) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.email = email;
    }
    
    public void mostrar(){
        System.out.println("------Empleado-----");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cuit: "+this.cuit);
        System.out.println("Domicilio: "+this.domicilio);
        System.out.println("Email: "+this.email);
        
         for(Asistencia asi:asistencia){
            System.out.println(" ");
            System.out.println("--> Asistencia");
            System.out.println(" ");
        asi.mostrar();
        }
        
        for(Tardanza tar:tardanza){
            System.out.println(" ");
            System.out.println("--> Tardanza -->");
            System.out.println(" ");
        tar.mostrar();
        }
       
    
    }

    
    // Metodo B.2
    public List<Asistencia> getAsistenciaXMesXAnio(int mes,int anio){
    List<Asistencia> lista = new ArrayList();
    
    for(Asistencia asis: asistencia){
    if(asis.getFecha().getMonth()==mes && asis.getFecha().getYear()==anio){
    lista.add(asis);
    }
    }
    return lista;
    }
    
    // Metodo B.3
    //List<Tardanza>
    public  void  getDiasConTardanza(int mes, int anio){
    List<Tardanza> lista = new ArrayList();
        for(Asistencia asis: asistencia){
        
        if(asis.getHora()!=this.regimenHorario.getHoraIngreso() || this.regimenHorario.getMinutoIngreso()-asis.getMinuto() < -16){
        
            addTardanza(asis.getId(),asis.getTipo(),asis.getFecha(),asis.getMinuto(),asis.getHora()); 
        }
        }
    for(Tardanza tard: tardanza){
    if(tard.getFecha().getMonth()==mes && tard.getFecha().getYear()==anio){
    lista.add(tard);
    }
    }
    //return lista;
    }
    
//-------------------------------------------------------------------------------------------------------
    
    public void addTardanza(long id, String tipo, Date fecha, int minuto,int hora){
    this.tardanza.add(new Tardanza(id,tipo,fecha,minuto,hora));
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
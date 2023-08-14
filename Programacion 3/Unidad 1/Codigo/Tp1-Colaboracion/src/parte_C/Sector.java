/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_C;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Sector {
    
    private int numero;
    private String denominacion;
    private String tipo;
    
    
    private ArrayList<Persona> persona = new ArrayList();
    private ArrayList<Sector> sector = new ArrayList();

    public Sector() {
    }

    // Metodo C.4
    public List<Sector> obtenerTotalSubsectores(){
    List<Sector> totalSubsectores = new ArrayList();
    obtenerSubsectoresRecursivos(this,totalSubsectores);
    return totalSubsectores;
    
    }
    public void obtenerSubsectoresRecursivos(Sector sector, List<Sector> totalSubsectores){
    totalSubsectores.add(sector);
    for(Sector subsector: sector.sector)
        obtenerSubsectoresRecursivos(subsector,totalSubsectores);
    }
    
    //------------------------------------------------------------------------
    
    public void addSector(Sector sector){
    this.sector.add(sector);
    }
    public void addPersona(Persona persona){
    this.persona.add(persona);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
    }

    public ArrayList<Sector> getSector() {
        return sector;
    }

    public void setSector(ArrayList<Sector> sector) {
        this.sector = sector;
    }
    
    
    
}

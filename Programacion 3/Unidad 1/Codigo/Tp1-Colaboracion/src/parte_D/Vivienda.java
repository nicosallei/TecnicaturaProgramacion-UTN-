/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_D;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Vivienda {
    
    private long id;
    private String calle;
    private int numeroCalle;
    private double superficieTerreno;
    
    private Barrio barrio;
    private ArrayList<Habitacion> habitacion = new ArrayList();

    public Vivienda() {
    }

    // Metodo D.2
    public double getMetrosCuadradosCubiertos() throws Exception{
    double totalMetros=0;
    for(Habitacion hab:habitacion){
    
    totalMetros+=hab.getMetrosCuadrados();
    
    }
    if(totalMetros> this.superficieTerreno){
    
    throw new Exception("La superficie cubierta no puede ser mayor a la superficie del terreno");
    }
    return totalMetros;
    }
    
    
 
    public ArrayList<Habitacion> getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(ArrayList<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public double getSuperficieTerreno() {
        return superficieTerreno;
    }

    public void setSuperficieTerreno(double superficieTerreno) {
        this.superficieTerreno = superficieTerreno;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
    
    
    
}

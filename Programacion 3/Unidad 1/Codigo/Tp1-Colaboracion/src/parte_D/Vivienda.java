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

    public void addHabitacion(Habitacion habitacion){
    this.habitacion.add(habitacion);
    }    
    
    public Vivienda(long id, String calle, int numeroCalle, double superficieTerreno) {
        this.id = id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.superficieTerreno = superficieTerreno;
    }

    public void mostrar() throws Exception{
    
        System.out.println("Vivienda ID: "+this.id);
        System.out.println("Calle: "+this.calle);
        System.out.println("Numero de calle: "+this.numeroCalle);
        System.out.println("Superficie Terreno: "+this.superficieTerreno);
        
        
        for(Habitacion hab: habitacion){
            System.out.println(" ");
            System.out.println("--Habitacion--");
        hab.mostrar();
        }
        
        System.out.println("Metros cuadrados cubiertos de la vivienda: "+getMetrosCuadradosCubiertos());
        
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

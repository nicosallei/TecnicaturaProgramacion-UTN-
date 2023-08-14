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
public class Barrio {
    
    private long id;
    private String nombre;
    private String empresaConstructora;
    
    private ArrayList<Vivienda> vivienda = new ArrayList();

    public Barrio() {
    }
    
    
    // Metodo D.1
    public double getSuperficieTotalTerreno(){
    double total=0;
    
    for(Vivienda vivi:vivienda){
    total += vivi.getSuperficieTerreno();
    }
    return total;
    }
    
    
    // Metodo D.3
    public double getSuperficieTotalCubierta() throws Exception{
    double totalMetros=0;
    
    
    for(Vivienda vivi: vivienda){
    for(Habitacion hab: vivi.getHabitacion()){
    
    totalMetros+=hab.getMetrosCuadrados();
    
    }
    if(totalMetros> vivi.getSuperficieTerreno()){
    
    throw new Exception("La superficie cubierta no puede ser mayor a la superficie del terreno");
    }
    }
    return totalMetros;
    
    }
    
    //-----------------------------------------------------------------------------------------

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaConstructora() {
        return empresaConstructora;
    }

    public void setEmpresaConstructora(String empresaConstructora) {
        this.empresaConstructora = empresaConstructora;
    }

    public ArrayList<Vivienda> getVivienda() {
        return vivienda;
    }

    public void setVivienda(ArrayList<Vivienda> vivienda) {
        this.vivienda = vivienda;
    }
    
    
}
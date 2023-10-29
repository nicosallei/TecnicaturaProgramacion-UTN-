/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_D;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Habitacion {
    private long id;
    private String nombre;
    private long metrosCuadrados;
    
    private Vivienda vivienda;

    public Habitacion() {
    }

    public Habitacion(long id, String nombre, long metrosCuadrados) {
        this.id = id;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public void mostrar(){
        
        System.out.println("Habitacion ID: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Metros Cuadrados: "+this.metrosCuadrados);
    }
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

    public long getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(long metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }
    
    
}
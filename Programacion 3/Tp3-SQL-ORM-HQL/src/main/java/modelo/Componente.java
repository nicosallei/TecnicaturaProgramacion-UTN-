/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
public class Componente extends EntityBean {
    
    
    private String nombre;
    private String nroSerie;
    
    private Computadora computadora;

    public Componente() {
    }

    public Componente(String nombre, String nroSerie) {
        
        this.nombre = nombre;
        this.nroSerie = nroSerie;
    }
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    
    
    
}

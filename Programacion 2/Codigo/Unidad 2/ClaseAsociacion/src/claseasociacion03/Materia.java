/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseasociacion03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicos
 */
public class Materia {
    private String nombre;
    private List<Inscripcion> inscripciones;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.inscripciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
        inscripcion.getEstudiante().getInscripciones().add(inscripcion);
    }

 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseasociacion02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicos
 */
public class Estudiante {
        private String nombre;
    private List<Materia> materias;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
        materia.agregarEstudiante(this);
    }



}

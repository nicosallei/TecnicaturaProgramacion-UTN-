/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseasociacion03;

/**
 *
 * @author nicos
 */
public class Inscripcion {
    private Estudiante estudiante;
    private Materia materia;
    private int nota;

    public Inscripcion(Estudiante estudiante, Materia materia, int nota) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public int getNota() {
        return nota;
    }


}

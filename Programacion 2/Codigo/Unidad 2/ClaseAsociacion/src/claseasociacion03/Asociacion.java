/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseasociacion03;

/**
 *
 * @author nicos
 */
public class Asociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("Maria");

        Materia materia1 = new Materia("Matemáticas");
        Materia materia2 = new Materia("Historia");

        Inscripcion inscripcion1 = new Inscripcion(estudiante1, materia1, 85);
        Inscripcion inscripcion2 = new Inscripcion(estudiante1, materia2, 75);
        Inscripcion inscripcion3 = new Inscripcion(estudiante2, materia1, 90);

        estudiante1.agregarInscripcion(inscripcion1);
        estudiante1.agregarInscripcion(inscripcion2);
        estudiante2.agregarInscripcion(inscripcion3);

        System.out.println("Notas de " + estudiante1.getNombre() + ":");
        for (Inscripcion inscripcion : estudiante1.getInscripciones()) {
            System.out.println(inscripcion.getMateria().getNombre() + ": " + inscripcion.getNota());
        }

        System.out.println("Estudiantes en " + materia1.getNombre() + ":");
        for (Inscripcion inscripcion : materia1.getInscripciones()) {
            System.out.println(inscripcion.getEstudiante().getNombre() + ": " + inscripcion.getNota());
        }

    }
    
}

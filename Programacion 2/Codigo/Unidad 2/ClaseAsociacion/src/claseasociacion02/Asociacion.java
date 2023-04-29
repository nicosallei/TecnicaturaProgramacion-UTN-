/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseasociacion02;

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

        estudiante1.agregarMateria(materia1);
        estudiante1.agregarMateria(materia2);
        estudiante2.agregarMateria(materia1);

        System.out.println("Materias de " + estudiante1.getNombre() + ":");
        for (Materia materia : estudiante1.getMaterias()) {
            System.out.println(materia.getNombre());
        }

        System.out.println("Estudiantes en " + materia1.getNombre() + ":");
        for (Estudiante estudiante : materia1.getEstudiantes()) {
            System.out.println(estudiante.getNombre());
        }

    }
    
}

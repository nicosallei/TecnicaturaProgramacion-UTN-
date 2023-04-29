/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseasociacion01;

/**
 *
 * @author nicos
 */
public class Simulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia matematicas = new Materia("Matematicas");
        Materia fisica = new Materia("Fisica");
        Materia quimica = new Materia("Quimica");

        Estudiante juan = new Estudiante("Juan");
        juan.agregarMateria(matematicas);
        juan.agregarMateria(fisica);

        Estudiante maria = new Estudiante("Maria");
        maria.agregarMateria(matematicas);
        maria.agregarMateria(quimica);

        Estudiante pedro = new Estudiante("Pedro");
        pedro.agregarMateria(matematicas);
        pedro.agregarMateria(fisica);
        pedro.agregarMateria(quimica);

        System.out.println("La materia " + matematicas.getNombre() + " es cursada por los estudiantes:");
        for (Estudiante estudiante : matematicas.getEstudiantes()) {
            System.out.println(estudiante.getNombre());
        }

        System.out.println("El estudiante " + juan.getNombre() + " cursa las materias:");
        for (Materia materia : juan.getMaterias()) {
            System.out.println(materia.getNombre());
        }

    }
    
}

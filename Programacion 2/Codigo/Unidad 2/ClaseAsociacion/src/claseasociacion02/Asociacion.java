
package claseasociacion02;


public class Asociacion {

   
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

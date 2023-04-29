package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class Soluciones {
    private String alternativas;
    private List<Estudiante> estudiantes = new ArrayList();
    public Soluciones() {
    }
    public void addEstudiantes(Estudiante estudiante){
    
    this.estudiantes.add(estudiante);
    }
public void removeEstudiantes(int lugar){
this.estudiantes.remove(lugar);
}
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    

    public Soluciones(String alternativas,Estudiante estudiantes) {
        this.alternativas = alternativas;
        this.estudiantes.add(estudiantes);
    }

    public String getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }

   
    
}

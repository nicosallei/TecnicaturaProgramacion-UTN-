package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class Soluciones {
    private String alternativas;
    private List<EstudianteSoluciones> estudianteSoluciones = new ArrayList();
    private Estudiante estudiante;
    
    public Soluciones() {
    }

    public Soluciones(String alternativas) {
        this.alternativas = alternativas;
    }

    public void addEstudianteSoluciones(EstudianteSoluciones estudianteSoluciones){
    this.estudianteSoluciones.add(estudianteSoluciones);
    estudianteSoluciones.getEstudiante().getEstudianteSoluciones().add(estudianteSoluciones);
    }
    public void removeEstudianteSoluciones(int lugar){
    this.estudianteSoluciones.remove(lugar);
    estudiante.getEstudianteSoluciones().remove(lugar);
    }
    
    
    public String getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }

    public List<EstudianteSoluciones> getEstudianteSoluciones() {
        return estudianteSoluciones;
    }

    public void setEstudianteSoluciones(List<EstudianteSoluciones> estudianteSoluciones) {
        this.estudianteSoluciones = estudianteSoluciones;
    }
     public String escoger() {
        return "El estudiante  escogio la alternativa: " + alternativas;
    }
}

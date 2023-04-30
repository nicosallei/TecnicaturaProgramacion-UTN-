
package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class Estudiante {
private Soluciones soluciones;    
private int aspiranteAGrado;
private List<EstudianteSoluciones> estudianteSoluciones = new ArrayList(); 
private List<Universidad> universidades = new ArrayList();
private ProyectoDeGrado proyectoDeGrado;
private EjecucionDelProyecto ejecuccionDelProyecto;
private List<PersonalDocente> personalDocentes = new ArrayList();

    public Estudiante(int aspiranteAGrado,EstudianteSoluciones estudianteSoluciones) {
        this.aspiranteAGrado = aspiranteAGrado;
        this.estudianteSoluciones.add(estudianteSoluciones);
    }

    public Estudiante() {
    }
    
    public void addEstudianteSolucion (EstudianteSoluciones estudianteSolucion){
    this.estudianteSoluciones.add(estudianteSolucion);
    estudianteSolucion.getSoluciones().getEstudianteSoluciones().add(estudianteSolucion);
    }
    public void addUniversidad(Universidad universidad){
    this.universidades.add(universidad);
    }
    public void removeUniversidad(int lugar){
    this.universidades.remove(lugar);
    }
    public void removeEstudianteSolucion(int lugar){
    this.estudianteSoluciones.remove(lugar);
    soluciones.getEstudianteSoluciones().remove(lugar);
    }
   
    public void addPersonalDocente(PersonalDocente personalDocente){
    this.personalDocentes.add(personalDocente);
    }
    public void removePersonalDocente(int lugar){
    this.personalDocentes.remove(lugar);
    }

    public ProyectoDeGrado getProyectoDeGrado() {
        return proyectoDeGrado;
    }

    public void setProyectoDeGrado(ProyectoDeGrado proyectoDeGrado) {
        this.proyectoDeGrado = proyectoDeGrado;
    }

    public EjecucionDelProyecto getEjecuccionDelProyecto() {
        return ejecuccionDelProyecto;
    }

    public void setEjecuccionDelProyecto(EjecucionDelProyecto ejecuccionDelProyecto) {
        this.ejecuccionDelProyecto = ejecuccionDelProyecto;
    }

    public List<PersonalDocente> getPersonalDocentes() {
        return personalDocentes;
    }

    public void setPersonalDocentes(List<PersonalDocente> personalDocentes) {
        this.personalDocentes = personalDocentes;
    }

 
    public List<Universidad> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(List<Universidad> universidades) {
        this.universidades = universidades;
    }



    
    
    public int getAspiranteAGrado() {
        return aspiranteAGrado;
    }

    public void setAspiranteAGrado(int aspiranteAGrado) {
        this.aspiranteAGrado = aspiranteAGrado;
    }

    public List<EstudianteSoluciones> getEstudianteSoluciones() {
        return estudianteSoluciones;
    }

    public void setEstudianteSoluciones(List<EstudianteSoluciones> estudianteSoluciones) {
        this.estudianteSoluciones = estudianteSoluciones;
    }

}

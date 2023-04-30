package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class EjecucionDelProyecto {
private String proyectoDeGradoTerminado;
private int recursosdisponibles;
private Resultados restulado = new Resultados();
private List<PersonalDocente> personalDocente=new ArrayList();
private List<Estudiante> estudiante=new ArrayList();

    public EjecucionDelProyecto() {
    }

    public EjecucionDelProyecto(String proyectoDeGradoTerminado) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
    }

    public String getProyectoDeGradoTerminado() {
        return proyectoDeGradoTerminado;
    }

public void addEstudiante(Estudiante estudiante){
this.estudiante.add(estudiante);
}
public void removeEstudiante(int lugar){
this.estudiante.remove(lugar);
}
public void addPersonalDocente(PersonalDocente personal){
this.personalDocente.add(personal);
}
public void removePersonalDocente(int lugar){
this.personalDocente.remove(lugar);
}

    public List<PersonalDocente> getPersonalDocente() {
        return personalDocente;
    }

    public void setPersonalDocente(List<PersonalDocente> personalDocente) {
        this.personalDocente = personalDocente;
    }

    public List<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }
    

    public void setProyectoDeGradoTerminado(String proyectoDeGradoTerminado) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
    }

    public Resultados getRestulado() {
        return restulado;
    }

    public void setRestulado(Resultados restulado) {
        this.restulado = restulado;
    }



    public int getRecursosdisponibles() {
        return recursosdisponibles;
    }

    public void setRecursosdisponibles(int recursosdisponibles) {
        this.recursosdisponibles = recursosdisponibles;
    }


}

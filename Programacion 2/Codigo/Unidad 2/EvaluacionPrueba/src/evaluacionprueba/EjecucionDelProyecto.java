package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class EjecucionDelProyecto {
private String proyectoDeGradoTerminado;
private int recursosDisponibles;
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



    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosdisponibles) {
        this.recursosDisponibles = recursosdisponibles;
    }

       public String comenzarDesarrolloDelProyecto(Estudiante estudiante) {
        if (this.recursosDisponibles > estudiante.getProyectoDeGrado().getCosto()) {
            restulado.setImplementacionFinalizada("Activo");
            return restulado.efectosPositivosyNegativos();
        } else {
            restulado.setImplementacionFinalizada("No Activo");
            return restulado.efectosPositivosyNegativos();
        }
    }

    public String FinalizarDesarrolloDelProyecto() {
        if (proyectoDeGradoTerminado.equalsIgnoreCase("Terminado")) {
            restulado.setImplementacionFinalizada("aprobado");
            return restulado.medidasDeSatisfaccionDeDiferentesAspectos();
        } else {
            restulado.setImplementacionFinalizada("desaprobado");
            return restulado.medidasDeSatisfaccionDeDiferentesAspectos();
        }
    }

}

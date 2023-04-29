
package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class Estudiante {
    
private int aspiranteAGrado;
private List<Soluciones> soluciones = new ArrayList(); 
private List<Universidad> universidades = new ArrayList();
private ProyectoDeGrado proyectoDeGrado;
private EjecucionDelProyecto ejecuccionDelProyecto;
private List<PersonalDocente> personalDocentes = new ArrayList();

    public Estudiante(int aspiranteAGrado,Soluciones soluciones) {
        this.aspiranteAGrado = aspiranteAGrado;
        this.soluciones.add(soluciones);
    }

    public Estudiante() {
    }
    
    public void addSolucion (Soluciones solucion){
    this.soluciones.add(solucion);
    }
    public void addUniversidad(Universidad universidad){
    this.universidades.add(universidad);
    }
    public void removeUniversidad(int lugar){
    this.universidades.remove(lugar);
    }
    public void removeSolucion(int lugar){
    this.soluciones.remove(lugar);
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

    public List<Soluciones> getSoluciones() {
        return soluciones;
    }

    public void setSoluciones(List<Soluciones> soluciones) {
        this.soluciones = soluciones;
    }

}

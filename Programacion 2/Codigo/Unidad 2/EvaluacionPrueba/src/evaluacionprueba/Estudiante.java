
package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class Estudiante {
    private String nombreYApellido;
private Soluciones soluciones;    
private String aspiranteAGrado;
private Universidad universidad;
private PersonalDocente personalDocente;
private List<EstudianteSoluciones> estudianteSoluciones = new ArrayList(); 
private List<Universidad> universidades = new ArrayList();
private ProyectoDeGrado proyectoDeGrado;
private EjecucionDelProyecto ejecuccionDelProyecto;
private List<PersonalDocente> personalDocentes = new ArrayList();

   

    public Estudiante(String nombreYapellido,String aspiranteAGrado, Universidad universidad, ProyectoDeGrado proyectoDeGrado) {
        this.nombreYApellido=nombreYapellido;
        this.aspiranteAGrado = aspiranteAGrado;
        this.universidades.add(universidad);
        this.proyectoDeGrado = proyectoDeGrado;
    }

    public Estudiante() {
    }
    
    public void addEstudianteSolucion (EstudianteSoluciones estudianteSolucion){
    this.estudianteSoluciones.add(estudianteSolucion);
    estudianteSolucion.getSoluciones().getEstudianteSoluciones().add(estudianteSolucion);
    }
    public void addUniversidad(Universidad universidad){
    this.universidades.add(universidad);
    universidad.getEstudiantes().add(this);
    }
    public void removeUniversidad(int lugar){
    this.universidades.remove(lugar);
    universidad.getEstudiantes().remove(lugar);
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

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public Soluciones getSoluciones() {
        return soluciones;
    }

    public void setSoluciones(Soluciones soluciones) {
        this.soluciones = soluciones;
    }

    public String getAspiranteAGrado() {
        return aspiranteAGrado;
    }

    public void setAspiranteAGrado(String aspiranteAGrado) {
        this.aspiranteAGrado = aspiranteAGrado;
    }

   

    public PersonalDocente getPersonalDocente() {
        return personalDocente;
    }

    public void setPersonalDocente(PersonalDocente personalDocente) {
        this.personalDocente = personalDocente;
    }

    public List<EstudianteSoluciones> getEstudianteSoluciones() {
        return estudianteSoluciones;
    }

    public void setEstudianteSoluciones(List<EstudianteSoluciones> estudianteSoluciones) {
        this.estudianteSoluciones = estudianteSoluciones;
    }

    public String estudiar(Universidad uni) {
        return "El estudiante " + nombreYApellido + " estudia la carrera " + uni.getDiferentesCarreras();
    }

    public String formarse() {
        return "El estudiante " + nombreYApellido + " se esta formando para el titulo " + proyectoDeGrado.getTitulo();
    }

    public String irALaUniversidad(Universidad uni) {
        return "El estudiante " + nombreYApellido + " va a la " + uni.getCunaDelConocimiento();
    }
}

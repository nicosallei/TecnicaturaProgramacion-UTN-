package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class ProyectoDeGrado {
    private String alcance;
    private int costo;
    private String planDeProyecto;
    private int tiempoDeRealizacion;
    private String titulo;
    private int viabilidad;
    private String objetivo;
    private EjecucionDelProyecto proyecto = new EjecucionDelProyecto();
    private Soluciones soluciones;
    private List<Estudiante> estudiantes = new ArrayList();
    
    public ProyectoDeGrado() {
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public ProyectoDeGrado(String alcance, int costo, String objetivo, String planDeProyecto, int tiempoDeRealizacion, String titulo, int viabilidad) {
        this.alcance = alcance;
        this.costo = costo;
        this.objetivo = objetivo;
        this.planDeProyecto = planDeProyecto;
        this.tiempoDeRealizacion = tiempoDeRealizacion;
        this.titulo = titulo;
        this.viabilidad = viabilidad;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
public void addEstudiante(Estudiante estudiante){
this.estudiantes.add(estudiante);
}
public void removeEstudiante(int lugar){
this.estudiantes.remove(lugar);
}
    
    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getPlanDeProyecto() {
        return planDeProyecto;
    }

    public void setPlanDeProyecto(String planDeProyecto) {
        this.planDeProyecto = planDeProyecto;
    }

    public int getTiempoDeRealizacion() {
        return tiempoDeRealizacion;
    }

    public void setTiempoDeRealizacion(int tiempoDeRealizacion) {
        this.tiempoDeRealizacion = tiempoDeRealizacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViabilidad() {
        return viabilidad;
    }

    public void setViabilidad(int viabilidad) {
        this.viabilidad = viabilidad;
    }

    
    public EjecucionDelProyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(EjecucionDelProyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Soluciones getSoluciones() {
        return soluciones;
    }

    public void setSoluciones(Soluciones soluciones) {
        this.soluciones = soluciones;
    }

}

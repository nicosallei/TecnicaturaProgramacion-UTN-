/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicos
 */
public class PersonalDocente {
    private String nombre;
    private String experiencia;
    private int trayectoria;
    private Universidad universidad;
    
    
    private List<Universidad> universidades = new ArrayList();
    private EjecucionDelProyecto ejercucionDelProyecto;
    private Estudiante estudiante;
    private Recopilacion recopilacion;

    public PersonalDocente() {
    }

    public PersonalDocente(String conocimiento, String experiencia, int trayectoria) {
        this.nombre = conocimiento;
        this.experiencia = experiencia;
        this.trayectoria = trayectoria;
    }
public void addUniversidad (Universidad universidad){
this.universidades.add(universidad);
universidad.getPersonalDocentes().add(this);
}
public void removeUniversidad(int lugar){
this.universidades.remove(lugar);
universidad.getPersonalDocentes().remove(lugar);
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(int trayectoria) {
        this.trayectoria = trayectoria;
    }

    public List<Universidad> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(List<Universidad> universidades) {
        this.universidades = universidades;
    }

    public EjecucionDelProyecto getEjercucionDelProyecto() {
        return ejercucionDelProyecto;
    }

    public void setEjercucionDelProyecto(EjecucionDelProyecto ejercucionDelProyecto) {
        this.ejercucionDelProyecto = ejercucionDelProyecto;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Recopilacion getRecopilacion() {
        return recopilacion;
    }

    public void setRecopilacion(Recopilacion recopilacion) {
        this.recopilacion = recopilacion;
    }
    
    
}

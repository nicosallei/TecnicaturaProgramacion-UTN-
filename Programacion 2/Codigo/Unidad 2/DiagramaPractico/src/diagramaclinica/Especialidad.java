package diagramaclinica;

import java.util.ArrayList;

public class Especialidad {

    private String nombre;
    private ArrayList<Habitacion> habitacion = new ArrayList();
    private ArrayList<Medico> medicos = new ArrayList();

    public Especialidad() {
    }

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Habitacion> getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(ArrayList<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion.add(habitacion);
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public void setMedicos(Medico medicos) {
        this.medicos.add(medicos);
    }

      public void addMedico(String nombreApellido){
    this.medicos.add(new Medico(nombreApellido));
    }
    public void addHabitacion(int numero){
    this.habitacion.add(new Habitacion(numero));
    }
    
}

package diagrama02;

import java.util.ArrayList;


public class Especialidad {

private String nombre;
private ArrayList<Medico> medico = new ArrayList<Medico>();
private ArrayList<Habitacion> habitacion = new ArrayList<Habitacion>();

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public void addMedico(String nombreApellido){
    this.medico.add(new Medico(nombreApellido));
    }
    public void addHabitacion(int numero){
    this.habitacion.add(new Habitacion(numero));
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Medico> getMedico() {
        return medico;
    }

    public void setMedico(ArrayList<Medico> medico) {
        this.medico = medico;
    }

    public ArrayList<Habitacion> getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(ArrayList<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }

    
}

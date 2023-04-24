package diagramaclinica;

import java.util.ArrayList;

public class Clinica {

    private ArrayList<Especialidad> especialidad = new ArrayList();

    public Clinica() {
    }

    public ArrayList<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void addEspecialidad(Especialidad especialidad) {
        this.especialidad.add(especialidad);
    }

}

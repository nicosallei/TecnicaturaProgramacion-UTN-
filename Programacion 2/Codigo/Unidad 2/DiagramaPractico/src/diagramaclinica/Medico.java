package diagramaclinica;

import java.util.ArrayList;

public class Medico {

    private String nombreApellidos;
    private ArrayList<Paciente> pacientes = new ArrayList();

    public Medico() {
    }

    public Medico(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public void quitarPaciente(int index){
    this.pacientes.remove(this.pacientes.get(index));
    }
    public void addPaciente(String NSIP, String nombreApellidos, char sexo, Fecha f){
    
    this.pacientes.add(new Paciente(NSIP,nombreApellidos,sexo,f));
    }
    
    
    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void setPacientes(Paciente pacientes) {
        this.pacientes.add(pacientes);
    }

}

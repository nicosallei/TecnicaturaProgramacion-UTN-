package diagrama02;

import java.util.ArrayList;


public class Medico {
    private String nombreApellido;
    private ArrayList<Paciente> paciente = new ArrayList<Paciente>();

    public Medico(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    
    public void addPaciente(String nsip, String nombreApellido, char sexo, int dia, int mes, int anio){
    
    this.paciente.add(new Paciente(nsip,nombreApellido,sexo,dia,mes,anio));
    }
    public void quitarPaciente(int index){
    this.paciente.remove(this.paciente.get(index));
    }
    public boolean tieneAlPaciente(){
    for(Paciente pa:paciente){
    if(pa.getDiagnostico().getTipo().name()=="ALTA"){
    return true;
    }
    }
    return false;
    }
    
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public ArrayList<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(ArrayList<Paciente> paciente) {
        this.paciente = paciente;
    }
    
}

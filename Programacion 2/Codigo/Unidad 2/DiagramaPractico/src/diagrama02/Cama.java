package diagrama02;


public class Cama {
    private Paciente paciente;

    public Cama() {
    }

   
    
   

   
    
    public boolean ocupada(){
    return this.paciente.getDiagnostico().getTipo().isOperacion();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

  
    
}

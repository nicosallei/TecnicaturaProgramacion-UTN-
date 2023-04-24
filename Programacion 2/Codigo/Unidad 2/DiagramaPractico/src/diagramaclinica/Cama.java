package diagramaclinica;

public class Cama {

    private Paciente paciente;

    public Cama() {
    }

    public Cama(Paciente paciente) {
        this.paciente = paciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}

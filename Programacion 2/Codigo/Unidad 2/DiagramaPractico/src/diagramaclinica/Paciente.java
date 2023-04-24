package diagramaclinica;

import java.util.ArrayList;

public class Paciente {

    private String NSIP, nombreApellidos;
    private char sexo;
    private Fecha fechaNacimiento = new Fecha();
    private ArrayList<Diagnostico> diagnosticos = new ArrayList();

    public Paciente() {
    }

    public Paciente(String NSIP, String nombreApellidos, char sexo, Fecha f) {
        this.NSIP = NSIP;
        this.nombreApellidos = nombreApellidos;
        this.sexo = sexo;
        this.fechaNacimiento = f;
    }

    public String getNSIP() {
        return NSIP;
    }

    public void setNSIP(String NSIP) {
        this.NSIP = NSIP;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public void setDeAUnoDiagnosticos(Diagnostico diagnosticos) {
        this.diagnosticos.add(diagnosticos);
    }

}

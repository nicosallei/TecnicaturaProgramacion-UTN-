package diagramaclinica;

public class Diagnostico {

    private String texto;
    private TipoDiagnostico tipo;
    private Tratamiento tratamiento = new Tratamiento();

    public Diagnostico() {
    }

    public Diagnostico(String texto, TipoDiagnostico tipo) {
        this.texto = texto;
        this.tipo = tipo;
    }

    public Diagnostico(String texto) {
        this.texto = texto;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoDiagnostico getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiagnostico tipo) {
        this.tipo = tipo;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

}

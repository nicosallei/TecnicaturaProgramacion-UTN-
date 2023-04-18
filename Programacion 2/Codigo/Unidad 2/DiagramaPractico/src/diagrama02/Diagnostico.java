package diagrama02;


public class Diagnostico {
  
    private String texto;
    private TipoDiagnostico tipo;
    private Tratamiento tratamiento;

    public Diagnostico(String texto, TipoDiagnostico tipo,String textoTratamiento) {
        this.texto = texto;
        this.tipo = tipo;
        this.tratamiento =new Tratamiento(textoTratamiento);
    }

    public Diagnostico() {
    }

    public boolean esAlta(){
    return tipo.isOperacion();
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

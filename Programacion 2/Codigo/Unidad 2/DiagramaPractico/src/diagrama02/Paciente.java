package diagrama02;


public class Paciente {
   private String nsip;
   private String nombreApellido;
   private char sexo;
   private Fecha fecha;
   private Diagnostico diagnostico;

    public Paciente(String nsip, String nombreApellido, char sexo, int dia, int mes, int anio) {
        this.nsip = nsip;
        this.nombreApellido = nombreApellido;
        this.sexo = sexo;
        this.fecha = new Fecha(dia,mes,anio);
    }

    public Paciente() {
    }
  
 public void addDiagnostico(String texto, TipoDiagnostico tipo,String textoTratamiento){
 this.diagnostico=new Diagnostico(texto, tipo,textoTratamiento);
 }
 public boolean estaCurado(){
 if(diagnostico.getTipo().name()=="ALTA"){
     return true;
 }
 return false;
 }

    public String getNsip() {
        return nsip;
    }

    public void setNsip(String nsip) {
        this.nsip = nsip;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
 
}

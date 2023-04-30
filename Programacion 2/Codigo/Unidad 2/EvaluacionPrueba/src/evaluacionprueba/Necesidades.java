package evaluacionprueba;

import java.util.ArrayList;


public class Necesidades {
   
    private String definir;
    private ArrayList<InterfazIngresoInformacion> ingresoInformacion = new ArrayList<>();

    public Necesidades(String definir) {
        this.definir = definir;
    }

    public Necesidades() {
    }
public void addIngresoInformacion(InterfazIngresoInformacion informacion){
    this.ingresoInformacion.add(informacion);
    }
    public void removeIngresoInformacion(int lugar){
    this.ingresoInformacion.remove(lugar);
    }
    
    public String getDefinir() {
        return definir;
    }

    public void setDefinir(String definir) {
        this.definir = definir;
    }

    public ArrayList<InterfazIngresoInformacion> getIngresoInformacion() {
        return ingresoInformacion;
    }

    public void setIngresoInformacion(ArrayList<InterfazIngresoInformacion> ingresoInformacion) {
        this.ingresoInformacion = ingresoInformacion;
    }
   
    
}

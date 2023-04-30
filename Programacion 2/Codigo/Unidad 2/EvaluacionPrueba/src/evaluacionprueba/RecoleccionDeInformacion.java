package evaluacionprueba;


public class RecoleccionDeInformacion extends InterfazIngresoInformacion {
    
    private String datosDeLosAfectados;
    private String datosDeLosDirecamenteInterezados;

    public RecoleccionDeInformacion(String datosDeLosAfectados, String datosDeLosDirecamenteInterezados, String comentariosAbiertosEnLinea, String formulariosEnLinea, byte plataformaDeSoftware) {
        super(comentariosAbiertosEnLinea, formulariosEnLinea, plataformaDeSoftware);
        this.datosDeLosAfectados = datosDeLosAfectados;
        this.datosDeLosDirecamenteInterezados = datosDeLosDirecamenteInterezados;
    }

    public RecoleccionDeInformacion(String datosDeLosAfectados, String datosDeLosDirecamenteInterezados) {
        this.datosDeLosAfectados = datosDeLosAfectados;
        this.datosDeLosDirecamenteInterezados = datosDeLosDirecamenteInterezados;
    }

    public RecoleccionDeInformacion() {
    }

    public String getDatosDeLosAfectados() {
        return datosDeLosAfectados;
    }

    public void setDatosDeLosAfectados(String datosDeLosAfectados) {
        this.datosDeLosAfectados = datosDeLosAfectados;
    }

    public String getDatosDeLosDirecamenteInterezados() {
        return datosDeLosDirecamenteInterezados;
    }

    public void setDatosDeLosDirecamenteInterezados(String datosDeLosDirecamenteInterezados) {
        this.datosDeLosDirecamenteInterezados = datosDeLosDirecamenteInterezados;
    }

  
    
    
    
}

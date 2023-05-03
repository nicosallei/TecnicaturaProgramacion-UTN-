/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionprueba;

/**
 *
 * @author nicos
 */
public class Recopilacion extends RecoleccionDeInformacion {
    private String datosMayorFavorabilidad;
    private String datosMayorUrgencia;

    public Recopilacion(String datosMayorFavorabilidad, String datosMayorUrgencia, String datosDeLosAfectados, String datosDeLosDirecamenteInterezados, String comentariosAbiertosEnLinea, String formulariosEnLinea, byte plataformaDeSoftware) {
        super(datosDeLosAfectados, datosDeLosDirecamenteInterezados, comentariosAbiertosEnLinea, formulariosEnLinea, plataformaDeSoftware);
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

    public Recopilacion(String datosMayorFavorabilidad, String datosMayorUrgencia, String datosDeLosAfectados, String datosDeLosDirecamenteInterezados) {
        super(datosDeLosAfectados, datosDeLosDirecamenteInterezados);
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

    public Recopilacion(String datosMayorFavorabilidad, String datosMayorUrgencia) {
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

    public Recopilacion() {
    }

    public String getDatosMayorFavorabilidad() {
        return datosMayorFavorabilidad;
    }

    public void setDatosMayorFavorabilidad(String datosMayorFavorabilidad) {
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
    }

    public String getDatosMayorUrgencia() {
        return datosMayorUrgencia;
    }

    public void setDatosMayorUrgencia(String datosMayorUrgencia) {
        this.datosMayorUrgencia = datosMayorUrgencia;
    }
    public String filtrar() {
        return "Datos de Mayor Favorabilidad: " + datosMayorFavorabilidad;
    }

    public String priorizar() {
        return "Datos de Mayor Urgencia: " + datosMayorUrgencia;
    }
}


package evaluacionprueba;


public class InterfazIngresoInformacion {
    private String comentariosAbiertosEnLinea;
    private String formulariosEnLinea;
    private byte plataformaDeSoftware;

    public InterfazIngresoInformacion(String comentariosAbiertosEnLinea, String formulariosEnLinea, byte plataformaDeSoftware) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
        this.formulariosEnLinea = formulariosEnLinea;
        this.plataformaDeSoftware = plataformaDeSoftware;
    }

    public InterfazIngresoInformacion() {
    }

    public String getComentariosAbiertosEnLinea() {
        return comentariosAbiertosEnLinea;
    }

    public void setComentariosAbiertosEnLinea(String comentariosAbiertosEnLinea) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
    }

    public String getFormulariosEnLinea() {
        return formulariosEnLinea;
    }

    public void setFormulariosEnLinea(String formulariosEnLinea) {
        this.formulariosEnLinea = formulariosEnLinea;
    }

    public byte getPlataformaDeSoftware() {
        return plataformaDeSoftware;
    }

    public void setPlataformaDeSoftware(byte plataformaDeSoftware) {
        this.plataformaDeSoftware = plataformaDeSoftware;
    }
    public String registroDeFormularioEnLinea() {
        return formulariosEnLinea + ". " + comentariosAbiertosEnLinea;
    }
    
}

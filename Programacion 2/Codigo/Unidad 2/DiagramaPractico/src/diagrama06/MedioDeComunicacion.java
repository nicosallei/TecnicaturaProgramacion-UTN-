/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama06;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class MedioDeComunicacion {
    
    private String descripcion;
    private TipoMedio tipoMedio;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    public MedioDeComunicacion(String descripcion, String medio) {
        this.descripcion = descripcion;
        this.tipoMedio = new TipoMedio(medio);
    }
}

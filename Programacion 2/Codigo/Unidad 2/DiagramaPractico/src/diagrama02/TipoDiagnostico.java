/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package diagrama02;

/**
 *
 * @author Nicolas Sallei Correa
 */
public enum TipoDiagnostico {
    ALTA("Esta dado de Alta, se puede ir",false),
    LEVE("Tiene que esperar un tiempo",false),
    GRAVE("Esta en estado grave tiene que ser internado",true),
    MUYGRAVE("Esta muy grave, tiene que ser operado de urgencia",true);

    private final String estado;
    private final boolean operacion;
    private TipoDiagnostico(String estado,boolean operacion) {
        this.estado = estado;
        this.operacion = operacion;
    }

    public boolean isOperacion() {
        return operacion;
    }
    public String getEstado(){
    return estado;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_A;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class EstadoControl {
    
    private long id;
    private boolean aprobado;
    
    private ArrayList<Control> control = new ArrayList();

    public EstadoControl() {
    }

    public EstadoControl(long id, boolean aprobado) {
        this.id = id;
        this.aprobado = aprobado;
    }
    
    public void addControl(Control control){
    this.control.add(control);
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public ArrayList<Control> getControl() {
        return control;
    }

    public void setControl(ArrayList<Control> control) {
        this.control = control;
    }
    
    private String rellenarCadena(String cadena){
        if(cadena.length() > 15){
            return cadena.substring(0, 15);
        }else{
            cadena = cadena + " ";
            return rellenarCadena(cadena);
        }
    }
    
}

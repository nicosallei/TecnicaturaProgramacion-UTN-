/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama06;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Lugar extends Direccion {
    
    private String nombre;
    private Direccion direccion;

    public Lugar(String calle, String numeroDeCalle, String nombre) {
        super(calle, numeroDeCalle);
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}

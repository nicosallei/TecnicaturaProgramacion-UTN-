/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovideo_statico;

/**
 *
 * @author nicos
 */
public class Empleado {
    
    private String nombre;
    private String seccion;
    
    private int id; 
    private static int idSiguiente=1;
    
    public void mostrarDatos(){
    
        System.out.println("El nombre es: "+nombre+" y la seccion es "+seccion+" su id es: "+id);
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public static String dameIdSiguiente(){
    
        return "El idSiguiente es: "+idSiguiente;
    }
 

    public Empleado(String nombre, String seccion) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.id=idSiguiente;
        this.idSiguiente++;
    }
}

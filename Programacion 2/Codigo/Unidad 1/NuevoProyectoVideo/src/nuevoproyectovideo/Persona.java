/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoproyectovideo;

/**
 *
 * @author nicos
 */
public class Persona extends Animal{
    
    String nombre;
    int edad;
    String dni;

    
    public Persona(String dni) {
        this.dni = dni;
    }

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }
    
    
    public void correr(){
        System.out.println("soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("he corrido "+km+" kilometros");
    }
    
    
    
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
    
}

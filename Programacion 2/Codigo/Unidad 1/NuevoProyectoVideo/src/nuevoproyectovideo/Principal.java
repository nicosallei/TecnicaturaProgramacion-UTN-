/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevoproyectovideo;


public class Principal {

    
    public static void main(String[] args) {
       
        Persona persona = new Persona();
        Perro perro = new Perro();
        
        persona.comer();
        perro.comer();
        
        Persona persona1 = new Persona("Alejando",21);
        persona1.correr();
        
        Persona persona2 = new Persona("12121212");
        persona2.correr(10);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovideo_statico;

/**
 *
 * @author nicos
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado trabajador1= new Empleado("Ana","Administracion");
        Empleado trabajador2= new Empleado("Pedro","Vendedor");
        Empleado trabajador3= new Empleado("Juan","Ejecutivo");
        Empleado trabajador4= new Empleado("Maria","Vendedor");
        
        trabajador1.mostrarDatos();
        trabajador2.mostrarDatos();
        trabajador3.mostrarDatos();
        trabajador4.mostrarDatos();
        
        System.out.println(Empleado.dameIdSiguiente());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_clasesabstractas;

/**
 *
 * @author nicos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PoligonoRegular c = new PoligonoRegular(7,3.0);  // Error!!! clase abstracta       System.out.println(c.area());
    
    Cuadrado c = new Cuadrado(3);
    
        System.out.println(c.area());
        System.out.println(c.perimetro());
    }
    
}

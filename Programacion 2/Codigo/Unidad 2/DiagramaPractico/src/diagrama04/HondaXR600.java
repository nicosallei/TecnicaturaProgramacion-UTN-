/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama04;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class HondaXR600 extends Moto {

    public HondaXR600(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    @Override
    public void romperinercia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esquivarObstaculo() {
         System.out.println("Esquivaste el obstaculo con exito");
    }
    
      public void mostrar(){
       System.out.println("La cantidad de ruedas que tiene es: "+RUEDAS);
       System.out.println("La velocidad promedio es: "+getVelocidadPromedio());
       System.out.println("La velocidad maxima es: "+getVelocidadMaxima());
   }
    
}

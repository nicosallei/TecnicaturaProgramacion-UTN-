/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama04;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class HondaXR25 extends Moto {

    public HondaXR25(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    @Override
    public void romperinercia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Esquivaste el obstactulo");
    }
    public void esquivarObstaculo(int metros){
    
        System.out.println("El obstaculo se encuentra en :"+metros+" m");
    }
}

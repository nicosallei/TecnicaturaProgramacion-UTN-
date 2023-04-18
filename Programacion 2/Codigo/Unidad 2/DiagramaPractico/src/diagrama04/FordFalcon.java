/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama04;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class FordFalcon extends Auto {

    public FordFalcon(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    @Override
    public void romperinercia() {
        
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Esquivaste el objeto moviendote hacia la derecha");
    }
    
    
}

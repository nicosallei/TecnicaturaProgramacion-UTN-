/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama04;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Boing747 extends Vehiculo {
    private static int viajes;

    public Boing747(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    public void despegar(){
        System.out.println("El avion esta despegando");
    }
    
    public void aterrizar(){
        System.out.println("El avion esta aterrizando");
    }
public void agregarViaje(){
this.viajes ++;
}
    
    public ArrayList<Rueda> getRueda() {
        return rueda;
    }

    public void setRueda(ArrayList<Rueda> rueda) {
        this.rueda = rueda;
    }
    

    public static int getViajes() {
        return viajes;
    }

    public static void setViajes(int viajes) {
        Boing747.viajes = viajes;
    }

    @Override
    public void romperinercia() {
        
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Obstactulo esquivado hacia arriba");
    }
    
    
}

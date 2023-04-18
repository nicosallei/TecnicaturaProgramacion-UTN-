package diagrama04;

import java.util.ArrayList;


public abstract class Vehiculo implements Desplazable {
    
    private double velocidadPromedio;
    private int velocidadMaxima;
    ArrayList<Rueda> rueda = new ArrayList<Rueda>();
    
    public abstract void romperinercia();

    public Vehiculo(double velocidadPromedio, int velocidadMaxima) {
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMaxima = velocidadMaxima;
        
    }

    public void addRueda(double presion, String rodado){
    this.rueda.add(new Rueda(presion,rodado));
    }
    
    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public ArrayList<Rueda> getRueda() {
        return rueda;
    }

    public void setRueda(ArrayList<Rueda> rueda) {
        this.rueda = rueda;
    }
    
    
}

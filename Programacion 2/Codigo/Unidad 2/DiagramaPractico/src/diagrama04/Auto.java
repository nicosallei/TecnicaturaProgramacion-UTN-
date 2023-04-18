package diagrama04;

import java.util.ArrayList;


public abstract class Auto extends Vehiculo {

    public static int RUEDAS=4;

    public Auto(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }


}

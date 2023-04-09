package diagrama03;

public class Bicicleta extends Vehiculo {

    @Override
    public double Precio() {
     double precio=85000;
        return precio;
    }

    @Override
    public double Velocidad_Maxima() {
          double maxima=30;
        return maxima;
    }

    @Override
    public int getRuedas() {
        return ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
     this.ruedas=ruedas;   
    }

    public Bicicleta(int ruedas, String duenio) {
        super(ruedas, duenio);
    }
    
    
}

package diagrama03;


public class Auto extends Vehiculo implements Motor {

    @Override
    public double Precio() {
        return 3500000;
    }

    @Override
    public double Velocidad_Maxima() {
        return 280;
    }

    @Override
    public int getRuedas() {
      return ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas=ruedas;
    }

    public Auto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public String Tipo() {
    return "Motor V6";    
    }
    
}

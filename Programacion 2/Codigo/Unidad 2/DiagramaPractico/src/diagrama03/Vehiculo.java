package diagrama03;

public abstract class Vehiculo {
   protected int ruedas;
   protected String duenio;

    public Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }

    public abstract double Precio();
    public abstract double Velocidad_Maxima();
    
    
    public abstract int getRuedas();
    

    public abstract void setRuedas(int ruedas);

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
   
   
}

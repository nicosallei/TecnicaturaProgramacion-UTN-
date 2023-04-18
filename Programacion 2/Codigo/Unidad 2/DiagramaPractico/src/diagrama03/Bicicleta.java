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
    
    public void mostrar(){
    System.out.println("El nombre del dueño de la bicibleta es: "+getDuenio());
        System.out.println("La cantidad de ruedas que tiene una bici es: "+getRuedas());
        System.out.println("El precio de la bici de "+getDuenio()+" es: "+Precio());
        System.out.println("La velocidad maxima de la bici es: "+Velocidad_Maxima());
    }
    
}

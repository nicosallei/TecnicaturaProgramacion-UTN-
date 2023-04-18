package diagrama03;


public class Auto extends Vehiculo implements Motor {
    private int puertas;

    public Auto(int puertas, int ruedas, String duenio) {
        super(ruedas, duenio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
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

    @Override
    public String Tipo() {
    return "Motor V6";    
    }
    
    public void mostrar(){
    System.out.println("El nombre del dueño del auto es: "+getDuenio());
        System.out.println("La cantidad de ruedas que tiene un auto es: "+getRuedas());
        System.out.println("El precio del auto de "+getDuenio()+" es: "+Precio());
        System.out.println("El auto tiene "+getPuertas()+" puertas");
        System.out.println("El tipo de motor es: "+Tipo());
        System.out.println("La velocidad maxima alcanzada por el auto es: "+Velocidad_Maxima());
    }
}

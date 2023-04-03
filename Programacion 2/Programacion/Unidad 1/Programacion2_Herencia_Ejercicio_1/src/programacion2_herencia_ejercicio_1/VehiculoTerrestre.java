package programacion2_herencia_ejercicio_1;


public class VehiculoTerrestre extends VehiculosDeMotor {

    private String cajaDeCambio;

    @Override
    public void sonido(){
        System.out.println("brummm brummmm brummmmmmmmmm");
    }
    
    public String getCajaDeCambio() {
        return cajaDeCambio;
    }

    public void setCajaDeCambio(String cajaDeCambio) {
        this.cajaDeCambio = cajaDeCambio;
    }

    public String getNombre() {
        return nombre;
    }

    public VehiculoTerrestre(String cajaDeCambio, String nombre, int altura, double peso, double velocidad) {
        super(nombre, altura, peso, velocidad);
        this.cajaDeCambio = cajaDeCambio;
    }

    public VehiculoTerrestre(String cajaDeCambio) {
        this.cajaDeCambio = cajaDeCambio;
    }

    public VehiculoTerrestre() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

}


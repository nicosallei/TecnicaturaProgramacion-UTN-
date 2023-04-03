package programacion2_herencia_ejercicio_1;

public class VehiculoAereo extends VehiculosDeMotor {

    private double altitudMaxima;

    public void sonido() {
        System.out.println("brrrrr brrr, brrrr");
    }

    public VehiculoAereo(double altitudMaxima, String nombre, int altura, double peso, double velocidad) {
        super(nombre, altura, peso, velocidad);
        this.altitudMaxima = altitudMaxima;
    }

    public VehiculoAereo() {
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public String getNombre() {
        return nombre;
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

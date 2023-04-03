/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2_herencia_ejercicio_1;

/**
 *
 * @author nicos
 */
public abstract class VehiculosDeMotor implements Ruido {

    protected String nombre;
    protected int altura;
    protected double peso;
    protected double velocidad;

    public abstract void sonido();

    public VehiculosDeMotor(String nombre, int altura, double peso, double velocidad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public VehiculosDeMotor() {
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}

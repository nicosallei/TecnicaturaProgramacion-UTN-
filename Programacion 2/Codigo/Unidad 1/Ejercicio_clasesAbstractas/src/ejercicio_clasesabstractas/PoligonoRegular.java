/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clasesabstractas;

/**
 *
 * @author nicos
 */
public abstract class PoligonoRegular {

    protected int numLados;
    protected double lado; // longitud de un lado 

    public PoligonoRegular(int numLados, double lado) {
        this.numLados = numLados;
        this.lado = lado;
    }

    public double perimetro() {
        return numLados * lado;
    }
    // este método lo tiene que hacer cada clase derivada; 
    // depende de cada polígono regular 

    public abstract double area();
}

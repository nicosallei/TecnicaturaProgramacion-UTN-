package ejercicio_clasesabstractas;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado) {
        super(4, lado);
    }

    @Override
    public double area() {
        return lado * lado;
    }

}

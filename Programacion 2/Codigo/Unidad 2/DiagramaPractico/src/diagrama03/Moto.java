/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama03;

/**
 *
 * @author nicos
 */
public class Moto extends Vehiculo implements Motor {

    @Override
    public double Precio() {
        return 400000;
    }

    @Override
    public double Velocidad_Maxima() {
      return 180;
    }

    @Override
    public int getRuedas() {
        return ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
    this.ruedas=ruedas;
    }

    public Moto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public String Tipo() {
        return "V-Twin";
    }
    
    public void mostrar(){
    System.out.println("El nombre del dueño de la moto es: "+getDuenio());
        System.out.println("La cantidad de ruedas que tiene la moto es: "+getRuedas());
        System.out.println("El precio de la moto de "+getDuenio()+" es: "+Precio());
        System.out.println("El tipo de motor es: "+Tipo());
        System.out.println("La velocidad maxima alcanzada por la moto es: "+Velocidad_Maxima());
    }
}

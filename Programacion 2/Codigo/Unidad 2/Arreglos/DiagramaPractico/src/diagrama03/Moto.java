/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama03;

/**
 *
 * @author nicos
 */
public class Moto extends Vehiculo {

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
    
}

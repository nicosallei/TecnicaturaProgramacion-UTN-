/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama06;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Direccion {
    private String calle;
    private String numeroDeCalle;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroDeCalle() {
        return numeroDeCalle;
    }

    public void setNumeroDeCalle(String numeroDeCalle) {
        this.numeroDeCalle = numeroDeCalle;
    }

    public Direccion(String calle, String numeroDeCalle) {
        this.calle = calle;
        this.numeroDeCalle = numeroDeCalle;
    }
}

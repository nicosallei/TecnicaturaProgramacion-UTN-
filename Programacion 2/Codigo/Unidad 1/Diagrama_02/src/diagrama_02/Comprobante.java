/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama_02;

/**
 *
 * @author nicos
 */
public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha = new Fecha();

   
    
    public Comprobante() {
        
    }


    
    
    public Comprobante(char tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
        
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}

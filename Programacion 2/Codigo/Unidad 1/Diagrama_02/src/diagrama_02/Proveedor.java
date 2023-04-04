/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama_02;

/**
 *
 * @author nicos
 */
public class Proveedor {
    private int codigo;
    private String razonSocial;

    public Proveedor(int codigo, String razonSocial) {
        this.codigo = codigo;
        this.razonSocial = razonSocial;
    }

    public Proveedor() {
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}

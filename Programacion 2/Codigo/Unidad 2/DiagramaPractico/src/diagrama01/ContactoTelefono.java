/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama01;

/**
 *
 * @author nicos
 */
public class ContactoTelefono {
    private Integer idContactoTelefono;
    private String codigo;
    private String numero;

    public ContactoTelefono(Integer idContactoTelefono, String codigo, String numero) {
        this.idContactoTelefono = idContactoTelefono;
        this.codigo = codigo;
        this.numero = numero;
    }

    public Integer getIdContactoTelefono() {
        return idContactoTelefono;
    }

    public void setIdContactoTelefono(Integer idContactoTelefono) {
        this.idContactoTelefono = idContactoTelefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}

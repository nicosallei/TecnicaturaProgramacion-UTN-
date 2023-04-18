/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama01;

/**
 *
 * @author nicos
 */
public class ContactoTipo {
    private Integer idContactoTipo;
    private String descripcion;

    public ContactoTipo(Integer idContactoTipo, String descripcion) {
        this.idContactoTipo = idContactoTipo;
        this.descripcion = descripcion;
    }

    public Integer getIdContactoTipo() {
        return idContactoTipo;
    }

    public void setIdContactoTipo(Integer idContactoTipo) {
        this.idContactoTipo = idContactoTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

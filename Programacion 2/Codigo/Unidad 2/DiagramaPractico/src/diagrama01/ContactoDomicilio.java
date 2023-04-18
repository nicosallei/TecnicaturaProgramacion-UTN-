/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama01;

/**
 *
 * @author nicos
 */
public class ContactoDomicilio {
    private Integer idContactoDomicilio;
    private String descripcion;

    public ContactoDomicilio(Integer idContactoDomicilio, String descripcion) {
        this.idContactoDomicilio = idContactoDomicilio;
        this.descripcion = descripcion;
    }

    public Integer getIdContactoDomicilio() {
        return idContactoDomicilio;
    }

    public void setIdContactoDomicilio(Integer idContactoDomicilio) {
        this.idContactoDomicilio = idContactoDomicilio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

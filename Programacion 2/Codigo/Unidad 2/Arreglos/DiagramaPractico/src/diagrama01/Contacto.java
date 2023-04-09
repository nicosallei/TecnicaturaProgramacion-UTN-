/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama01;

import java.util.Vector;

/**
 *
 * @author nicos
 */
public class Contacto extends Persona {

    private Integer idContacto;
    private ContactoTipo tipo;
    private Vector<ContactoDomicilio> domicilio = new Vector<ContactoDomicilio>();
    private Vector<ContactoTelefono> telefono = new Vector<ContactoTelefono>();

    public Contacto(Integer idPersona,String nombre, String apellido,Integer idContacto,ContactoTipo tipo) {
        super(nombre, apellido, idPersona);
        this.idContacto = idContacto;
        this.tipo = tipo;
    }

    
    
    public void addTelefono(ContactoTelefono tel) {
        telefono.add(tel);
    }

    public void addDomicilio(ContactoDomicilio dom) {
        domicilio.add(dom);
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public ContactoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ContactoTipo tipo) {
        this.tipo = tipo;
    }

    public Vector<ContactoDomicilio> getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Vector<ContactoDomicilio> domicilio) {
        this.domicilio = domicilio;
    }

    public Vector<ContactoTelefono> getTelefono() {
        return telefono;
    }

    public void setTelefono(Vector<ContactoTelefono> telefono) {
        this.telefono = telefono;
    }

}

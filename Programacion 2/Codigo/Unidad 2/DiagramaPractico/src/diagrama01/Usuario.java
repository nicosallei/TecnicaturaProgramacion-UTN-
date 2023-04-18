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
public class Usuario extends Persona {
    private Integer idUsuario;
    private String usuario;
    private String password;
    private Vector <Contacto> contactos = new Vector <Contacto>();

    public Usuario(Integer idPersona, String nombre, String apellido,Integer idUsuario, String usuario,String password) {
        super(nombre, apellido, idPersona);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public void addcontacto(Contacto con){
    contactos.add(con);
    }
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Vector<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Vector<Contacto> contactos) {
        this.contactos = contactos;
    }
    
    public void mostrar(){
        System.out.println("");
        System.out.println("El usuario: "+usuario);
        System.out.println("Su nombre y apellido es: "+getNombre()+", "+getApellido());
        System.out.println("El id del usuario es: "+idUsuario);
        
       
        System.out.println(" ");
        for (Contacto con:contactos){
            System.out.println(" ");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println(" ");
            System.out.println("El nombre y apellido del conctacto es: "+con.getNombre()+", "+con.getApellido());
            System.out.println("El id del conctacto es: "+con.getIdContacto());
            System.out.println("El tipo de id y tipo de conctacto es: "+con.getTipo().getIdContactoTipo()+", "+con.getTipo().getDescripcion());
            System.out.println("---------------------------------------------------------");
            for(ContactoTelefono tel: con.getTelefono()){
                System.out.println("idContactoTelefono: "+tel.getIdContactoTelefono());
                System.out.println("Codigo: "+tel.getCodigo());
                System.out.println("Telefono: "+tel.getNumero());
                
                System.out.println("--------------------------");
            }
            
            for(ContactoDomicilio dom:con.getDomicilio()){
            
                System.out.println("El idContactoDomicilio y la descipcion: "+dom.getIdContactoDomicilio()+", "+dom.getDescripcion());
            }   
        }
    }

}

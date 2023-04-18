/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama01;

/**
 *
 * @author nicos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Usuario use = new Usuario(1,"nicolas","sallei",29,"sallei","prueba29");
        /*
        use.getContactos().get(0).getTipo().setDescripcion("prueba 1");
        use.getContactos().get(0).getTipo().setIdContactoTipo(19);
        use.getContactos().get(0).getDomicilio().get(0).setDescripcion("modesto lima");
        use.getContactos().get(0).getDomicilio().get(0).setIdContactoDomicilio(07);
        use.getContactos().get(0).getTelefono().get(0).setCodigo("261");
        use.getContactos().get(0).getTelefono().get(0).setIdContactoTelefono(153900322);
        use.getContactos().get(0).getTelefono().get(0).setNumero("2613900322");
        use.getContactos().get(0).addDomicilio(use.getContactos().get(0).getDomicilio().get(0));
        // dudas de como queda......
        */
        
        // otra forma....
        //use.getContactos().get(0).addDomicilio(new ContactoDomicilio(1254,"pruebaa"));
        //use.getContactos().get(0).setTipo(new ContactoTipo(124,"pruebaa"));
        //use.addcontacto(new Contacto(021,"juan","esquivel",145,use.getContactos().get(0).getTipo()));
        
        use.addcontacto(new Contacto(01,"Juan","Esquivel",021,12,"prueba 1"));
        use.getContactos().get(0).addDomicilio(new ContactoDomicilio(19,"modesto lima"));
        use.getContactos().get(0).addDomicilio(new ContactoDomicilio(12,"Chacras 024"));
        use.getContactos().get(0).addTelefono(new ContactoTelefono(251,"261","153900322"));
        use.getContactos().get(0).addTelefono(new ContactoTelefono(251,"261","1654189"));
        use.addcontacto(new Contacto(01,"Pedro","Sanchez",021,12,"prueba 2"));
        use.getContactos().get(1).addDomicilio(new ContactoDomicilio(11,"pedro molina"));
        use.getContactos().get(1).addTelefono(new ContactoTelefono(251,"261","1654saa189"));
        use.mostrar();
    }
    
}

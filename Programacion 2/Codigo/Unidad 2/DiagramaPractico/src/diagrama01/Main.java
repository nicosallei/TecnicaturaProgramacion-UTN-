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

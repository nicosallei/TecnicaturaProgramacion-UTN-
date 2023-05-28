package Controlador;

import Vista.MenuPrincipalVista;

/**
 *
 * @author rocio
 */
public class Main {

   
    public static void main(String[] args) {      
        MenuPrincipalVista menu = new MenuPrincipalVista();
        MenuPrincipalControlador menuControlador = new MenuPrincipalControlador(menu);
         
    }
    
    
}

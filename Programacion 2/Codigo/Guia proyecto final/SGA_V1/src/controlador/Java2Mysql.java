/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import datos.ClienteDAO;
import vista.JF_Menu;

/**
 *
 * @author Cristian
 */
public class Java2Mysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JF_Menu menuPrincipal  = new JF_Menu();
        ControladorMenuPrincipal ccPal1 = new ControladorMenuPrincipal(menuPrincipal);
        ccPal1.escucharBotones();
        menuPrincipal.setVisible(true);
    }
}

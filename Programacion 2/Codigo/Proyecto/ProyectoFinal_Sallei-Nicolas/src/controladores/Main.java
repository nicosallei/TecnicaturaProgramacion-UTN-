
package controladores;

import vistas.Loading1;
import vistas.Menu;

/**
 * Nicolas sallei 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long time_start, time_end;
        time_start = System.currentTimeMillis();
        Loading1 load = new Loading1();

        load.setVisible(true);  //Se Abre El Splash De Carga y Se Inician Funciones...

        Menu menu = new Menu();
        ControladorMenuPrincipal cm = new ControladorMenuPrincipal(menu);
        cm.panelAlumno();// Por Defecto Inicia En El Panel De Alumnos
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
        menu.setTitle("Proyecto Final - Programacion II");
        
        menu.getLblMainTitle().setText("Lista De Alumnos");

        load.setVisible(false);//Se Cierra El Splash De Carga

        menu.setVisible(true);//Se Muestra El Menú Con Los Datos Cargados
        time_end = System.currentTimeMillis();

        System.out.println("Tiempo De Carga : " + (-time_start + time_end) +" mili segundos");
    }

}

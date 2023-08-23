/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import persistencia.ConfigHibernate;

/**
 *
 * @author Docente
 */
public class GestorFactura extends Gestor {

    public GestorFactura() {
        sesion = ConfigHibernate.openSession();
    }
}

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
public class GestorORM extends Gestor {

    public GestorORM() {
        sesion = ConfigHibernate.openSession();
    }
}

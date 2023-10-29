package controlador;

import persistencia.ConfigHibernate;

public class GestorProveedores extends Gestor {

    public GestorProveedores() {
        sesion = ConfigHibernate.openSession();
    }
}

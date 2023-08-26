package controlador;

import org.hibernate.Session;
import org.hibernate.Transaction;
import persistencia.ConfigHibernate;

public class Gestor {


    private static ConfigHibernate configHibernate;

    protected Session sesion;

    public Gestor() {
        configHibernate = new ConfigHibernate();
    }

    public void guardar(Object o) throws Exception {

        boolean guardar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) {
                tx = sesion.beginTransaction();
                guardar = true;
            }
            sesion.saveOrUpdate(o);
            if (guardar) {
                tx.commit();
                System.out.println("objeto persistido.");
            }
        } catch (Exception e) {
            if (guardar) {
                tx.rollback();
            }
            throw new Exception(e.getMessage());
        }
    }

    
    public void eliminar(Object o) throws Exception {
        boolean eliminar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) {
                tx = sesion.beginTransaction();
                eliminar = true;
            }
            sesion.delete(o);
            if (eliminar) {
                tx.commit();
            }
            System.out.println("objeto eliminado.");
        } catch (Exception e) {
            if (eliminar) {
                tx.rollback();
            }
            throw new Exception(e.getMessage());
        }
    }

    public ConfigHibernate getHu() {
        if (configHibernate != null) {
            return configHibernate;
        } else {
            configHibernate = new ConfigHibernate();
            return configHibernate;
        }
    }

    public static void setHu(ConfigHibernate configHibernate) {
        Gestor.configHibernate = configHibernate;
    }

    public Session getSesion() {
        return sesion;
    }

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }
}

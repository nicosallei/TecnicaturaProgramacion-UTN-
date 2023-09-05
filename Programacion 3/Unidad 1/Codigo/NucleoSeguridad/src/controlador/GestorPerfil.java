/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.BaseDeDatos;
import conexion.ConfigHibernate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Perfil;
import modelo.Usuario;
import org.hibernate.Query;

/**
 *
 * @author 0535
 */
public class GestorPerfil extends Gestor{

    BaseDeDatos bd = new BaseDeDatos();
    Connection conexion = bd.estableceConexion();

    public GestorPerfil() {
        sesion = ConfigHibernate.openSession();
    }
    
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Perfil damePerfilFila(Long idFila) {
        ResultSet rs = null;
        Perfil perfil = new Perfil();
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from perfil where id = " + idFila);
            
            if(rs.next()){
                perfil.setDenominacion(rs.getString("denominacion"));
                perfil.setId(rs.getLong("id"));
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return perfil;
    }

    public List<Perfil> dameListaPerfiles() {
        ResultSet rs = null;
        List<Perfil> perfiles = new ArrayList<Perfil>();

        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from perfil");
            Perfil perfil = new Perfil();
            while(rs.next()){
                perfil = new Perfil();
                perfil.setDenominacion(rs.getString("denominacion"));
                perfil.setId(rs.getLong("id"));
                perfiles.add(perfil);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return perfiles;
    }

    public void insertarPersona(String perfil) {
        try {
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO perfil (denominacion) VALUES (?)");
            // Se establecen los parámetros y se ejecuta la sentencia.
            ps.setString(1, perfil);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestorPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarPerfilFila(Long valorId) {
        try {
            Statement st = conexion.createStatement();
            String sql = "DELETE FROM perfil WHERE id = " + valorId;
            int delete = st.executeUpdate(sql);

            if (delete == 1) {
                System.out.println("Perfil Borrado");
            } else {
                System.out.println("Perfil no Borrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Perfil damePerfilFilaHQL(Long idFila) {
       
        try {
                                               
            Query consulta = sesion.createQuery("FROM Perfil WHERE id = :idParam");
            consulta.setParameter("idParam", idFila);
            Perfil perfil = (Perfil) consulta.uniqueResult();
            return perfil;
           
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
      
    }

    public List<Perfil> dameListaPerfilesHQL() {
        
        try {
                                                // //select * from perfil
           Query consulta = sesion.createQuery("SELECT p FROM Perfil p");
            List<Perfil> lista;
            lista = consulta.list();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }

    public void insertarPersonaHQL(String denominacionPerfil) {
        try {
            Perfil perfil = new Perfil();
            perfil.setDenominacion(denominacionPerfil);
            this.guardar(perfil);
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void eliminarPerfilFilaHQL(Long valorId) {
        try {
            Perfil perfil = damePerfilFila(valorId);
            this.eliminar(perfil);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.BaseDeDatos;
import conexion.ConfigHibernate;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
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
import modelo.Persona;
import modelo.Usuario;
import org.hibernate.Query;

/**
 *
 * @author 0535
 */
public class GestorUsuario extends Gestor{

    BaseDeDatos bd = new BaseDeDatos();
    Connection conexion = bd.estableceConexion();
    
    public GestorUsuario() {
        sesion = ConfigHibernate.openSession();
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> dameListaUsuarios() {
        try {
           Query consulta = sesion.createQuery("FROM Usuario");
            List<Usuario> lista;
            lista = consulta.list();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }

    public void eliminarUsuario(Long valorId) {
        try {
             Usuario user = this.dameUsuarioFila(valorId);
             this.eliminar(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertarUsuario(String usuario, String clave, String idPersona, String idPerfil) {
        try {
             Usuario user = new Usuario();
             user.setClave(clave);
             user.setNombreUsuario(usuario);
             GestorPerfil gperfil = new GestorPerfil();
             Perfil perfil = (Perfil) gperfil.buscarPorId(Perfil.class, Long.parseLong(idPerfil));
             user.setPerfil(perfil);
             GestorPersona gpersona = new GestorPersona();
             Persona persona = (Persona) gpersona.buscarPorId(Persona.class, Long.parseLong(idPersona));
             user.setPersona(persona);
             
             this.guardar(user);
               
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Usuario dameUsuarioFila(Long idFila) {
       try {
            Query consulta = sesion.createQuery("FROM Usuario WHERE id = :idParam");
            consulta.setParameter("idParam", idFila);
            Usuario usuario = (Usuario) consulta.uniqueResult();
            return usuario;
       
       } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void actualizarUsuario(Long idUsuario, String usuario, String clave, String idPersona, String idPerfil) {
        try {
            Usuario user = this.dameUsuarioFila(idUsuario);
            user.setClave(clave);
            user.setNombreUsuario(usuario);
            GestorPerfil gperfil = new GestorPerfil();
            Perfil perfil = (Perfil) gperfil.buscarPorId(Perfil.class, Long.parseLong(idPerfil));
            user.setPerfil(perfil);
            GestorPersona gpersona = new GestorPersona();
            Persona persona = (Persona) gpersona.buscarPorId(Persona.class, Long.parseLong(idPersona));
            user.setPersona(persona);
             
            this.guardar(user);
                    
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validarUsuarioClave(String usuario, String clave) {
        try {
            
            System.out.println("CLAVE ENCRIPTADA " + SHA1.SHA1(clave));
            
            Query consulta = sesion.createQuery("SELECT u FROM Usuario u "
                    + " WHERE u.nombreUsuario = :nombreUsuarioParam AND u.clave = :claveParam");
            consulta.setParameter("nombreUsuarioParam", usuario);
            consulta.setParameter("claveParam", SHA1.SHA1(clave));
            List<Usuario> lista;
            lista = consulta.list();
            if (!lista.isEmpty()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
        
    }
}

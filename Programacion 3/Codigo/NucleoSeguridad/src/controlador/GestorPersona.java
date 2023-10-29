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
import modelo.Domicilio;
import modelo.Persona;
import modelo.Usuario;
import org.hibernate.Query;

/**
 *
 * @author 0535
 */
public class GestorPersona extends Gestor{

    BaseDeDatos bd = new BaseDeDatos();
    Connection conexion = bd.estableceConexion();

    public GestorPersona() {
        sesion = ConfigHibernate.openSession();
    }
    
    public List<Persona> buscarPorApellido(String apellido) {
        ResultSet rs = null;
        Persona persona = new Persona();
        List<Persona> personas = new ArrayList<Persona>();

        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from persona where apellido LIKE '" + apellido + "%'");
            while (rs.next()) {
                persona = new Persona();
                persona.setApellido(rs.getString("apellido"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDni(rs.getLong("dni"));
                persona.setId(rs.getLong("id"));
                persona.setDomicilio(dameDomicilioFila(rs.getLong("iddomicilio")));
                personas.add(persona);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personas;
    }

    public List<Persona> buscarPorDNI(Long dni) {
        ResultSet rs = null;
        Persona persona = new Persona();
        List<Persona> personas = new ArrayList<Persona>();

        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from persona where dni = " + dni);
            while (rs.next()) {
                persona = new Persona();
                persona.setApellido(rs.getString("apellido"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDni(rs.getLong("dni"));
                persona.setId(rs.getLong("id"));
                persona.setDomicilio(dameDomicilioFila(rs.getLong("iddomicilio")));
                personas.add(persona);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personas;
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Persona> dameListaPersonas() {
        ResultSet rs = null;
        Persona persona = new Persona();
        List<Persona> personas = new ArrayList<Persona>();

        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from persona");
            while (rs.next()) {
                persona = new Persona();
                persona.setApellido(rs.getString("apellido"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDni(rs.getLong("dni"));
                persona.setId(rs.getLong("id"));
                persona.setDomicilio(dameDomicilioFila(rs.getLong("iddomicilio")));
                personas.add(persona);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personas;
    }
    
    public List<Persona> dameListaPersonasHQL() {
       try {
            Query consulta = sesion.createQuery("FROM Persona");
            List<Persona> lista;
            lista = consulta.list();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Persona> getPersonasXNombreApellidoHQL(String paramBusqueda) {
       try {
            StringBuilder sql = new StringBuilder("FROM Persona ");
            if(paramBusqueda != null && !paramBusqueda.isEmpty()){
                sql.append("WHERE apellido LIKE :apellido OR nombre LIKE :nombre");
            }
            Query consulta = sesion.createQuery(sql.toString());
            if(paramBusqueda != null && !paramBusqueda.isEmpty()){
                consulta.setParameter("apellido", '%'+paramBusqueda+'%');
                consulta.setParameter("nombre", '%'+paramBusqueda+'%');
            }
            
            List<Persona> lista;
            lista = consulta.list();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Persona damePersonaFilaHQL(Long idFila) {
        
      try {
            Query consulta = sesion.createQuery("FROM Persona WHERE id = :idParam");
            consulta.setParameter("idParam", idFila);
            Persona persona = (Persona) consulta.uniqueResult();
            return persona;
       
       } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Persona damePersonaFila(Long idFila) {
        ResultSet rs = null;
        Persona persona = new Persona();
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from persona where id = " + idFila);
            if (rs.next()) {
                persona.setApellido(rs.getString("apellido"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDni(rs.getLong("dni"));
                persona.setId(rs.getLong("id"));
                persona.setDomicilio(dameDomicilioFila(rs.getLong("iddomicilio")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return persona;
    }
    
    
    public Domicilio dameDomicilioFila(Long idDomicilio) {
        ResultSet rs = null;
        Domicilio domicilio = new Domicilio();
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();
            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from domicilio where id = " + idDomicilio);
            if (rs.next()) {
                domicilio.setDepartamento(rs.getString("departamento"));
                domicilio.setId(rs.getLong("id"));
                domicilio.setNombreCalle(rs.getString("nombrecalle"));
                domicilio.setNumero(rs.getInt("numero"));
                domicilio.setPiso(rs.getString("piso"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return domicilio;
    }
    
    public void actualizarPersonaHQL(Long idPersona, String nombre, String apellido, String dni, Long idDomicilio, String calle, String nro, String piso, String departamento) {
        try {
           Persona persona = this.damePersonaFilaHQL(idPersona);
           Domicilio domicilio = persona.getDomicilio();
           domicilio.setNombreCalle(nombre);
           domicilio.setNumero(Integer.parseInt(nro));
           domicilio.setPiso(piso);
           domicilio.setDepartamento(departamento);
           persona.setApellido(apellido);
           persona.setDni(Long.parseLong(dni));
           persona.setNombre(nombre);
           
           this.guardar(persona);

        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarPersona(Long idPersona, String nombre, String apellido, String dni, Long idDomicilio, String calle, String nro, String piso, String departamento) {
        try {
            // Se crea el objeto PreparedStatement.
            // Este precompila la sentencia SQL especificada.
            // Los signos de interrogación señalan el lugar en que deben establecerse los
            // parámetros antes de que se ejecute la sentencia.
            // La siguiente es una forma
            //PreparedStatement ps = conexion.prepareStatement("UPDATE cliente SET nombre = '" + nombre + "', apellidos = '" + apellido + "', dni = '" + dni + "' where id = " + idCliente);
            // Se establecen los parámetros y se ejecuta la sentencia.
            PreparedStatement psPersona = conexion.prepareStatement("UPDATE persona SET nombre = ?, apellido = ?, dni = ? where id = ?");
            psPersona.setString(1, nombre);
            psPersona.setString(2, apellido);
            psPersona.setInt(3, new Integer(dni));
            psPersona.setLong(4, idPersona);
            psPersona.executeUpdate();

            PreparedStatement psDomicilio = conexion.prepareStatement("UPDATE domicilio SET nombrecalle = ?, numero = ?, piso = ?, departamento = ? where id = ?");
            psDomicilio.setString(1, calle);
            psDomicilio.setInt(2, new Integer(nro));
            psDomicilio.setString(3, piso);
            psDomicilio.setString(4, departamento);
            psDomicilio.setLong(5, idDomicilio);
            psDomicilio.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPersonaFila(Long valorId) {
        try {
            Statement st = conexion.createStatement();
            String sql = "DELETE FROM persona WHERE id = " + valorId;
            int delete = st.executeUpdate(sql);

            if (delete == 1) {
                System.out.println("Persona Borrada");
            } else {
                System.out.println("Persona no Borrada");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarPersonaFilaHQL(Long valorId) {
        try {
           Persona persona = this.damePersonaFila(valorId);
           this.eliminar(persona);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void insertarPersonaHQL(String nombre, String apellido, String dni, String calle, String nro, String piso, String departamento)  {
        try {
           Persona persona = new Persona();
           Domicilio domicilio = new Domicilio();
           persona.setDomicilio(domicilio);
           domicilio.setNombreCalle(nombre);
           domicilio.setNumero(Integer.parseInt(nro));
           domicilio.setPiso(piso);
           domicilio.setDepartamento(departamento);
           persona.setApellido(apellido);
           persona.setDni(Long.parseLong(dni));
           persona.setNombre(nombre);
           
           this.guardar(persona);
           
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }


    public void insertarPersona(String nombre, String apellido, String dni, String calle, String nro, String piso, String departamento) {
        try {
            boolean altaDomicilio = insertarDomicilio(calle, new Integer(nro), piso, departamento);
            if (altaDomicilio) {
                Long ultimoDom = ultimoDomicilio();
                // Se crea el objeto PreparedStatement.
                // Este precompila la sentencia SQL especificada.
                // Los signos de interrogación señalan el lugar en que deben establecerse los
                // parámetros antes de que se ejecute la sentencia.
                PreparedStatement ps = conexion.prepareStatement("INSERT INTO persona (nombre, apellido, dni, iddomicilio) VALUES (?, ?, ?, ?)");

                // Se establecen los parámetros y se ejecuta la sentencia.
                ps.setString(1, nombre);
                ps.setString(2, apellido);
                ps.setLong(3, new Long(dni));
                ps.setLong(4, ultimoDom);
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public Long ultimoDomicilio() {
        ResultSet rs = null;


        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("SELECT MAX(id) FROM domicilio;");
            Integer maximo = 0;
            while (rs.next()) {
                maximo = rs.getInt(1);
            }
            return new Long(maximo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    


    public boolean insertarDomicilio(String calle, int nro, String piso, String departamento) {
        try {
            // Se crea el objeto PreparedStatement.
            // Este precompila la sentencia SQL especificada.
            // Los signos de interrogación señalan el lugar en que deben establecerse los
            // parámetros antes de que se ejecute la sentencia.
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO domicilio (nombrecalle, numero, piso, departamento) VALUES (?, ?, ?, ?)");

            // Se establecen los parámetros y se ejecuta la sentencia.
            ps.setString(1, calle);
            ps.setInt(2, nro);
            ps.setString(3, piso);
            ps.setString(4, departamento);
            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }


    }

    public Persona cargarPersona(Integer id, String nombre, String apellido,
            long dni, Integer idDomicilio, String calle, Integer numero, String piso, String departamento) {
        Persona pe = new Persona();
        pe.setId(id);
        pe.setNombre(nombre);
        pe.setApellido(apellido);
        pe.setDni(dni);
        Domicilio domicilio = new Domicilio();
        domicilio.setId(idDomicilio);
        domicilio.setNombreCalle(calle);
        domicilio.setNumero(numero);
        domicilio.setPiso(piso);
        domicilio.setDepartamento(departamento);
        pe.setDomicilio(domicilio);
        return pe;

    }
}

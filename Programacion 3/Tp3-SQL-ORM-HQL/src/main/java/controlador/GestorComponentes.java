/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.BaseDeDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Componente;
import persistencia.ConfigHibernate;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class GestorComponentes extends Gestor {
 
    BaseDeDatos bd = new BaseDeDatos();
    Connection conexion = bd.estableceConexion();

    public GestorComponentes() {
        sesion = ConfigHibernate.openSession();
    }

    
    
    public void insertarComponentes(long id, String nombre, String nroSerie, Long idComputadora) {
        try {
            
                // Se crea el objeto PreparedStatement.
                // Este precompila la sentencia SQL especificada.
                // Los signos de interrogación señalan el lugar en que deben establecerse los
                // parámetros antes de que se ejecute la sentencia.
                PreparedStatement ps = conexion.prepareStatement("INSERT INTO componente (id, nombre, nroSerie, idComputadora) VALUES (?, ?, ?, ?)");

                // Se establecen los parámetros y se ejecuta la sentencia.
                ps.setLong(1, id);
                ps.setString(2, nombre);
                ps.setString(3, nroSerie);
                ps.setLong(4, idComputadora);
                ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarComponentesHQL(long id, String nombre, String nroSerie, int idComputadora) {
        try {
             Componente componente = new Componente();
            
            componente.setId(id);
            componente.setNombre(nombre);
            componente.setNroSerie(nroSerie);
            
            
            
            this.guardar(componente);
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    
}

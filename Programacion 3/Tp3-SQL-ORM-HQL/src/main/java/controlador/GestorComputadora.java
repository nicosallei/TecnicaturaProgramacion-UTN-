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
import modelo.Computadora;
import persistencia.ConfigHibernate;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class GestorComputadora extends Gestor {
    
    BaseDeDatos bd = new BaseDeDatos();
    Connection conexion = bd.estableceConexion();

    public GestorComputadora() {
        sesion = ConfigHibernate.openSession();
    }
    
    
    public void insertarComputadora(Long id, String codigo, String marca, String modelo) throws SQLException {
        try {
                conexion.setAutoCommit(false);
                // Se crea el objeto PreparedStatement.
                // Este precompila la sentencia SQL especificada.
                // Los signos de interrogación señalan el lugar en que deben establecerse los
                // parámetros antes de que se ejecute la sentencia.
                PreparedStatement ps = conexion.prepareStatement("INSERT INTO computadora (id, codigo, marca, modelo) VALUES (?, ?, ?, ?)");

                // Se establecen los parámetros y se ejecuta la sentencia.
                ps.setLong(1, id);
                ps.setString(2, codigo);
                ps.setString(3, marca);
                ps.setString(4, modelo);
                ps.executeUpdate();
                
                conexion.commit();
            
        } catch (SQLException ex) {
            conexion.rollback();
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarComputadoraHQL(int id, String codigo, String marca, String modelo) {
        try {
            Computadora compu = new Computadora();
            
            compu.setId(id);
            compu.setCodigo(codigo);
            compu.setMarca(marca);
            compu.setModelo(modelo);
            
            
            this.guardar(compu);
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Administrador
 */
public class Conexion {
    private Connection conectar = null;
    
    public Connection conexion() throws SQLException{
        try {
           Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mibase","root","");
            
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
         return conectar;
    }
    
    public void cerrarConexion(Connection con){
    
        try {
            con.close();
            System.out.println("cerrè la conexiona la base");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}

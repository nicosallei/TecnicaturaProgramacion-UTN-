/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class BaseSQL {
    
    private Connection conexionBd = null;
    private String user = "root";
    private String password = "123456";
    private String puerto = "3306";
    private String catalogo = "bd_computadora";
    private String host = "localhost";
    
    
    public Connection estableceConexion() {
        if (conexionBd != null) {
            return conexionBd;
        }
        try {
            // Se registra el Driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            String urlConexion = "jdbc:mysql://" + host + ":" + puerto + "/" + catalogo+"?useTimezone=true&serverTimezone=UTC";
            conexionBd = DriverManager.getConnection(urlConexion, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexionBd;
    }
    public void cierraConexion() {
        try {
            conexionBd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

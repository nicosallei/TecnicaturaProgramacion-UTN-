/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author Ing. Gerardo Magni
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Clase encargada de conexión y consultas a base de datos.

 */
public class BaseDeDatos {

    /** La conexion con la base de datos */
    private Connection conexion = null;
    private String user = "root";
    private String password = "123456";
    private String puerto = "3306";
    private String catalogo = "seguridad";
    private String host = "localhost";

    /** Se establece la conexion con la base de datos */
    public Connection estableceConexion() {
        if (conexion != null) {
            return conexion;
        }
        try {
            // Se registra el Driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            String urlConexion = "jdbc:mysql://" + host + ":" + puerto + "/" + catalogo;
            // Se obtiene una conexión con la base de datos. Hay que
            // cambiar el usuario "root" y la clave "root" por las
            // adecuadas a la base de datos que estemos usando.
            conexion = DriverManager.getConnection(urlConexion, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexion;
    }

    /** Cierra la conexión con la base de datos */
    public void cierraConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

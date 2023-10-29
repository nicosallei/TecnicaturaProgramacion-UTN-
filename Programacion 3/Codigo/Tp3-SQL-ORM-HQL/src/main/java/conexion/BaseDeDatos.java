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
    private String catalogo = "bd_computadora";
    private String host = "localhost";

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /** Se establece la conexion con la base de datos */
    public Connection estableceConexion() {
        if (conexion != null) {
            return conexion;
        }
        try {
            // Se registra el Driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            String urlConexion = "jdbc:mysql://" + host + ":" + puerto + "/" + catalogo+"?useTimezone=true&serverTimezone=UTC";
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

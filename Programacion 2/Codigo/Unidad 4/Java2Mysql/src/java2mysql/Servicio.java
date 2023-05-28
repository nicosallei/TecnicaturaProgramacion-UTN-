/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java2mysql;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian
 */
public class Servicio extends SQLQuery{
    public void verTodos(){
        try {
            this.conectar("127.0.0.1", "Izanagi2", "Cristian", "pos.2012");
            this.consulta = this.conn.prepareStatement("SELECT id, nombre FROM servicio");
            this.datos = this.consulta.executeQuery();
            while (this.datos.next()) {                
                System.out.println("id: "+this.datos.getInt("id")+" nombre: "+this.datos.getString("nombre"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basegestion2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class BaseGestion implements DBsentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ResultSet hojaResultados = null;
        Connection conectar = null;
        PreparedStatement sentencia = null;
// Registro el driver
        Class.forName("com.mysql.jdbc.Driver");
// Establezco la conexiòn a la base de datos, segùn el protocolo
        conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/basegestion2", "root", "");
// En el àmbito de la conexion genero la sentencia de consuta preparada
        sentencia = (PreparedStatement) conectar.prepareStatement(consulta4);
// Impacto efectivamente la conculta
        hojaResultados = sentencia.executeQuery();
// Creo un array de Objetos de 4 elementos porque conozco que hay 4 campos en la tabla persona
        Object datos[] = new Object[4];
// listado artesanal
        System.out.println("Listado de personas");
        // hago un bucle mientras la hoja de resultados tenga registros
        while (hojaResultados.next()) {
            // cargo cada campo del registro a un elemento del array de Objetos
            for (int i = 0; i < datos.length; i++) {

                datos[i] = hojaResultados.getObject(i + 1);

            }
// Recorro el array de objetos, para mostrar los datos leidos d ela base de datos
            for (int i = 0; i < datos.length; i++) {
                System.out.print(datos[i].toString() + "   ");
                if (i == 3) {
                    System.out.println("");
                }

            }

        }

        //---------------------
        // listado con metadata (descubrir la  estructura de la tabla)
        System.out.println("Las columnas de la tabla son : ");
// descubro el nombre d ela tabla
        System.out.println("Tabla: " + hojaResultados.getMetaData().getTableName(1));
        // realizo un bucle para determinar los campos que la componenen     
        for (int i = 1; i <= hojaResultados.getMetaData().getColumnCount(); i++) {
            System.out.println("Nombre de la columna " + i + " " + hojaResultados.getMetaData().getColumnName(i));

        }

        // realizo de nuevo la consulta
        sentencia = (PreparedStatement) conectar.prepareStatement(consulta4);

        hojaResultados = sentencia.executeQuery();
        // descubro la cantidad de columnas
        int cantidadDeColumnas = hojaResultados.getMetaData().getColumnCount();

        System.out.println("Cantidad de columnas " + cantidadDeColumnas);

        System.out.println("Listado de personas Inteligente");
        while (hojaResultados.next()) {

            // cargo el array de Objetos 
            for (int i = 0; i < hojaResultados.getMetaData().getColumnCount(); i++) {

                datos[i] = hojaResultados.getObject(i + 1);

            }
            // listo el array cargado
            for (int i = 0; i < (hojaResultados.getMetaData().getColumnCount()); i++) {
                System.out.print(datos[i].toString() + "   ");
                if (i == 3) {
                    System.out.println("");
                }

            }

        }

        //----------------Insertar un registro
        // En el àbito d ela conexiòn realizo la sentencia preparada  
        sentencia = (PreparedStatement) conectar.prepareStatement(consulta1);
        // Cargo a cada paràmetro de sustituciòn cada campo segùn el orden y su tipo de dato      
        sentencia.setInt(1, 9999);
        sentencia.setString(2, "facu");
        sentencia.setString(3, "cortez");
        // Impacto la inserciòn       
//        sentencia.executeUpdate();
//        System.out.println("Insertè");

        // elimino un registro
        sentencia = (PreparedStatement) conectar.prepareStatement(consulta2);
        sentencia.setInt(1, 4);
//        sentencia.executeUpdate();
//        System.out.println("elimine");

        System.out.println("voy a actualizar");
        sentencia = (PreparedStatement) conectar.prepareStatement(consulta3);
        sentencia.setString(1, "julio");
        sentencia.setString(2, "boca");
        sentencia.setInt(3, 5);
        sentencia.executeUpdate();
        System.out.println("actualicè");

    }

}

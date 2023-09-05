/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Ing. Gerardo Magni
 */
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Perfil;
import modelo.Persona;
import modelo.Usuario;

/**
 * Convierte un ResultSet en un DefaultTableModel
 *  *
 */
public class GestorTabla {

    /**
     * Rellena el DefaultTableModel con los datos del ResultSet.
     * Vacía el DefaultTableModel completamente y le mete los datos que hay
     * en el ResultSet.
     * @param rs El resultado de lac onsula a base de datos.
     * @param modelo El DefaultTableModel que queremos rellenar
     */
    public static void rellena(ResultSet rs, DefaultTableModel modelo) {
        //configuraColumnas(rs, modelo); //coneste metodo configuro las columnas de forma automatica
        vaciaFilasModelo(modelo);
        anhadeFilasDeDatos(rs, modelo);
    }

    /**
     * Añade al DefaultTableModel las filas correspondientes al ResultSet.
     * @param rs El resultado de la consulta a base de datos
     * @param modelo El DefaultTableModel que queremos rellenar.
     */
    public static void anhadeFilasDeDatos(ResultSet rs,
            DefaultTableModel modelo) {
        int numeroFila = 0;
        try {
            // Para cada registro de resultado en la consulta 
            while (rs.next()) {
                // Se crea y rellena la fila para el modelo de la tabla.
                Object[] datosFila = new Object[modelo.getColumnCount()];
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    datosFila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(datosFila);
                numeroFila++;
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void rellena(List rs, DefaultTableModel modelo) {
        //configuraColumnas(rs, modelo); //coneste metodo configuro las columnas de forma automatica
        vaciaFilasModelo(modelo);
        anhadeFilasDeDatos(rs, modelo);
    }

    public static void anhadeFilasDeDatos(List res, DefaultTableModel modelo) {
        //modelo = new DefaultTableModel();
        if(res.get(0) instanceof Persona){
            for(Persona p : (List<Persona>)res){
                Object[] fila = new Object[5];
                fila[0] = p.getId();
                fila[1] = p.getNombre();
                fila[2] = p.getApellido();
                fila[3] = p.getDni();
                fila[4] = p.getDomicilio().getId();
                modelo.addRow(fila);
            }
        }else if(res.get(0) instanceof Usuario){
            for(Usuario u : (List<Usuario>)res){
                Object[] fila = new Object[5];
                fila[0] = u.getId();
                fila[1] = u.getNombreUsuario();
                fila[2] = u.getClave();
                fila[3] = u.getPersona().getId();
                fila[4] = u.getPerfil().getId();
                modelo.addRow(fila);
            }
        }else if(res.get(0) instanceof Perfil){
            for(Perfil p : (List<Perfil>)res){
                Object[] fila = new Object[2];
                fila[0] = p.getId();
                fila[1] = p.getDenominacion();
                modelo.addRow(fila);
            }
        }
       
        
    }

    public static List transformarAObjetos(ResultSet rs, int cantCampos) {
        List listaObjetos = new ArrayList();
        try {
            // Para cada registro de resultado en la consulta 
            while (rs.next()) {
                // Se crea y rellena la fila para el modelo de la tabla.
                Object[] datosFila = new Object[cantCampos];
                int i = 0;
                for (i = 0; i < cantCampos; i++) {
                    datosFila[i] = rs.getObject(i + 1);
                }
                listaObjetos.add(datosFila);
            }
            rs.close();
            return listaObjetos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Borra todas las filas del modelo.
     * @param modelo El modelo para la tabla.
     */
    public static void vaciaFilasModelo(final DefaultTableModel modelo) {

        try {

            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Pone en el modelo para la tabla tantas columnas como tiene el resultado
     * de la consulta a base de datos.
     * @param rs Resultado de consulta a base de datos.
     * @param modelo Modelo de la tabla.
     */
    public static void configuraColumnas(final ResultSet rs,
            final DefaultTableModel modelo) {
        try {

            // Se obtiene los metadatos de la consulta. Con ellos
            // podemos obtener el número de columnas y el nombre
            // de las mismas.
            ResultSetMetaData metaDatos = rs.getMetaData();

            // Se obtiene el numero de columnas.
            int numeroColumnas = metaDatos.getColumnCount();

            // Se obtienen las etiquetas para cada columna
            Object[] etiquetas = new Object[numeroColumnas];
            for (int i = 0; i < numeroColumnas; i++) {
                etiquetas[i] = metaDatos.getColumnLabel(i + 1);
            }

            // Se meten las etiquetas en el modelo. El numero
            // de columnas se ajusta automáticamente.
            modelo.setColumnIdentifiers(etiquetas);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

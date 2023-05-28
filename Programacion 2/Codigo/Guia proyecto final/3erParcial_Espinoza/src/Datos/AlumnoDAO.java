package Datos;

import Modelo.AlumnoModelo;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;


/**
 *
 * @author rocio
 */
public class AlumnoDAO extends SQLQuery {
    
    private ArrayList <Modelo.AlumnoModelo> alumnos;
    private Modelo.AlumnoModelo alumno;
       
   

    public ArrayList<AlumnoModelo> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<AlumnoModelo> alumnos) {
        this.alumnos = alumnos;
    }

     
    public boolean cargaDatosDAO(Modelo.AlumnoModelo alumno) {
        try {      
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            this.datos = this.consulta.executeQuery();
            String sql ="INSERT INTO alumno (dni_alu, nombre_alu, ape_alu, domic_alu, tel_alu) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStmt = (PreparedStatement) this.conn.prepareStatement(sql);
            preparedStmt.setLong(1, alumno.getDni());
            preparedStmt.setString(2, alumno.getNombre());
            preparedStmt.setString(3, alumno.getApellido());
            preparedStmt.setString(4, alumno.getDomicilio());
            preparedStmt.setString(5, alumno.getTelefono());
            preparedStmt.execute();
            this.desconectar();
           return true;
            

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
       
    }
    
  
    public ArrayList<Modelo.AlumnoModelo> traeAlumnosDAO() {
        alumnos = new ArrayList();
        try {     
             this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from alumno");
            ResultSet hojadeResultados = consulta.executeQuery();

            while (hojadeResultados.next()) {
                alumno = new Modelo.AlumnoModelo();
                alumno.setDni(hojadeResultados.getLong(1));
                alumno.setNombre(hojadeResultados.getString(2));
                alumno.setApellido(hojadeResultados.getString(3));
                alumno.setDomicilio(hojadeResultados.getString(4));
                alumno.setTelefono(hojadeResultados.getString(5));
                alumnos.add(alumno);
               }
            this.desconectar();
           
           
        } catch (ClassNotFoundException |SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

       return alumnos;
        
    }

        
    public boolean bajaDAO(JTable tabla){
        int seleccion;
        alumnos = new ArrayList(traeAlumnosDAO());
        try {
               this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
           this.consulta = this.conn.prepareStatement("DELETE FROM Alumno WHERE dni_alu = ?");
            seleccion = tabla.getSelectedRow();
            this.consulta.setLong(1, alumnos.get(seleccion).getDni());
            consulta.executeUpdate();
            
            this.desconectar();
            return true;
            

        } catch (ClassNotFoundException |SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
               return false;
        }
    }
    
    public boolean modificaDAO(Modelo.AlumnoModelo alumno){
        try{
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            PreparedStatement preparedStmt = (PreparedStatement) this.conn.prepareStatement("UPDATE Alumno SET nombre_alu=?, ape_alu=?, domic_alu=?, tel_alu=? WHERE dni_alu=?");
            preparedStmt.setString(1, alumno.getNombre());
            preparedStmt.setString(2, alumno.getApellido());
            preparedStmt.setString(3, alumno.getDomicilio());
            preparedStmt.setString(4, alumno.getTelefono());
            preparedStmt.setLong(5, alumno.getDni());
            preparedStmt.executeUpdate();
            this.desconectar();
             return true;
        }catch(ClassNotFoundException |SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
               return false;
        }
        
       
    }
    
    public boolean dniRepetidoDAO(Modelo.AlumnoModelo alumno){
       
       try {
           this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from alumno where dni_alu=?");
            this.consulta.setLong(1, alumno.getDni());
            ResultSet hojadeResultados = consulta.executeQuery();
            if(hojadeResultados.next()){
                return true;              
            }
            this.desconectar();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;
   }

}
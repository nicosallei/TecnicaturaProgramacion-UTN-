package Datos;

import Modelo.NotaModelo;
import Modelo.ProfesorModelo;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;



public class NotaDAO extends SQLQuery{
    private ArrayList<NotaModelo> notas;
    private NotaModelo nota;



    public ArrayList<NotaModelo> traeNotasDAO() {
        notas = new ArrayList();
        try {  
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from Nota");
            ResultSet hojadeResultados = consulta.executeQuery();

            while (hojadeResultados.next()) {
                nota = new NotaModelo();
                Modelo.MateriaModelo materia = new Modelo.MateriaModelo();
                nota.setMateria(materia);
                Modelo.AlumnoModelo alumno = new Modelo.AlumnoModelo();
                nota.setAlumno(alumno);
                nota.getAlumno().setDni(hojadeResultados.getLong(1));
                nota.getMateria().setCodigo(hojadeResultados.getInt(2));
                nota.setNota(hojadeResultados.getInt(3));
                notas.add(nota);
               }
            
           this.desconectar();
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

       return notas;
        
    }
        

     public ArrayList<String> traeDNIAlumnoDAO(){
        ArrayList<String> dni= new ArrayList();
       try {
           this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select dni_alu from alumno");
            ResultSet hojadeResultados = consulta.executeQuery();
            dni.add("");
            while (hojadeResultados.next()) {
               dni.add(Long.toString(hojadeResultados.getLong(1)));
              }
            this.desconectar();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      return dni;
   }
    

     public ArrayList<String> traeCodigoMateriaDAO(){
       ArrayList<String> codigo = new ArrayList();
       try {
           this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select cod_mat from materia");
            ResultSet hojadeResultados = consulta.executeQuery();
            codigo.add("");
            while (hojadeResultados.next()) {
               codigo.add(Integer.toString(hojadeResultados.getInt(1)));
              }
            this.desconectar();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      return codigo;
   }
     

     public Modelo.MateriaModelo traeMateriaDAO(int codigo) {
        
        Modelo.MateriaModelo materia=new Modelo.MateriaModelo();        
        try {    
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from materia where cod_mat=?");
            this.consulta.setInt(1, codigo);
            
            ResultSet hojadeResultados = consulta.executeQuery();
            if(hojadeResultados.next()){
                ProfesorModelo profesor = new ProfesorModelo();
                materia.setProfesor(profesor);
                materia.setCodigo(hojadeResultados.getInt(1));
                materia.setNombre(hojadeResultados.getString(2));
                materia.setCantHoras(hojadeResultados.getInt(3));                
                materia.getProfesor().setDni(hojadeResultados.getLong(4));           
            }
            
            this.desconectar();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

       return materia;
        
    }
     
      public Modelo.AlumnoModelo traeAlumnoDAO(Long dni) {
        
        Modelo.AlumnoModelo alumno=new Modelo.AlumnoModelo();        
        try {    
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from alumno where dni_alu=?");
            this.consulta.setLong(1, dni);
            
            ResultSet hojadeResultados = consulta.executeQuery();
            if(hojadeResultados.next()){
               
                alumno.setDni(hojadeResultados.getLong(1));
                alumno.setNombre(hojadeResultados.getString(2));
                alumno.setApellido(hojadeResultados.getString(3));
                alumno.setDomicilio(hojadeResultados.getString(4));
                alumno.setTelefono(hojadeResultados.getString(5));
            }
            
            this.desconectar();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

       return alumno;
               }
       
    public boolean cargaDatosDAO(Modelo.NotaModelo nota) {
        try {
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            this.datos = this.consulta.executeQuery();
            String sql ="INSERT INTO nota (dni_alu_not, cod_mat_not, nota_not) VALUES (?,?,?)";
            PreparedStatement preparedStmt = (PreparedStatement) this.conn.prepareStatement(sql);
            preparedStmt.setLong(1, nota.getAlumno().getDni());
            preparedStmt.setInt(2, nota.getMateria().getCodigo());
            preparedStmt.setInt(3, nota.getNota());
            preparedStmt.execute();
            this.desconectar();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
        
    public boolean bajaDAO(JTable tabla){
        int seleccion;
        notas = new ArrayList(traeNotasDAO());
        try {
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            this.datos = this.consulta.executeQuery();
            this.consulta = this.conn.prepareStatement("DELETE FROM Nota WHERE dni_alu_not = ? AND cod_mat_not = ?");
            seleccion = tabla.getSelectedRow();
            this.consulta.setLong(1, notas.get(seleccion).getAlumno().getDni());
            this.consulta.setInt(2, notas.get(seleccion).getMateria().getCodigo());
            consulta.executeUpdate();
            this.desconectar();           
            return true;
            

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
               return false;
        }
    }
    
     public boolean modificaDAO(Modelo.NotaModelo nota){
        try{
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            PreparedStatement preparedStmt = (PreparedStatement) this.conn.prepareStatement("UPDATE Nota SET nota_not=? WHERE dni_alu_not=? AND cod_mat_not=?");
            preparedStmt.setInt(1, nota.getNota());
            preparedStmt.setLong(2, nota.getAlumno().getDni());
            preparedStmt.setInt(3, nota.getMateria().getCodigo());      
            preparedStmt.executeUpdate();
            this.desconectar();
             return true;
        }catch(ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
               return false;
        }
    
}
    public boolean notaRepetida(Modelo.NotaModelo nota){
       
       try {
           this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from nota where dni_alu_not=? AND cod_mat_not=?");
            this.consulta.setLong(1, nota.getAlumno().getDni());
            this.consulta.setInt(2, nota.getMateria().getCodigo());
            ResultSet hojadeResultados = consulta.executeQuery();
            if(hojadeResultados.next()){
                return true;              
            }
            this.desconectar();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;
   }

    
}

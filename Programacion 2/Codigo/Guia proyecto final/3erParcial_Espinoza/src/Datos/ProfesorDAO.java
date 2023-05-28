/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.ProfesorModelo;
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
public class ProfesorDAO extends SQLQuery {

    private ArrayList<Modelo.ProfesorModelo> profesores;
    private Modelo.ProfesorModelo profesor;

    public ArrayList<ProfesorModelo> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<ProfesorModelo> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Modelo.ProfesorModelo> traeProfesoresDAO() {
        profesores = new ArrayList();
        try {
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from profesor");
            ResultSet hojadeResultados = consulta.executeQuery();

            while (hojadeResultados.next()) {
                profesor = new Modelo.ProfesorModelo();
                profesor.setDni(hojadeResultados.getLong(1));
                profesor.setNombre(hojadeResultados.getString(2));
                profesor.setApellido(hojadeResultados.getString(3));
                profesor.setDom(hojadeResultados.getString(4));
                profesor.setTel(hojadeResultados.getString(5));
                profesores.add(profesor);
            }
            this.desconectar();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return profesores;

    }

    public Modelo.ProfesorModelo traeUNProfesorDAO(Long dni) {
        Modelo.ProfesorModelo profe = new Modelo.ProfesorModelo();
        try {
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from profesor where dni_prof=?");
            this.consulta.setLong(1, dni);
            ResultSet hojadeResultados = consulta.executeQuery();
            profe.setDni(hojadeResultados.getLong(1));
            profe.setNombre(hojadeResultados.getString(2));
            profe.setApellido(hojadeResultados.getString(3));
            profe.setDom(hojadeResultados.getString(4));
            profe.setTel(hojadeResultados.getString(5));
            this.desconectar();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return profe;

    }

    public boolean cargaDatosDAO(Modelo.ProfesorModelo profesor) {
        try {
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            this.datos = this.consulta.executeQuery();
            String sql = "INSERT INTO profesor (dni_prof, nom_prof, ape_prof, domic_prof, tel_prof) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStmt = (PreparedStatement) this.conn.prepareStatement(sql);
            preparedStmt.setLong(1, profesor.getDni());
            preparedStmt.setString(2, profesor.getNombre());
            preparedStmt.setString(3, profesor.getApellido());
            preparedStmt.setString(4, profesor.getDom());
            preparedStmt.setString(5, profesor.getTel());
            preparedStmt.execute();

            this.desconectar();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean bajaDAO(JTable tabla) {
        int seleccion;
        profesores = new ArrayList(traeProfesoresDAO());
        try {
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            this.datos = this.consulta.executeQuery();
            this.consulta = this.conn.prepareStatement("DELETE FROM Profesor WHERE dni_prof = ?");
            seleccion = tabla.getSelectedRow();
            this.consulta.setLong(1, profesores.get(seleccion).getDni());
            consulta.executeUpdate();
            this.desconectar();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean modificaDAO(Modelo.ProfesorModelo profesor) {
        try {
            this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("UPDATE Profesor SET nom_prof=?, ape_prof=?, domic_prof=?, tel_prof=? WHERE dni_prof=?");
            this.consulta.setString(1, profesor.getNombre());
            this.consulta.setString(2, profesor.getApellido());
            this.consulta.setString(3, profesor.getDom());
            this.consulta.setString(4, profesor.getTel());
            this.consulta.setLong(5, profesor.getDni());
            this.consulta.executeUpdate();
            this.desconectar();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProfesorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    public boolean dniRepetidoDAO(Modelo.ProfesorModelo profesor){
       
       try {
           this.conectar("127.0.0.1", "SGA_2019", "root", "mysql");
            this.consulta = this.conn.prepareStatement("select * from profesor where dni_prof=?");
            this.consulta.setLong(1, profesor.getDni());
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

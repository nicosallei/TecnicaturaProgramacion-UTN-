/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import conexion.BaseSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Componente;
import modelo.Computadora;



/**
 *
 * @author Nicolas Sallei Correa
 */
public class GestoSQL  {

    BaseSQL bd = new BaseSQL();
    Connection conexion = bd.estableceConexion();
        
    public void insert(Computadora computadora) throws SQLException{
    
    try {
               conexion.setAutoCommit(false);
               PreparedStatement psComputadora = conexion.prepareStatement("INSERT INTO computadora (id, codigo, marca, modelo) VALUES (?, ?, ?, ?)");

                // Se establecen los parámetros y se ejecuta la sentencia.
               
                psComputadora.setLong(1, computadora.getId());
                psComputadora.setString(2, computadora.getCodigo());
                psComputadora.setString(3, computadora.getMarca());
                psComputadora.setString(4, computadora.getModelo());
                psComputadora.executeUpdate();
    
                
                for(Componente comp : computadora.getComponente()){
                PreparedStatement psComponente = conexion.prepareStatement("INSERT INTO componente (id, nombre, nroSerie, idComputadora) VALUES (?, ?, ?, ?)");

                // Se establecen los parámetros y se ejecuta la sentencia.
                psComponente.setLong(1, comp.getId());
                psComponente.setString(2, comp.getNombre());
                psComponente.setString(3, comp.getNroSerie());
                psComponente.setLong(4, computadora.getId());
                psComponente.executeUpdate();
                psComponente.close();
                
                }
                
                
                conexion.commit();
                System.out.println("Computadora guardada Correctamente");
                psComputadora.close();
                
    }
    catch(SQLException e){
        // En caso de error, hacer rollback
                    conexion.rollback();
    }finally{
    //Cierro conexion
            try {
                if (conexion != null) {
                    bd.cierraConexion();
                    conexion.close();
                }
            } catch (SQLException e) {
            }
        }
}
}
    
    
    
   
    
    

    
    


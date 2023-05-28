/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import datos.SQLQuery;
import modelo.Cliente;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO extends SQLQuery{

    public ClienteDAO() {
        try {
            this.conectar("localhost", "bd", "root", "mysql");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public String sexo(String s){
        //System.out.println("==>"+s);
        if("M".equals(s)){
            return "Masculino";
        }else if("F".equals(s)){
            return "Femenino"; 
        }else{
            return "---";
        }
    }
    
    public ArrayList<Cliente> verTodos(){
        ArrayList<Cliente> cliTodos = new ArrayList();
        try {
            
            this.consulta = this.conn.prepareStatement("SELECT cli_dni,cli_nombre,cli_apellido,cli_telefono,cli_sexo FROM Clientes");
            this.datos = this.consulta.executeQuery();
            while (this.datos.next()) {  
                //this.datos.getString("alum_nom").equals(null);       
                //System.out.println("DNI: "+this.datos.getInt("cli_dni")+"Nombre: "+this.datos.getString("cli_nombre")+" Apellido: "+this.datos.getString("cli_apellido")+" Teléfono: "+this.datos.getString("cli_telefono")+" Sexo: "+sexo(this.datos.getString("cli_sexo")));
                Cliente cli1 = new Cliente();
                cli1.setDni(this.datos.getInt("cli_dni"));
                cli1.setApellido(this.datos.getString("cli_apellido"));
                cli1.setNombre(this.datos.getString("cli_nombre"));
                cli1.setTelefono(this.datos.getString("cli_telefono"));
                cli1.setSexo(sexo(this.datos.getString("cli_sexo")));
                cliTodos.add(cli1);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliTodos; 
    }
    
    public boolean insertarClienteDAO(Cliente cli){
               
        try {
            this.s = this.conn.createStatement();
            //se insertan datos en la tabla
                this.s.executeUpdate("INSERT INTO Clientes (cli_dni, cli_nombre, cli_apellido, cli_telefono, cli_sexo) VALUES (" + cli.getDni() + ",'" + cli.getNombre() + "','" + cli.getApellido()+ "','" + cli.getTelefono() + "', '" + cli.getSexo() + "' )");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }  
    
    public boolean actualizarCliente(Cliente cli){
               
        try {
            this.s = this.conn.createStatement();
            s.executeUpdate("UPDATE Clientes SET "
                    + "cli_nombre  = '" +  cli.getNombre() + "',"
                    + "cli_apellido = '" + cli.getApellido() + "' WHERE cli_dni =  " + cli.getDni() );
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } 

    public boolean eliminarCliente(int dni){
               
        try {
            this.s = this.conn.createStatement();
            //Los datos que vamos a insertar los tenemos en 3 arrays
            s.executeUpdate("DELETE FROM Clientes WHERE cli_dni =  " + dni );
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } 
    
}

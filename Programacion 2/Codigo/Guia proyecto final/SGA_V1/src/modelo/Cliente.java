/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author martin
 */
public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String sexo;
    private ClienteDAO clienteDAO;

    public Cliente(int dni, String nombre, String apellido, String telefono, String sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.sexo = sexo;
        this.clienteDAO = new ClienteDAO();
    }

    public Cliente() {
        this.clienteDAO = new ClienteDAO();
    }
    
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public ArrayList<Cliente> verClientesTodos(){
          return this.clienteDAO.verTodos();
    }
    
    public boolean insertarCliente(Cliente cli){
        return this.clienteDAO.insertarClienteDAO(cli);
    }
    
}

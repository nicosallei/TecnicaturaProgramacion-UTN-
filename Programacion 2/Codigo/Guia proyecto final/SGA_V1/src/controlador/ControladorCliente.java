/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import vista.JF_Menu;

/**
 *
 * @author martin
 */
public class ControladorCliente {
  
    private DefaultTableModel tCliente;
    private ArrayList<Cliente> arrayListCliente = new ArrayList<Cliente>();
    private Cliente cliente = new Cliente();
    private int posicionAlumnoAModificar;
    private JF_Menu menuPrincipal;

    public ControladorCliente(JF_Menu menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
        this.arrayListCliente = this.cliente.verClientesTodos();
    }

    public void alumnoAModificar(int posicionAlumnoAModificar) {
        this.posicionAlumnoAModificar = posicionAlumnoAModificar;
    }

    public DefaultTableModel gettCliente() {
        return tCliente;
    }

    public void settCliente(DefaultTableModel tCliente) {
        this.tCliente = tCliente;
    }

    public ArrayList<Cliente> getArrayListCliente() {
        return arrayListCliente;
    }

    public void setArrayListCliente(ArrayList<Cliente> arrayListCliente) {
        this.arrayListCliente = arrayListCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

//    public void modificarAlumno(String dni, String nombre, String apellido, String domicilio, String fecha) throws SQLException {
//        cliente.modificarAlumno(posicionAlumnoAModificar, Integer.parseInt(dni), nombre, apellido, domicilio, fecha);
//    }
// 
    

    public boolean agregarCliente(String dni, String nombre, String apellido, String telefono, String sexo) {
        boolean existe = false;
        
        if (this.arrayListCliente.size() != 0) {
            for (int i = 0; i < this.arrayListCliente.size(); i++) {
                if (Integer.parseInt(dni) == this.arrayListCliente.get(i).getDni()) {
                    JOptionPane.showMessageDialog(null, "El alumno ingresado ya existe");
                    i = this.arrayListCliente.size();
                    existe = true;
                }
            }
        }
        if (existe == false) {
            this.cliente.setDni(Integer.parseInt(dni));
            this.cliente.setNombre(nombre);
            this.cliente.setApellido(apellido);
            this.cliente.setSexo(sexo);
            this.cliente.setTelefono(telefono);
            //INGRESO EL DATO Y ESPERO QUE SE RETORNE UN BOOLEAN POR ESO.
            return this.cliente.insertarCliente(cliente);
        }
        else{
            return false;
        }
    }
//
//    public ArrayList devolverLista() throws SQLException, ParseException {
//        alumno = new Alumno();
//        arrayListCliente = alumno.listaAlumnos();
//        return arrayListCliente;
//    }
//
//    public void eliminarAlumno(int nroFila) throws SQLException {
//        alumno.eliminarAlumno(nroFila);
//    }
//
    public DefaultTableModel tablaClientes() {
        int contadorTabla = 0;
        String x[][] = {};
        String nombresColumnas[] = {"Dni", "Nombre", "Apellido", "Teléfono", "Sexo"};
        tCliente = new DefaultTableModel(x, nombresColumnas);
        if (arrayListCliente != null) {
            for (int i = 0; i < this.arrayListCliente.size(); i++) {
                tCliente.insertRow(contadorTabla, new Object[]{});
                tCliente.setValueAt(arrayListCliente.get(i).getDni(), contadorTabla, 0);
                tCliente.setValueAt(arrayListCliente.get(i).getNombre(), contadorTabla, 1);
                tCliente.setValueAt(arrayListCliente.get(i).getApellido(), contadorTabla, 2);
                tCliente.setValueAt(arrayListCliente.get(i).getTelefono(), contadorTabla, 3);
                tCliente.setValueAt(arrayListCliente.get(i).getSexo(), contadorTabla, 4);
                contadorTabla++;
            }
        }
        return tCliente;
    }
    
}

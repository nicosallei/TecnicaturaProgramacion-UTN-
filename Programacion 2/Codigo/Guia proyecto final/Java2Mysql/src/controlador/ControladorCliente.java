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
    
//FieldTypeComment
//cli_dni bigint(10) unsigned NOT NULL
//cli_nombre varchar(30) NOT NULL
//cli_apellido varchar(50) NOT NULL
//cli_telefono varchar(30) NULL
//cli_sexo
//    private int dni;
//    private String nombre;
//    private String apellido;
//    private String telefono;
//    private String sexo;
    public void agregarCliente(String dni, String nombre, String apellido, String telefono, String sexo) {
        boolean existe = false;
        
        if (this.arrayListCliente.size() != 0) {
            for (int i = 0; i < arrayListCliente.size(); i++) {
                if (Integer.parseInt(dni) == arrayListCliente.get(i).getDni()) {
                    JOptionPane.showMessageDialog(null, "El alumno ingresado ya existe");
                    i = arrayListCliente.size();
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
            this.cliente.insertarCliente(cliente);
            JOptionPane.showMessageDialog(null, "ALUMNO GUARDADO");
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
    public DefaultTableModel tablaClientes(ArrayList<Cliente> arrayListCliente) {
        int contadorTabla = 0;
        String x[][] = {};
        String nombresColumnas[] = {"Dni", "Nombre", "Apellido", "Teléfono", "Sexo"};
        tCliente = new DefaultTableModel(x, nombresColumnas);
        if (arrayListCliente != null) {
            for (int i = 0; i < arrayListCliente.size(); i++) {
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

package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AlumnoControlador implements ActionListener, MouseListener {

    private Modelo.AlumnoModelo alumnoModelo;
    private Vista.AlumnoVista alumnoVista;
    private DefaultTableModel modeloTabla;

    public AlumnoControlador(Modelo.AlumnoModelo modelo, Vista.AlumnoVista vista) {
        this.alumnoModelo = modelo;
        this.alumnoVista = vista;
        this.alumnoVista.setVisible(true);
        this.llenarFilas(this.alumnoVista.getjTableAlumno());
        escucharBotones();
    }

    public void escucharBotones() {
        this.alumnoVista.getjBGuardar().addActionListener(this);
        this.alumnoVista.getjBVolver().addActionListener(this);
        this.alumnoVista.getjBEliminar().addActionListener(this);
        this.alumnoVista.getjTableAlumno().addMouseListener(this);
        this.alumnoVista.getjBModificar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource().equals(this.alumnoVista.getjBGuardar())) {

            if (alumnoModelo.validaCarga(this.alumnoVista.getjTNombre().getText()) || alumnoModelo.validaCarga(this.alumnoVista.getjTApellido().getText()) || alumnoModelo.validaCarga(this.alumnoVista.getjTDNI().getText())) {

                JOptionPane.showMessageDialog(null, "Los campos de DNI, nombre y apellido son obligatorios");

            } else if (alumnoModelo.validaDNI(this.alumnoVista.getjTDNI().getText())) {
                JOptionPane.showMessageDialog(null, "El DNI no es válido");

            } else{
                this.alumnoModelo.setDni(Long.parseLong(this.alumnoVista.getjTDNI().getText()));
                this.alumnoModelo.setNombre(this.alumnoVista.getjTNombre().getText());
                this.alumnoModelo.setApellido(this.alumnoVista.getjTApellido().getText());
                this.alumnoModelo.setDomicilio(this.alumnoVista.getjTDomicilio().getText());
                this.alumnoModelo.setTelefono(this.alumnoVista.getjTTelefono().getText());
                if (alumnoModelo.dniRepetido(alumnoModelo)){
                    if (this.alumnoModelo.cargaDatos(alumnoModelo)) {
                        JOptionPane.showMessageDialog(null, "Alumno cargado correctamente");
                    }
                    this.limpiarTabla(this.alumnoVista.getjTableAlumno());
                    llenarFilas(this.alumnoVista.getjTableAlumno());
                    limpiaCuadros();
                } else {
                JOptionPane.showMessageDialog(null, "Alumno repetido");
                }
            }
        } else if (evento.getSource().equals(this.alumnoVista.getjBVolver())) {
            Vista.MenuPrincipalVista menuVista = new Vista.MenuPrincipalVista();
            MenuPrincipalControlador menuControlador = new MenuPrincipalControlador(menuVista);
            this.alumnoVista.dispose();

        } else if (evento.getSource().equals(this.alumnoVista.getjBEliminar())) {
            if (this.alumnoModelo.baja(this.alumnoVista.getjTableAlumno())) {
                limpiarTabla(this.alumnoVista.getjTableAlumno());
                llenarFilas(this.alumnoVista.getjTableAlumno());
                JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente");
                limpiaCuadros();
                this.alumnoVista.getjTDNI().setEditable(true);
            }

        } else if (evento.getSource().equals(this.alumnoVista.getjBModificar())) {

            this.alumnoModelo.setDni(Long.parseLong(this.alumnoVista.getjTDNI().getText()));
            this.alumnoModelo.setNombre(this.alumnoVista.getjTNombre().getText());
            this.alumnoModelo.setApellido(this.alumnoVista.getjTApellido().getText());
            this.alumnoModelo.setDomicilio(this.alumnoVista.getjTDomicilio().getText());
            this.alumnoModelo.setTelefono(this.alumnoVista.getjTTelefono().getText());
            if (this.alumnoModelo.modifica(alumnoModelo)) {
                JOptionPane.showMessageDialog(null, "Alumno modificado correctamente");
            }
            this.limpiarTabla(this.alumnoVista.getjTableAlumno());
            llenarFilas(this.alumnoVista.getjTableAlumno());
            limpiaCuadros();
            this.alumnoVista.getjTDNI().setEditable(true);
        }

    }

    public String[] dameColumnas() {
        String[] Columna = {"DNI", "Nombre", "Apellido", "Domicilio", "Telefono"};
        return Columna;
    }

    public void limpiarTabla(JTable tabla) {
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        int a = tabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    public void llenarFilas(JTable tabla) {
        modeloTabla = new DefaultTableModel(null, dameColumnas());
        ArrayList<Modelo.AlumnoModelo> alumnos;
        alumnos = this.alumnoModelo.traeAlumnos();
        this.limpiarTabla(this.alumnoVista.getjTableAlumno());
        Object datos[] = new Object[5];
        if (alumnos.size() > 0) {
            for (int i = 0; i < alumnos.size(); i++) {
                datos[0] = alumnos.get(i).getDni();
                datos[1] = alumnos.get(i).getNombre();
                datos[2] = alumnos.get(i).getApellido();
                datos[3] = alumnos.get(i).getDomicilio();
                datos[4] = alumnos.get(i).getTelefono();
                modeloTabla.addRow(datos);
            }
        }

        tabla.setModel(modeloTabla);
        alumnos.clear();

    }

    public void limpiaCuadros() {
        this.alumnoVista.getjTNombre().setText("");
        this.alumnoVista.getjTApellido().setText("");
        this.alumnoVista.getjTDNI().setText("");
        this.alumnoVista.getjTDomicilio().setText("");
        this.alumnoVista.getjTTelefono().setText("");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            int fila = this.alumnoVista.getjTableAlumno().rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.alumnoVista.getjTDNI().setText(String.valueOf(this.alumnoVista.getjTableAlumno().getValueAt(fila, 0)));
                this.alumnoVista.getjTDNI().setEditable(false);
                this.alumnoVista.getjTNombre().setText(String.valueOf(this.alumnoVista.getjTableAlumno().getValueAt(fila, 1)));
                this.alumnoVista.getjTApellido().setText(String.valueOf(this.alumnoVista.getjTableAlumno().getValueAt(fila, 2)));
                this.alumnoVista.getjTDomicilio().setText(String.valueOf(this.alumnoVista.getjTableAlumno().getValueAt(fila, 3)));
                this.alumnoVista.getjTTelefono().setText(String.valueOf(this.alumnoVista.getjTableAlumno().getValueAt(fila, 4)));
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {

    }
}

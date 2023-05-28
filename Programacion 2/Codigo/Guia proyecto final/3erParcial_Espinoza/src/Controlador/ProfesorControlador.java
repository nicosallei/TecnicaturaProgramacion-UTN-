package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rocio
 */
public class ProfesorControlador implements ActionListener, MouseListener{
    private Vista.ProfesorVista profesorVista;
    private Modelo.ProfesorModelo profesorModelo;
    private DefaultTableModel modeloTabla;

    public ProfesorControlador(Vista.ProfesorVista vista, Modelo.ProfesorModelo modelo) {
        this.profesorVista = vista;
        this.profesorModelo = modelo;
        this.profesorVista.setVisible(true);        
        llenarFilas(this.profesorVista.getjTableProfesor());
        escucharBotones();
        
    }
    
    public void escucharBotones(){
        this.profesorVista.getjBGuardar().addActionListener(this);
        this.profesorVista.getjBVolver().addActionListener(this);
        this.profesorVista.getjBEliminar().addActionListener(this);
        this.profesorVista.getjTableProfesor().addMouseListener(this);
        this.profesorVista.getjBModificar().addActionListener(this);
    }
    
      
     @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource().equals(this.profesorVista.getjBGuardar())) {
            
            if (profesorModelo.validaCarga(this.profesorVista.getjTNombre().getText()) || profesorModelo.validaCarga(this.profesorVista.getjTApellido().getText()) || profesorModelo.validaCarga(this.profesorVista.getjTDNI().getText())) {
               
                JOptionPane.showMessageDialog(null, "Los campos de DNI, nombre y apellido son obligatorios");
            
            } else if (profesorModelo.validaDNI(this.profesorVista.getjTDNI().getText())) {
                JOptionPane.showMessageDialog(null, "El DNI no es válido");
            
            }else{
                this.profesorModelo.setDni(Long.parseLong(this.profesorVista.getjTDNI().getText()));
                this.profesorModelo.setNombre(this.profesorVista.getjTNombre().getText());
                this.profesorModelo.setApellido(this.profesorVista.getjTApellido().getText());
                this.profesorModelo.setDom(this.profesorVista.getjTDomicilio().getText());
                this.profesorModelo.setTel(this.profesorVista.getjTTelefono().getText());
                if (profesorModelo.dniRepetido(profesorModelo)){
                    if(this.profesorModelo.cargaDatos(profesorModelo)){
                        JOptionPane.showMessageDialog(null, "Profesor cargado correctamente");
                    }
                this.limpiarTabla(this.profesorVista.getjTableProfesor());
                llenarFilas(this.profesorVista.getjTableProfesor());
                limpiaCuadros();                
                
                }else{
                    JOptionPane.showMessageDialog(null, "Profesor repetido");
                }
            }
        }else if(evento.getSource().equals(this.profesorVista.getjBVolver())){
            Vista.MenuPrincipalVista menuVista = new Vista.MenuPrincipalVista();
            MenuPrincipalControlador menuControlador = new MenuPrincipalControlador(menuVista);
            this.profesorVista.dispose();
           
            
        }else if (evento.getSource().equals(this.profesorVista.getjBEliminar())) {
            if(this.profesorModelo.baja(this.profesorVista.getjTableProfesor())){
                limpiarTabla(this.profesorVista.getjTableProfesor());
                llenarFilas(this.profesorVista.getjTableProfesor());
                JOptionPane.showMessageDialog(null, "Profesor eliminado correctamente");
                limpiaCuadros();
                this.profesorVista.getjTDNI().setEditable(true);
            }
            
        }else if(evento.getSource().equals(this.profesorVista.getjBModificar())){
           
                this.profesorModelo.setDni(Long.parseLong(this.profesorVista.getjTDNI().getText()));
                this.profesorModelo.setNombre(this.profesorVista.getjTNombre().getText());
                this.profesorModelo.setApellido(this.profesorVista.getjTApellido().getText());
                this.profesorModelo.setDom(this.profesorVista.getjTDomicilio().getText());
                this.profesorModelo.setTel(this.profesorVista.getjTTelefono().getText());
                if(this.profesorModelo.modifica(profesorModelo)){
                     JOptionPane.showMessageDialog(null, "Profesor modificado correctamente");
                }
                this.limpiarTabla(this.profesorVista.getjTableProfesor());
                llenarFilas(this.profesorVista.getjTableProfesor());
                limpiaCuadros();
                this.profesorVista.getjTDNI().setEditable(true);
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
        ArrayList<Modelo.ProfesorModelo> profesores;
        profesores = this.profesorModelo.traeProfesores();
        this.limpiarTabla(this.profesorVista.getjTableProfesor());
        Object datos[] = new Object[5];
        if (profesores.size() > 0) {
            for (int i = 0; i < profesores.size(); i++) {
                datos[0] = profesores.get(i).getDni();
                datos[1] = profesores.get(i).getNombre();
                datos[2] = profesores.get(i).getApellido();
                datos[3] = profesores.get(i).getDom();
                datos[4] = profesores.get(i).getTel();
                modeloTabla.addRow(datos);
            }
        }

        tabla.setModel(modeloTabla);
        profesores.clear();

    }
    
    public void limpiaCuadros(){
        this.profesorVista.getjTNombre().setText("");
        this.profesorVista.getjTApellido().setText("");
        this.profesorVista.getjTDNI().setText("");
        this.profesorVista.getjTDomicilio().setText("");
        this.profesorVista.getjTTelefono().setText("");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() ==1){
            int fila = this.profesorVista.getjTableProfesor().rowAtPoint(e.getPoint());
            if (fila > -1){
                this.profesorVista.getjTDNI().setText(String.valueOf(this.profesorVista.getjTableProfesor().getValueAt(fila, 0)));
                this.profesorVista.getjTDNI().setEditable(false);
                this.profesorVista.getjTNombre().setText(String.valueOf(this.profesorVista.getjTableProfesor().getValueAt(fila, 1)));
                this.profesorVista.getjTApellido().setText(String.valueOf(this.profesorVista.getjTableProfesor().getValueAt(fila, 2)));
                this.profesorVista.getjTDomicilio().setText(String.valueOf(this.profesorVista.getjTableProfesor().getValueAt(fila, 3)));
                this.profesorVista.getjTTelefono().setText(String.valueOf(this.profesorVista.getjTableProfesor().getValueAt(fila, 4)));
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

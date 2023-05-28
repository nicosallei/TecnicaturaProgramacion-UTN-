/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.NotaModelo;
import Vista.NotaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rocio
 */
public class NotaControlador implements ActionListener, MouseListener,  ItemListener{
    private Modelo.NotaModelo notaModelo;
    private Vista.NotaVista notaVista;
    private DefaultTableModel modeloTabla;
    private Modelo.AlumnoModelo alumno = new Modelo.AlumnoModelo();
    private Modelo.MateriaModelo materia = new Modelo.MateriaModelo();

    public NotaControlador(NotaModelo notaModelo, NotaVista notaVista) {
        this.notaModelo = notaModelo;
        this.notaVista = notaVista;
        this.notaVista.setVisible(true);
        this.llenarFilas(this.notaVista.getjTNotas());
        llenaComboBoxAlumno();
        this.notaVista.getjTAlumno().setEditable(false);
        llenaComboBoxMateria();
        this.notaVista.getjTMateria().setEditable(false);
        this.notaModelo.setAlumno(alumno);
        this.notaModelo.setMateria(materia);
        escucharBotones();
    }
    
    public void escucharBotones(){
       this.notaVista.getjBGuardar().addActionListener(this);
       this.notaVista.getjBEliminar().addActionListener(this);
       this.notaVista.getjBModificar().addActionListener(this);
       this.notaVista.getjTNotas().addMouseListener(this);
       this.notaVista.getjBVolver().addActionListener(this);
       this.notaVista.getjCBCodigoMateria().addItemListener(this);
       this.notaVista.getjCBDniAlumno().addItemListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource().equals(this.notaVista.getjBGuardar())) {
            if(notaModelo.validaCarga(this.notaVista.getjCBCodigoMateria().toString()) || notaModelo.validaCarga(this.notaVista.getjCBDniAlumno().toString())){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno y una materia");
            }else if(notaModelo.validaNota(Integer.parseInt(this.notaVista.getjTNota().getText()))){
                this.notaModelo.getAlumno().setDni(Long.parseLong(this.notaVista.getjCBDniAlumno().getSelectedItem().toString()));
                this.notaModelo.getMateria().setCodigo(Integer.parseInt(this.notaVista.getjCBCodigoMateria().getSelectedItem().toString()));
                this.notaModelo.setNota(Integer.parseInt(this.notaVista.getjTNota().getText()));
                if(notaModelo.notaRepetida(notaModelo)){
                    if(this.notaModelo.cargaDatos(notaModelo)){
                        JOptionPane.showMessageDialog(null, "Nota cargada");
                    }
                    this.limpiarTabla(this.notaVista.getjTNotas());
                    llenarFilas(this.notaVista.getjTNotas());
                    limpiaCuadros();
                
                }else{
                    JOptionPane.showMessageDialog(null, "Nota repetida");
                }
            }else{
                JOptionPane.showMessageDialog(null, "La nota debe estar entre 1 y 10");
            }
        }else if(evento.getSource().equals(this.notaVista.getjBEliminar())){
            if(this.notaModelo.baja(this.notaVista.getjTNotas())){
                limpiarTabla(this.notaVista.getjTNotas());
                llenarFilas(this.notaVista.getjTNotas());
                JOptionPane.showMessageDialog(null, "Nota eliminada correctamente");
                limpiaCuadros();    
            }
            
        }else if(evento.getSource().equals(this.notaVista.getjBModificar())){
            this.notaModelo.getAlumno().setDni(Long.parseLong(this.notaVista.getjCBDniAlumno().getSelectedItem().toString()));
                this.notaModelo.getMateria().setCodigo(Integer.parseInt(this.notaVista.getjCBCodigoMateria().getSelectedItem().toString()));
                this.notaModelo.setNota(Integer.parseInt(this.notaVista.getjTNota().getText()));
                if(this.notaModelo.modifica(notaModelo)){
                    JOptionPane.showMessageDialog(null, "Nota modificada");
                }
                this.limpiarTabla(this.notaVista.getjTNotas());
                llenarFilas(this.notaVista.getjTNotas());
                limpiaCuadros();
            
        }else if(evento.getSource().equals(this.notaVista.getjBVolver())){
            Vista.MenuPrincipalVista menuVista = new Vista.MenuPrincipalVista();
            Controlador.MenuPrincipalControlador menuControlador = new MenuPrincipalControlador(menuVista);
            this.notaVista.dispose();
        }
    }
    
    
    public void llenaComboBoxAlumno(){
        ArrayList<String> dni = this.notaModelo.traeDNIAlumno();
        Iterator<String> dniIterator = dni.iterator();
        while(dniIterator.hasNext()){
            this.notaVista.getjCBDniAlumno().addItem(dniIterator.next());
        }
    }
    
    public void llenaComboBoxMateria(){
        ArrayList<String> materia = this.notaModelo.traeCodigoMateria();
        Iterator<String> materiaIterator = materia.iterator();
        while(materiaIterator.hasNext()){
            this.notaVista.getjCBCodigoMateria().addItem(materiaIterator.next());
        }
    }

    public void llenarFilas(JTable tabla) {
        modeloTabla = new DefaultTableModel(null, dameColumnas());
        ArrayList<Modelo.NotaModelo> notas;
        notas = this.notaModelo.traeNotas();
        this.limpiarTabla(this.notaVista.getjTNotas());
        Object datos[] = new Object[3];
        if (notas.size() > 0) {
            for (int i = 0; i < notas.size(); i++) {
                datos[0] = notas.get(i).getAlumno().getDni();
                datos[1] = notas.get(i).getMateria().getCodigo();
                datos[2] = notas.get(i).getNota();
                modeloTabla.addRow(datos);
            }
        }
        tabla.setModel(modeloTabla);
        notas.clear();

    }
    
     public void limpiarTabla(JTable tabla) {
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        int a = tabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }
    
     public String[] dameColumnas() {
        String[] Columna = {"DNI Alumno", "Codigo Materia", "Nota"};
        return Columna;
    }
     
      public void limpiaCuadros() {
          this.notaVista.getjTNota().setText("");
          this.notaVista.getjCBCodigoMateria().setSelectedIndex(0);
          this.notaVista.getjCBCodigoMateria().setEnabled(true);
          this.notaVista.getjCBDniAlumno().setSelectedIndex(0);
          this.notaVista.getjCBDniAlumno().setEnabled(true);
          this.notaVista.getjTMateria().setText("");
       }
      
       @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            int fila = this.notaVista.getjTNotas().rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.notaVista.getjCBDniAlumno().setSelectedItem(String.valueOf(this.notaVista.getjTNotas().getValueAt(fila, 0)));
                this.notaVista.getjCBDniAlumno().setEnabled(false);
                this.notaVista.getjCBCodigoMateria().setSelectedItem(String.valueOf(this.notaVista.getjTNotas().getValueAt(fila, 1)));
                this.notaVista.getjCBCodigoMateria().setEnabled(false);
                this.notaVista.getjTNota().setText(String.valueOf(this.notaVista.getjTNotas().getValueAt(fila, 2)));
               
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
    
    @Override
    public void itemStateChanged(ItemEvent ie){
        if(ie.getItemSelectable().equals(this.notaVista.getjCBCodigoMateria()) && !this.notaVista.getjCBCodigoMateria().getSelectedItem().equals("")){
            int eleccion = Integer.parseInt(this.notaVista.getjCBCodigoMateria().getSelectedItem().toString());
            this.materia = this.notaModelo.traeMateria(eleccion);
            this.notaVista.getjTMateria().setText(this.materia.getNombre());
        }else if(ie.getItemSelectable().equals(this.notaVista.getjCBDniAlumno()) && !this.notaVista.getjCBDniAlumno().getSelectedItem().equals("")){
            Long eleccion = Long.parseLong(this.notaVista.getjCBDniAlumno().getSelectedItem().toString());
            this.alumno = this.notaModelo.traeAlumno(eleccion);
            this.notaVista.getjTAlumno().setText(this.alumno.getNombre()+" "+this.alumno.getApellido());
        }
    }
    
   
    
}

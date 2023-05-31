
package controladores;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Materia;

import vistas.AgregarMateria;
import vistas.EditarMateria;
import vistas.Menu;
import vistas.PanelMaterias;

/**
 * Nicolas sallei 
 */
public class ControladorMaterias implements ActionListener {

    private Materia materia = new Materia();

    private AgregarMateria agregarMateria = new AgregarMateria();
    private EditarMateria editarMateria = new EditarMateria();
    private PanelMaterias panelMaterias;
    private DefaultTableModel modelo;
    private Menu menu;

    

    @SuppressWarnings("LeakingThisInConstructor")
    public ControladorMaterias(Menu menu, PanelMaterias panelMaterias) {
        this.panelMaterias = panelMaterias;
        this.menu = menu;

        this.panelMaterias.getBtnNuevo().addActionListener(this);
        this.panelMaterias.getBtnEliminar().addActionListener(this);
        this.panelMaterias.getBtnEditar().addActionListener(this);

        this.agregarMateria.getBtnAgregar().addActionListener(this);
        this.agregarMateria.getBtnCancelar().addActionListener(this);

        this.editarMateria.getBtnAgregar().addActionListener(this);
        this.editarMateria.getBtnCancelar().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelMaterias.getBtnNuevo()) {
            agregarMateria.setVisible(true);
            
        } else if (e.getSource() == panelMaterias.getBtnEliminar()) {
            eliminar();
        } else if (e.getSource() == panelMaterias.getBtnEditar()) {
            cargarVistaEditar();
        } else if (e.getSource() == agregarMateria.getBtnAgregar()) {
            agregar();
        } else if (e.getSource() == agregarMateria.getBtnCancelar()) {
            agregarMateria.dispose();
        } else if (e.getSource() == editarMateria.getBtnAgregar()) {
            editar();
        } else if (e.getSource() == editarMateria.getBtnCancelar()) {
            editarMateria.dispose();
        }
    }

    public void agregar() {

        if (camposVacios() == false) {
            JOptionPane.showMessageDialog(null, "Campos Vacios!");
        } else if (materia.materiaExist(Integer.parseInt(agregarMateria.getTxtCodMateria().getText())) == true) {
            JOptionPane.showMessageDialog(null, "La Materia Con Codigo " + agregarMateria.getTxtCodMateria().getText() + " Ya Existe!");
        } else {

            materia.setCodMateria(Integer.parseInt(agregarMateria.getTxtCodMateria().getText()));
            materia.setNombreMateria(agregarMateria.getTxtNombre().getText());
            

            if (materia.createMateria(materia) == true) {

                clearTable();
                listarMaterias(panelMaterias.getTblMaterias());
                JOptionPane.showMessageDialog(null, "Guardado Con Exito!");
                agregarMateria.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }

    }

    public void editar() {

        if (camposVaciosEditar() == false) {
            JOptionPane.showMessageDialog(null, "Campos Vacios!");
        } else {

            materia.setCodMateria(Integer.parseInt(editarMateria.getTxtMatCode().getText()));
            materia.setNombreMateria(editarMateria.getTxtNombre().getText());
            

            if (materia.updateMateria(materia) == true) {

                clearTable();
                listarMaterias(panelMaterias.getTblMaterias());
                JOptionPane.showMessageDialog(null, "Editado Con Exito!");
                editarMateria.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
    }

    public void eliminar() {
        int fila = panelMaterias.getTblMaterias().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea Elimnar?", "Seleccione Una Opc.", JOptionPane.YES_NO_OPTION) == 0) {
                int id = Integer.parseInt((String) panelMaterias.getTblMaterias().getValueAt(fila, 0).toString());
                materia.deleteMateria(id);
                clearTable();
                listarMaterias(panelMaterias.getTblMaterias());
                JOptionPane.showMessageDialog(null, "Eliminado!");
            }

        }
    }

    public void cargarVistaEditar() {
        
        int fila = panelMaterias.getTblMaterias().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            editarMateria.getTxtMatCode().setText(panelMaterias.getTblMaterias().getValueAt(fila, 0).toString());
            editarMateria.getTxtNombre().setText(panelMaterias.getTblMaterias().getValueAt(fila, 1).toString());
            editarMateria.setVisible(true);
        }
    }

    

    public void listarMaterias(JTable table) {
        modelo = (DefaultTableModel) panelMaterias.getTblMaterias().getModel();
        panelMaterias.getTblMaterias().setRowHeight(30);
        List<Materia> lista = materia.readMaterias();
        Object[] fila = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getCodMateria();
            fila[1] = lista.get(i).getNombreMateria();

            modelo.addRow(fila);
        }
        panelMaterias.getTblMaterias().setModel(modelo);

    }

    public void clearTable() {
        for (int i = 0; i < panelMaterias.getTblMaterias().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    

    public boolean camposVacios() {
        return !(agregarMateria.getTxtCodMateria().getText().isEmpty()
                || agregarMateria.getTxtNombre().getText().isEmpty());
    }

    public boolean camposVaciosEditar() {
        return !(editarMateria.getTxtMatCode().getText().isEmpty()
                || editarMateria.getTxtNombre().getText().isEmpty());
    }

    
}

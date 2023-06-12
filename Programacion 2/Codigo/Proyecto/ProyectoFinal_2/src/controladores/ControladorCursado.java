
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Alumno;
import modelos.Cursado;
import modelos.Materia;
import vistas.AgregarCursado;
import vistas.EditarCursado;
import vistas.Menu;
import vistas.PanelCursados;



/**
 * Nicolas sallei 
 */
public class ControladorCursado implements ActionListener {

   private Cursado cursado = new Cursado();
    private Alumno alumno = new Alumno();
    private Materia materia = new Materia();
    private Validador val = new Validador();
    private AgregarCursado agregarCursado = new AgregarCursado();
    private EditarCursado editarCursado = new EditarCursado();
    private PanelCursados panelCursados;
    private DefaultTableModel modelo;
    private Menu menu;

    @SuppressWarnings("LeakingThisInConstructor")
    public ControladorCursado(Menu menu, PanelCursados panelCursados) {
        
        this.panelCursados = panelCursados;
        this.menu = menu;
        
        this.panelCursados.getBtnNuevo().addActionListener(this);
        this.panelCursados.getBtnEliminar().addActionListener(this);
        this.panelCursados.getBtnEditar().addActionListener(this);
        this.agregarCursado.getBtnAgregar().addActionListener(this);
        this.agregarCursado.getBtnCancelar().addActionListener(this);
        this.editarCursado.getBtnAgregar().addActionListener(this);
        this.editarCursado.getBtnCancelar().addActionListener(this);
    }

    public ControladorCursado() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelCursados.getBtnNuevo()) {
            cargarComboBox();
            agregarCursado.setVisible(true);
        } else if (e.getSource() == panelCursados.getBtnEditar()) {

            cargarVistaEditar();
        } else if (e.getSource() == panelCursados.getBtnEliminar()) {
            eliminar();
        } else if (e.getSource() == agregarCursado.getBtnAgregar()) {
            agregar();
        } else if (e.getSource() == agregarCursado.getBtnCancelar()) {
            agregarCursado.dispose();
        } else if (e.getSource() == editarCursado.getBtnAgregar()) {
            editar();
        } else if (e.getSource() == editarCursado.getBtnCancelar()) {
            editarCursado.dispose();
        }
    }

    public void agregar() {
        if (revisarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Campos Vacios, Revise Alumno, Materia o Nota");
        } else if (val.validarNota(Double.parseDouble(agregarCursado.getTxtNota().getText())) == false) {
            JOptionPane.showMessageDialog(null, "La Nota Debe Ser Un Valor Entre 1 y 10");
        } else if (val.notaContieneLetras(agregarCursado.getTxtNota().getText()) == false) {
            JOptionPane.showMessageDialog(null, "Nota Solo Puede Contener Numeros!");
        } else {
            cursado.setAlumnoDni(splitearString(agregarCursado.getCbxAlumnos().getSelectedItem().toString()));
            cursado.setCodigoMateria(splitearString(agregarCursado.getCbxMaterias().getSelectedItem().toString()));
            cursado.setNota(Double.parseDouble(agregarCursado.getTxtNota().getText()));

            if (cursado.createCursado(cursado) == true) {

                clearTable();
                listarCursados(panelCursados.getTblCursados());
                JOptionPane.showMessageDialog(null, "Nota Registrada Con Exito!");
                agregarCursado.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }

    }

    public void editar() {
        if (val.validarNota(Double.parseDouble(editarCursado.getTxtNota().getText())) == false) {
            JOptionPane.showMessageDialog(null, "La Nota Debe Ser Un Valor Entre 1 y 10");
        } else if (val.notaContieneLetras(editarCursado.getTxtNota().getText()) == false) {
            JOptionPane.showMessageDialog(null, "Nota Solo Puede Contener Numeros!");
        } else {

            cursado.setAlumnoDni(splitearString(editarCursado.getCbxAlumnos().getSelectedItem().toString()));
            cursado.setCodigoMateria(splitearString(editarCursado.getCbxMaterias().getSelectedItem().toString()));
            cursado.setNota(Double.parseDouble(editarCursado.getTxtNota().getText()));

            if (cursado.updateCursado(cursado) == true) {

                clearTable();
                listarCursados(panelCursados.getTblCursados());
                JOptionPane.showMessageDialog(null, "Nota Editada Con Exito!");
                editarCursado.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
    }

    public void eliminar() {
        int fila = panelCursados.getTblCursados().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea Elimnar?", "Seleccione Una Opc.", JOptionPane.YES_NO_OPTION) == 0) {
                int id = Integer.parseInt((String) panelCursados.getTblCursados().getValueAt(fila, 3).toString());
                cursado.deleteCursado(id);
                clearTable();
                listarCursados(panelCursados.getTblCursados());
                JOptionPane.showMessageDialog(null, "Eliminado!");
            }

        }
    }

    public void cargarVistaEditar() {

        int fila = panelCursados.getTblCursados().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            cargarComboBoxEditar();
            editarCursado.getTxtNota().setText(panelCursados.getTblCursados().getValueAt(fila, 2).toString());
            editarCursado.setVisible(true);
        }
    }

    //Carga De ComboBoxes
    public void cargarComboBox() {

        List<Alumno> listaAlumnos = alumno.readlumnos();
        List<Materia> listaMaterias = materia.readMaterias();

        agregarCursado.getCbxAlumnos().removeAllItems();
        agregarCursado.getCbxAlumnos().addItem("Seleccionar Alumno");
        for (int i = 0; i < listaAlumnos.size(); i++) {
            agregarCursado.getCbxAlumnos().addItem(String.valueOf(listaAlumnos.get(i).getDni()) + " - " + listaAlumnos.get(i).getNombre()
                    + " " + listaAlumnos.get(i).getApellido());
        }

        agregarCursado.getCbxMaterias().removeAllItems();
        agregarCursado.getCbxMaterias().addItem("Seleccionar Materia");

        for (int i = 0; i < listaMaterias.size(); i++) {
            agregarCursado.getCbxMaterias().addItem(String.valueOf(listaMaterias.get(i).getCodMateria() + " - " + listaMaterias.get(i).getNombreMateria()));
        }

    }

    public void cargarComboBoxEditar() {

        List<Alumno> listaAlumnos = alumno.readlumnos();
        List<Materia> listaMaterias = materia.readMaterias();

        editarCursado.getCbxAlumnos().removeAllItems();
        editarCursado.getCbxAlumnos().addItem("Seleccionar Alumno");
        for (int i = 0; i < listaAlumnos.size(); i++) {
            editarCursado.getCbxAlumnos().addItem(String.valueOf(listaAlumnos.get(i).getDni()) + " - " + listaAlumnos.get(i).getNombre()
                    + " " + listaAlumnos.get(i).getApellido());
        }

        editarCursado.getCbxMaterias().removeAllItems();
        editarCursado.getCbxMaterias().addItem("Seleccionar Materia");

        for (int i = 0; i < listaMaterias.size(); i++) {
            editarCursado.getCbxMaterias().addItem(String.valueOf(listaMaterias.get(i).getCodMateria() + " - " + listaMaterias.get(i).getNombreMateria()));
        }

    }

    //Se Listan Las Incripciones En La JTable
    public void listarCursados(JTable table) {
        modelo = (DefaultTableModel) panelCursados.getTblCursados().getModel();
        panelCursados.getTblCursados().setRowHeight(30);
        List<Cursado> lista = cursado.readCursado();
        Object[] fila = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getAlumnoDni();
            fila[1] = lista.get(i).getCodigoMateria();
            fila[2] = lista.get(i).getNota();
            fila[3] = lista.get(i).getId();

            modelo.addRow(fila);
        }
        panelCursados.getTblCursados().setModel(modelo);

    }

    //Para Limpiar La Tabla
    public void clearTable() {
        for (int i = 0; i < panelCursados.getTblCursados().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    public int splitearString(String str) {
        String[] parts = str.split(" - ");
        String part1 = parts[0];

        return Integer.parseInt(part1);
    }

    public boolean revisarCampos() {
       return !(agregarCursado.getCbxAlumnos().getSelectedItem().equals("Seleccionar Alumno")
               || agregarCursado.getCbxMaterias().getSelectedItem().equals("Seleccionar Materia")
               || agregarCursado.getTxtNota().getText().isEmpty());
    }
    
}

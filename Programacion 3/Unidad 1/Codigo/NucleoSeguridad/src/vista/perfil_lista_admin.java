/*
 * perfil_lista_admin.java
 *
 * Created on 24 de agosto de 2009, 13:26
 */
package vista;

import controlador.GestorPerfil;
import controlador.GestorTabla;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Perfil;

/**
 *
 * @author  0535
 */
public class perfil_lista_admin extends javax.swing.JFrame {

    private DefaultTableModel listaPerfiles;

    /** Creates new form perfil_lista_admin */
    public perfil_lista_admin() {
        try {
            initComponents();
            //configuro el encabezado de la tabla
            configTabla();
            //modelo = new DefaultTableModel();
            // Se comienza.
            //creo el gestor persona
            GestorPerfil gp = new GestorPerfil();
            //obtengo las personas en base de datos
            List<Perfil> perfiles = gp.dameListaPerfilesHQL();
            GestorTabla.anhadeFilasDeDatos(perfiles, listaPerfiles);
            //seteo el modelo de datos a la tablaCliente
            tablaPerfiles.setModel(listaPerfiles);
            //oculto el campo id de la tablaCliente
            tablaPerfiles.getColumnModel().removeColumn(tablaPerfiles.getColumnModel().getColumn(0));
            gp.cerrarConexion();

        } catch (Exception ex) {
            Logger.getLogger(perfil_lista_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void configTabla() {
        listaPerfiles = new DefaultTableModel();
        listaPerfiles.addColumn("id");
        listaPerfiles.addColumn("Denominacion");
    }

    public void actualizarTabla() {
        GestorPerfil gp = new GestorPerfil();
        List<Perfil> perfiles = gp.dameListaPerfilesHQL();
        GestorTabla.rellena(perfiles, listaPerfiles);
        gp.cerrarConexion();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPerfiles = new javax.swing.JTable();
        txtPerfil = new javax.swing.JTextField();
        bt_guardar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaPerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPerfiles);

        bt_guardar.setText("Guardar");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        bt_cerrar.setText("Cerrar");
        bt_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Perfil");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 122, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPerfil)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(bt_guardar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(bt_eliminar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(bt_cerrar)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 275, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtPerfil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bt_cerrar)
                    .add(bt_eliminar)
                    .add(bt_guardar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void bt_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrarActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
}//GEN-LAST:event_bt_cerrarActionPerformed

private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
// TODO add your handling code here:
    GestorPerfil gp = new GestorPerfil();
    gp.insertarPersonaHQL(txtPerfil.getText());
    actualizarTabla();
    gp.cerrarConexion();

}//GEN-LAST:event_bt_guardarActionPerformed

private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
// TODO add your handling code here:
    int filaSeleccionada = tablaPerfiles.getSelectedRow();
    int columnaSeleccionada = tablaPerfiles.getSelectedColumn();

    try {
        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un perfil de la lista", "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            Long valorId = (Long) listaPerfiles.getValueAt(filaSeleccionada, 0);
            System.out.println(valorId);

            GestorPerfil gp = new GestorPerfil();
            gp.eliminarPerfilFilaHQL(valorId);
            actualizarTabla();
            gp.cerrarConexion();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_bt_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cerrar;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPerfiles;
    private javax.swing.JTextField txtPerfil;
    // End of variables declaration//GEN-END:variables
}

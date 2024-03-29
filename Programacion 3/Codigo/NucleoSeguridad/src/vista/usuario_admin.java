/*
 * usuario_admin.java
 *
 * Created on 24 de agosto de 2009, 13:30
 */
package vista;

import controlador.GestorPerfil;
import controlador.GestorPersona;
import controlador.GestorUsuario;
import controlador.SHA1;
import java.sql.ResultSet;
import modelo.Usuario;

/**
 *
 * @author  0535
 */
public class usuario_admin extends javax.swing.JFrame {

    public String idPersona;
    public String denominacionPersona;
    public String idPerfil;
    public String denominacionPerfil;
    private boolean modificar;
    private Long valorId;
    private usuario_lista usuariolista;

    /** Creates new form usuario_admin */
    public usuario_admin() {
        initComponents();

    }

    public usuario_admin(usuario_lista usuarioLista, boolean modificar, Long idUsuario) {
        this.usuariolista = usuarioLista;
        this.modificar = modificar;
        this.valorId = idUsuario;
        initComponents();
        lbPersona.setText("");
        lbPerfil.setText("");
        try {
            if (modificar) {
                GestorUsuario gu = new GestorUsuario();
                Usuario usuario = gu.dameUsuarioFila(valorId);
                txtUsuario.setText(usuario.getNombreUsuario());
                lbPersona.setText(usuario.getPersona().getApellido() + usuario.getPersona().getNombre());
                lbPerfil.setText(usuario.getPerfil().getDenominacion());
                idPersona = Long.toString(usuario.getPersona().getId());
                idPerfil = Long.toString(usuario.getPerfil().getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarPersona() {
        lbPersona.setText(this.denominacionPersona);
    }

    public void cargarPerfil() {
        lbPerfil.setText(this.denominacionPerfil);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtClave2 = new javax.swing.JTextField();
        lbPersona = new javax.swing.JLabel();
        lbPerfil = new javax.swing.JLabel();
        btBuscarPersona = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btBuscarPerfil = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de Usuario");

        jLabel2.setText("Clave");

        jLabel3.setText("Confirmar Clave");

        jLabel4.setText("Persona");

        jLabel5.setText("Perfil");

        lbPersona.setText("lb_persona");

        lbPerfil.setText("lb_perfil");

        btBuscarPersona.setText("Buscar");
        btBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPersonaActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        btBuscarPerfil.setText("Buscar");
        btBuscarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPerfilActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar");

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtClave, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                            .add(txtUsuario, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                            .add(txtClave2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, lbPerfil, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, lbPersona, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(btBuscarPersona)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jButton2))
                                    .add(layout.createSequentialGroup()
                                        .add(btBuscarPerfil)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jButton4))))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(btGuardar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtClave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtClave2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(lbPersona)
                    .add(btBuscarPersona)
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(lbPerfil)
                    .add(btBuscarPerfil)
                    .add(jButton4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 60, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btCerrar)
                    .add(btGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPersonaActionPerformed
// TODO add your handling code here:
    new persona_explorer(this).setVisible(true);
}//GEN-LAST:event_btBuscarPersonaActionPerformed

private void btBuscarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPerfilActionPerformed
// TODO add your handling code here:
    new perfil_explorer(this).setVisible(true);
}//GEN-LAST:event_btBuscarPerfilActionPerformed

private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
// TODO add your handling code here:
    this.setVisible(false);

}//GEN-LAST:event_btCerrarActionPerformed

private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
// TODO add your handling code here:
    try {
        String claveEncriptada = "";
        if (!(txtClave.getText().equals(txtClave2.getText()))) {
            javax.swing.JOptionPane.showMessageDialog(this, "Las Claves no son iguales", "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            claveEncriptada = SHA1.SHA1(txtClave.getText());
        }
        GestorUsuario gu = new GestorUsuario();
        if (modificar) {
            gu.actualizarUsuario(valorId, txtUsuario.getText(), claveEncriptada, idPersona, idPerfil);
        } else {
            gu.insertarUsuario(txtUsuario.getText(), claveEncriptada, idPersona, idPerfil);
        }
        this.setVisible(false);
        usuariolista.actualizarTabla();
        gu.cerrarConexion();
    } catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_btGuardarActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarPerfil;
    private javax.swing.JButton btBuscarPersona;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JLabel lbPersona;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtClave2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

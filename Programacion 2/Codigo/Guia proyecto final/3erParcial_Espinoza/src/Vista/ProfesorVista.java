/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author rocio
 */
public class ProfesorVista extends javax.swing.JFrame {

    /**
     * Creates new form AlumnoVista
     */
    public ProfesorVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPAlumno = new javax.swing.JPanel();
        jLAlumnoTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfesor = new javax.swing.JTable();
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jTDNI = new javax.swing.JTextField();
        jLDomicilio = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBVolver = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPAlumno.setBackground(new java.awt.Color(9, 154, 151));

        jLAlumnoTitulo.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLAlumnoTitulo.setForeground(new java.awt.Color(241, 228, 228));
        jLAlumnoTitulo.setText("PROFESOR");

        jTableProfesor.setBackground(new java.awt.Color(255, 253, 232));
        jTableProfesor.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTableProfesor.setForeground(new java.awt.Color(51, 51, 51));
        jTableProfesor.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableProfesor.setGridColor(new java.awt.Color(21, 205, 168));
        jTableProfesor.setSelectionBackground(new java.awt.Color(151, 100, 199));
        jScrollPane1.setViewportView(jTableProfesor);

        jLNombre.setFont(new java.awt.Font("Ubuntu Medium", 0, 12)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(241, 228, 228));
        jLNombre.setText("NOMBRE");

        jTNombre.setBackground(new java.awt.Color(255, 253, 232));
        jTNombre.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        jLApellido.setFont(new java.awt.Font("Ubuntu Medium", 0, 12)); // NOI18N
        jLApellido.setForeground(new java.awt.Color(241, 228, 228));
        jLApellido.setText("APELLIDO");

        jTApellido.setBackground(new java.awt.Color(255, 253, 232));
        jTApellido.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        jLDNI.setFont(new java.awt.Font("Ubuntu Medium", 0, 12)); // NOI18N
        jLDNI.setForeground(new java.awt.Color(241, 228, 228));
        jLDNI.setText("DNI");

        jTDNI.setBackground(new java.awt.Color(255, 253, 232));
        jTDNI.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        jLDomicilio.setFont(new java.awt.Font("Ubuntu Medium", 0, 12)); // NOI18N
        jLDomicilio.setForeground(new java.awt.Color(241, 228, 228));
        jLDomicilio.setText("DOMICILIO");

        jTDomicilio.setBackground(new java.awt.Color(255, 253, 232));
        jTDomicilio.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        jLTelefono.setFont(new java.awt.Font("Ubuntu Medium", 0, 12)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(241, 228, 228));
        jLTelefono.setText("TELÉFONO");

        jTTelefono.setBackground(new java.awt.Color(255, 253, 232));
        jTTelefono.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N

        jBGuardar.setBackground(new java.awt.Color(21, 205, 168));
        jBGuardar.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(51, 51, 51));
        jBGuardar.setText("NUEVO");

        jBVolver.setBackground(new java.awt.Color(21, 205, 168));
        jBVolver.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        jBVolver.setForeground(new java.awt.Color(51, 51, 51));
        jBVolver.setText("VOLVER");

        jBEliminar.setBackground(new java.awt.Color(21, 205, 168));
        jBEliminar.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(51, 51, 51));
        jBEliminar.setText("ELIMINAR");

        jBModificar.setBackground(new java.awt.Color(21, 205, 168));
        jBModificar.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(51, 51, 51));
        jBModificar.setText("MODIFICAR");

        javax.swing.GroupLayout jPAlumnoLayout = new javax.swing.GroupLayout(jPAlumno);
        jPAlumno.setLayout(jPAlumnoLayout);
        jPAlumnoLayout.setHorizontalGroup(
            jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlumnoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAlumnoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBVolver, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAlumnoLayout.createSequentialGroup()
                                .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLNombre)
                                    .addComponent(jLApellido)
                                    .addComponent(jLDNI)
                                    .addComponent(jLDomicilio))
                                .addGap(18, 18, 18)
                                .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAlumnoLayout.createSequentialGroup()
                                .addComponent(jLTelefono)
                                .addGap(21, 21, 21)
                                .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(jTDomicilio))))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPAlumnoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLAlumnoTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPAlumnoLayout.setVerticalGroup(
            jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlumnoLayout.createSequentialGroup()
                .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPAlumnoLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPAlumnoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLAlumnoTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLApellido)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDNI)
                            .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDomicilio))
                        .addGap(18, 18, 18)
                        .addGroup(jPAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefono)
                            .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBVolver)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    public JButton getjBGuardar() {
        return jBGuardar;
    }

    public void setjBGuardar(JButton jBGuardar) {
        this.jBGuardar = jBGuardar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getjTApellido() {
        return jTApellido;
    }

    public void setjTApellido(JTextField jTApellido) {
        this.jTApellido = jTApellido;
    }

    public JTextField getjTDNI() {
        return jTDNI;
    }

    public void setjTDNI(JTextField jTDNI) {
        this.jTDNI = jTDNI;
    }

    public JTextField getjTDomicilio() {
        return jTDomicilio;
    }

    public void setjTDomicilio(JTextField jTDomicilio) {
        this.jTDomicilio = jTDomicilio;
    }

    public JTextField getjTNombre() {
        return jTNombre;
    }

    public void setjTNombre(JTextField jTNombre) {
        this.jTNombre = jTNombre;
    }

    public JTextField getjTTelefono() {
        return jTTelefono;
    }

    public void setjTTelefono(JTextField jTTelefono) {
        this.jTTelefono = jTTelefono;
    }

    public JTable getjTableProfesor() {
        return jTableProfesor;
    }

 
    public JButton getjBVolver() {
        return jBVolver;
    }

    public JButton getjBEliminar() {
        return jBEliminar;
    }

    public JButton getjBModificar() {
        return jBModificar;
    }
    
    
    

      
    

    /**
     * @param args the command line arguments
     */
    public void setjTableProfesor(JTable jTableAlumno) {
        this.jTableProfesor = jTableAlumno;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlumnoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnoVista().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JLabel jLAlumnoTitulo;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JPanel jPAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTable jTableProfesor;
    // End of variables declaration//GEN-END:variables
}

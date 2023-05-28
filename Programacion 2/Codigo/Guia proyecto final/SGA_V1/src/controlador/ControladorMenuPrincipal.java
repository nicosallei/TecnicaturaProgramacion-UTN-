/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import modelo.Cliente;
import vista.JF_Clientes;
import vista.JF_Menu;

/**
 *
 * @author martin
 */
public class ControladorMenuPrincipal implements ActionListener, MouseListener  {
    
    private JF_Menu menuPrincipal;
    private JF_Clientes agregarIntCliente = new JF_Clientes();
    private ControladorCliente controladorCliente = new ControladorCliente(menuPrincipal);

    public ControladorMenuPrincipal(JF_Menu menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
        //System.out.println("1");
    }

    public void escucharBotones() {
        this.menuPrincipal.setLocationRelativeTo(null);
        this.menuPrincipal.getjMenuCliente().addActionListener(this);
        this.agregarIntCliente.getjB_Insetar().addActionListener(this);
        this.agregarIntCliente.getjTable_Clientes().addMouseListener(this);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getSource().equals(this.menuPrincipal.getjMenuCliente())){

            this.agregarIntCliente.getjTable_Clientes().setModel(this.controladorCliente.tablaClientes());

            //Comprobamos si la ventana ya esta mostrandose
            if (this.agregarIntCliente.isShowing()) { 
                //Si esta solo la colocamos en el centro
                this.agregarIntCliente.setLocation(0, 0);

            } else { 
                //si no esta la insertamos, la centramos y la mostramos
                this.menuPrincipal.getjDesktopPane1().add(this.agregarIntCliente);
                this.agregarIntCliente.setLocation(0, 0);
                this.agregarIntCliente.show();
            }
        }
        else if(e.getSource().equals(this.agregarIntCliente.getjB_Insetar())){
            //llamo al metodo que se encarga de insertar el cliente 
            boolean resultado;
            resultado = this.controladorCliente.agregarCliente( this.agregarIntCliente.getjT_Dni().getText(), this.agregarIntCliente.getjT_Nombre().getText(), this.agregarIntCliente.getjT_Apellido().getText(), this.agregarIntCliente.getjT_Telefono().getText(), this.agregarIntCliente.getjSexo().getSelection().getActionCommand());
            System.out.println("=>"+ resultado );
            if (resultado == true){
                            this.agregarIntCliente.getjTable_Clientes().setModel(this.controladorCliente.tablaClientes());
                            JOptionPane.showMessageDialog(null, "ALUMNO GUARDADO");
            }else{
                JOptionPane.showMessageDialog(null, "ALUMNO NO INGRESADO, REVISE LOS DATOS, HE INTENTELO NUEVAMENTE.");
            }
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("dsfsddsfsdf");
        if (e.getButton() == 1)//boton izquierdo
        {
            int fila = this.agregarIntCliente.getjTable_Clientes().rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.agregarIntCliente.setjT_Dni(String.valueOf(this.agregarIntCliente.getjTable_Clientes().getValueAt(fila, 0)));
                this.agregarIntCliente.getjT_Dni().enable(false);
                this.agregarIntCliente.setjT_Nombre(String.valueOf(this.agregarIntCliente.getjTable_Clientes().getValueAt(fila, 1)));
                this.agregarIntCliente.setjT_Apellido(String.valueOf(this.agregarIntCliente.getjTable_Clientes().getValueAt(fila, 2)));
                this.agregarIntCliente.setjT_Telefono(String.valueOf(this.agregarIntCliente.getjTable_Clientes().getValueAt(fila, 3)));
                this.agregarIntCliente.setjSexo(String.valueOf(this.agregarIntCliente.getjTable_Clientes().getValueAt(fila, 4)));

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

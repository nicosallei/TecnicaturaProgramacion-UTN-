package com.sky.pi.controller;

import com.sky.pi.view.Menu;
import com.sky.pi.view.PanelAlumnos;
import com.sky.pi.view.PanelMaterias;
import com.sky.pi.view.PanelProfesores;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author SkylakeFrost
 */
public class ControladorMenuPrincipal implements ActionListener {

    private CardLayout cardLayout = new CardLayout();
    private Menu menu;
    //Paneles
    private PanelAlumnos panelAlumnos = new PanelAlumnos();
   
    private PanelProfesores panelProfesores = new PanelProfesores();
    private PanelMaterias panelMaterias = new PanelMaterias();
    
    //Controladores
    private ControladorAlumnos ca = new ControladorAlumnos(menu, panelAlumnos);
    
    
    private ControladorProfesores cp = new ControladorProfesores(menu, panelProfesores);
    private ControladorMaterias cm = new ControladorMaterias(menu, panelMaterias);
    

    @SuppressWarnings("LeakingThisInConstructor")
    public ControladorMenuPrincipal(Menu menu) {
        this.cardLayout = (CardLayout) menu.getMainPanel().getLayout();
        this.menu = menu;

        this.menu.getBtnListaAlumnos().addActionListener(this);
        
        
        this.menu.getBtnMaterias().addActionListener(this);
        
        this.menu.getBtnListaProfesores().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu.getBtnListaAlumnos()) {
            menu.getSelectAlumnos().setVisible(true);
            
            
            menu.getSelectMat().setVisible(false);
            menu.getSelectProf().setVisible(false);
            menu.getLblMainTitle().setText("Lista De Alumnos");
            panelAlumno();
            ca.clearTable();
            ca.listarAlumnos(panelAlumnos.getTblAlumnos());

        }  else if (e.getSource() == menu.getBtnListaProfesores()) {

            menu.getSelectAlumnos().setVisible(false);
            
            
            
            menu.getSelectMat().setVisible(false);
            menu.getSelectProf().setVisible(true);
            menu.getLblMainTitle().setText("Lista De Profesores");
            panelProfesores();
            cp.clearTable();
            cp.listarProfesores(panelProfesores.getTblProfesores());

        } else if (e.getSource() == menu.getBtnMaterias()) {
            menu.getSelectAlumnos().setVisible(false);
            
            
            
            menu.getSelectMat().setVisible(true);
            menu.getSelectProf().setVisible(false);
            menu.getLblMainTitle().setText("Lista De Materias");
            panelMaterias();
            cm.clearTable();
            cm.listarMaterias(panelMaterias.getTblMaterias());
        } 
    }

    public void panelAlumno() {
        menu.getMainPanel().add(panelAlumnos, "panelAlumnos");
        cardLayout.show(menu.getMainPanel(), "panelAlumnos");
        SwingUtilities.updateComponentTreeUI(menu);
        menu.repaint();
        ca.listarAlumnos(panelAlumnos.getTblAlumnos());

    }



    public void panelProfesores() {
        menu.getMainPanel().add(panelProfesores, "panelProf");
        cardLayout.show(menu.getMainPanel(), "panelProf");
        SwingUtilities.updateComponentTreeUI(menu);
        menu.repaint();
    }

    public void panelMaterias() {
        menu.getMainPanel().add(panelMaterias, "panelMat");
        cardLayout.show(menu.getMainPanel(), "panelMat");
        SwingUtilities.updateComponentTreeUI(menu);
        menu.repaint();
        cm.listarMaterias(panelMaterias.getTblMaterias());
    }

    
}

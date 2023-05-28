
package controladores;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import vistas.Menu;
import vistas.PanelAlumnos;
import vistas.PanelCursados;
import vistas.PanelMaterias;


/**
 * Nicolas sallei 
 */
public class ControladorMenuPrincipal implements ActionListener {
    
    private CardLayout cardLayout = new CardLayout();
    private Menu menu;
    //Paneles
    private PanelAlumnos panelAlumnos = new PanelAlumnos();
   
    
    private PanelMaterias panelMaterias = new PanelMaterias();
    private PanelCursados panelCursados = new PanelCursados();
    //Controladores
    private ControladorAlumnos ca = new ControladorAlumnos(menu, panelAlumnos);
    private ControladorCursado cur = new ControladorCursado(menu, panelCursados);
    
   
    private ControladorMaterias cm = new ControladorMaterias(menu, panelMaterias);
    
    
   
    @SuppressWarnings("LeakingThisInConstructor")
    public ControladorMenuPrincipal(Menu menu) {
        
        //this.cardLayout = (CardLayout) menu.getMainPanel().getLayout();
        this.cardLayout = new CardLayout();
        menu.getMainPanel().setLayout(cardLayout);

        this.menu = menu;

        this.menu.getjB_Alumnos().addActionListener(this);
        this.menu.getjB_Cursado().addActionListener(this);
        this.menu.getjB_Materias().addActionListener(this);
        
        //this.menu.getjB_Profesores().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu.getjB_Alumnos()) {
            
            menu.getLblMainTitle().setText("Lista De Alumnos");
            panelAlumno();
            ca.clearTable();
            ca.listarAlumnos(panelAlumnos.getTblAlumnos());

        }  else if (e.getSource() == menu.getjB_Cursado()) {
            

            
            
            
            menu.getLblMainTitle().setText("Lista De Cursados");
            panelCursados();
            cur.clearTable();
            cur.listarCursados(panelCursados.getTblCursados());
        } else if (e.getSource() == menu.getjB_Materias()) {
            
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


    public void panelMaterias() {
        menu.getMainPanel().add(panelMaterias, "panelMat");
        cardLayout.show(menu.getMainPanel(), "panelMat");
        SwingUtilities.updateComponentTreeUI(menu);
        menu.repaint();
        cm.listarMaterias(panelMaterias.getTblMaterias());
    }
 
    
    public void panelCursados() {
        menu.getMainPanel().add(panelCursados, "panelCur");
        cardLayout.show(menu.getMainPanel(), "panelCur");
        SwingUtilities.updateComponentTreeUI(menu);
        menu.repaint();
    }
    
    

   

    
    
    
    
    
}

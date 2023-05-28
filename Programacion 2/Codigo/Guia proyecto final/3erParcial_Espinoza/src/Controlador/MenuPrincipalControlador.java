package Controlador;

import Vista.AlumnoVista;
import Vista.MenuPrincipalVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipalControlador implements ActionListener {
    private MenuPrincipalVista menu;

    public MenuPrincipalControlador(MenuPrincipalVista menu) {
        this.menu = menu;
        menu.setVisible(true);
        escucharBotones();
        
    }
    
    public void escucharBotones(){
        this.menu.getjBAlumno().addActionListener(this);
        this.menu.getjBMateria().addActionListener(this);
        this.menu.getjBProfesor().addActionListener(this);
        this.menu.getjBNotas().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource().equals(this.menu.getjBAlumno())){
            
            Modelo.AlumnoModelo alumnoModelo = new Modelo.AlumnoModelo();
            AlumnoVista alumnoVista = new Vista.AlumnoVista();
            AlumnoControlador alumnoControlador = new Controlador.AlumnoControlador(alumnoModelo, alumnoVista);
            this.menu.dispose();
            
        }else if(evento.getSource().equals(this.menu.getjBMateria())){
            Modelo.MateriaModelo materiaModelo = new Modelo.MateriaModelo();
            Vista.MateriaVista materiaVista = new Vista.MateriaVista();
            MateriaControlador materiaControlador = new Controlador.MateriaControlador(materiaVista, materiaModelo);
            this.menu.dispose();
            
        }else if(evento.getSource().equals(this.menu.getjBProfesor())){
            Modelo.ProfesorModelo profesorModelo = new Modelo.ProfesorModelo();
            Vista.ProfesorVista profesorVista = new Vista.ProfesorVista();
            ProfesorControlador profesorControlador = new Controlador.ProfesorControlador(profesorVista, profesorModelo);
            this.menu.dispose();
        }else if(evento.getSource().equals(this.menu.getjBNotas())){
            Modelo.NotaModelo notaModelo = new Modelo.NotaModelo();
            Vista.NotaVista notaVista = new Vista.NotaVista();
            NotaControlador notaControlador = new Controlador.NotaControlador(notaModelo, notaVista);
            this.menu.dispose();
            
        }
    }
    
}

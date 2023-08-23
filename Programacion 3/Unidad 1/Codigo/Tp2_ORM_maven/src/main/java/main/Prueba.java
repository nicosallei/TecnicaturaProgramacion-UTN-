package main;

import controlador.Gestor;
import controlador.GestorFactura;
import modelo.Medico;
import modelo.Paciente;

/**
 * Nicolas sallei
 */
public class Prueba {

    /**
     * Medico(int idMedico, int matricula, long celular, int idPersona, String
     *  Paciente(int nroSocio, int idPersona, String nombre, String apellido, long dni)
     */
    public static void main(String[] args) {
        try {// creacion de objetos
            GestorFactura gestor = new GestorFactura();

            Medico medi01 = new Medico(145,2648513,11,"roberto","perez",156185181);
            
            Paciente pac = new Paciente(1247,02,"Pedro","Lopez",423548952);

            // seteo de los atributos
            gestor.guardar(medi01);
            
            gestor.guardar(pac);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

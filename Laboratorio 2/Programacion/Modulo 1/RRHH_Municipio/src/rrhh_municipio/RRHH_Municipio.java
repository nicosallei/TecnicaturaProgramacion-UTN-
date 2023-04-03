/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rrhh_municipio;

import _commons.Persona;
import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class RRHH_Municipio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CargaDatos datos = new CargaDatos();
     
    
        datos.carga();
        
        
        
        for(Persona personas : datos.getPersonas()){
        
            System.out.println("nombre y apellido: "+personas.getNombre());
            System.out.println("Documento: "+ personas.getDocumento());
            System.out.println("----------------------------");
            System.out.println("");
        }
        
    }
    
}

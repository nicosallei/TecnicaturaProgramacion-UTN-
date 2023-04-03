/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rrhh_municipio;

import _commons.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class CargaDatos {
    Scanner sc = new Scanner(System.in);
    private static  ArrayList<Persona>personas;
    
    
    
    public  void carga(){

        while(true){
            Persona persona = new Persona();
            System.out.println("Ingrese el nombre y apellido ");
            persona.setNombre(sc.nextLine());
            System.out.println("Ingrese el documento");
            persona.setDocumento(sc.nextLine());
        addePersonas(persona);
            System.out.println("para no cargar mas personas ingrese 'n' ");
            String bandera = sc.nextLine();
            System.out.println(bandera);
            if ("n".equalsIgnoreCase(bandera)){
            
                break;
            }
        }
        

}
    
    
        
    public void addePersonas (Persona personas){
    if(this.personas == null)
        this.personas= new ArrayList<Persona>();
    this.personas.add(personas);
    
    }
   

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.utn.ej_maven_exclusion_1;

import edu.utn.clasesbase.Domicilio;
import edu.utn.clasesbase.Personas.Persona;
import edu.utn.clasesbase.Vehiculos.Vehiculo;
//import edu.utn.clasesbasebase2.Registro;




/**
 *
 * @author julio
 */
public class Ej_Maven_Exclusion_1 {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        Persona p = new Persona();
        
        Domicilio d = new Domicilio();
        //Registro r = new Registro();
        
        p.domicilio = d;
       // p.registro = r;
    }
}

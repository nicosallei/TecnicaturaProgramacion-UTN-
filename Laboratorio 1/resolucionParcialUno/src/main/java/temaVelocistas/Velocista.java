/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaVelocistas;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Velocista {
    
    String apellido;
    String nombre;
    int edad;
    double tiempos[];
    double mejorTiempo;
    
    public Velocista (String apellido,String nombre,int edad,double[] tiempos,double mejorTiempo){
    
    this.apellido = apellido;
    this.nombre= nombre;
    this.edad = edad;
    this.tiempos = tiempos;
    this.mejorTiempo= mejorTiempo;
   
    }

}

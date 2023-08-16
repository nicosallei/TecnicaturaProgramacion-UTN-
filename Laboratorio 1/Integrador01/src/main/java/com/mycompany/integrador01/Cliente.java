/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integrador01;

/**
 *
 * @author nicos
 */
public class Cliente {
    String apellido, nombre;
    int dni;
    double sueldo;
    int nroCliente;
    
    
    public static void main(String[]args){
    
        Cliente cliente1 = new Cliente();
        
        cliente1.apellido = "Alonso";
        cliente1.nombre = "Eugenia";
        cliente1.dni = 27456987;
        cliente1.sueldo = 2698.85;
        cliente1.nroCliente = 13654;
    
       
        
        Cliente cliente2 = new Cliente();
        
        cliente2.apellido = "Pereira";
        cliente2.nombre = "Victor";
        cliente2.dni = 26987456;
        cliente2.sueldo = 3695.45;
        cliente2.nroCliente = 12852;
        
        System.out.println("Cliente N° 1");
        System.out.println("apellido: "+cliente1.apellido);
        System.out.println("nombre: "+cliente1.nombre);
        System.out.println("dni: "+cliente1.dni);
        System.out.println("sueldo: "+cliente1.sueldo);
        System.out.println("nroCliente: "+cliente1.nroCliente);
        
        System.out.println("................");
        
        System.out.println("Cliente N° 2");
        System.out.println("apellido: "+cliente2.apellido);
        System.out.println("nombre: "+cliente2.nombre);
        System.out.println("dni: "+cliente2.dni);
        System.out.println("sueldo: "+cliente2.sueldo);
        System.out.println("nroCliente: "+cliente2.nroCliente);
        
        
    }
    
}

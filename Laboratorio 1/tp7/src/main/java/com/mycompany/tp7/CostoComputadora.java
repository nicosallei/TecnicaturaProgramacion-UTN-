/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp7;

import java.util.*;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class CostoComputadora {
    
    static Computadora computadora = new Computadora();
    
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        
        computadora();
        while(true){
        componentes();
        
            System.out.println("Desea cargar mas componentes?");
            String condicionSalir = sc.next();

            if (condicionSalir.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        System.out.println(computadora.getComponenCPU().size());
       mostrar();
        
        
    
    }
    
    
    public static void computadora(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la MARCA de la computadora");
        computadora.setMarca(sc.nextLine());
        System.out.println("Ingrese el MODELO de la computadora");
        computadora.setModelo(sc.nextLine());
        
        
    
   
    }
   
    public static void componentes(){
        Scanner sc = new Scanner(System.in);
        ComponenteCPU comp = new ComponenteCPU();
        System.out.println("Ingrese componente");
        comp.setComponente(sc.nextLine());
        System.out.println("Ingrese la Marca del componente");
        comp.setMarca(sc.nextLine());
        System.out.println("Ingrese la cantidad del componente");
        comp.setCantidad(sc.nextInt());
        System.out.println("Ingrese el precio del componente");
        comp.setPrecio(sc.nextDouble());
    
    comp.setSubTotal(comp.getCantidad()*comp.getPrecio());
    computadora.addcomponenCPU(comp);
    
    }
    
    public static  String completarConEspacios(String cadena){

        int cantidadEspacios = 20 - cadena.length();

        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }

        return cadena;
    }
    
    public static void mostrar(){
    
    
        double total=0;
        System.out.println("---------Computadora---------");
       System.out.println("Marca: "+computadora.getMarca());
       System.out.println("Modelo: "+computadora.getModelo());
       System.out.println("---------Componentes---------");
       System.out.println("Componente \t\tMarca \t\tCantidad\t\tPrecio X Unidad\t\t\tSubTotal");
       for(ComponenteCPU componente : computadora.getComponenCPU()) { 
            System.out.println(completarConEspacios(componente.getComponente()) + "\t" +
                    completarConEspacios(componente.getMarca()) + "\t" + 
                    completarConEspacios(Integer.toString(componente.getCantidad())) + "\t" +
                    completarConEspacios(Double.toString(componente.getPrecio())) + "\t" +
                    completarConEspacios(Double.toString(componente.getSubTotal())));

            total += componente.getSubTotal();
        }
       System.out.println(" \t\t \t\t \t\t \t\t COSTO TOTAL\t\t \t"+completarConEspacios(String.valueOf(total)));
        if(total < 50000) {
            double ganancia = total * 0.4;
            System.out.println("\nEl costo de la PC es de " + total + " + " + ganancia + " = " + (total + ganancia));
        } else {
            double ganancia = total * 0.3;
            System.out.println("\nEl costo de la PC es de " + total + " + " + ganancia + " = " + (total + ganancia));
        }
    
    }
    
    
    
}

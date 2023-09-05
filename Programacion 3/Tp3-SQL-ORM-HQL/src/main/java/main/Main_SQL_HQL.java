/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controlador.GestorORM;
import java.util.Scanner;
import modelo.Componente;
import modelo.Computadora;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Main_SQL_HQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
        GestorORM gestor = new GestorORM();
        Scanner sc = new Scanner(System.in);
       
        while(true){
            
        
        Computadora computadora = new Computadora();
            
            System.out.println("Ingrese el codigo de la computadora: ");
            computadora.setCodigo(sc.nextLine());
            System.out.println("Ingrese la marca de la computadora: ");
            computadora.setMarca(sc.nextLine());
            System.out.println("Ingrese el modelo de la computadora: ");
            computadora.setModelo(sc.nextLine());
        
        
            while(true){
               
            Componente comp = new Componente();
                System.out.println("Ingrese el nombre del componente: ");
                comp.setNombre(sc.nextLine());
                System.out.println("Ingrese el Numero de serie: ");
                comp.setNroSerie(sc.nextLine());
                
                comp.setComputadora(computadora);
                computadora.getComponente().add(comp);
                
                System.out.println("Si desea agregar otro componente ingrese y, sino ingrese cualquier letra");
               
                if(!"y".equals(sc.nextLine().toLowerCase())) {
                    System.out.println("Entro al primer if");
                    break;
                
                }
            }
            System.out.println("si desea agregar otra --computadora-- ingrese Y, de lo contrario ingrese cualquier letra");
            
            if( !"y".equals(sc.nextLine().toLowerCase())){
                gestor.guardar(computadora);
                break;
                }
            gestor.guardar(computadora);
           
        
        }
        
        
        
        
        
        
        
        
        
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
}

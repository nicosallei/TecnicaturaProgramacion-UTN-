/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controlador.GestorComponentes;
import controlador.GestorComputadora;

import java.util.Scanner;
import modelo.Componente;
import modelo.Computadora;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Main_SQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
        //GestorORM gestor = new GestorORM();
        GestorComputadora gCompu = new GestorComputadora();
        GestorComponentes gCom = new GestorComponentes();
        Scanner sc = new Scanner(System.in);
       
        while(true){
            
        
        Computadora computadora = new Computadora();
            
            System.out.println("Ingrese el Id de la computadora: ");
            Long idCompu = sc.nextLong();
            System.out.println("Ingrese el codigo de la computadora: ");
            sc.nextLine();
            String codigo = sc.nextLine();
            System.out.println("Ingrese la marca de la computadora: ");
            String marca = sc.nextLine();
            System.out.println("Ingrese el modelo de la computadora: ");
            String modelo = sc.nextLine();
            
            System.out.println(" ");
            gCompu.insertarComputadora(idCompu, codigo, marca, modelo);
        
            while(true){
               
            Componente comp = new Componente();
                System.out.println("Ingrese el Id del componente: ");
                Long id = sc.nextLong();
                System.out.println("Ingrese el nombre del componente: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.println("Ingrese el Numero de serie: ");
                String nroSerie= sc.nextLine();
                
                
                System.out.println(" ");
                
                comp.setComputadora(computadora);
                computadora.getComponente().add(comp);
                
                gCom.insertarComponentes(id, nombre, nroSerie, idCompu);
                System.out.println("Si desea agregar otro componente ingrese y, sino ingrese cualquier letra");
               
                if(!"y".equals(sc.nextLine().toLowerCase())) {
                    System.out.println("Entro al primer if");
                    break;
                
                }
            }
            System.out.println("si desea agregar otra --computadora-- ingrese Y, de lo contrario ingrese cualquier letra");
            
            if( !"y".equals(sc.nextLine().toLowerCase())){
                
                break;
                }

        }
        
 
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    }
    


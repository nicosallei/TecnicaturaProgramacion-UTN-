
package main;

import controlador.GestoSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
        
        GestoSQL sql = new GestoSQL();
        Scanner sc = new Scanner(System.in);
    
        Computadora computadora = new Computadora();
            System.out.println("Ingrese el Id de la computadora: ");
            computadora.setId(sc.nextLong());
            System.out.println("Ingrese el codigo de la computadora: ");
            sc.nextLine();
            computadora.setCodigo(sc.nextLine()); 
            System.out.println("Ingrese la marca de la computadora: ");
            computadora.setMarca(sc.nextLine());
            System.out.println("Ingrese el modelo de la computadora: ");
            computadora.setModelo(sc.nextLine());
            
            System.out.println(computadora.getId());
            System.out.println(" ");

            while(true){
            Componente comp = new Componente(); 
                
                System.out.println("Ingrese el ID del componente:");
                comp.setId(sc.nextLong());
                System.out.println("Ingrese el nombre del componente: ");
                sc.nextLine();
                comp.setNombre(sc.nextLine());
                System.out.println("Ingrese el Numero de serie: ");
                comp.setNroSerie(sc.nextLine()); 
                System.out.println(" ");
                
                comp.setComputadora(computadora);
                computadora.getComponente().add(comp);
                System.out.println("Si desea agregar otro componente ingrese y, sino ingrese cualquier letra");    
                if(!"y".equals(sc.nextLine().toLowerCase())) {
                    break;
                
                }
            }
            sql.insert(computadora);

        }catch(SQLException e){
        }
    }
    }
    


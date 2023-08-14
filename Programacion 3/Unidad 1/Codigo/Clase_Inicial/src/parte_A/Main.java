/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte_A;

import java.util.Scanner;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creacion de la instancia factura
        Factura factura01 = new Factura();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la fecha de la factura (dd-mm-aaaa)");
        factura01.setFecha(sc.nextLine());
        System.out.println("Ingrese Numero de Factura");
        factura01.setNroFactura(sc.nextLong());
        System.out.println("\n----Datos del cliente----");
        System.out.println("Ingrese la razon social del cliente");
        sc.nextLine();
        factura01.setRazonSocial(sc.nextLine());
        
        System.out.println("Ingrese el cuit del cliente");
        factura01.setCuitCliente(sc.nextLong());
        System.out.println("---Fin datos del cliente---");
        
        while(true){
        System.out.println("Ingrese el tipo de pago (C-TC-TD)");
        String metodo = sc.nextLine().toUpperCase();
        
        if (metodo.equals("C") || metodo.equals("TC") || metodo.equals("TD")){
        
            factura01.setTipoPago(metodo);
            metodo=null;
            break;
        }else System.out.println("El tipo de pago ingresado es invalido\n vuelva a ingresarlo");
        }
        
        while(true){
            System.out.println("Ingrese la cantidad de articulos a facturar");
            int cantidad = sc.nextInt();
            if(cantidad>0){
               factura01.cantidadItemEnFactura(cantidad);
                break;
            
            }else System.out.println("La cantidad de articulos a facturar tiene que ser mayor a 0");
        }
        
        for(int i=0;i<factura01.getItemsFactura().length;i++){
         factura01.cargaArticulos(i);
        }
        factura01.totalItem();
        factura01.recargo();
        factura01.totalFinal();
        factura01.mostrar();
        
    }
    
}

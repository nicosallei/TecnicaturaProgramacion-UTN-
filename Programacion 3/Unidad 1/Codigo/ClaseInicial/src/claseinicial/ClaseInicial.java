/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseinicial;

import controlador.FacturaManager;
import facturacion.Articulo;
import facturacion.Cliente;
import facturacion.DetalleFactura;
import facturacion.Factura;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import util.FuncionApp;

/**
 *
 * @author Gerardo
 */
public class ClaseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){
        
        Factura factura = new Factura();
        FacturaManager fm = new FacturaManager(factura);
        fm.cargarArticulosDataBase();
        
        System.out.println("CARGA DE FACTURA");
        Scanner ingreso = new Scanner(System.in);
        
        Date fechaFactura = null;
        while(true){
            System.out.println("Ingrese la fecha de Facturación con format dd-mm-yyyy");
            String fechaIngresada = ingreso.nextLine();
            fechaFactura = FuncionApp.convertirStringToDate(fechaIngresada);
            if(fechaFactura == null){
                System.out.println("La fecha ingresada no es valida. Vuelva a ingresarla");
            }else{
                break;
            }
        }
        factura.setFecha(fechaFactura);
        System.out.println("Ingrese el Numero de Factura");
        ingreso = new Scanner(System.in);
        int nroFactura = ingreso.nextInt();
        factura.setNumero(nroFactura);
        
        String tipoPago = null;
        while(true){
            System.out.println("Ingrese el tipo de pago Contado (C), Tarjeta Credito (TC), Tarjeta Debito (TD)");
            ingreso = new Scanner(System.in);
            tipoPago = ingreso.nextLine();
            if(tipoPago.equals("C") || tipoPago.equals("TC") || tipoPago.equals("TD")){
                factura.setTipoPago(tipoPago);
                break;
            }else{
                System.out.println("El tipo de pago no es valido, debe ser C, TC o TD");
            }
        }
        
        System.out.println("Desea asignar un cliente a la factura ? Y/N");
        ingreso = new Scanner(System.in);
        String respuesta = ingreso.nextLine();
        if(respuesta.equals("Y")){
            Cliente cliente = new Cliente();
            System.out.println("Ingrese la razon Social del Cliente");
            ingreso = new Scanner(System.in);
            cliente.setRazonSocial(ingreso.nextLine());
            System.out.println("Ingrese el CUIT del Cliente");
            ingreso = new Scanner(System.in);
            cliente.setCuit(ingreso.nextLong());
            System.out.println("Ingrese el Numero del Cliente");
            ingreso = new Scanner(System.in);
            cliente.setNumero(ingreso.nextInt());
            factura.setCliente(cliente);
        }
       
        
        ArrayList<DetalleFactura> detalles = new ArrayList<>();
        factura.setDetalles(detalles);
        
        DetalleFactura detalle = null;
        while(true){
            System.out.println("Ingrese el codigo del articulo a facturar o X para salir");
            ingreso = new Scanner(System.in);
            String codigo = ingreso.nextLine();
            if(codigo.toUpperCase().equals("X")){
                if(factura.getDetalles() == null || factura.getDetalles().isEmpty()){
                    System.out.println("Debe cargar al menos 1 articulo a la factura para poder generarla.");
                    continue;
                }
                break;
            }
            Articulo art = fm.getArticuloXCodigo(codigo);
            if(art == null){
                System.out.println("El articulo no existe, verifique el codigo.");
                continue;
            }
            
            detalle = new DetalleFactura();
            detalle.setArticulo(art);
            System.out.println("Ingrese la cantidad de articulos " + art.getDenominacion() + " a facturar");
            ingreso = new Scanner(System.in);
            detalle.setCantidad(ingreso.nextInt());
            detalle.setArticulo(art);
            detalles.add(detalle);
            System.out.println("El articulo " + art.getDenominacion() + " fue agregado exitosamente a la factura Nº " + nroFactura);
            System.out.println("----------------------------------------------------------------------------------------------");
        }
        if(factura.getDetalles() != null && !factura.getDetalles().isEmpty()){
            factura.calcularTotalItems();
            factura.calcularRecargo();
            factura.calcularTotalFinal();
            fm.imprimirDatosFactura();
        }else{
            System.out.println("La Factura no contiene articulos, no puede generarse.");
        }
        
    }
}

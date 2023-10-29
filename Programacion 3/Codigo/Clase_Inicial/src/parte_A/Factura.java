/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_A;

import java.util.Scanner;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Factura {
    
    private String fecha;
    private Long nroFactura;
    private String razonSocial;
    private Long cuitCliente;
    private String tipoPago;
    private double montoTotalItems;
    private double recargo;
    private double montoFinal;
    private String [][]itemsFactura;
    private CalculoFactura calFactura= new CalculoFactura();
    public Factura() {
        
        
        
    }
    public void cantidadItemEnFactura(int x){
 
        this.itemsFactura= new String [x][5];

    }

    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(Long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Long getCuitCliente() {
        return cuitCliente;
    }

    public void setCuitCliente(Long cuitCliente) {
        this.cuitCliente = cuitCliente;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getMontoTotalItems() {
        return montoTotalItems;
    }

    public void setMontoTotalItems(double montoTotalItems) {
        this.montoTotalItems = montoTotalItems;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String[][] getItemsFactura() {
        return itemsFactura;
    }

    public void setItemsFactura(String[][] itemsFactura) {
        this.itemsFactura = itemsFactura;
    }
    
    public void cargaArticulos(int posicion){
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        System.out.println("Articulo a Facturar");
        while(bandera){
            System.out.println("Ingrese el codigo del articulo");
            String codigo=sc.nextLine();
            for(int i=0;i<calFactura.getArticulos().length;i++){
                
            if(codigo.equals(calFactura.getArticulos()[i][0])){
                
                    this.itemsFactura[posicion][0]=calFactura.getArticulos()[i][0];
                    this.itemsFactura[posicion][1]=calFactura.getArticulos()[i][1];
                    this.itemsFactura[posicion][2]=calFactura.getArticulos()[i][2];
                    codigo=null;
                    bandera=false;
                    
                    System.out.println("tamaño matriz "+this.getItemsFactura().length+" x "+this.getItemsFactura()[0].length);
                    
                    System.out.println("Ingrese la cantidad de "+calFactura.getArticulos()[i][1]+" que va a facturar");

                    this.itemsFactura[posicion][3]=sc.nextLine();
                    
                    double precio = Double.parseDouble(calFactura.getArticulos()[i][2]);
                    
                    double cantidad =Double.parseDouble(this.itemsFactura[posicion][3]);
                    double subtotal= precio*cantidad;
                    this.itemsFactura[posicion][4]=String.valueOf(subtotal);
                    
                    break;
                   

                }

            }
            System.out.println("El codigo del articulo es invalido");
        
        }

    }
    public void totalItem(){
        double cantidad=0;
        for(int i=0;i<this.itemsFactura.length;i++){
            cantidad += Double.parseDouble(this.itemsFactura[i][4]);
            
    
    }
    this.setMontoTotalItems(cantidad);
    }
    public void recargo(){
    
        switch (this.getTipoPago()){
        
            case "C":
                this.setRecargo(0);
                break;
            case "TC":
                this.setRecargo(this.getMontoTotalItems()*0.1+this.getMontoTotalItems());
                break;
            case "TD":
                this.setRecargo(this.getMontoTotalItems()*0.05+this.getMontoTotalItems());
                break;

        }
    
    }
    public void totalFinal(){
    
    this.setMontoFinal(this.getMontoTotalItems()+this.getRecargo());
    }
    
   public void mostrar(){
   
       System.out.println("Cliente: "+this.getRazonSocial());
       System.out.println("Fecha: "+this.getFecha());
       System.out.println("Numero: "+this.getNroFactura());
       System.out.println("Tipo Pago: "+this.getTipoPago());
       System.out.println("Codigo Item\t\t\tDenominacion\t\tPrecio\t\t\t\t\t\t\t\tCantidad\t\t\t\t\t\tSubtotal");
   for(int i=0;i<this.getItemsFactura().length;i++){
       System.out.println(this.getItemsFactura()[i][0]+" "+this.getItemsFactura()[i][1]+" "+this.getItemsFactura()[i][2]+" "+this.getItemsFactura()[i][3]+" "+this.getItemsFactura()[i][4]);
   
   
   }
       System.out.println("");
       System.out.println("Total Items: "+this.getMontoTotalItems());
       System.out.println("Recargo:     "+this.getRecargo());
       System.out.println("Total Final: "+this.getMontoFinal());
   } 
    
    public void espacios(String caracter){
    
        
        
        
    }
    
}

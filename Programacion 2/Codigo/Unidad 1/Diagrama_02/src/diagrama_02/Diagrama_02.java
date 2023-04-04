/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama_02;

/**
 *
 * @author nicos
 */
public class Diagrama_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Recibo recibo = new Recibo();
        recibo.getProveedor().setCodigo(1245);
        recibo.getProveedor().setRazonSocial("OSEP");
       
       
        recibo.getFecha().setDia(28);
        recibo.getFecha().setMes(03);
        recibo.getFecha().setAnio(2023);
        recibo.setTipo('A');
        recibo.setNumero(1);
        recibo.setTotal(4875);
        recibo.setDetalle("Radiografia");
        
        System.out.println("prueba");
        
        
       recibo.mostrar(recibo);
       /*
      System.out.println("Fecha :"+recibo.getFecha().getDia()+"/"+recibo.getFecha().getMes()+"/"+recibo.getFecha().getAnio());
      System.out.println("tipo de comprobante: "+recibo.getTipo());
      System.out.println("numero de comprobante: "+recibo.getNumero());
      System.out.println("codigo de proveedor: "+recibo.getProveedor().getCodigo());
      System.out.println("Razon Social: "+recibo.getProveedor().getRazonSocial());
      System.out.println("Detalle: "+recibo.getDetalle());
      System.out.println("Total: "+recibo.getTotal());
*/    
}
    
}

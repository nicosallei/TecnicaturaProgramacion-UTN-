package orm;

import controlador.GestorFactura;
import modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {// creacion de objetos
            GestorFactura gestor = new GestorFactura();
            Proveedor proveedor = new Proveedor();
            Domicilio domicilio = new Domicilio();
            Factura factura = new Factura();
            Articulo articulo = new Articulo();
            FacturaDetalle facturaDetalle = new FacturaDetalle();
            List<FacturaDetalle> facturasDetalle = new ArrayList<FacturaDetalle>();
            List<TipoArticulo> tiposDeArticulo = new ArrayList<TipoArticulo>();
            TipoArticulo ta1 = new TipoArticulo();
            TipoArticulo ta2 = new TipoArticulo();


            // seteo de los atributos
            ta1.setDenominacion("Limpieza");
            ta2.setDenominacion("Desinfeccion");
            tiposDeArticulo.add(ta1);
            tiposDeArticulo.add(ta2);

            proveedor.setCuit("20-23949058-5");
            proveedor.setRazonSocial("Ocio S.A.");

            domicilio.setNombreCalle("Rondeau");
            domicilio.setNumero(377);
            domicilio.setLocalidad("Maipu");
            
            Pais pais = new Pais();
            pais.setCodigo(125);
            pais.setNombrePais("Argentina");
            
            domicilio.setPais(pais);

            factura.setFecha("20/12/10");
            factura.setNumero(40);
            factura.setTotal(1500);

            articulo.setDenominacion("Detergente");
            articulo.setCantidad(12);
            articulo.setTiposDeArticulo(tiposDeArticulo);
            
            facturaDetalle.setCantidad(10);
            facturaDetalle.setSubTotal(2500);
            // seteo de factura desde facturaDetalle
            facturaDetalle.setFactura(factura);
            // seteo de domicilio desde proveedor
            proveedor.setDomicilio(domicilio);
            // seteo el articulo desde facturaDetalle
            facturaDetalle.setArticulo(articulo);
            // agrega a la lista los objetos facturaDetalle
            facturasDetalle.add(facturaDetalle);
            // seteo de proveedor desde factura
            factura.setProveedor(proveedor);
            // seteo de facturaDetalle desde factura
            factura.setFacturasDetalle(facturasDetalle);
            // guardo factura: contiene los datos del proveedor,
            // el articulo y el detalle de la factura
            // invoco al gestor y le paso un objeto como argumento
            gestor.guardar(factura);
            factura.toString();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

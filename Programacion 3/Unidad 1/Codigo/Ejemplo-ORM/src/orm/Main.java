package orm;

import controlador.GestorFactura;
import modelo.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            // creacion de objetos
            //Manager
            GestorFactura gestor = new GestorFactura();
            
            //entidades
            Proveedor proveedor = new Proveedor();
            if(proveedor.getFechaAlta() == null)
                proveedor.setFechaAlta(new Date());
            proveedor.setFechaModificacion(new Date());
            Domicilio domicilio = new Domicilio();
            if(domicilio.getFechaAlta() == null)
                domicilio.setFechaAlta(new Date());
            domicilio.setFechaModificacion(new Date());
            Factura factura = new Factura();
            if(factura.getFechaAlta() == null)
                factura.setFechaAlta(new Date());
            factura.setFechaModificacion(new Date());
            Articulo articulo = new Articulo();
            if(articulo.getFechaAlta() == null)
                articulo.setFechaAlta(new Date());
            articulo.setFechaModificacion(new Date());
            FacturaDetalle facturaDetalle = new FacturaDetalle();
            List<FacturaDetalle> facturasDetalle = new ArrayList<FacturaDetalle>();
            List<TipoArticulo> tiposDeArticulo = new ArrayList<TipoArticulo>();
            TipoArticulo ta1 = new TipoArticulo();
            if(ta1.getFechaAlta() == null)
                ta1.setFechaAlta(new Date());
            ta1.setFechaModificacion(new Date());
            TipoArticulo ta2 = new TipoArticulo();
            if(ta2.getFechaAlta() == null)
                ta2.setFechaAlta(new Date());
            ta2.setFechaModificacion(new Date());


            // seteo de los atributos
            ta1.setDenominacion("Limpieza");
            ta2.setDenominacion("Desinfeccion");
            tiposDeArticulo.add(ta1);
            tiposDeArticulo.add(ta2);


            proveedor.setCuit("20-23949058-5");
            proveedor.setRazonSocial("Ocio S.A.");

            domicilio.setNombreCalle("Rondeau");
            domicilio.setNumero(377);

            factura.setFecha(new Date());
            factura.setNumero(40);
            factura.setTotal(1500);

            articulo.setDenominacion("Mapas");
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

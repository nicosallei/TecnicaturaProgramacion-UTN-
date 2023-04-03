
package diagrama_01;

import java.util.ArrayList;
import java.util.Iterator;


public class Factura extends Comprobante {
  
 private float total;
 private ArrayList <Producto> mproducto = new ArrayList<>();
 private Cliente mcliente;

    public Factura() {
    }

 public void AddProducto(Producto producto){
     mproducto.add(producto);
     setTotal(getTotal()+producto.getPrecio());
 }
 public void RemoveProducto(Producto producto){
 mproducto.remove(producto);
 setTotal(getTotal()-producto.getPrecio());
 }
 
 public Producto GetProducto(int index){
 return (Producto) mproducto.get(index);
 }
 
 public int GetProductoCount(){
 return mproducto.size();
 }
    
 
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<Producto> getMproducto() {
        return mproducto;
    }

    public void setMproducto(ArrayList<Producto> mproducto) {
        this.mproducto = mproducto;
    }

    public Cliente getMcliente() {
        return mcliente;
    }

    public void setMcliente(Cliente mcliente) {
        this.mcliente = mcliente;
    }
   public void mostrarProductos(){
        Iterator<Producto> iter = mproducto.iterator();
        while (iter.hasNext()){
            Producto p = iter.next();
            System.out.printf("Codigo: %d Descripcion %s Precio: %5.2f \n", p.getCodigo(), p.getDescripcion(),p.getPrecio());
        }
        
    }
    
    public void mostrar(){
        System.out.printf("Tipo: %c Numero: %d Fecha: %d/%d/%d\n",
        getTipo(), getNumero(),
        getFecha().getDia(), getFecha().getMes(), getFecha().getAnio());
        System.out.printf("-------Cliente------- \n");
        System.out.printf("Codigo: %d Razon Social: %s \n",
        mcliente.getCodigo(), mcliente.getRazonSocial());
        System.out.printf("-------Productos------- \n");
        mostrarProductos();
        System.out.printf("Total: %6.2f \n",getTotal());
    }
    
}

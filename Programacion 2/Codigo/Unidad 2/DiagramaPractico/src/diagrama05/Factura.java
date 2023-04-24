package diagrama05;

import java.util.ArrayList;
import java.util.Date;


public class Factura {
    private Empleado emp;
    private Cliente clie ;
    private Date fecha;
    private double monto;
    private int nro_Factura;

    public Factura(Date fecha, double monto, int nro_factura) {
        this.fecha = fecha;
        this.monto = monto;
        this.nro_Factura = nro_factura;
    }


    public Factura(Date fecha_Ingreso, int nro_Legajo, int dni_emp, String nombre_emple, String apellido_emple, long cuit_empleado,int dni_clie, String nombre_clie, String apellido_clie, long cuit_cliente,int nro_Factura,Date fecha, double monto) {
       this.emp=new Empleado(fecha_Ingreso,nro_Legajo,dni_emp,nombre_emple,apellido_emple,cuit_empleado);
       this.clie=new Cliente(dni_clie,nombre_clie,apellido_clie,cuit_cliente);
        this.fecha = fecha;
        this.monto = monto;
        this.nro_Factura = nro_Factura;
    }
    
    

    public Factura() {
    }

    
    
    public Cliente getClie() {
        return clie;
    }

    public void setClie(Cliente clie) {
        this.clie = clie;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
    
    
 
     public int getNro_factura() {
        return nro_Factura;
    }

    public void setNro_factura(int nro_factura) {
        this.nro_Factura = nro_factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void mostrar(){
    
        System.out.println("Factura N° :"+nro_Factura);
        System.out.println("Fecha: "+fecha);
        
        System.out.println("///////////////////////////////////////////");
        
        
            System.out.println("Nombre y Apellido del Empleado: "+emp.getNombre()+" "+emp.getApellido());
            System.out.println("DNI: "+emp.getDni()+" ,CUIT: "+emp.getCuit());
            System.out.println("Legajo: "+emp.getNro_Legajo());
            System.out.println("Ingreso del empleado: "+emp.getFecha_Ingreso());
            System.out.println("----------------------------------");
        
        System.out.println("+++++++++++++++++++++++++++++++++++");
        
            System.out.println("Nombre y Apellido del Cliente: "+clie.getNombre()+" "+clie.getApellido());
            System.out.println("DNI: "+clie.getDni()+" ,CUIT: "+clie.getCuit());
            System.out.println("--------------------------------");
            for(Tarjeta_de_Credito tarjeta: clie.getCredit_Car()) {
              System.out.println("Ingreso de la tarjeta: "+tarjeta.getFecha_Ingreso());
              System.out.println("Limite de la tarjeta: "+tarjeta.getLimite());
                System.out.println("************");
          }
            System.out.println("¿El cliente tiene problemas en el veraz? :\n "+clie.problemaVerazCodeme());
        
    
        System.out.println("Monto total : "+getMonto());
    }
    
}

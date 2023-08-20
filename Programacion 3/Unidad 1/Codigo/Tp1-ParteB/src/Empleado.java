/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Empleado extends Persona{
    
    private int idEmpleado;
    private int nroLegajo;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(int idEmpleado, int nroLegajo, double sueldo) {
        this.idEmpleado = idEmpleado;
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }

    public Empleado(int idEmpleado, int nroLegajo, double sueldo, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.idEmpleado = idEmpleado;
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }
    
    
    
    public void mostrarEmpleado(){
    
        System.out.println("---- Empleado ---\n");
        System.out.println("Empleado ID: "+this.getIdEmpleado());
        System.out.println("Numero Legajo: "+this.getNroLegajo());
        System.out.println("Sueldo: "+this.getSueldo()+"\n");
        
        System.out.println("----Persona----\n");
        System.out.println("Persona ID: "+this.getIdPersona());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("DNI: "+this.getDni()+"\n");
        
        System.out.println("--------Domicilio--------\n");
        System.out.println("Domicilio ID: "+this.getDomicilio().getIdDomicilio());
        System.out.println("Localidad: "+this.getDomicilio().getLocalidad());
        System.out.println("Calle: "+this.getDomicilio().getCalle());
        System.out.println("Numero: "+this.getDomicilio().getNumero()+"\n");
    
    
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}

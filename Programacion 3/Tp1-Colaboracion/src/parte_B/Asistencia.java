/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_B;

import java.util.Date;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Asistencia {
    private long id;
    private String tipo;
    private Date fecha;
    private int hora;
    private int minuto;

    private Empleado empleado;
    
    public Asistencia() {
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.toUpperCase().equals("E") || tipo.toUpperCase().equals("S")){
        this.tipo = tipo.toUpperCase();
        }else System.out.println("El tipo es incorrecto, tiene que ser S o E");
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    
}

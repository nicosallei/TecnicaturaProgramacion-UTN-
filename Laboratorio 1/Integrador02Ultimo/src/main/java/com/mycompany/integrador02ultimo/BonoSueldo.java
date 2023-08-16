/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integrador02ultimo;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class BonoSueldo {
    
   Empleado empleado;
   private int mesLiquidacion;
   private int anioLiquidacion;
   private double montoLiquidacion;
   private double sumaHaberes;
   private double sumaDeducciones;

    public double getSumaHaberes() {
        return sumaHaberes;
    }

    public void setSumaHaberes(double sumaHaberes) {
        this.sumaHaberes = sumaHaberes;
    }

    public double getSumaDeducciones() {
        return sumaDeducciones;
    }

    public void setSumaDeducciones(double sumaDeducciones) {
        this.sumaDeducciones = sumaDeducciones;
    }
  

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getMesLiquidacion() {
        return mesLiquidacion;
    }

    public void setMesLiquidacion(int mesLiquidacion) {
        this.mesLiquidacion = mesLiquidacion;
    }

    public int getAnioLiquidacion() {
        return anioLiquidacion;
    }

    public void setAnioLiquidacion(int anioLiquidacion) {
        this.anioLiquidacion = anioLiquidacion;
    }

    public double getMontoLiquidacion() {
        return montoLiquidacion;
    }

    public void setMontoLiquidacion(double montoLiquidacion) {
        this.montoLiquidacion = montoLiquidacion;
    }
    
}

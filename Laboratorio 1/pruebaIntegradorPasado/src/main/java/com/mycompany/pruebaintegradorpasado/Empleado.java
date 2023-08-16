/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaintegradorpasado;

/**
 *
 * @author Nicolas Sallei Correa
 */
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombreEmpleado;
    private long cuil;
    private int anioIngreso;
    private double montoAntiguedad;
    private double sueldoBasico;
    private List<BonoSueldo> bonos;

    String[][] bonoTotal = new String[5][4];

    List<String[][]> bonitos = new ArrayList<>();


    public List<String[][]> getBonitos() {
        return bonitos;
    }

    public void setBonitos(List<String[][]> bonitos) {
        this.bonitos = bonitos;
    }

    public String[][] getBonoTotal() {
        return bonoTotal;
    }

    public void setBonoTotal(String[][] bonoTotal) {
        this.bonoTotal = bonoTotal;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setMontoAntiguedad(double montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public List<BonoSueldo> getBonos() {
        return bonos;
    }

    public void setBonos(List<BonoSueldo> bonos) {
        this.bonos = bonos;
    }

    public void addBono(BonoSueldo bono) {
        if(this.bonos == null)
            this.bonos = new ArrayList<>();
        this.bonos.add(bono);
    }

}
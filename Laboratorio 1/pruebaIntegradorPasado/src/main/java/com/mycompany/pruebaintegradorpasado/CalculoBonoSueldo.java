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
import java.util.Scanner;

public class CalculoBonoSueldo {

    static String [][]  haberes = {{"100","Presentismo", "9"} , {"101"," Titulo Profesional" , "9"} , {"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104"," Otros Haberes", "M"}};
    static String [][]  deducciones = {{"200"," Obra Social", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203"," Seguro", "1.5"} , {"204","Otros", "M"}};
    static List<Integer> codigosIngresados = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double sumaHaberes = 0;
        double sumaDeducciones = 0;
        System.out.println("Ingrese el anio actual");
        int anioActual = t.nextInt();
        t.nextLine();
        Empleado empleado = new Empleado();

        System.out.println("Ingrese el nombre del Empleado");
        empleado.setNombreEmpleado(t.nextLine());
        System.out.println("Ingrese el CUIL del empleado");
        empleado.setCuil(t.nextLong());
        System.out.println("Ingrese el anio de Ingreso del empleado");
        empleado.setAnioIngreso(t.nextInt());
        while (empleado.getAnioIngreso() > anioActual) {
            System.out.println("El anio de ingreso no puede ser mayor que el actual");
            empleado.setAnioIngreso(t.nextInt());
        }
        System.out.println("Ingrese el sueldo basico del empleado");
        empleado.setSueldoBasico(t.nextDouble());


        while (true) {
            BonoSueldo bono = new BonoSueldo();
            System.out.println("Ingrese el mes de liquidacion");
            bono.setMesLiquidacion(t.nextInt());
            System.out.println("Ingrese el anio de liquidacion");
            bono.setAnioLiquidacion(t.nextInt());
            while (bono.getAnioLiquidacion() > anioActual) {
                System.out.println("El anio de liquidacion no puede ser mayor que el actual");
                bono.setAnioLiquidacion(t.nextInt());
            }
            double aux = (bono.getAnioLiquidacion() - empleado.getAnioIngreso()) * 0.02;
            empleado.setMontoAntiguedad(aux * empleado.getSueldoBasico());
            String[][] bonoCalculado = new String[10][4];
            codigosIngresados.clear();
            int ubiH = 0;
            while (true) {

                System.out.println("""
                        Ingrese los Haberes del empleado.
                        Ingrese el codigo del item.""");
                String codigo = t.next();
                if (codigo.equalsIgnoreCase("000")) {
                    if (bonoCalculado.length == 0) {
                        System.out.println("Debe ingresar al menos 1 haber");
                    } else {
                        break;
                    }
                }
                while (codigosIngresados.contains(Integer.valueOf(codigo))) {
                    System.out.println("El codigo ya ha sido cargado");
                    codigo = t.next();
                }
                int noHaber = 0;
                for (int i = 0; i < haberes.length; i++) {
                    if (haberes[i][0].equalsIgnoreCase(codigo)) {
                        bonoCalculado[ubiH][0] = codigo;
                        bonoCalculado[ubiH][1] = haberes[i][1];
                        if (Character.isDigit(haberes[i][2].charAt(0))) {
                            double valor = Double.valueOf(haberes[i][2]) / 100;
                            bonoCalculado[ubiH][2] = String.valueOf((empleado.getSueldoBasico() * valor));
                        } else {
                            System.out.println("Ingrese el valor del haber");
                            double haber = t.nextDouble();
                            bonoCalculado[ubiH][2] = String.valueOf(haber);
                        }
                    } else {
                        noHaber++;
                    }
                }
                if (noHaber >= haberes.length) {
                    System.out.println("El codigo ingresado es incorrecto");
                } else {
                    codigosIngresados.add(Integer.valueOf(codigo));
                }
                ubiH++;
            }
            int ubiD = ubiH;
            while (true) {
                System.out.println("""
                        Ingrese las Deducciones del empleado.
                        Ingrese el codigo del item.""");
                String codigo = t.next();
                boolean exist = false;
                int contDeduc = 0;
                if (codigo.equalsIgnoreCase("000")) {
                    for (int i = 0; i < ubiD; i++) {
                        if (bonoCalculado[i][0].equalsIgnoreCase("200") || bonoCalculado[i][0].equalsIgnoreCase("201") || bonoCalculado[i][0].equalsIgnoreCase("202") || bonoCalculado[i][0].equalsIgnoreCase("203") || bonoCalculado[i][0].equalsIgnoreCase("204")) {
                            exist = true;
                        } else {
                            contDeduc++;
                        }
                    }
                    if (contDeduc >= ubiD) {
                        System.out.println("Debe ingresar al menos 1 deduccion");
                    }
                    if (exist == true) {
                        break;
                    }
                }
                while (codigosIngresados.contains(Integer.valueOf(codigo))) {
                    System.out.println("El codigo ya ha sido cargado");
                    codigo = t.next();
                }
                int noDeduccion = 0;
                for (int i = 0; i < deducciones.length; i++) {
                    if (deducciones[i][0].equalsIgnoreCase(codigo)) {
                        bonoCalculado[ubiD][0] = codigo;
                        bonoCalculado[ubiD][1] = deducciones[i][1];
                        if (Character.isDigit(deducciones[i][2].charAt(0))) {
                            double valor = Double.valueOf(deducciones[i][2]) / 100;
                            bonoCalculado[ubiD][3] = String.valueOf((empleado.getSueldoBasico() * valor));
                        } else {
                            System.out.println("Ingrese el valor de la deduccion");
                            double deduccion = t.nextDouble();
                            bonoCalculado[ubiD][3] = String.valueOf(deduccion);
                        }
                    } else {
                        noDeduccion++;
                    }
                }
                if (noDeduccion >= haberes.length) {
                    System.out.println("El codigo ingresado es incorrecto");
                } else {
                    codigosIngresados.add(Integer.valueOf(codigo));
                }
                ubiD++;
            }
            sumaHaberes = 0;
            sumaDeducciones = 0;
            empleado.setBonoTotal(bonoCalculado);
            empleado.getBonitos().add(empleado.getBonoTotal());
            for (int i = 0; i < ubiH; i++) {
                sumaHaberes += Double.valueOf(bonoCalculado[i][2]);
            }
            for (int j = ubiH; j < ubiD; j++) {
                sumaDeducciones += Double.valueOf(bonoCalculado[j][3]);
            }
            double monto = (empleado.getSueldoBasico() + empleado.getMontoAntiguedad() + sumaHaberes) - sumaDeducciones;
            bono.setMontoLiquidacion(monto);
            empleado.addBono(bono);
            System.out.println("Desea cargar otro bono?");
            String condicionSalir = t.next();
            if (condicionSalir.equalsIgnoreCase("no")) {
                break;
            }
        }
        for (int i = 0; i < empleado.getBonos().size(); i++) {
            boolean ext = false;
            System.out.println("Nombre: " + empleado.getNombreEmpleado());
            System.out.println("CUIL: " + empleado.getCuil());
            System.out.println("Mes Liquidacion: " + empleado.getBonos().get(i).getMesLiquidacion() + "        anio Liquidacion: " + empleado.getBonos().get(i).getAnioLiquidacion());
            System.out.println("Sueldo Basico: " + empleado.getSueldoBasico() + "         anio Ingreso: " + empleado.getAnioIngreso());
            System.out.println("Codigo Item        Denominacion                Haberes        Deducciones");
            System.out.println("                   Sueldo Basico              " + empleado.getSueldoBasico());
            System.out.println("                   Antiguedad                 " + empleado.getMontoAntiguedad());
            for (int j = 0; j < empleado.getBonitos().get(i).length; j++) {
                for (int k = 0; k < empleado.getBonitos().get(i)[0].length; k++) {
                    System.out.print(empleado.getBonitos().get(i)[j][k] + "            ");
                    if (empleado.getBonitos().get(i)[j][0] == null) {
                        ext = true;
                        break;
                    }
                }
                System.out.println("");
                if (ext == true) {
                    break;
                }
            }
            System.out.println("                    SubTotal: " + sumaHaberes + "   " + sumaDeducciones);
            System.out.println("                                   NETO:            " + empleado.getBonos().get(i).getMontoLiquidacion());
            System.out.println("");
            System.out.println("");
        }
    }
}
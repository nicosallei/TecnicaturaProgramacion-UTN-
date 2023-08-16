/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integrador02ultimo;

import java.util.*;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class CalculoBonoSueldo {
//-----------datos dados------------------------    

    static String[][] haberes = {{"100", "Presentismo", "9"}, {"101", "Titulo Profesional", "9"}, {"102", "Horas Extraordinarias", "M"}, {"103", "Horas Nocturnas", "M"}, {"104", "Otros Haberes", "M"}};
    static String[][] deducciones = {{"200", "Obra Social", "3"}, {"201", "Jubilacion", "11"}, {"202", "Sindicato", "2"}, {"203", "Seguro", "1.5"}, {"204", "Otros", "M"}};
    static List<Integer> codigosIngresados = new ArrayList<Integer>();
// --------objetos,Array,Listas globales------------ 
    public static Empleado empleado = new Empleado();
//-----------Variables globales---------------------
    static int contador = 0;
    static int fila = 0;
    static double sumaHaberes = 0;
    static double sumaDeducciones = 0;

//    año actual
    static Calendar cal = Calendar.getInstance();
    static int anioActual = cal.get(Calendar.YEAR);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        datoEmpleado();

        while (true) {

            //-------- Reseteo de variables, array y lista---------
            reseteo();
            //---------carga de bonos-----------------
            cargaBonos();

            System.out.println("Desea cargar otro bono?");
            String condicionSalir = sc.next();

            if (condicionSalir.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        mostrar();
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

       

    }

    public static void datoEmpleado() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre completo del empleado");
        empleado.setNombreEmpleado(sc.nextLine());
        System.out.println("Ingrese el cuil del empleado");
        empleado.setCuil(sc.nextLong());
        System.out.println("Ingrese el año de ingreso del empleado");

        // carga del año de ingreso y validacion
        while (true) {
            int anioCargado = sc.nextInt();
            if (anioCargado <= anioActual) {
                empleado.setAnioIngreso(anioCargado);
                break;
            } else {
                System.out.println("El año de ingreso no puede superar al actual.");
            }
        }
        //---------------------------------------

        System.out.println("Ingrese el sueldo basico");
        empleado.setSueldoBasico(sc.nextDouble());

        //-------monto antiguedad-----------
        double montoAntiguedad = (anioActual - empleado.getAnioIngreso()) * 0.02;
        empleado.setMontoAntiguedad(empleado.getSueldoBasico() * montoAntiguedad);

    }

    public static void cargaBonos() {
        String[][] bonoCalculado = new String[10][4];
        Scanner sc = new Scanner(System.in);
        BonoSueldo bono = new BonoSueldo();

        datoLaborales(bono);
        // Carga de datos en la clase empleado y ejecuta los metodos
        haberes(bonoCalculado);
        contador = 0;
        deducciones(bonoCalculado);
        double monto = (empleado.getSueldoBasico() + empleado.getMontoAntiguedad() + sumaHaberes) - sumaDeducciones;
        bono.setMontoLiquidacion(monto);
        bono.setSumaHaberes(sumaHaberes);
        bono.setSumaDeducciones(sumaDeducciones);

        empleado.addBonitos(bonoCalculado);
        empleado.addBono(bono);

    }

    public static void datoLaborales(BonoSueldo bono) {

        Scanner sc = new Scanner(System.in);

        reseteo();
        //-------- mes de liquidacion y validacion
        while (true) {
            System.out.println("Ingrese el mes de liquidacion (1-12)");
            int mesLiquidacion = sc.nextInt();
            if (mesLiquidacion > 0 && mesLiquidacion < 13) {
                bono.setMesLiquidacion(mesLiquidacion);
                break;
            } else {
                System.out.println("El mes de liquidacion es incorrecto\n");
            }
        }

        //-----------año de liquidacion y validacion---------------
        while (true) {
            System.out.println("Ingrese el año de liquidacion");
            int anioLiquidacion = sc.nextInt();
            if (anioLiquidacion <= anioActual) {
                bono.setAnioLiquidacion(anioLiquidacion);
                break;
            } else {
                System.out.println("Error: El año de liquidacion ingresado es mayor al actual");
            }

        }
        System.out.println("Año liquidacion: " + bono.getAnioLiquidacion());
    }

    public static void haberes(String[][] bonoCalculado) {
        //---------- variables----------
        String codigo;
        Integer item = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los Haberes del Empleado");

        while (true) {
            System.out.println("Ingrese el codigo del item");
            codigo = sc.nextLine();
            item = Integer.parseInt(codigo);

            if (codigo.equals("000") && contador == 0) {
                System.out.println("Debe ingresar al menos 1 haber");
            } else if (codigo.equals("000")) {
                System.out.println("Carga de haberes Finalizada.\n-----------------");
                break;
            } else if (item < 100 || item > 104) {
                System.out.println("ERROR: Item incorrecto");
            } else if (codigosIngresados.indexOf(item) >= 0) {
                System.out.println("El codigo ya ha sido cargado");
                System.out.println("Ingrese otro codigo");
            } else {

                cargoHaberes(item, bonoCalculado);
            }
        }
    }

    public static void cargoHaberes(int item, String[][] bonoCalculado) {
        Scanner sc = new Scanner(System.in);
        double montoResultante = 0;
        contador++;

        for (String[] haber : haberes) {
            int codigo = Integer.parseInt(haber[0]);

            if (codigo == item) {
                bonoCalculado[fila][1] = haber[1];
                if (haber[2].equals("M")) {
                    System.out.println("Ingrese el monto correspondiente al item: " + haber[1]);
                    montoResultante = sc.nextDouble();
                } else {
                    double porcentaje = Double.parseDouble(haber[2]) / 100;
                    montoResultante = empleado.getSueldoBasico() * porcentaje;
                    System.out.println(montoResultante);

                }
            }
        }
        //---------Carga de datos---------
        String cargoItem = String.valueOf(item);
        String montoRes = String.valueOf(montoResultante);
        bonoCalculado[fila][0] = cargoItem;
        bonoCalculado[fila][2] = montoRes;
        sumaHaberes += montoResultante;
        codigosIngresados.add(item);
        fila++;

    }

    public static void deducciones(String[][] bonoCalculado) {
        //---------- variables----------
        String codigo;
        Integer item = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Deduccion del Empleado");

        while (true) {
            System.out.println("Ingrese el codigo del item");
            codigo = sc.nextLine();
            item = Integer.parseInt(codigo);
            if (codigo.equals("000") && contador == 0) {
                System.out.println("Debe ingresar al menos 1 deduccion");
            } else if (codigo.equals("000")) {
                System.out.println("Carga de Deducciones Finalizada.");
                break;
            } else if (item < 200 || item > 204) {
                System.out.println("ERROR: Item incorrecto");
            } else if (codigosIngresados.indexOf(item) >= 0) {
                System.out.println("El codigo ya ha sido cargado");
                System.out.println("Ingrese otro codigo");
            } else {
                cargoDeducciones(item, bonoCalculado);
            }
        }
    }

    public static void cargoDeducciones(int item, String[][] bonoCalculado) {
        Scanner sc = new Scanner(System.in);
        double montoResultante = 0;
        contador++;

        for (String[] deduccion : deducciones) {
            int codigo = Integer.parseInt(deduccion[0]);

            if (codigo == item) {
                bonoCalculado[fila][1] = deduccion[1];
                if (deduccion[2].equals("M")) {
                    System.out.println("Ingrese el monto correspondiente al item: " + deduccion[1]);
                    montoResultante = sc.nextDouble();
                } else {
                    double porcentaje = Double.parseDouble(deduccion[2]) / 100;
                    montoResultante = empleado.getSueldoBasico() * porcentaje;
                    System.out.println(montoResultante);

                }
            }
        }
        //---------Carga de datos---------
        String cargoItem = String.valueOf(item);
        String montoRes = String.valueOf(montoResultante);
        bonoCalculado[fila][0] = cargoItem;
        bonoCalculado[fila][3] = montoRes;
        sumaDeducciones += montoResultante;
        codigosIngresados.add(item);
        fila++;

    }

    public static void reseteo() {

        codigosIngresados.clear();
        fila = 0;
        contador = 0;
        sumaHaberes = 0;
        sumaDeducciones = 0;

    }

    public static String completarConEspacios(String cadena) {
        int cantidadEspacios = 20 - cadena.length();
        for (int i = 0; i < cantidadEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }
    
    public static void mostrar() {

        for (int i = 0; i < empleado.getBonos().size(); i++) {
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            boolean ext = false;

            System.out.println("Nombre: " + empleado.getNombreEmpleado());
            System.out.println("CUIL: " + empleado.getCuil());
            System.out.println("Mes Liquidacion: " + empleado.getBonos().get(i).getMesLiquidacion() + "\t\t\tAño Liquidacion: " + empleado.getBonos().get(i).getAnioLiquidacion());
            System.out.println("Sueldo Basico: " + empleado.getSueldoBasico() + "\t\t\tAño ingreso: " + empleado.getAnioIngreso() + "\n");
            System.out.println(completarConEspacios("Codigo Item") + completarConEspacios("Denominacion") + completarConEspacios("Haberes") + completarConEspacios("Deducciones"));
            System.out.println(completarConEspacios(" ")+completarConEspacios("Sueldo Basico:") + completarConEspacios(String.valueOf(empleado.getSueldoBasico())));
            System.out.println(completarConEspacios(" ")+completarConEspacios("Antiguedad:") + completarConEspacios(String.valueOf(empleado.getMontoAntiguedad())));
            System.out.println(" ");
            
            for (int j = 0; j < empleado.getBonitos().get(i).length; j++) {
                for (int k = 0; k < empleado.getBonitos().get(i)[0].length; k++) {
                    if (empleado.getBonitos().get(i)[j][k] == null) {
                        System.out.print(completarConEspacios(""));
                    } else {
                        System.out.print(completarConEspacios(empleado.getBonitos().get(i)[j][k]));
                    }
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

            System.out.println(completarConEspacios(" ")+completarConEspacios("SubTotal:") + completarConEspacios(String.valueOf(empleado.getBonos().get(i).getSumaHaberes()))+completarConEspacios(String.valueOf(empleado.getBonos().get(i).getSumaDeducciones())));
            System.out.println(completarConEspacios(" ")+completarConEspacios("NETO:") + completarConEspacios(String.valueOf(empleado.getBonos().get(i).getMontoLiquidacion())));
            System.out.println("");
            System.out.println("");

        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.laboratorio;

import java.util.*;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class LiquidacionEmpresa {
    
    static Empresa empresa = new Empresa();
    static ArrayList<NivelAcademico> nivelesAcademicos = new ArrayList<NivelAcademico>();
    static ArrayList<Integer> legajosIngresados = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        grabarNivel();
        datosEmpresa();
        
        while (true) {
            cargaEmpleados();
            
            System.out.println("Quiere cargar otro empleado?");
            String pregunta = sc.nextLine();
            if (pregunta.toLowerCase().equals("no")) {
                break;
            }

            
        }
        mostrar();
    }
    
    public static void grabarNivel() {
        NivelAcademico niv1 = new NivelAcademico();
        NivelAcademico niv2 = new NivelAcademico();
        NivelAcademico niv3 = new NivelAcademico();
        NivelAcademico niv4 = new NivelAcademico();
        
        niv1.setCodigo(10);
        niv1.setNivel("Secundario Completo");
        niv1.setPorcentajeAumento(10);
        
        niv2.setCodigo(20);
        niv2.setNivel("Universitario Completo");
        niv2.setPorcentajeAumento(30);
        
        niv3.setCodigo(30);
        niv3.setNivel("Maestria Completo");
        niv3.setPorcentajeAumento(40);
        
        niv4.setCodigo(40);
        niv4.setNivel("Doctorado Completo");
        niv4.setPorcentajeAumento(50);
        
        nivelesAcademicos.add(niv1);
        nivelesAcademicos.add(niv2);
        nivelesAcademicos.add(niv3);
        nivelesAcademicos.add(niv4);
        
    }
    
    public static void datosEmpresa() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ingrese la razon social de la empresa");
            empresa.setRazonSocial(sc.nextLine());
            System.out.println("Ingrese el cuit de la empresa");
            empresa.setCuit(sc.nextLine());
            if (empresa.getRazonSocial().length() == 0 || empresa.getCuit().length() < 11) {
                System.out.println("Datos incorrectos la razon social no puede estar vacia y el cuit debe contener 11 caracteres");
            } else {
                break;
            }
            
        }
    }
    
    public static void cargaEmpleados() {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        NivelAcademico nivel = new NivelAcademico();
        System.out.println("Ingrese el nombre completo");
        while (true) {
            
            empleado.setNombreCompleto(sc.nextLine());
            if (empleado.getNombreCompleto().length() == 0) {
                System.out.println("El nombre del empleado es obligatorio. INGRESE NUEVAMENTE");
            } else {
                break;
            }
        }
        System.out.println("Ingrese el Legajo");
        while (true) {
            empleado.setLegajo(sc.nextInt());
            if (empleado.getLegajo() == 0) {
                System.out.println("El legajo no puede ser 0. INGRESE NUEVAMENTE");
            }else if(legajosIngresados.indexOf(empleado.getLegajo())>=0){
                System.out.println("Error: El legajo ya ha sido ingresado");
                
            } else {
                break;
            }
        }
        System.out.println("Ingrese el Salario");
        while (true) {
            empleado.setSalario(sc.nextDouble());
            if (empleado.getSalario() <= 0) {
                System.out.println("El salario no puede ser 0. INGRESE NUEVAMENTE");
            } else {
                break;
            }
        }
        
        while (true) {
            System.out.println("Ingrese el codigo");
            int codigo = sc.nextInt();
            
            if (codigo == 10 || codigo == 20 || codigo == 30 || codigo == 40) {
                
                buscarArray(nivel, codigo);                
                break;
            } else {
                System.out.println("Error: Codigo no valido");
            }
        }
        
        empleado.setNivelAcademico(nivel);
        empresa.addempleados(empleado);
        
    }
    
    public static void buscarArray(NivelAcademico nivel, int codigo) {
        
        for (NivelAcademico buscar : nivelesAcademicos) {
            
            if (buscar.getCodigo() == codigo) {
                nivel.setCodigo(codigo);
                nivel.setNivel(buscar.getNivel());
                nivel.setPorcentajeAumento(buscar.getPorcentajeAumento());
                
                break;
            }            
            
        }
        
    }
    
    
    
    public static void mostrar() {
        
        int contador=0;
        double promedio=0;
        String mejorEmpleado=" ";
        double mejorSalario=0;
        String mejorNivel=" ";
        double mejorPorcentaje=0;
        
        System.out.println("Empresa: "+empresa.getRazonSocial());
        System.out.println("CUIT: "+empresa.getCuit());
        
        System.out.println("--------------------Empleados--------------------");  
        
        for(Empleado empleado: empresa.getEmpleados()){
        
            System.out.println("Nombre Completo: "+empleado.getNombreCompleto());
            System.out.println("Salario: $"+ empleado.salarioTotalCalculado());
            System.out.println("Nivel Educativo: "+empleado.getNivelAcademico().getNivel()+"(Porcentaje Aumento "+(empleado.getNivelAcademico().getPorcentajeAumento())+"%)");
            System.out.println("------------------------------------------------");         
        
           if(empleado.salarioTotalCalculado()>mejorSalario){
           
               mejorSalario=empleado.salarioTotalCalculado();
               mejorEmpleado=empleado.getNombreCompleto();
               mejorNivel=empleado.getNivelAcademico().getNivel();
               mejorPorcentaje=empleado.getNivelAcademico().getPorcentajeAumento();
           } 
            
            
        promedio+=empleado.salarioTotalCalculado();
        contador++;
        }
        promedio=promedio/contador;
        System.out.println("El promedio de los salarios de la empresa es: $"+promedio);
        System.out.println("El empleado con mejor salario es: ");
        System.out.println("Nombre Completo: "+mejorEmpleado);
        System.out.println("Salario: $"+mejorSalario);
        System.out.println("Nivel Educativo: "+mejorNivel+"(Porcentaje Aumento "+mejorPorcentaje+"%)");
        
        
     
        
    }
    
}

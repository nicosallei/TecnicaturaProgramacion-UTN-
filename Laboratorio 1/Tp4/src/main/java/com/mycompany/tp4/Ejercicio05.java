/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

import java.util.Scanner;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Ejercicio05 {
    
    static String [][] golosinas = {{"KitKat","32","10"},{"Chicles","2","50"},{"Caramelos de Menta","2","50"},{"Huevo Kinder","25","10"},
        {"Chetoos","30","10"},{"Twix","26","10"},{"M&M'S","35","10"},{"Papas Lays","40","20"},{"Milkybar","30","10"},{"Alfajor Tofi","20","15"}
    ,{"Lata Coca","50","20"},{"Chitos","45","1"}};
    static double montoTotal = 0;
    public static void main(String[]args){
    
        menuOpciones();
    }


public static void menuOpciones(){ 
    System.out.println("Inicia");
    Scanner sc = new Scanner(System.in);
    String opcion;
    while(true){
System.out.println("----------------------");
            System.out.println("Menú Opciones");
            System.out.println("----------------------");
            System.out.println("a- Pedir Golosina");
            System.out.println("b- Mostrar Golosina");
            System.out.println("c- Rellenar Golosinas");
            System.out.println("d- Apagar Maquina");
            System.out.println("Seleccione la opción a ejecutar");

opcion = sc.nextLine();
if(opcion.equals("a")){
                pedirGolosinas();
            }else if(opcion.equals("b")){
                System.out.println("Las Golosinas Disponibles son:");
                mostrarGolosinas();
            }else if(opcion.equals("c")){
                rellenarGolosinas();
            }else if(opcion.equals("d")){
                apagarMaquina();
                break;
            }else{
                System.out.println("Opción Incorrecta. Intente nuevamente.");
                System.out.println("----------------------");
            }
        
            
    
}
}
public static void pedirGolosinas(){
    mostrarGolosinas();
Scanner sc = new Scanner(System.in);
int codigo;
System.out.println("--------------------");
        System.out.println("Ingrese código golosina");
        codigo = sc.nextInt();
        int stockActual = Integer.parseInt(golosinas[codigo-1][2]);
        
        if(codigo<0 && codigo>12 ){
            System.out.println("ERROR: Código incorrecto");
            pedirGolosinas();
        }
        if(stockActual>0){
            golosinas[codigo-1][2]=Integer.toString(stockActual-1);
            System.out.println("Gracias por comprar " + golosinas[codigo - 1][0] + ".");
        montoTotal += Double.parseDouble(golosinas[codigo-1][1]);
        menuOpciones();
        }else{
        System.out.println("La golosina " + golosinas[codigo - 1][0] + " no posee stock, seleccione otra golosina");
            pedirGolosinas();
        }
}


public static void mostrarGolosinas(){
    System.out.println("---------------------------------------");
    for(int i=0;i<golosinas.length;i++){
        
        System.out.println((i+1)+"\t"+ completarConEspacios(golosinas[i][0]) +"\t"+ "$"+golosinas[i][1] + "\t" + golosinas[i][2] + "Unidades");
    }
    System.out.println("---------------------------------------"); 
}
        
public static void rellenarGolosinas(){
Scanner sc = new Scanner(System.in);


    System.out.println("Ingrese la contraseña de administrador");
    String contraseña=sc.nextLine();
    
    if( contraseña.equals("AdminXYZ")){
        System.out.println("Contraseña correcta");
        while(true){
        mostrarGolosinas();
                System.out.println("Ingrese código golosina");
                int codigo = new Scanner(System.in).nextInt();
                if(codigo<0 && codigo>12 ){
            System.out.println("ERROR: Código incorrecto, intente nuevamente");
            
        }else{
                    System.out.println("Ingrese la cantidad a rellenar");
                    int cantidad = new Scanner(System.in).nextInt();
                    golosinas[codigo - 1][2] = Integer.toString(Integer.parseInt(golosinas[codigo - 1][2]) + cantidad);
                    System.out.println("El stock de la golosina " + golosinas[codigo - 1][0] + " fue actualizado. Stock Actual " + golosinas[codigo - 1][2]);
                    break;
        
        
        }
    
    
    }




}


}   
    
 private static void apagarMaquina(){
        System.out.println("TOTAL de VENTAS REALIZADAS: $" + montoTotal);
        System.out.println("Gracias por su compra.");
 }
    
 private static String completarConEspacios(String cadena){
        int cantidadEspacios = 25 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }
}  



  
    
    
    
    
    
    
    

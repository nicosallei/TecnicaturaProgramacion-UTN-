/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temaVelocistas;

import java.util.Scanner;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class VelocistaMasRapido {
    
    
     public static Velocista [] velocistas;
    
    public static void main(String[]args){
     
        int cantidad;
        
        
        
        cantidad = cantidadVelocista();
        cargaDeDatos(cantidad);
        mostrar(velocistas);
     
    }
    
public static Velocista []cargaDeDatos(int cantidad){
    Scanner sc = new Scanner (System.in);
    String nombre;
    String apellido;
    int edad,  cantidadDeTiempos;
    double [] tiempos;
    double mejorTiempo;
    
    velocistas = new Velocista [cantidad];
    for(int i=0; i<cantidad;i++){
        System.out.println("Informacion velocista "+(i+1)+" ");
        System.out.print("Apellido: ");
        apellido = sc.next();
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        System.out.print("Cantidad de Tiempos: ");
        cantidadDeTiempos=sc.nextInt();
        
       tiempos=cargarTiempos(cantidadDeTiempos); 
       mejorTiempo =encontrarMejorTiempo(tiempos);
        
      velocistas[i]= new Velocista(apellido,nombre,edad,tiempos,mejorTiempo); 
       
    }
    return velocistas;
    }
public static double []cargarTiempos(int x){
Scanner sc = new Scanner(System.in);
    double [] tiempos = new double[x];
    
    for(int i=0; i<tiempos.length;i++){
    
    do{
           System.out.print("Ingrese el tiempo: "+(i+1)+": ");
                    tiempos[i]= sc.nextDouble();
                    //tiempo
                    if (tiempos[i]<9 || tiempos[i]>14) {
                        System.out.println("Error: tiempo ingresado incorrecto (de 9 a 14");
                    }
    
    
    }while(tiempos[i]<9 || tiempos[i]>14);
    
    
    }
    
return tiempos;
}   
public static double encontrarMejorTiempo(double [] tiempos){
    double mejorTiempo = tiempos [0];
       for(int i=1; i<tiempos.length;i++){
       
       if(mejorTiempo>tiempos[i]){
       mejorTiempo=tiempos[i];
       }
       } 
    
    return mejorTiempo;
    }
public static int cantidadVelocista(){
    Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese la cantidad de velocistas mayor a 2");
    int cantidad = sc.nextInt();
    if(cantidad<3){
        System.out.println("Error: cantidad invalida");
    cantidadVelocista();
    }
    return cantidad;
    }
public static void mostrar(Velocista []velocistas){
    String edad,apellido,nombre,mejorTiempo;
    System.out.println("Tabla de informacion de los Velocistas");
    System.out.print(completarConEspacios("Edad")+ completarConEspacios("Apellido")+completarConEspacios("Nombre")+"Mejor Tiempo");
    for(int i=0; i<velocistas.length;i++){
        
        edad = String.valueOf(velocistas[i].edad);
        apellido = String.valueOf(velocistas[i].apellido);
        nombre = String.valueOf(velocistas[i].nombre);
        mejorTiempo = String.valueOf(velocistas[i].mejorTiempo);
       
        System.out.println(" ");
        System.out.print(completarConEspacios(edad)+completarConEspacios(apellido)+completarConEspacios(nombre)+mejorTiempo+"\n");
    }
    System.out.println(" ");
    System.out.println("-----------------------------------------------------------------------");
    int bandera = mejorVelocista(velocistas);
    System.out.println("El mejor tiempo es de  ");
    System.out.print("Apellido: "+velocistas[bandera].apellido+"\n");
    System.out.print("Nombre: "+velocistas[bandera].nombre+"\n");
    System.out.print("Edad: "+velocistas[bandera].edad+"\n");
    
    
    
    System.out.print("Tiempos: ");
    System.out.print(+velocistas[bandera].tiempos[0]);
    for(int i=1;i<velocistas[bandera].tiempos.length;i++){
    
    System.out.print(" - "+velocistas[bandera].tiempos[i]);
    }
    System.out.print("\nMejor Tiempo: "+velocistas[bandera].mejorTiempo);
    
}
public static int mejorVelocista(Velocista []velocistas){
   int bandera = 0;
           double mejorTiempo=velocistas[0].mejorTiempo;
for(int i=1; i<velocistas.length;i++){

if(mejorTiempo>velocistas[i].mejorTiempo){
bandera = i;
}
}

return bandera;
}
public static String completarConEspacios(String cadena){
        int cantidadEspacios = 15 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }   
    
    
}  
    
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integrador01;

import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class algoritmoArregloC {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    
        System.out.println("Itroduce el numero de comensales (minimo 1, maximo 5)");
        int comensales = sc.nextInt();
    int pedidos[]=new int[comensales];
    
    
    for(int i=0; i<comensales;i++){
        
        boolean bandera = true;
       while(bandera){   
           System.out.println("Ingrese el menu pedido por el comensal "+(i+1));
        pedidos[i]=sc.nextInt();
    if(pedidos[i]>0 && pedidos[i]<4){
    bandera=false;
    }else System.out.println("El numero del pedido es incorrecto tiene que ser (1-3)");
       }
    }
        System.out.println(".......................................................................");
    for(int i=0; i<comensales;i++){
        System.out.println("Comensal "+(i+1)+" va a tomar el menu "+pedidos[i]+" con el precio $"+menu(pedidos[i]));
    }
        System.out.println(" ");
        System.out.println("El costo total a pagar por la mesa es de $"+totalPagar(pedidos));
        System.out.println(".......................................................................");
    }
    
    
    public static int menu(int pedido){
    switch(pedido){
        case 1:
            pedido =2500;
            break;
        case 2:
            pedido=3200;
            break;
        case 3: 
            pedido=4500;  
            break;
    }
            
 return pedido;
    }
    public static double totalPagar(int pedido[]){
    double total=0;
        for(int i=0; i<pedido.length;i++){
        
        total += menu(pedido[i]);
        }
        
    
    return total;
    }
}

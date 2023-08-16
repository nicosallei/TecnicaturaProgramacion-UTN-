/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp7;

import java.util.*;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Telefono {

    static HashMap<String, Long> agenda = new HashMap<String, Long>();
static boolean bandera= true;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (bandera) {

            menu();
/*
            System.out.println("Desea salir?");
            String condicionSalir = sc.next();
            if (condicionSalir.equalsIgnoreCase("si")) {
                break;
            }
*/
        }
    }

    public static void cargaDatos() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el telefono de la persona");
            Long telefono = sc.nextLong();

            if (agenda.containsKey(nombre)) {
                System.out.println("Error: 'El nombre de la persona ya esta agendada'");

            } else {
                agenda.put(nombre.toUpperCase(), telefono);
                break;
            }
        }
    }

    public static void buscarTelefono() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre de la persona que quiere buscar");
        String personaBuscada = sc.nextLine();

        if (agenda.containsKey(personaBuscada.toUpperCase())) {
            System.out.println("La persona fue encontrada.");
            System.out.println(personaBuscada.toUpperCase() + ", Telefono: " + agenda.get(personaBuscada));

        } else {
            System.out.println("La persona no se encuentra en la agenda.");
        }
    }

    public static void listaAgenda() {
        Iterator it = agenda.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Nombre: " + e.getKey() + " Telefono: " + e.getValue());
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 : Cargar Datos en la Agenda");
        System.out.println("2 : Buscar Telefono Por Nombre");
        System.out.println("3 : Listar Agenda");
        System.out.println("4 : Salir");
        System.out.print("Ingrese: ");
        String dato = sc.nextLine();
        switch (dato) {
            case "1":
                cargaDatos();
                break;
            case "2":
                buscarTelefono();
                break;
            case "3":
                listaAgenda();
                break;
            case "4":
                bandera=false;
                break;
                
            default:
                System.out.println("Error: Opcion Invalida");
        }

    }

}

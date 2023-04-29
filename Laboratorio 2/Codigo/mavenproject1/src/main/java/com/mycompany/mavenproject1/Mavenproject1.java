/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Mavenproject1 {

    public static void main(String[] args) {
        // Abrir el archivo
        String archivo = "Traza_Gps.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(archivo));
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo: " + e.getMessage());
            return;
        }
        
        // Inicializar variables
        double totalVelocidad = 0;
        int cantRegistros = 0;
        
        // Recorrer el archivo línea por línea
        String linea;
        try {
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                String hora = campos[0];
                double velocidad = Double.parseDouble(campos[5]);
                
                // Calcular promedio solo para registros antes de las 11:56:00
                if (hora.compareTo("11:56:00") < 0) {
                    totalVelocidad += velocidad;
                    cantRegistros++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }
        
        // Calcular promedio
        if (cantRegistros > 0) {
            double promedioVelocidad = totalVelocidad / cantRegistros;
            System.out.println("El promedio de velocidad es: " + promedioVelocidad);
        } else {
            System.out.println("No se encontraron registros antes de las 11:56:00");
        }
        
        // Cerrar el archivo
        try {
            br.close();
        } catch (IOException e) {
            System.err.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama03;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicicleta bici1 = new Bicicleta(2, "Pedro Sanchez");
        Auto auto1 = new Auto(4, 4, "Juan Perez");
        Moto moto1 = new Moto(2, "Emanuel pepito");

        bici1.mostrar();
        System.out.println("-----------------------------------------------------------------------\n");
        auto1.mostrar();

        System.out.println("-----------------------------------------------------------------------\n");
        moto1.mostrar();

    }

}

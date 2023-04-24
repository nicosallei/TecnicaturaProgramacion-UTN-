/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama06;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        // Mafioso--------------------------------
        Mafioso mafioso1 = new Mafioso("Pedro","Escobar","Foto 1","Pedro en el campo",22);
        mafioso1.agregarPerfil(01,"Psicopata");
        mafioso1.agregarPerfil(02,"Agresivo");
        mafioso1.agregarPerfil(03,"Alto");
        mafioso1.agregarLugar("modesto lima","100", "Lujan");
        mafioso1.agregarLugar("Buenos aires","1536", "Buenos Aires, Argentina");
        mafioso1.agregarMedioDeComunicacion("Red social","Facebook");
        mafioso1.mostrar();
        // Detective----------------------------
        Detective detective1 = new Detective("124A21","Carlos","Sanchez","Foto perfil","Perfil",34);
        detective1.agregarMedioDeComunicacion("Red social","Facebook");
        detective1.agregarMedioDeComunicacion("Red social","Instagram");
        detective1.agregarMedioDeComunicacion("App de comunicacion","WhatsApp");
        detective1.agregarPerfil(11,"Seguro");
        detective1.agregarPerfil(14,"Fuerte");
        detective1.agregarPerfil(12,"Correcto");
        System.out.println(" ");
        detective1.mostrar();
        detective1.mostrarBusqueda(mafioso1);
       

    }
    
}

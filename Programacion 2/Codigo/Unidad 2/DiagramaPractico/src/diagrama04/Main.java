package diagrama04;


public class Main {

  
    public static void main(String[] args) {
       HondaXR25 moto1 = new HondaXR25(125,310);
       moto1.mostrar();
       moto1.esquivarObstaculo();
        System.out.println("-----------------------------");
       Boing747 avion1 = new Boing747(200,280);
       avion1.agregarViaje();
       avion1.agregarViaje();
       avion1.agregarViaje();
       avion1.agregarViaje();
       avion1.mostrar();
       avion1.despegar();
       avion1.aterrizar();
    
    }
    
}

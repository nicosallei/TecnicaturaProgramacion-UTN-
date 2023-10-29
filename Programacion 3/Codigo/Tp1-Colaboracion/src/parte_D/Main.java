
package parte_D;

/**
 * Nicolas sallei 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        /* 
        Barrio(long id, String nombre, String empresaConstructora)
        Vivienda(long id, String calle, int numeroCalle, double superficieTerreno)
        Habitacion(long id, String nombre, long metrosCuadrados)
*/
        
        Barrio barrio = new Barrio(1246,"Barrio Soler","Reconstructura V");
        
        Vivienda viv01 = new Vivienda(01,"diamante",120,800);
        Vivienda viv02 = new Vivienda(02,"diamante",135,1000);
        Vivienda viv03 = new Vivienda(03,"colorado",285,1400);
        Vivienda viv04 = new Vivienda(04,"colorado",235,2000);
        
        Habitacion hab01 = new Habitacion(1,"Pieza",60);
        Habitacion hab02 = new Habitacion(2,"Cocina",70);
        Habitacion hab03 = new Habitacion(3,"Living",100);
        Habitacion hab04 = new Habitacion (4,"Baño",30);
        
        
        barrio.addVivienda(viv01);
        barrio.addVivienda(viv02);
        barrio.addVivienda(viv03);
        barrio.addVivienda(viv04);
        
        viv01.addHabitacion(hab01);
        viv01.addHabitacion(hab04);
        viv01.addHabitacion(hab02);
        
        viv02.addHabitacion(hab01);
        viv02.addHabitacion(hab02);
        viv02.addHabitacion(hab03);
        viv02.addHabitacion(hab04);
        
        viv03.addHabitacion(hab01);
        viv03.addHabitacion(hab01);
        viv03.addHabitacion(hab02);
        viv03.addHabitacion(hab03);
        viv03.addHabitacion(hab04);
        viv03.addHabitacion(hab04);
        
        viv04.addHabitacion(hab01);
        viv04.addHabitacion(hab01);
        viv04.addHabitacion(hab01);
        viv04.addHabitacion(hab02);
        viv04.addHabitacion(hab03);
        viv04.addHabitacion(hab04);
        viv04.addHabitacion(hab04);
        viv04.addHabitacion(hab04);
        
        barrio.mostrar();
        System.out.println("-----------METODOS DE LA CLASE BARRIO---------\n");
        System.out.println("Superficie Cubierta del barrio");
        System.out.println(barrio.getSuperficieTotalCubierta());
        System.out.println("Superficie total del barrio");
        System.out.println(barrio.getSuperficieTotalTerreno());
        
        
    }

}

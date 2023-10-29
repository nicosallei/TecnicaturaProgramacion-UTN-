
package parte_C;


import java.util.List;
import util.FuncionApp;

/**
 * Nicolas sallei 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        
        Persona(String nombre, String tipoDocumento, long nroDocumento, int telefono, String email, String celular)
        Sector(int numero, String denominacion, String tipo)
        Actividad(Date fechaInicio, Date fechaFin, String nombre, String descripcion, TipoActividad tipoActividad, Persona persona)
        TipoActividad(int codigo, String denominacion, double puntosAsignados)
        
        */
       

        Persona per01 = new Persona("nicolas","Dni",39768444,491391145,"sallei@gmail.com","261458798");
        Persona per02 = new Persona("lautaro","Dni",38745681,4891245,"Lauta@gmail.com","26345879");
        Persona per03 = new Persona("Pedro","Dni",38775781,4891245,"Pedro@gmail.com","26348879");
        Persona per04 = new Persona("Juan","Dni",38745221,4833245,"Juan@gmail.com","26341179");
        
        
        Sector sec01 = new Sector(01,"A","Administracion");
        Sector sec02 = new Sector(02,"B","Legislacion");
        Sector sec03 = new Sector(03,"C","Contaduria");
        Sector sec04 = new Sector(04,"B","Presidencia");
        
        Actividad act01 = new Actividad(FuncionApp.convertirStringToDate("10-06-2023"),FuncionApp.convertirStringToDate("20-06-2023"),"Truco","Torneo de Truco");
        Actividad act02 = new Actividad(FuncionApp.convertirStringToDate("20-07-2022"),FuncionApp.convertirStringToDate("25-07-2022"),"Poker","Torneo de Poker");
        Actividad act03 = new Actividad(FuncionApp.convertirStringToDate("05-06-2023"),FuncionApp.convertirStringToDate("15-06-2023"),"Ajedrez","Torneo de Ajedrez");
        
        TipoActividad tipo01 = new TipoActividad(01,"A",285);
        TipoActividad tipo02 = new TipoActividad(02,"B",135);
        
        //Sector uso recursividad con sector
        
        sec01.addSector(sec04);
        sec01.addSector(sec02);
        sec04.addSector(sec03);
        
        // Sector le agrego personas
        
        sec01.addPersona(per01);
        sec01.addPersona(per04);
        sec02.addPersona(per02);
        sec03.addPersona(per03);
        sec03.addPersona(per02);
        sec04.addPersona(per04);
        
        // Personas le agrego una actividad
        
        per01.addActividad(act03);
        per01.addActividad(act02);
        per01.addActividad(act01);
        per02.addActividad(act01);
        per02.addActividad(act02); 
        per03.addActividad(act02);
        per03.addActividad(act01);
        per04.addActividad(act03);
        
        // Actividad le agrego tipo de Actividad
        act01.setTipoActividad(tipo01);
        act03.setTipoActividad(tipo01);
        act02.setTipoActividad(tipo02);
        
        // TipoActividad agrego actividad
        
        tipo01.addActividad(act03);
        tipo01.addActividad(act01);
        tipo02.addActividad(act02);
        
        
        System.out.println("---------Mostrando Sector 01---------------");
        sec01.mostrar();
        System.out.println("--------------------------------------------");
        System.out.println("-------Fin\n\n");
        
        System.out.println("-----mostrando sublista de sector designado");
        mostrar(sec01.obtenerTotalSubsectores());
        
        System.out.println("\n\n\n\n\n\n");
        
        System.out.println("pruebas con persona 1");
        System.out.println("Total de puntos asignado en actividad");
        System.out.println(per01.totalPuntosAsignados());
        System.out.println("Total de puntos asignado en actividad 01");
        System.out.println(per01.totalPuntosAsignados(01));
        System.out.println("Total de puntos asignado en actividad 02 y anio 2022");
        System.out.println(per01.totalPuntosAsignados(02,2022));
    }

    public static void mostrar(List<Sector> sect){

        for(Sector sec: sect){
            System.out.println("-> sector de sublista");
            System.out.println(" ");
        sec.mostrar();
        }
        
    
    
    }
    
    
}

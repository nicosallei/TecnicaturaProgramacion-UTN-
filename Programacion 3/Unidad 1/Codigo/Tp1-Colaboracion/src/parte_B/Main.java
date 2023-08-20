
package parte_B;

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
        
        /*
        Asistencia(long id, String tipo, Date fecha, int hora, int minuto)
        Tardanza(long id, String tipo, Date fecha, int minuto,int hora)
        Empleado(String nombre, long cuit, String domicilio, String email)
        RegimenHorario(long id, int horaIngreso, int minutoIngreso, int horaEgreso, int minutoEgreso)
        
        
        */
        
        Empleado empleado = new Empleado("Nicolas",2039784518,"Lujan de cuyo","nicolas@gmail.com");
        RegimenHorario horario = new RegimenHorario(1,11,00,20,30);
        //Tardanza tar01 = new Tardanza();
        Asistencia asi01 = new Asistencia(21,"E",FuncionApp.convertirStringToDate("18-08-2023"),12,00);
        Asistencia asi02 = new Asistencia(22,"S",FuncionApp.convertirStringToDate("18-08-2023"),11,05);
        Asistencia asi03 = new Asistencia(23,"S",FuncionApp.convertirStringToDate("18-08-2023"),11,30);
        Asistencia asi04 = new Asistencia(24,"E",FuncionApp.convertirStringToDate("18-08-2023"),11,10);
        
        empleado.setRegimenHorario(horario);
        empleado.addAsistencia(asi04);
        empleado.addAsistencia(asi03);
        empleado.addAsistencia(asi02);
        empleado.addAsistencia(asi01);
        
        empleado.getDiasConTardanza(8,2023);
        empleado.mostrar();
        
        
        
        
    }

    public static void mostrarAsistencia(List<Asistencia> asis){
    
        for(Asistencia as: asis){
        
            System.out.println("Asistencia ID: "+as.getId());
            System.out.println("Tipo: "+as.getTipo());
            System.out.println("Fecha "+FuncionApp.convertirDateToString(as.getFecha()));
            System.out.println("Minuto: "+as.getMinuto());
            System.out.println("Hora: "+as.getHora());
            
        }
    
    }
    
    public static void mostrarTardanza(List <Tardanza> tard){
    
        for(Tardanza tar: tard){
        
        System.out.println("Tardanza ID: "+tar.getId());
        System.out.println("Tipo: "+tar.getTipo());
        System.out.println("Fecha "+FuncionApp.convertirDateToString(tar.getFecha()));
        System.out.println("Minuto: "+tar.getMinuto());
        System.out.println("Hora: "+tar.getHora());
            
        }
        
    
    }
    
    
    
}

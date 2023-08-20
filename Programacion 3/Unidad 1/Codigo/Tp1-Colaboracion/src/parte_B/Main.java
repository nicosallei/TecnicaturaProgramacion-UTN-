
package parte_B;

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
        RegimenHorario horario = new RegimenHorario(01,13,00,21,30);
        Tardanza tar01 = new Tardanza();
        Asistencia asi01 = new Asistencia();
        
    }

}

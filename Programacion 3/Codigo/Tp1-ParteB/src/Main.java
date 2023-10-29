
import Util.FuncionApp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**     Constructores Sobrecargados
 * 
 *Domicilio(int idDomicilio, String localidad, String calle, int numero)
 * 
 *Medico(int idMedico, int matricula, long celular, int idPersona, String nombre, String apellido, long dni)
 * 
 *Paciente(int idPaciente, int nroSocio, int idPersona, String nombre, String apellido, long dni)
 * 
 *Empleado(int idEmpleado, int nroLegajo, double sueldo, int idPersona, String nombre, String apellido, long dni) 
 * 
 *Especialidad(int idEspecialidad, String denominacion)
 * 
 *Turno(int idTurno, Date fecha, int hora, int minutos, Paciente paciente, Medico medico) 
 * 
 *HistoriaClinica(int idHistoriaClinica, int numero, Date fechaAlta) 
 * 
 *DetalleHistoriaClinica(int idDetalleHC, Date fechaAtencion, String sintomas, String diagnostico, String observaciones) 
 * 
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Domicilio dom01= new Domicilio(45,"Lujan","Patricio",124);
        Domicilio dom02= new Domicilio(46,"Maipu","Sarmiento",2487);
        Domicilio dom03= new Domicilio(47,"Godoy Cruz","San martin",458);
        Domicilio dom04= new Domicilio(48,"Mendoza","San lorenzo",912);
        
        
        Medico doc01 = new Medico(01,1245,26154587,11,"Pedro","Gomez",289468756);
        Medico doc02 = new Medico(02,2586,26444587,12,"Maio","Ramos",284217756);
        
        Paciente pac01 = new Paciente(21,144,13,"Pablo","Gonzales",345789641);
        Paciente pac02 = new Paciente(24,1879,14,"Maria","Gimenez",445778949);
        
        Especialidad esp01 = new Especialidad(87,"Pediatra");
        Especialidad esp02 = new Especialidad(99,"Cirujano");
        Especialidad esp04 = new Especialidad(206,"Dermatologo");
        Especialidad esp05 = new Especialidad(6,"Medico");
        
        
        HistoriaClinica hist01 = new HistoriaClinica(31,61,FuncionApp.convertirStringToDate("29-02-2022"));
        HistoriaClinica hist02 = new HistoriaClinica(32,55,FuncionApp.convertirStringToDate("28-04-2022"));
        
        
        DetalleHistoriaClinica det01 = new DetalleHistoriaClinica(241,FuncionApp.convertirStringToDate("15-02-2022"),"Dolor de panza","intoxicacion","Reposo y comida sana");
        DetalleHistoriaClinica det02 = new DetalleHistoriaClinica(241,FuncionApp.convertirStringToDate("25-04-2022"),"Dolor de cabeza","Migraña","tomar tafirol");
        DetalleHistoriaClinica det03 = new DetalleHistoriaClinica(241,FuncionApp.convertirStringToDate("05-06-2021"),"Fiebre","anginas","Reposo y medicacion");
        
        
        Turno turn01 = new Turno(01,FuncionApp.convertirStringToDate("18-08-2023"),16,15,pac01,doc01);
        Turno turn02 = new Turno(02,FuncionApp.convertirStringToDate("19-08-2023"),12,30,pac02,doc02);
        Turno turn03 = new Turno(03,FuncionApp.convertirStringToDate("25-08-2023"),18,20,pac01,doc01);
        
        doc01.addTurno(turn01);
        doc01.addTurno(turn03);
        doc02.addTurno(turn02);
        
        doc01.addEspecialidad(esp05);
        doc01.addEspecialidad(esp01);
        doc01.addEspecialidad(esp04);
        doc02.addEspecialidad(esp05);
        doc02.addEspecialidad(esp02);
        
        doc01.setDomicilio(dom04);
        doc02.setDomicilio(dom03);
        
        pac01.addTurno(turn01);
        pac01.addTurno(turn03);
        pac02.addTurno(turn02);
        
        pac01.setDomicilio(dom02);
        pac02.setDomicilio(dom01);
        
        pac01.setHistoriaClinica(hist01);
        pac02.setHistoriaClinica(hist02);
        
        hist01.addDetalleHistoriaClinica(det03);
        hist01.addDetalleHistoriaClinica(det01);
        hist02.addDetalleHistoriaClinica(det02);
        
        System.out.println("--- PRUEBA EN MOSTRAR MEDICO ---\n");
        doc01.mostrarMedico();
        doc01.mostrarTurnos();
        System.out.println("---  FIN PRUEBA ---");
        
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("***************************************");
        
        System.out.println("----  PRUEBA EN MOSTRAR PACIENTE  ----\n");
        pac01.mostrarPaciente();
        pac01.mostrarHistorialClinico();
        pac01.mostrarTurnos();
        
        
        
        
    }
    
}


import Util.FuncionApp;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Paciente extends Persona {
    
    private int idPaciente;
    private int nroSocio;
    
    private HistoriaClinica historiaClinica;
    private ArrayList<Turno> turno = new ArrayList();

    public Paciente() {
    }

    public Paciente(int idPaciente, int nroSocio) {
        this.idPaciente = idPaciente;
        this.nroSocio = nroSocio;
    }

    public Paciente(int idPaciente, int nroSocio, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.idPaciente = idPaciente;
        this.nroSocio = nroSocio;
    }
    
    
    
    public void mostrarPaciente(){
    
        System.out.println("---- Paciente ----\n");
        System.out.println("Paciente ID: "+this.getIdPaciente());
        System.out.println("Numero Socio: "+this.getNroSocio()+"\n");
        
        System.out.println("Apellido y Nombre: "+this.getApellido()+" "+this.getNombre());
        System.out.println("DNI: "+this.getDni());
        System.out.println("Localidad: "+this.getDomicilio().getLocalidad()+" Calle: "+this.getDomicilio().getCalle()+" Numero: "+this.getDomicilio().getNumero()+"\n");
        
    }
    public void mostrarHistorialClinico(){
    
        System.out.println("Hitoria Clinica ID: "+this.getHistoriaClinica().getIdHistoriaClinica());
        System.out.println("Fecha Alta: "+FuncionApp.convertirDateToString(this.getHistoriaClinica().getFechaAlta())+"\n");
        
        System.out.println("-----  Detalle Hitoria Clinica  -----\n");
        
        for(DetalleHistoriaClinica detalle: this.historiaClinica.getDetalleHistoriaClinica()){
        
        detalle.mostrarDetalle();
        }
    }
    
    public void mostrarTurnos(){
    
    for(Turno tur: turno){
    
    tur.mostrar();
    tur.getMedico().mostrarMedico();
    
    }
    
    }
    
    
    
    
    public void addTurno(Turno turn){
    this.turno.add(turn);
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public ArrayList<Turno> getTurno() {
        return turno;
    }

    public void setTurno(ArrayList<Turno> turno) {
        this.turno = turno;
    }
    
    
    
    
}

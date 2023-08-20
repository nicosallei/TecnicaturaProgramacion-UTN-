package modelo;



import jakarta.persistence.*;
import util.FuncionApp;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
public class Medico extends Persona {
    
    @Id
    @Column(name="Id")
    private int idMedico;
    @Column(name="Matricula")
    private int matricula;
    @Column(name="Celular")
    private long celular;
    
    private ArrayList<Turno> turno = new ArrayList();
    private ArrayList<Especialidad> especialidad = new ArrayList();

    public Medico() {
    }

    public Medico(int idMedico, int matricula, long celular) {
        this.idMedico = idMedico;
        this.matricula = matricula;
        this.celular = celular;
    }

    public Medico(int idMedico, int matricula, long celular, int idPersona, String nombre, String apellido, long dni) {
        super(idPersona, nombre, apellido, dni);
        this.idMedico = idMedico;
        this.matricula = matricula;
        this.celular = celular;
    }
    
    
    
    
    public void mostrarMedico(){
        System.out.println("-----  Medico   ----\n");
        System.out.println("Medico ID: "+this.getIdMedico());
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Celular: "+this.getCelular()+"\n");
        
        System.out.println("----Persona----\n");
        System.out.println("Persona ID: "+this.getIdPersona());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("DNI: "+this.getDni()+"\n");
        
        System.out.println("--------Domicilio--------\n");
        System.out.println("Domicilio ID: "+this.getDomicilio().getIdDomicilio());
        System.out.println("Localidad: "+this.getDomicilio().getLocalidad());
        System.out.println("Calle: "+this.getDomicilio().getCalle());
        System.out.println("Numero: "+this.getDomicilio().getNumero()+"\n");
        
        System.out.println("--------  Especialidades Medico  ---------\n");
        for(Especialidad esp: especialidad){
            System.out.println("Especialidad ID: "+esp.getIdEspecialidad());
            System.out.println("Denominacion: "+esp.getDenominacion());
            System.out.println("---    ---\n");

        }
        
        
    }
    
    public void mostrarTurnos(){
    
    for(Turno tur: turno){
        
        System.out.println("---  Turno  ---\n");
        System.out.println("Turno ID: "+tur.getIdTurno());
        System.out.println("Fecha: "+FuncionApp.convertirDateToString(tur.getFecha()));
        System.out.println("Hora: "+tur.getHora()+":"+tur.getMinutos()+"\n");
        
        tur.getPaciente().mostrarPaciente();
  
        
    }
    
    }
    
    
    
    
    public void addTurno(Turno turn){
    this.turno.add(turn);
    }
    
    public void addEspecialidad(Especialidad especi){
    this.especialidad.add(especi);
    especi.addMedico(this);
    }

    @Id
    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    
    @OneToMany(mappedBy = "medico",cascade = CascadeType.ALL)
    public ArrayList<Turno> getTurno() {
        return turno;
    }

    public void setTurno(ArrayList<Turno> turno) {
        this.turno = turno;
    }

    @ManyToMany(fetch = FetchType.LAZY,
     targetEntity = Especialidad.class,
     cascade=CascadeType.ALL)
    @JoinTable(
            name = "MEDICO_ESPECIALIDAD",
            joinColumns = @JoinColumn(name="MEDICO_ID"),
            inverseJoinColumns = @JoinColumn(name="TIPO_ESPECIALIDAD_ID")
    )
    public ArrayList<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(ArrayList<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }
    
    
}

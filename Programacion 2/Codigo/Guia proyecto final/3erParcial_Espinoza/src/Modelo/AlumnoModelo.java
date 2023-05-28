package Modelo;

import Datos.AlumnoDAO;
import java.util.ArrayList;
import javax.swing.JTable;



public class AlumnoModelo {
    private long dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String telefono;
    private AlumnoDAO alumnoDAO = new AlumnoDAO();

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    public boolean validaDNI(String a){
        
         try{
           dni = Long.parseLong(a);
          return false;
        }catch(NumberFormatException nfe){
            return true;
        }
    }
    
   public boolean dniRepetido(AlumnoModelo alumno){
       return !alumnoDAO.dniRepetidoDAO(alumno);
    } 
    
    
   public boolean validaCarga(String a){
         if(a.length()==0){
             return true;
         }else{
             return false;
         }
     }
   
   public boolean cargaDatos(AlumnoModelo alumno){
  
       return alumnoDAO.cargaDatosDAO(alumno);
       
   }
   
   public ArrayList<Modelo.AlumnoModelo> traeAlumnos(){
       return alumnoDAO.traeAlumnosDAO();       
   }
   
   public boolean baja(JTable tabla){
       return alumnoDAO.bajaDAO(tabla);
       
   }
   public boolean modifica(AlumnoModelo alumno){
       return alumnoDAO.modificaDAO(alumno);
   }
   
   
   
  }

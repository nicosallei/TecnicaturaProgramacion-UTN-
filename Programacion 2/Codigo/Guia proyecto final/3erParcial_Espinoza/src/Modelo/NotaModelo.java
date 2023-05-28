package Modelo;

import java.util.ArrayList;
import javax.swing.JTable;

public class NotaModelo {
    private int nota;
    private AlumnoModelo alumno;
    private MateriaModelo materia;
    private Datos.NotaDAO notaDAO = new Datos.NotaDAO();

    public NotaModelo(int nota, AlumnoModelo alumno, MateriaModelo materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public NotaModelo() {
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public AlumnoModelo getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoModelo alumno) {
        this.alumno = alumno;
    }

    public MateriaModelo getMateria() {
        return materia;
    }

    public void setMateria(MateriaModelo materia) {
        this.materia = materia;
    }
    
    public boolean validaCarga(String a){
         if(a.length()==0){
             return true;
         }else{
             return false;
         }
     }
    
    public ArrayList <NotaModelo> traeNotas(){
        return notaDAO.traeNotasDAO();
    }
    
    public ArrayList<String> traeDNIAlumno(){
        return notaDAO.traeDNIAlumnoDAO();
    }
    
    public Modelo.AlumnoModelo traeAlumno(Long dni) {
        this.alumno = notaDAO.traeAlumnoDAO(dni);
        return this.alumno;
    }
 
    public ArrayList<String> traeCodigoMateria(){
        return notaDAO.traeCodigoMateriaDAO();
    }
    
    public Modelo.MateriaModelo traeMateria(int codigo){
        this.materia = notaDAO.traeMateriaDAO(codigo);
        return this.materia;
    }
    
    
    public boolean cargaDatos(Modelo.NotaModelo nota) {
        return notaDAO.cargaDatosDAO(nota);
    }
    
    public boolean baja(JTable tabla){
        return notaDAO.bajaDAO(tabla);
    }
    
     public boolean modifica(Modelo.NotaModelo nota){
         return notaDAO.modificaDAO(nota);
     }
     
      public boolean notaRepetida(Modelo.NotaModelo nota){
          return !notaDAO.notaRepetida(nota);
      }
      
      public boolean validaNota(int nota){
          if(nota>=1 && nota<=10){
              return true;
          }else{
              return false;
          }
      }
     
}

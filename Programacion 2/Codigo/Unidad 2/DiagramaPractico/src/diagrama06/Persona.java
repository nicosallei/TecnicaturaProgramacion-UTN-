package diagrama06;

import java.util.ArrayList;
import java.util.List;


public class Persona {
    private String nombre;
    private String apellido;
    private Foto foto;
    private List<MedioDeComunicacion> comunicaciones = new ArrayList<MedioDeComunicacion>();
    private List<Perfil> perfiles = new ArrayList<Perfil>();

    public Persona(String nombre, String apellido,String pathToFile, String nombreFoto, float tamaño) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = new Foto(pathToFile,nombreFoto,tamaño);
    }

    public void agregarMedioDeComunicacion(MedioDeComunicacion comunicacion){
       this.comunicaciones.add(comunicacion);
    }
     public void agregarMedioDeComunicacion(String descripcion, String medio){
       this.comunicaciones.add(new MedioDeComunicacion(descripcion,medio));
    }
    
    
    public void agregarPerfil(Perfil perfil){
    this.perfiles.add(perfil);
    }
    
    public void agregarPerfil(int tipoPerfil,String descripcion){
        
       this.perfiles.add(new Perfil(tipoPerfil,descripcion));
    }
    public void agregarPerfil2(int tipoPerfil,String descripcion){
    
        this.perfiles.add(new Perfil(tipoPerfil,descripcion));
    }
    public boolean quitarPerfil(int indice){
    
        if(perfiles.get(indice)!=null){
        perfiles.remove(indice);
        return true;
        }
    return false;
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

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public List<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }

    public void setComunicaciones(List<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
    
}

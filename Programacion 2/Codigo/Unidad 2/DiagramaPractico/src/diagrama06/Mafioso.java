/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Mafioso extends Persona implements Investigable {

    private List<Lugar> lugaresFrecuentes;

    public Mafioso(String nombre, String apellido, String pathToFile, String nombreFoto, float tamaño) {
        super(nombre, apellido, pathToFile, nombreFoto, tamaño);
    }

    public void agregarLugar(Lugar lugar) {
        if (this.lugaresFrecuentes == null) {
            this.lugaresFrecuentes = new ArrayList<Lugar>();
            this.lugaresFrecuentes.add(lugar);
        }
        this.lugaresFrecuentes.add(lugar);
    }
    
    public void agregarLugar(String calle, String numeroCalle, String nom) {
        if (this.lugaresFrecuentes == null) {
            this.lugaresFrecuentes = new ArrayList<Lugar>();
        }
        this.lugaresFrecuentes.add(new Lugar(calle,numeroCalle,nom));
    }
    

    public List<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    public void setLugaresFrecuentes(List<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    @Override
    public boolean investigar() {
        return true;
    }

    public void mostrar(){
        System.out.println("--------------------MAFIOSO--------------------\n");
        System.out.println("Nombre del mafioso: "+getNombre()+", "+getApellido());
        System.out.println("Foto:  -- -- --");
        System.out.println("PathTofile: "+getFoto().getPathToFile()+", Nombre: "+getFoto().getNombre()+", Tamaño: "+getFoto().getTamaño());
       
        for(Perfil perfil: getPerfiles()){
            System.out.println("---------------------------------");
            System.out.println("Tipo de perfil: "+perfil.getTipoPerfil()+", Descripcion: "+perfil.getDesripcion());
        }
        
    
        for (MedioDeComunicacion comunicacion : getComunicaciones()){
            System.out.println("-----------------------------------");
            System.out.println("Medio de comunicacion: "+comunicacion.getTipoMedio().getMedio());
            System.out.println("Descripcion del medio de comunicacion: "+comunicacion.getDescripcion());  
                
        }
        System.out.println("\n*************************************");
        System.out.println("Lugares Frecuentes:");
        System.out.println("*************************************");
        for(Lugar lugar: getLugaresFrecuentes()){
            System.out.println(" ");
            System.out.println("Nombre del lugar: "+lugar.getNombre()+", Calle: "+lugar.getCalle()+" numero: "+lugar.getNumeroDeCalle());
        }
    }
    
}

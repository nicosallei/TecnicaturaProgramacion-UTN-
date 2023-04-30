package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class Region {
    private String aspectosSocioCulturales;
    private String nivelGrupal;
    private String nivelPersonal;
    private String parteEspecificaDelPais;
    private ArrayList<Problemas> problemas = new ArrayList();
    private List<Necesidades> necesidades = new ArrayList();
    private List<Universidad> universidades = new ArrayList();

    public Region(String aspectosSocioCulturales, String nivelGrupal, String nivelPersonal, String parteEspecificaDelPais) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
        this.nivelGrupal = nivelGrupal;
        this.nivelPersonal = nivelPersonal;
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public Region() {
    }
    
    public void addProblemas(Problemas problemas){
    this.problemas.add(problemas);
    }
    public void removeProblemas(int lugar){
    this.problemas.remove(lugar);
    }
   public void addNecesidades (Necesidades necesidades){
   this.necesidades.add(necesidades);
   }
   public void removeNecesidades (int lugar){
   this.necesidades.remove(lugar);
   }
   public void addUniversidades (Universidad universidad){
   this.universidades.add(universidad);
   } 
   public void removeUniversidades(int lugar){
   this.universidades.remove(lugar);
   }

    public String getAspectosSocioCulturales() {
        return aspectosSocioCulturales;
    }

    public void setAspectosSocioCulturales(String aspectosSocioCulturales) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
    }

    public String getNivelGrupal() {
        return nivelGrupal;
    }

    public void setNivelGrupal(String nivelGrupal) {
        this.nivelGrupal = nivelGrupal;
    }

    public String getNivelPersonal() {
        return nivelPersonal;
    }

    public void setNivelPersonal(String nivelPersonal) {
        this.nivelPersonal = nivelPersonal;
    }

    public String getParteEspecificaDelPais() {
        return parteEspecificaDelPais;
    }

    public void setParteEspecificaDelPais(String parteEspecificaDelPais) {
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public ArrayList<Problemas> getProblemas() {
        return problemas;
    }

    public void setProblemas(ArrayList<Problemas> problemas) {
        this.problemas = problemas;
    }

    public List<Necesidades> getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(List<Necesidades> necesidades) {
        this.necesidades = necesidades;
    }

    public List<Universidad> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(List<Universidad> universidades) {
        this.universidades = universidades;
    }
    
    
}

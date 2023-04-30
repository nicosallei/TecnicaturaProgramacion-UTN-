package evaluacionprueba;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    private String cunaDelConocimiento;
    private String diferentesCarreras;
    private String privada;
    private String publica;
    
    private List<Region> regiones = new ArrayList();
    private List<Estudiante> estudiantes = new ArrayList();
    private List<PersonalDocente> personalDocentes = new ArrayList();
    private RecoleccionDeInformacion recoleccionDeInformacion;  

    public Universidad(String cunaDelConocimiento, String diferentesCarreras, String privada, String publica, RecoleccionDeInformacion recoleccionDeInformacion) {
        this.cunaDelConocimiento = cunaDelConocimiento;
        this.diferentesCarreras = diferentesCarreras;
        this.privada = privada;
        this.publica = publica;
        this.recoleccionDeInformacion = recoleccionDeInformacion;
    }

    public Universidad() {
    }

    public void addRegion (Region region){
    this.regiones.add(region);
    }
    public void removeRegion (int lugar){
    this.regiones.remove(lugar);
    }
    
    public void addEstudiante(Estudiante estudiante){
    this.estudiantes.add(estudiante);
    }
    public void removeEstudiante(int lugar){
    this.estudiantes.remove(lugar);
    }
    
    public void addPersonalDocente(PersonalDocente personalDocente){
    this.addPersonalDocente(personalDocente);
    }
    public void removePersonalDocente(int lugar){
    this.personalDocentes.remove(lugar);
    }
    
    public String getCunaDelConocimiento() {
        return cunaDelConocimiento;
    }

    public void setCunaDelConocimiento(String cunaDelConocimiento) {
        this.cunaDelConocimiento = cunaDelConocimiento;
    }

    public String getDiferentesCarreras() {
        return diferentesCarreras;
    }

    public void setDiferentesCarreras(String diferentesCarreras) {
        this.diferentesCarreras = diferentesCarreras;
    }

    public String getPrivada() {
        return privada;
    }

    public void setPrivada(String privada) {
        this.privada = privada;
    }

    public String getPublica() {
        return publica;
    }

    public void setPublica(String publica) {
        this.publica = publica;
    }

    public List<Region> getRegiones() {
        return regiones;
    }

    public void setRegiones(List<Region> regiones) {
        this.regiones = regiones;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<PersonalDocente> getPersonalDocentes() {
        return personalDocentes;
    }

    public void setPersonalDocentes(List<PersonalDocente> personalDocentes) {
        this.personalDocentes = personalDocentes;
    }

    public RecoleccionDeInformacion getRecoleccionDeInformacion() {
        return recoleccionDeInformacion;
    }

    public void setRecoleccionDeInformacion(RecoleccionDeInformacion recoleccionDeInformacion) {
        this.recoleccionDeInformacion = recoleccionDeInformacion;
    }
    
    
}

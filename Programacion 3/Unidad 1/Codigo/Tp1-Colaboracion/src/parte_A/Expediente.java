/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_A;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Expediente {
    
    private int id;
    private String letra;
    private int numero;
    private String tipo;
    private String ambito;
    private String descripcion;
    
    
    
    private ArrayList<Expediente> expediente = new ArrayList();
    private ArrayList<Control> control = new ArrayList();

    public Expediente() {
    }

    public void addExpediente(Expediente exp){
    this.expediente.add(exp);
    }
    public void addControl(Control control){
    this.control.add(control);
    control.addExpediente(this);
    }
    
    //  Metodo A.1
    public String getCaratulaExpediente(){
    String concatenacion=String.valueOf(this.getNumero())+"-"+this.getLetra()+"-"+this.getDescripcion();
    return concatenacion;
    }
    // Metodo A.2
    public String getControlesObligatorios(){
    List<String> denominacionControles = new ArrayList();
    for(Control cont: control){
    denominacionControles.add(cont.getDenominacion());
    }
    return String.join(", ",denominacionControles);
    }
   
    // Metodo A.3
    public boolean getEstadoControles(){
        boolean bandera=true;
        for(Control cont:control){
        if(cont.isEsObligatorio()==false){
        bandera=false;
        break;
        }
        }
    return bandera;
    }
    
    // Metodo A.4
    public List<Expediente> listaExpedientes(){
    List<Expediente> lista = new ArrayList();
    
    for(Expediente exp:expediente){
    lista.add(exp);
    }
    return lista;
    }
    
    // Metodo A.4.Prueba
    
    public List<Expediente> listaExpedientePrueba(){
    List<Expediente> lista = new ArrayList();
    listaExpedienteRecursivo(this, lista);
    return lista;
    }
    
    public void listaExpedienteRecursivo(Expediente expediente, List<Expediente> lista){
    lista.add(expediente);
    if(expediente.getExpediente()!=null){
    for(Expediente exp: expediente.expediente){
    listaExpedienteRecursivo(exp, lista);
    }
    }
    }
 
    ////////////////////////Fin prueba
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public ArrayList<Expediente> getExpediente() {
        return expediente;
    }

    public void setExpediente(ArrayList<Expediente> expediente) {
        this.expediente = expediente;
    }

    public ArrayList<Control> getControl() {
        return control;
    }

    public void setControl(ArrayList<Control> control) {
        this.control = control;
    }

    
}

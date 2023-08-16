/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp7;

import java.util.*;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class Computadora {
    
private String marca;
private String modelo;

private List<HashSet> computadorass;

    public List<HashSet> getComputadorass() {
        return computadorass;
    }

    public void setComputadorass(List<HashSet> computadorass) {
        this.computadorass = computadorass;
    }

HashSet<ComponenteCPU> componenCPU; 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<ComponenteCPU> getComponenCPU() {
        return componenCPU;
    }

    public void setComponenCPU(HashSet<ComponenteCPU> componenCPU) {
        this.componenCPU = componenCPU;
    }

  public void addcomponenCPU(ComponenteCPU componente) {
        if(this.componenCPU == null){
            this.componenCPU = new HashSet<ComponenteCPU>();
        }
        this.componenCPU.add(componente);
    }
public void addcomputadorass (HashSet compu){
if(this.computadorass == null){
            this.computadorass = new ArrayList<HashSet>();
        }
        this.computadorass.add(compu);


}
   

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
public class Computadora extends EntityBean {
    
    
    private String codigo;
    private String marca;
    private String modelo;

    private List<Componente> componente;
    
    public Computadora() {
    }

    public Computadora(String codigo, String marca, String modelo) {
        
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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

    public List<Componente> getComponente() {
        return componente;
    }

    public void setComponente(List<Componente> componente) {
        this.componente = componente;
    }
    
    
    
    
}

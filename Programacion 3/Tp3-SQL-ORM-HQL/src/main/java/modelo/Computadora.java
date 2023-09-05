/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 *
 * @author Nicolas Sallei Correa
 */
@Entity
public class Computadora extends EntityBean {
    
    
    private String codigo;
    private String marca;
    private String modelo;

    private List<Componente> componente = new ArrayList();
    
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
    
    @OneToMany(mappedBy = "computadora", cascade = CascadeType.ALL)
    public List<Componente> getComponente() {
        return componente;
    }

    public void setComponente(List<Componente> componente) {
        this.componente = componente;
    }

    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import util.FuncionApp;

/**
 *
 * @author Gerardo
 */
@MappedSuperclass
public abstract class EntityApp extends EntityBean{
    
    protected Date fechaAlta;
    protected Date fechaBaja;
    protected Date fechaModificacion;
    
    @Column(nullable=false)
    //@Temporal(TemporalType.DATE)
    public Date getFechaAlta() {
            return fechaAlta;
    }
    public void setFechaAlta(Date fechaAlta) {
            this.fechaAlta = fechaAlta;
    }

    @Transient
    public String getStrFechaAlta() {
            if(this.getFechaAlta() != null)
                    return FuncionApp.getFormatDate(this.fechaAlta);

            return "";
    }
    
    @Column(nullable=false)
    //@Temporal(TemporalType.DATE)
    public Date getFechaModificacion() {
            return fechaModificacion;
    }
    public void setFechaModificacion(Date fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
    }

    @Transient
    public String getStrFechaModificacion() {
            if(this.getFechaModificacion() != null)
                    return FuncionApp.getFormatDate(this.fechaModificacion);

            return "";
    }

    //@Temporal(TemporalType.DATE)
    public Date getFechaBaja() {
            return fechaBaja;
    }
    public void setFechaBaja(Date fechaBaja) {
            this.fechaBaja = fechaBaja;
    }

    @Transient
    public String getStrFechaBaja() {
            if(this.getFechaBaja() != null)
                    return FuncionApp.getFormatDate(this.fechaBaja);

            return "";
    }
    
    
}

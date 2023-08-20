package modelo;

import java.util.Date;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;


@MappedSuperclass// clase padre de las entidades
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EntityBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected Long id;
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// gener.value = autonumerico; identity=sin repetir
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static String getIdentityPropery() {
        return "id";
    }
    
   

    
}

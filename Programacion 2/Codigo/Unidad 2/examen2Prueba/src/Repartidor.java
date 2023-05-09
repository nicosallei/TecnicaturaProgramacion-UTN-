import java.util.ArrayList;


public class Repartidor extends Persona {
    
    private int numeroRepartidor;
    private ArrayList<Delivery> deliverys =new ArrayList();

    public Repartidor(int numeroRepartidor, int dniPersona, String nombrePersona, String apellidoPersona) {
        super(dniPersona, nombrePersona, apellidoPersona);
        this.numeroRepartidor = numeroRepartidor;
        
    }

    public Repartidor(int numeroRepartidor) {
        this.numeroRepartidor = numeroRepartidor;
        
    }
    

    public Repartidor() {
        
     
    }

    public void addDelivery(Delivery delivery){
    this.deliverys.add(delivery);
    }

    public ArrayList<Delivery> getDeliverys() {
        return deliverys;
    }

    public void setDeliverys(ArrayList<Delivery> deliverys) {
        this.deliverys = deliverys;
    }
    
    
    public int getNumeroRepartidor() {
        return numeroRepartidor;
    }

    public void setNumeroRepartidor(int numeroRepartidor) {
        this.numeroRepartidor = numeroRepartidor;
    }

    public int getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(int dniPersona) {
        this.dniPersona = dniPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    
    


    
    
}

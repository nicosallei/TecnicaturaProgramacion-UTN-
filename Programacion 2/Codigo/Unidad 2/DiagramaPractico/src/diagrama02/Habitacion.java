package diagrama02;

import java.util.ArrayList;


public class Habitacion {
    private static int siguienteNumero =1;
    private int numero;
    private int numeroCama;
    private ArrayList<Cama> cama=new ArrayList<Cama>();
    public Habitacion(int numero) {
        this.numero = numero;
    }

   public void addCama(int n){
       this.numeroCama=this.numeroCama+n;
   
   }
    
    public void quitarCama(int posicion){
    this.cama.remove(this.cama.get(posicion));
    this.numeroCama--;
    this.siguienteNumero--;
    }

    public ArrayList<Cama> getCama() {
        return cama;
    }

    public void setCama(ArrayList<Cama> cama) {
        this.cama = cama;
    }
    
    public static int getSiguienteNumero() {
        return siguienteNumero;
    }

    public static void setSiguienteNumero(int siguienteNumero) {
        Habitacion.siguienteNumero = siguienteNumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}

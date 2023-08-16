
public class Fraccion {
    int numerador;
    int denominador;
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
     @Override
    public String toString() {
        
        return numerador + "/" + denominador;
    }
     
public Fraccion(){
}
 

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
   
     
    public Fraccion sumarFracciones(Fraccion f1,Fraccion f2) {

        Fraccion f = new Fraccion(); 
        f.setDenominador(f1.getDenominador() * f2.getDenominador());
        f.setNumerador((f2.getDenominador() * f1.getNumerador()) + (f2.getNumerador() * f1.getDenominador()));
        
        return f;
    }
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
      Fraccion f = new Fraccion();
       f.setDenominador(f1.getDenominador() * f2.getDenominador());
       f.setNumerador((f1.getNumerador() * f2.getDenominador()) - (f2.getNumerador() * f1.getDenominador()));
         
         
      return f;
}
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){

       Fraccion f = new Fraccion();

       f.setNumerador(f1.getNumerador() * f2.getNumerador());
       f.setDenominador(f1.getDenominador() * f2.getDenominador());
       
       return f;       
}
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        Fraccion f = new Fraccion();
        f.setNumerador(f1.getNumerador() * f2.getDenominador());
        f.setDenominador(f1.getDenominador() * f2.getNumerador());
        
return f;
}


    
}

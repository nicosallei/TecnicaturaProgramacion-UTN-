
package modelos;


public class Modelo {
    

    public boolean ValidaDato(String a){
        try{
           Double.parseDouble(a);
           return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
    
    public double Suma(double a, double b){
        return a+b;
    }
    
    public double Resta(double a, double b){
        return a-b;
    }
    
    public double Division(double a, double b){
        if(b == 0){
           return -1;
        }else{
           return a/b; 
        }
        
    }
    public double Multiplicacion(double a, double b){
    return a*b;
    }
    
    public double Pow (double a, double b){
    return Math.pow(a,b);
    }
    
    public double Raiz(double a,double b){
    return Math.pow(a,1/b);
    
    }
    
    
}


public class Recursividad22 {
  
    public int Suma(int numero){
    
        if(numero==0){
        
        return 0;
        }else{
        
        
        
        return Suma(numero/10)+numero%10;
        }
    
    
    }
    
    
}

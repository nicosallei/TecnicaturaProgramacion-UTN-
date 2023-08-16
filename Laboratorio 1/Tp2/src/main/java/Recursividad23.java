
public class Recursividad23 {
 public String cadenaInversa(String cadena, int longitud){
 if(longitud==0){
 
 return cadena.charAt(longitud)+"";
 
 }else{
 
 return cadena.charAt(longitud)+cadenaInversa(cadena,longitud-1);
 }
 
 
 
 }   
}

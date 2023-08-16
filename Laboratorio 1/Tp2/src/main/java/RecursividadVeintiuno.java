
public class RecursividadVeintiuno {
     public int Suma(int numero ){
        if(numero>=2){
           int resultado=numero+Suma(numero-1);
           
           return resultado;
        }
       return 1;
}
}
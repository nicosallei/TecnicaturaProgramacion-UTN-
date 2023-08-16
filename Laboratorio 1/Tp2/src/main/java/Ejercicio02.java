
public class Ejercicio02 {
  public static void main(String[]args){
      /*
    
   Si se le Asigna un valor a una variable fuera de rango lo que va a suceder es 
    que salte un error o el numero que de no sea el correcto, la unica forma de arreglarlo
    es poner el tipo de dato que le corresponde 
   
    */


    
    /* short numero = 98899999;
    
    En este caso si dejamos ese short nos tira un error de que no es valido porque 
    el valor es mayor del que acepta ese variable dato, por lo cual hago que se fuerce
    y se lo asigne igual y podemos ver el valor que nos entrega, si aumento mas el numero
    aun asi me tiraria error aun que fuerce el dato en la variable.
    
    */
    short numero = (short)988999999;
    
    System.out.println("Numero: "+ numero);
    System.out.println("Podemos ver que el numero que nos entrega al forzar ese tipo de dato nos da que el valor no corresponde ni un poco al dado");
    System.out.println("Lo que se podria hacer es ponerle el dato correspondiente a la variable para que entregue el mismo valor");
    
    /*
     
    En este caso podemos observar que si nos va a entregar el numero correspondiente
    
    */
    
    double numero2 = 988999999;
            
      System.out.println("Ahora podemos ver que si nos entrega el valor ingresado correspondiente");
      System.out.println("");
      System.out.println("Numero: "+ numero2);
    

}
    
}

package segundoejercicio;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Mes[] meses = Mes.values();
        
        System.out.println("Escribe un numero de dias");
        int dias = sc.nextInt();
        
        for(Mes mes:meses){
        
            if(mes.getNumDias()==dias){
                System.out.println(mes.toString());
            }
        
        }
        
    }
    
}

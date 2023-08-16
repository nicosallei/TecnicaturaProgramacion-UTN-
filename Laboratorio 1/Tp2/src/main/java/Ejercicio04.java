
import java.util.Scanner;


public class Ejercicio04 {
    public static void main(String[]args){
    
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el dinero dado");
        double dinero =sc.nextDouble();
        int a=0;
        // ------------Opcion numeroi 1----------------//
        /*
        int docientos=0, cien=0, cincuenta=0, veinte=0, diez=0, cinco=0, dos=0, uno=0, cincuentaCentavos=0, veinticincoCentavos=0, diezCentavos=0, cincuentaCentimos=0;
        do{
            if(dinero-200>=0){
                dinero = dinero -200;
                docientos =+ 1;
            }else{
            if(dinero-100>=0){
                dinero = dinero-100;
                cien =+1;}else{
            if(dinero-50>=0){
            dinero = dinero-50;
            cincuenta=+1;
            }else{
            if(dinero-20>=0){
            dinero = dinero-50;
            veinte =+1;
            }else{
            if(dinero-10>=0){
            dinero = dinero-10;
            diez =+1;
            
            }else{
            if(dinero-5>=0){
            dinero= dinero-5;
            cinco =+ 1;
            
            }else{
            if(dinero-2>=0){
            dinero= dinero-2;
            dos =+1;
            
            }else{
            if(dinero-1>=0){
            dinero = dinero-1;
            uno =+1;
            }else{
            if(dinero-0.50>=0){
            dinero = dinero-0.50;
            cincuentaCentavos =+1;
            }else{
            if(dinero-0.25>=0){
            dinero= dinero-0.25;
            veinticincoCentavos =+1;
            }else{
            if(dinero-0.10>=0){
            dinero = dinero-0.10;
            diezCentavos =+1;
            }else{
            if(dinero-0.05>=0){
            dinero= dinero-0.05;
            cincuentaCentimos =+1;
            }
            }
            }
            }           
            }
            }
            }
            }
            }
            }
            }
            }
            
        }while(dinero>0.05);
        
        System.out.println("Se necesitan la siguiente cantidad de billetes");
        System.out.println(docientos+ " billetes de 200");
        System.out.println(cien+" billetes de 100");
        System.out.println(cincuenta+" billetes de 50");
        System.out.println(veinte+" billetes de 20");
        System.out.println(diez+" billetes de 10");
        System.out.println(cinco+" billetes de 5");
        System.out.println(dos+" billetes de 2");
        System.out.println(uno+" billetes de 1");
        
        System.out.println(cincuentaCentavos+" monedas de 0.50");
        System.out.println(veinticincoCentavos+" monedas de 0.25");
        System.out.println(diezCentavos+" monedas de 0.10");
        System.out.println(cincuentaCentimos+" monedas de 0.05");
        */
        //------------Opcion 2------------------//
        while(dinero-200>=0){
            dinero=dinero-200;
            a++;
        }
        if(a>0){
        System.out.println(a+" billetes de 200");
        }
        a=0;
        while(dinero-100>=0){
            dinero = dinero-100;
            a++;
        }
        if(a>0){
        System.out.println(a+" billetes de 100");
        }
        a=0;
          while(dinero-50>=0){
              dinero=dinero-50;
              a++;
        }
          if(a>0){
        System.out.println(a+" billetes de 50");
        }
          a=0;
           while(dinero-20>=0){
               dinero=dinero-20;
               a++;
        }
           if(a>0){
        System.out.println(a+" billetes de 20");
        }
          a=0;
            while(dinero-10>=0){
                dinero=dinero-10;
                a++;
        }
            if(a>0){
        System.out.println(a+" billetes de 10");
        }
          a=0;
             while(dinero-5>=0){
                 dinero=dinero-5;
                 a++;
        }
             if(a>0){
        System.out.println(a+" billetes de 5");
        }
          a=0;
              while(dinero-2>=0){
                  dinero=dinero-2;
                  a++;
        }
              if(a>0){
        System.out.println(a+" billetes de 2");
        }
          a=0;
               while(dinero-1 >=0){
                   dinero= dinero-1;
                   a++;
        }
               if(a>0){
        System.out.println(a+" billetes de 1");
        }
          a=0;
                while(dinero-0.50>=0){
                    dinero=dinero-0.50;
                    a++;
        }
                if(a>0){
        System.out.println(a+" monedas de 0.50");
        }
          a=0;
                 while(dinero-0.25>=0){
                     dinero=dinero-0.25;
                     a++;
        }
                  if(a>0){
                 System.out.println(a+" monedas de 0.25");
        }
          a=0;
          
                  while(dinero-0.10>=0){
             dinero=dinero-0.10;
             a++;
        }if(a>0){
           System.out.println(a+" monedas de 0.10");
        }
          a=0;
                   while(dinero-0.05>=0){
                       dinero=dinero-0.05;
                       a++;
        }
                   if(a>0){
System.out.println(a+" monedas de 0.05");
        }
         
    }
    
}

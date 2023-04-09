package numterminados4;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
       TerminaEn4 te = new TerminaEn4();
       int array[] = new int[10];
       int [] array2={24,22,44,54,33,68,64,72,70,17};
        ArrayList<Integer> num = new ArrayList<>();
        int it = 0;
        for (int i = 0; i < 10; i++) {
            
                array[it] = i*i;
                num.add(i);
                it++;
            
        }
        System.out.print("La posicion de los numeros terminados en 4 son: ");
        for(int i=0;i<10;i++){
        if(te.buscandoNumero(array2[i])){
            System.out.print(i+1+" ");
        }
              
        }
        System.out.println(" "); 
        // ---------------ArrayList-------------------------
        ArrayList<Integer> cant = new ArrayList<>();
        it=0;
        for(Integer n:num){
            it++;
            
        if(te.buscandoNumero(n)){
        cant.add(it);
        }
        }
        
        for(Integer ca:cant){
            System.out.print("La posicion de los numeros terminados en 4, en el ArrayList son: ");
            System.out.print(ca+" ");
        }
            System.out.println(" ");
        }
        

    }



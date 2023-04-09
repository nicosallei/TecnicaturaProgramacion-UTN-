package repeticionesnummayor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Metodos me = new Metodos();

        // int array[] = new int[10];                    //arreglo cargado en el for
        // ArrayList<Integer> num = new ArrayList<>();  //ArrayList cargado en el for
        int[] array2 = {2, 2, 18, 5, 3, 18, 5, 7, 7, 1};

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(1);
        num2.add(8);
        num2.add(3);
        num2.add(1);
        num2.add(8);
        num2.add(5);
        /*
       // Carga de datos por el for
        
        int it = 0;
        for (int i = 0; i < 10; i++) {
                array[it] = i*i;
                num.add(i);
                it++;
        } 
         */

       
        System.out.print("El numero mayor del arreglo, ");me.cantidad(array2, me.mayor(array2));
        me.repeticionMayor(num2);
    }

}

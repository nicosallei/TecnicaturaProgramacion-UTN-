package numeroprimos2;

import java.util.ArrayList;
import java.util.Iterator;
import static numeromayorprimo.Main.numeroPrimo;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[10];
        ArrayList<Integer> num = new ArrayList<Integer>();
        int lugar = 0;
        for (int i = 100; i < 300; i++) {
            if (numeroPrimo(i)) {
                array[lugar] = i;
                num.add(i);
                lugar++;
                if (lugar == 10) {
                    break;
                }
            }
        }

        mostrarArreglo(array);
        System.out.println("-----------------------------------------------------");
        System.out.println("Ahora lo hacemos con el ArrayList y con el Iterator");
        System.out.println("-----------------------------------------------------");
        Iterator it = num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public static void mostrarArreglo(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }

}

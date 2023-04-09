package repeticionesnummayor;

import java.util.ArrayList;

public class Metodos {

    public int mayor(int x[]) {
        int mayor = 0;
        int y;
        for (int i = 0; i < x.length; i++) {

            if (x[i] > mayor) {

                mayor = x[i];
            }

        }
        return mayor;
    }

    public void cantidad(int x[], int mayor) {
        int it = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == mayor) {
                it++;
            }
        }
        System.out.println("Se repite: " + it);
    }

    public void repeticionMayor(ArrayList<Integer> x) {
        int mayor = 0, it = 0;
        for (Integer m : x) {
            if (m > mayor) {
                mayor = m;
            }
        }
        for (Integer m : x) {
            if (mayor == m) {
                it++;
            }
        }
        System.out.println("El numero mayor es: " + mayor + " y se repite: " + it);

    }

}

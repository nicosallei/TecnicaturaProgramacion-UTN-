package numeromayorprimo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = i + 1;
        }
        numeroMayorPrimo(num);

        //--------------ArrayList--------------------
        int valor = 0;
        int index = 0;
        ArrayList<Numero> numero = new ArrayList<Numero>();

        for (int i = 0; i < 10; i++) {
            numero.add(new Numero((i + i) + 3));
        }

        int ite = 0;
        for (Numero nu : numero) {
            ite++;
            if (numeroPrimo(nu.getValor())) {
                if (nu.getValor() > valor) {
                    valor = nu.getValor();
                    index = ite;
                }
            }
        }
        if (valor == 0) {
            System.out.println("No hay numero primo");
        } else {
            //index=numero.indexOf(valor)+1;
            System.out.println("El Mayor Numero primo es: " + valor);
            System.out.println("La posicion del Mayor numero primo es: " + index);
        }

    }

    public static void numeroMayorPrimo(int num[]) {
        int posicion = 0;
        int numeroMayor = 0;

        for (int i = 0; i < num.length; i++) {
            if (numeroPrimo(num[i])) {
                if (num[i] > numeroMayor) {
                    posicion = i;
                    numeroMayor = num[i];
                }
            }
        }
        if (numeroMayor == 0) {
            System.out.println("No hay numero primo");
        } else {
            posicion = posicion + 1;
            System.out.println("El numero mayor primo es: " + numeroMayor);
            System.out.println("El numero mayor primo esta en la posicion: " + posicion);
        }
    }

    public static boolean numeroPrimo(int x) {

        if (x == 0 || x == 1 || x == 4) {
            return false;
        }

        for (int i = 2; i < x / 2; i++) {

            if (x % i == 0) {
                return false;
            }

        }
        return true;

    }
}

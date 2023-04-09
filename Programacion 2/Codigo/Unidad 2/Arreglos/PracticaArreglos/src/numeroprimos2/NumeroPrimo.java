package numeroprimos2;

public class NumeroPrimo {

    public boolean numeroPrimo(int x) {

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

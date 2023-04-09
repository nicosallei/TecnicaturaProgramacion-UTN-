package numterminados4;

public class TerminaEn4 {

    public boolean buscandoNumero(int x) {

        while (true) {
            if (x > 10) {
                x = x - 10;
            } else {
                break;
            }
        }
        return x == 4;
    }
}

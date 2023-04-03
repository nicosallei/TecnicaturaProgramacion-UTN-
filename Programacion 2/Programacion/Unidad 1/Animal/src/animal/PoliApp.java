package animal;

public class PoliApp {

    public static void main(String[] args) {
        Gato gato = new Gato();
        Cucu cucu = new Cucu();
        hazleHablar(cucu);
        hazleHablar(gato);
    }

    static void hazleHablar(Parlanchin sujeto) {
        sujeto.habla();
    }

}

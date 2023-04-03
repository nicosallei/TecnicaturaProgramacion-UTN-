package programacion2_herencia_ejercicio_1;

public class CreacionVehiculos {

    public static void main(String[] args) {

        VehiculoTerrestre auto = new VehiculoTerrestre("manual", "mercedez", 2, 500, 280);
        VehiculoAereo avion = new VehiculoAereo();
        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();

        //--------- Una forma de cargar los datos por los metodos set
        avion.setAltitudMaxima(18555);
        avion.setAltura(15);
        avion.setPeso(10000);
        avion.setVelocidad(230);
        avion.setNombre("Avion Comercial");

        System.out.print("Sonido de un Avion: ");
        emitirSonido(avion);
        System.out.print("Sonido de un Auto: ");
        emitirSonido(auto);
        System.out.print("Sonido de un Piano: ");
        emitirSonido(piano);
        System.out.print("Sonido de una Guitarra: ");
        emitirSonido(guitarra);

    }

    static void emitirSonido(Ruido ob) {
        ob.sonido();
    }

}

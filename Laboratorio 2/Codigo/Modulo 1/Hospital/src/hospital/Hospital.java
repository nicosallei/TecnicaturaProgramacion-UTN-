package hospital;

import _commons.Persona;

public class Hospital {

    public static void main(String[] args) {

        CargaDeDatos datos = new CargaDeDatos();

        datos.carga();

        for (Persona personas : datos.getPersonas()) {

            System.out.println("nombre y apellido: " + personas.getNombre());
            System.out.println("Documento: " + personas.getDocumento());
            System.out.println("----------------------------");
            System.out.println("");
        }
    }
}

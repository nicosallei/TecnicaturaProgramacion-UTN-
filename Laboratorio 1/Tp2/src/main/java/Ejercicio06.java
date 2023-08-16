
public class Ejercicio06 {
    public static void main(String[]args){
    
    String frase = "La lluvia en Mendoza es escasa";
    int cantidadDeCaracteres = frase.replace(" ", "").length();
        System.out.println("La cantidad de caracteres (sin contar los espacios) es: "+ cantidadDeCaracteres);
    }
}

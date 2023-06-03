
package controladores;

/**
 * Nicolas sallei 
 */
public class Validador {

    //Validaciones Que Se Usan Para Varios Modelos, Alumno, Profesor, etc
    public boolean verificarDni(String dni) {
        //DNI Debe Contener 8 Caracteres, Ni Mas Ni Menos!
        return !(dni.length() > 8 || dni.length() < 8);
    }

    public boolean dniContieneLetras(String dni) {

        try {
            Integer.valueOf(dni);
            return true;//Si El DNI No Contiene Letras Retorna True
        } catch (NumberFormatException e) {
            return false;//Lo Contrario
        }
    }

    public boolean verificarTelefono(String tel) {
        //El Telefono No Puede Tener Mas De 12 Caracteres Alfanumericos
        //Por Ej. +2617684576
        return tel.length() <= 12;
    }

    public boolean validarNota(double nota) {
        return nota >= 1.0 && nota <= 10.0;

    }

    public boolean notaContieneLetras(String nota) {
        try {
            System.out.println("nota "+nota);
            Double.valueOf(nota);
            return true;//Si La Nota No Contiene Letras Retorna True
        } catch (NumberFormatException e) {
            return false;//Lo Contrario
        }
    }
    
}

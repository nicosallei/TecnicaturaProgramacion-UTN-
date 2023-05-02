/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionprueba;


public class Resultados {
    
    private String implementacionFinalizada;

    public Resultados() {
    }

    public Resultados(String implementacionFinalizada) {
        this.implementacionFinalizada = implementacionFinalizada;
    }

    public String getImplementacionFinalizada() {
        return implementacionFinalizada;
    }

    public void setImplementacionFinalizada(String implementacionFinalizada) {
        this.implementacionFinalizada = implementacionFinalizada;
    }

   
  public String efectosPositivosyNegativos() {
        if (implementacionFinalizada.equalsIgnoreCase("activo")) {
            return "Produce efectos Positivos en la sociedad";
        } else {
            return "Produce efectos Negativos en la sociedad";
        }
    }

    public String medidasDeSatisfaccionDeDiferentesAspectos() {
        if (implementacionFinalizada.equalsIgnoreCase("aprobado")) {
            return "Aprobado Satisfactoriamente";
        } if (implementacionFinalizada.equalsIgnoreCase("desaprobado")){
            return "Desaprobado";
        } else {
            return "No entregado";
        }   
 
}
}
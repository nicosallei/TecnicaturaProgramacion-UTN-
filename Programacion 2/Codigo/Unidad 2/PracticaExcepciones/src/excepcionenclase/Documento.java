/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionenclase;

/**
 *
 * @author nicos
 */
public class Documento {
    private String tipo;
    private String numero;

    public Documento(String tipo,String numero) throws Exception{
        if(tipo.equals("1"))
        {
        //chequear numero
            if(Integer.valueOf(numero)<90000 && Integer.valueOf(tipo)>50000000)
            
        this.tipo = tipo;
        this.numero = numero;
        }
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


   

  
    
}

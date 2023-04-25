package excepcionenclase;


public class Documento {

    private String tipo;
    private String numero;

    public Documento(String tipo, String numero) throws Exception {
        if (tipo.equals("1")) {
            //chequear numero
            if (Integer.valueOf(numero) < 90000 && Integer.valueOf(tipo) > 50000000) {
                throw new Exception();
            }

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}

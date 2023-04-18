package diagrama04;


public class Rueda {
    
    
    private double presion;
    private String rodado;

    public Rueda(double presion, String rodado) {
        
        this.presion = presion;
        this.rodado = rodado;
    }


    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }
    
}

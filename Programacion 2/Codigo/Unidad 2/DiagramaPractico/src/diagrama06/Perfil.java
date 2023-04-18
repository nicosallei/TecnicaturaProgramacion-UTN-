package diagrama06;


public class Perfil {
    
    private int tipoPerfil;
    private String desripcion;

    public Perfil(int tipoPerfil, String desripcion) {
        this.tipoPerfil = tipoPerfil;
        this.desripcion = desripcion;
    }

    public int getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    public String getDesripcion() {
        return desripcion;
    }

    public void setDesripcion(String desripcion) {
        this.desripcion = desripcion;
    }
    
}

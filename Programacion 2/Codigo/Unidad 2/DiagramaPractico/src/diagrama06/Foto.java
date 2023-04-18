package diagrama06;


public class Foto {
    private String pathToFile;
    private String nombre;
    private float tamaño;

    public Foto(String pathToFile, String nombre, float tamaño) {
        this.pathToFile = pathToFile;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    
}

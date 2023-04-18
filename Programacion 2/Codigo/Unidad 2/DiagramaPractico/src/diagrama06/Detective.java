package diagrama06;

public class Detective extends Persona {

    private String numeroPlaca;

    public Detective(String numeroPlaca, String nombre, String apellido, String pathToFile, String nombreFoto, float tamaño) {
        super(nombre, apellido, pathToFile, nombreFoto, tamaño);
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public boolean investigarMafioso(Mafioso mafioso) {
        return mafioso.investigar();
    }

    public void mostrarBusqueda(Mafioso mafioso) {
        
        System.out.println("\n-------------Busqueda de Mafioso-------------");
        if (investigarMafioso(mafioso)) {
            System.out.println("El mafioso esta siendo investigado por el detective: " + getNombre()+" "+getApellido());
        } else {
            System.out.println("El mafioso no esta siendo investigado por el detective: " + getNombre()+" "+getApellido());
        }

    }

    public void mostrar() {
        System.out.println("--------------------DETECTIVE--------------------\n");
        System.out.println("Nombre del Detective: " + getNombre() + ", " + getApellido());
        System.out.println("PathTofile: " + getFoto().getPathToFile() + ", Nombre: " + getFoto().getNombre() + ", Tamaño: " + getFoto().getTamaño());
        System.out.println("Placa del detective: " + getNumeroPlaca());
        for (Perfil perfil : getPerfiles()) {
            System.out.println("---------------------------------");
            System.out.println("Tipo de perfil: " + perfil.getTipoPerfil() + ", Descripcion: " + perfil.getDesripcion());
        }

        for (MedioDeComunicacion comunicacion : getComunicaciones()) {
            System.out.println("-----------------------------------");
            System.out.println("Medio de comunicacion: " + comunicacion.getTipoMedio().getMedio());
            System.out.println("Descripcion del medio de comunicacion: " + comunicacion.getDescripcion());

        }

    }

}

package evaluacionprueba;


public class Main {

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        ProyectoDeGrado proyecto1 = new ProyectoDeGrado("Nacional", 60000,"Construir un sistema de sala de espera", "Plan de Estudios 2023", 2, "Tecnico en Programacion", 90);
        ProyectoDeGrado proyecto2 = new ProyectoDeGrado("Nacional", 100000, "Construir nueva tecnologia para un hospital", "Utilizar lo enseñado en la carrera", 5, "Ingeniero en Sistemas de la Informacion", 100);
        PersonalDocente profesor1 = new PersonalDocente("Juan Lopez", "Ingeniero graduado de la UTN", 40);
        PersonalDocente profesor2 = new PersonalDocente("Matias Ramirez", "Tecnico en Programacion de la UTN", 20);
        Universidad utn = new Universidad("Universidad Tecnologica Nacional", "Tecnicatura en Programacion", "", "Universidad Publica");
        Region mendoza = new Region("Tierra del sol y del buen vino", "bodegas", "enologos", "Region Cuyana");
        
         Estudiante est = new Estudiante("Nicolas Sallei", "Tecnico en Programacion",utn ,proyecto1);
         est.addPersonalDocente(profesor1);
        est.addPersonalDocente(profesor2);
        est.getUniversidades().get(0).setRecoleccionDeInformacion(new RecoleccionDeInformacion());
        est.getUniversidades().get(0).getRecoleccionDeInformacion().setDatosDeLosAfectados("Nicolas sallei, 26 anios; becado");
        est.getUniversidades().get(0).getRecoleccionDeInformacion().setDatosDeLosDirecamenteInterezados(est.getUniversidades().get(0).getCunaDelConocimiento()+ ", " + est.getPersonalDocentes().get(1).getNombre());
        est.getUniversidades().get(0).addRegion(mendoza);
        est.getUniversidades().get(0).getRegiones().get(0).addNecesidades(new Necesidades("Graduarse, conseguir empleo en el exterior y emigrar"));
        est.setEjecuccionDelProyecto(new EjecucionDelProyecto());
        est.getEjecuccionDelProyecto().setRecursosdisponibles(150000);
        
    }
    
}

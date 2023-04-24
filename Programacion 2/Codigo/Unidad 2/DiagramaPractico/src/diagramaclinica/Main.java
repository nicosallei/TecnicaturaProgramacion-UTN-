package diagramaclinica;

public class Main {

    public static void main(String[] args) {

        Clinica clinic1 = new Clinica();

        clinic1.addEspecialidad(new Especialidad("Clínica general"));

        clinic1.getEspecialidad().get(0).setHabitacion(new Habitacion(3));
        clinic1.getEspecialidad().get(0).setMedicos(new Medico("Juan Sosa"));
        clinic1.getEspecialidad().get(0).getHabitacion().get(0).setCamas(new Cama(new Paciente("1438", "Julio Alba", 'M', new Fecha(3, 10, 1984))));
        clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().setDeAUnoDiagnosticos(new Diagnostico("Resfrio", TipoDiagnostico.TdLeve));
        clinic1.getEspecialidad().get(0).getHabitacion().get(0).setNumero(3);
        clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getDiagnosticos().get(0).setTratamiento(new Tratamiento("Te de ajo"));
        

        System.out.println(String.format("La primer especialidad de la Clínica es %s", clinic1.getEspecialidad().get(0).getNombre()));
        System.out.println("Información del paciente: ");
        System.out.println(String.format("Nombre: %s - Edad: %d - Género: - %c - NSIP: %s", 
                clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getNombreApellidos(),
                clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getFechaNacimiento().getDiferenciaAnios(clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getFechaNacimiento()),
                clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getSexo(),
                clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getNSIP()));
        System.out.println("Estado del paciente: ");
        System.out.println(String.format("Cama: %d - Tipo de diagnóstico: %s - Diagnóstico: %s", 
                clinic1.getEspecialidad().get(0).getHabitacion().get(0).getNumero(),
                clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getDiagnosticos().get(0).getTipo(),
                clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getDiagnosticos().get(0).getTexto()));
        System.out.println(String.format("Médico tratante: %s - Tratamiento: %s",
                clinic1.getEspecialidad().get(0).getMedicos().get(0).getNombreApellidos(),
                clinic1.getEspecialidad().get(0).getHabitacion().get(0).getCamas().get(0).getPaciente().getDiagnosticos().get(0).getTratamiento().getTexto()));
        
    }

}

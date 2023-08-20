/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_B;

/**
 *
 * @author Nicolas Sallei Correa
 */
public class RegimenHorario {
    private long id;
    private int horaIngreso;
    private int minutoIngreso;
    private int horaEgreso;
    private int minutoEgreso;

    private Empleado empleado;

    
    
    
    public RegimenHorario() {
    }

    public RegimenHorario(long id, int horaIngreso, int minutoIngreso, int horaEgreso, int minutoEgreso) {
        this.id = id;
        this.horaIngreso = horaIngreso;
        this.minutoIngreso = minutoIngreso;
        this.horaEgreso = horaEgreso;
        this.minutoEgreso = minutoEgreso;
    }
    
    public void mostrar(){
        System.out.println("Regimen Horario ID: "+this.id);
        System.out.println("Hora Ingreso: "+this.getHoraIngreso());
        System.out.println("Minuto Ingreso: "+this.getMinutoIngreso());
        System.out.println("Hora Egreso: "+this.getHoraEgreso());
        System.out.println("Minuto Egreso: "+this.getMinutoEgreso());
    }
    
    
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getMinutoIngreso() {
        return minutoIngreso;
    }

    public void setMinutoIngreso(int minutoIngreso) {
        this.minutoIngreso = minutoIngreso;
    }

    public int getHoraEgreso() {
        return horaEgreso;
    }

    public void setHoraEgreso(int horaEgreso) {
        this.horaEgreso = horaEgreso;
    }

    public int getMinutoEgreso() {
        return minutoEgreso;
    }

    public void setMinutoEgreso(int minutoEgreso) {
        this.minutoEgreso = minutoEgreso;
    }
    
    
    
}

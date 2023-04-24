package diagramaclinica;

import java.util.Date;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getDiferenciaAnios(Fecha f) {
        Date fechaActual = new Date();
        int diferenciaAnios = fechaActual.getYear()+1900 - f.getAnio();
        if(fechaActual.getMonth()-f.getMes()<0) {
            diferenciaAnios -=1;
        } else if(fechaActual.getMonth()-f.getMes()==0 && fechaActual.getDay()-f.getDia()<0) {
            diferenciaAnios -=1;
        }
        return diferenciaAnios;
    }
    
    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.getDia(), this.getMes(), this.getAnio());
    }

}

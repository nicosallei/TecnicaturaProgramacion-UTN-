import java.util.ArrayList;
import java.util.List;

public class BonoSueldo {
        private Empleado empleado;
        private int mesLiquidacion;
        private int anioLiquidacion;
        private double montoLiquidacion;



    public Empleado getEmpleado() {
            return empleado;
        }

        public void setEmpleado(Empleado empleado) {
            this.empleado = empleado;
        }

        public int getMesLiquidacion() {
            return mesLiquidacion;
        }

        public void setMesLiquidacion(int mesLiquidacion) {
            this.mesLiquidacion = mesLiquidacion;
        }

        public int getAnioLiquidacion() {
            return anioLiquidacion;
        }

        public void setAnioLiquidacion(int anioLiquidacion) {
            this.anioLiquidacion = anioLiquidacion;
        }

        public double getMontoLiquidacion() {
            return montoLiquidacion;
        }

        public void setMontoLiquidacion(double montoLiquidacion) {
            this.montoLiquidacion = montoLiquidacion;
        }
}


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class FuncionesPrograma {
    
    
  public static String getFechaString(Date fecha){
     
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
     String getFechaString = sdf.format(fecha);
     
     
     
     return  getFechaString;
 }
    
    public static Date getFechaDate(int dia, int mes, int anio){
    
       // dia = 13;
        //mes=9;
        //anio=2021;
    
        LocalDate LD = LocalDate.of(anio, mes, dia);
        Date getFechaDate = java.sql.Date.valueOf(LD);
    
    return getFechaDate;
    }
}
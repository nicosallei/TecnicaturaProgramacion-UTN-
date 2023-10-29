/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class FuncionApp {
    
    //formato dd-mm-yyyy
    public static Date convertirStringToDate(String fecha){
        try{
            String fechaAux = fecha.replaceAll("/", "-");
            String [] fechaArray = fechaAux.split("-");
            if(fechaArray.length == 3){
                Date fechaDate = new Date((Integer.valueOf(fechaArray[2])-1900), (Integer.valueOf(fechaArray[1])-1), Integer.valueOf(fechaArray[0]));
                return fechaDate;
            }
        }catch(Exception ex){
                return null;
        }
        return null;
        
    }
    
    public static String convertirDateToString(Date fecha){
        try{
            if(fecha != null){
                int anio = fecha.getYear() + 1900;
                int mes = fecha.getMonth() + 1;
                int dia = fecha.getDate();
                String fechaString = "";
                if(dia < 10){
                    fechaString += "0" + dia;
                }else{
                    fechaString += dia;
                }
                fechaString += "/";
                if(mes < 10){
                    fechaString += "0" + mes;
                }else{
                    fechaString += mes;
                }
                fechaString += "/";
                fechaString += anio;
                return fechaString;
            }
        }catch(Exception ex){
            return null;
        }
        return null;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Gerardo
 */
public class FuncionApp {
    
    public static String getFormatDate(Date date) {
        String day, month;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        if (calendar.get(Calendar.DAY_OF_MONTH) < 10)
                day = "0" + Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));			
        else 
                day = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));

        if (calendar.get(Calendar.MONTH) < 9)
                month = "0" + Integer.toString(calendar.get(Calendar.MONTH) + 1);
        else
                month = Integer.toString(calendar.get(Calendar.MONTH) + 1);

        return day + "/" + month + "/" + Integer.toString(calendar.get(Calendar.YEAR));
    }
    
    @SuppressWarnings("deprecation")
    public static String getFormatHourMinute(Date date) {
        String hour, minute;

        if (date.getHours() < 10)
                hour = "0" + Integer.toString(date.getHours());
        else
                hour = Integer.toString(date.getHours());

        if (date.getMinutes() < 10)
                minute = "0" + Integer.toString(date.getMinutes());
        else
                minute = Integer.toString(date.getMinutes());

        return hour + ":" + minute;
    }
	
    
}

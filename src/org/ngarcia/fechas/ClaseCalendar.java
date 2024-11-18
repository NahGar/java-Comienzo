package org.ngarcia.fechas;

import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    
    public static void main(String[] args) {
        
        //clase estática
        Calendar calendar = Calendar.getInstance();
        
        //el mes comienza en 0
        calendar.set(2050, Calendar.JANUARY, 25, 19, 20, 12);
                
        Date fecha = calendar.getTime();
        System.out.println("calendario " + fecha);
        
        calendar.set(Calendar.YEAR, 2020);
        System.out.println("calendario " + calendar.getTime());
    }
}

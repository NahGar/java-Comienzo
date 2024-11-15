package org.ngarcia.Fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {
    
    public static void main(String[] args) {
        
        Date fecha = new Date();
        System.out.println("Fecha="+fecha);
        
        SimpleDateFormat df = new SimpleDateFormat("dd MM-yyyy G 'at' hh:mm:ss");
        String fechaStr = df.format(fecha);
        
        System.out.println("Fecha="+fechaStr);
        
        for(int i = 0; i < 1000000000; i++) {
            
        }
        
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        
        System.out.println("tiempo="+tiempoFinal);
    }
}

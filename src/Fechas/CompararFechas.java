package Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CompararFechas {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha yyyy-MM-dd");
        try {
            Date fecha = format.parse(s.next());

            Date fecha2 = new Date();

            // Crear una instancia de Calendar y asignar la fecha actual
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fecha2);

            // Establecer horas, minutos, segundos y milisegundos a cero
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            // Obtener la fecha con las horas, minutos, segundos y milisegundos en 0
            fecha2 = calendar.getTime();

            System.out.println("fecha " + fecha);
            System.out.println("fecha2 " + fecha2);
            if(fecha.after(fecha2)) {
                System.out.println("Fecha posterior a fecha2");
            }
            else if(fecha.before(fecha2)){
                System.out.println("Fecha anterior a fecha2");
            }
            else if(fecha.equals(fecha2)){
                System.out.println("Fecha igual fecha2");
            }

            //comparando con compareTo
            if(fecha.compareTo(fecha2) > 0 ) {
                System.out.println("Fecha posterior a fecha2");
            }
            else if(fecha.compareTo(fecha2) < 0 ){
                System.out.println("Fecha anterior a fecha2");
            }
            else if(fecha.compareTo(fecha2) == 0 ){
                System.out.println("Fecha igual fecha2");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

package org.ngarcia.java8.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjecutarLocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("H:"+ahora.getHour()+" M:"+ahora.getMinute()+" S:"+ahora.getSecond());

        LocalTime hora = LocalTime.of(5,10,50);
        System.out.println(hora);
        hora = LocalTime.parse("05:10:50");
        System.out.println(hora);

        //HH formato 24hs, hh formato am pm
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("hh:mm:ss a");
        DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(ahora.format(dt));
        System.out.println(dt2.format(ahora));

    }
}

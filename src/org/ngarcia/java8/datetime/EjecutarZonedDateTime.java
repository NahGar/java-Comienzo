package org.ngarcia.java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjecutarZonedDateTime {
    public static void main(String[] args) {

        //formato default
        //LocalDateTime fechaLocal = LocalDateTime.parse("2024-12-30T12:45");
        //si quisiera cargar la fecha hora en otro formato:
        LocalDateTime fechaLocal = LocalDateTime.parse("2024/12/30 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        //ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork);
        //Utilizando UTC
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        //utilizando atZone(ZoneId.of() O ZoneOffset.of())
        ZonedDateTime zonaNy = fechaLocal.atZone(ZoneId.of("America/New_York"));

        System.out.println("Horario de partida desde New York: " + zonaNy);

        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        //ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        //Utilizando UTC
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);

        System.out.println("Horario de llegada a Madrid: " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Partida desde New York: " + f.format(zonaNy));
        System.out.println("Llegada a Madrid: " + zonaMadrid.format(f));

        //Set<String> zonas = ZoneId.getAvailableZoneIds();
        //zonas.forEach(System.out::println);
    }
}

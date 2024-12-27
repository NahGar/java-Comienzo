package org.ngarcia.java8.datetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjecutarDuration {
    public static void main(String[] args) {

        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now()
                .plusMonths(2)
                .plusDays(1)
                .plusHours(3)
                .plusMinutes(15)
                .plusSeconds(14);

        Duration lapso = Duration.between(fecha1, fecha2);
        System.out.println("lapso:"+lapso);
        System.out.println("dias:"+lapso.toDays());
        System.out.println("horas:"+lapso.toHours());

    }
}

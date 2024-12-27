package org.ngarcia.java8.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjecutarLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);

        fechaHora = LocalDateTime.of(2024,12,11,12,30,45);
        System.out.println(fechaHora);

        fechaHora = LocalDateTime.parse("2024-12-11T23:20:45");
        System.out.println(fechaHora);

        System.out.println("dando formato: " + fechaHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}

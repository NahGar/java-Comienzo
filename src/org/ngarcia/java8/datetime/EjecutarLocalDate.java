package org.ngarcia.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjecutarLocalDate {
    public static void main(String[] args) {

        Locale esp = new Locale("es","ES");

        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        System.out.println("Día: " + fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println("Mes nombre: " + mes);
        System.out.println("Mes nombre español: " + mes.getDisplayName(TextStyle.FULL, esp));
        System.out.println("Mes número: " + mes.getValue());
        System.out.println("Mes número: " + fechaActual.getMonthValue());
        System.out.println("Año: " + fechaActual.getYear());

        LocalDate fecha = LocalDate.of(2024, Month.DECEMBER,1);
        System.out.println(fecha);

        fecha = LocalDate.parse("2024-12-25");
        System.out.println(fecha);

        fecha = LocalDate.now().plusDays(2);
        System.out.println("Hoy +2: "+fecha);

        fecha = LocalDate.now().minusDays(2);
        System.out.println("Anteayer: "+fecha);

        //fecha = LocalDate.now().minusMonths(1);
        fecha = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Hace un mes: "+fecha);

        DayOfWeek dia = LocalDate.now().getDayOfWeek();
        System.out.println("Día de la semana: "+dia);
        System.out.println("Día de la semana español: "+dia.getDisplayName(TextStyle.FULL,esp));

        System.out.println("Día del mes: "+LocalDate.now().getDayOfMonth() + " del año: "
                + LocalDate.now().getDayOfYear());

        boolean esAntes = LocalDate.of(2012,12,12).isBefore(LocalDate.parse("2012-12-11"));
        System.out.println("es antes: " + esAntes);

        boolean esDespues = LocalDate.of(2012,12,12).isAfter(LocalDate.parse("2012-12-11"));
        System.out.println("es después: " + esDespues);



    }
}

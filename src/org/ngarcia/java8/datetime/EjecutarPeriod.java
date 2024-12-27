package org.ngarcia.java8.datetime;

import java.time.LocalDate;
import java.time.Period;

public class EjecutarPeriod {
    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2011,9,23);
        LocalDate fecha2 = LocalDate.of(2021,11,25);

        //para modificar
        fecha2 = fecha2.withMonth(8);

        Period periodo = Period.between(fecha1,fecha2);
        System.out.println(periodo);
        System.out.printf("Periodo entre %s y %s: %d años, %d meses, %d días",
                fecha1,fecha2,periodo.getYears(),periodo.getMonths(),periodo.getDays());


    }
}

package org.ngarcia.api.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.*;

public class EjecutarRange {
    public static void main(String[] args) {
        
        IntStream numeros = IntStream.range(10,15).peek(System.out::println);
        //System.out.println(numeros.reduce(0, (a,b) -> a + b ));
        //System.out.println(numeros.sum());
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println(stats);
    }
}

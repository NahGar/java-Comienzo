package Tareas.stream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

public class EjecutarModificarFlujo {
    public static void main(String[] args) {

        AtomicInteger numerador = new AtomicInteger(0);
        Double suma = DoubleStream.generate( () -> {
                    return numerador.incrementAndGet();
                })
                .limit(100)
                .filter( n -> n % 10 != 0)
                .map( n -> (double) n / 2)
                .reduce(0, (a,b) -> a + b );

        System.out.println(suma);
    }
}

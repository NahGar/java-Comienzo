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
        
        /*
        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
        }

        double total = Arrays.stream(arreglo)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);
        
        System.out.println(total); // 2250.0
        */
    }
}

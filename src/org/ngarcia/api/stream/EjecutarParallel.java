package org.ngarcia.api.stream;

import org.ngarcia.api.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjecutarParallel {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Juan","Lopez"));
        lista.add(new Usuario("Mica","Nieves"));
        lista.add(new Usuario("Evan","Garcia"));
        lista.add(new Usuario("Gael","Garcia"));
        lista.add(new Usuario("Robert","Downey"));
        lista.add(new Usuario("Gael","Bernal"));

        long t1 = System.currentTimeMillis();

        String resultado = lista.stream()
                .parallel() //ejecuta el flujo en varios hilos
                .map( u -> u.toString().toUpperCase())
                .peek(System.out::println)
                .flatMap( n -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if( n.contains("gael".toUpperCase())) {
                        return Stream.of(n);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("tiempo=" + (t2 - t1) + " " + resultado);
    }
}

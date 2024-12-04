package org.ngarcia.api.stream;

import java.util.stream.Stream;

public class EjecutarInfinitoGenerate {
    public static void main(String[] args) {

        Stream.generate( () -> {
                return "Hola mundo!";
            })
            .limit(20)
            .forEach(System.out::println);
    }
}

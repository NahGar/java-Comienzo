package org.ngarcia.api.stream;

import java.util.stream.*;

public class EjecutarReduce {
    public static void main(String[] args) {
        
        Stream<String> nombres = Stream.of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández","Paco Lopez","Paco Lopez")
                .distinct();
                
        System.out.println(nombres.reduce("", (a,b) -> a + ", " + b ));
        
        
        Stream<Integer> numeros = Stream.of(5,10,15,20);
        System.out.println(numeros.reduce(0, (a,b) -> a + b ));
    }
}

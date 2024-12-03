package org.ngarcia.api.stream;

import java.util.stream.*;

public class EjecutarDistinct {
    public static void main(String[] args) {
        
        Stream.of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández","Paco Lopez","Paco Lopez")
                .distinct()
                .forEach(System.out::println);
        
    }
}

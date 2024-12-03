package org.ngarcia.api.stream;

import java.util.stream.*;

public class EjecutarFilterEmpty {
    public static void main(String[] args) {
        
        long count = Stream
                .of("Pato Ruiz","","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","")
                .filter( n -> n.isEmpty() )
                .peek( e -> System.out.print(e + " - "))
                .count();
                
        System.out.println("cantidad "+count);
        
    }
}

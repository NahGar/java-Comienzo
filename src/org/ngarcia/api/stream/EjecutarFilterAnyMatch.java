package org.ngarcia.api.stream;

import java.util.stream.*;
import org.ngarcia.api.stream.models.Usuario;

public class EjecutarFilterAnyMatch {
    public static void main(String[] args) {
        
        boolean existe = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández")
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                .peek( e -> System.out.print(e + " - "))
                .anyMatch(e -> e.getId().equals(1));
        
        System.out.println("Existe id 5 = " + existe);
    }
}

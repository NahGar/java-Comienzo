package org.ngarcia.api.stream;

import java.util.List;
import java.util.stream.*;
import org.ngarcia.api.stream.models.Usuario;

public class EjecutarFilter {
    public static void main(String[] args) {
        
        Stream<Usuario> nombres = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández")
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                //peek en este caso muestra los valores luego del upper
                .peek( e -> System.out.print(e+" - "))
                .filter( e -> e.getNombre().equals("Juan"));
        
        //nombres.forEach( e -> System.out.print(e+ " - "));
        
        List<Usuario> lista = nombres.collect(Collectors.toList());
                
        System.out.println();
        lista.forEach( e -> System.out.println(e));
    }
}

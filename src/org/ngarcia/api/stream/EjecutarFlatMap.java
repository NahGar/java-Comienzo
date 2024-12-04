package org.ngarcia.api.stream;

import org.ngarcia.api.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjecutarFlatMap {
    public static void main(String[] args) {
        
        Stream<Usuario> nombres = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández")
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                //peek en este caso muestra los valores luego del upper
                .peek( e -> System.out.print(e+" - "))
                //.filter( e -> e.getNombre().equals("Juan"));
                .flatMap( u -> {
                   if(u.getNombre().equals("Juan")) {
                       return Stream.of(u);
                   }
                   return Stream.empty();
                });
        
        nombres.forEach(System.out::println);
    }
}

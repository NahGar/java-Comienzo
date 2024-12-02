package org.ngarcia.api.stream;

import java.util.Optional;
import java.util.stream.*;
import org.ngarcia.api.stream.models.Usuario;

public class EjecutarFilterSingle {
    public static void main(String[] args) {
        
        Stream<Usuario> nombres = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández")
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                //peek en este caso muestra hasta que se encuentra el primer Juan
                //por findFirst()
                .peek( e -> System.out.print(e + " - "))
                .filter( e -> e.getNombre().equals("Juan"));
        
        
        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println("");
        System.out.println(usuario.get());
        
        
        System.out.println("----busca por Id----");
        Usuario usuario2 = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández")
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                .filter( e -> e.getId().equals(5))
                .findFirst().get();
        
        System.out.println(usuario2);
    }
}

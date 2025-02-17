package org.ngarcia.api.stream;

import org.ngarcia.api.stream.models.Usuario;

import java.util.stream.*;

public class EjecutarDistinct {
    public static void main(String[] args) {
        
        Stream.of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández","Paco Lopez","Paco Lopez")
                .distinct()
                .forEach(System.out::println);

        System.out.println("---distinct usuarios---");
        Stream<Usuario> usuarios = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández","Gael García","Gael García")
                //.distinct()
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                //al aplicar distinct luego de map hay que implementar equals() y hashcode() en Usuario
                .distinct();

        usuarios.forEach(System.out::println);

    }
}

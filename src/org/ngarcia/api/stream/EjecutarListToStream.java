package org.ngarcia.api.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.ngarcia.api.stream.models.Usuario;

public class EjecutarListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Juan","Lopez"));
        lista.add(new Usuario("Mica","Nieves"));
        lista.add(new Usuario("Evan","Garcia"));
        lista.add(new Usuario("Gael","Garcia"));
        lista.add(new Usuario("Robert","Downey"));
        lista.add(new Usuario("Gael","Bernal"));

        lista.stream()
                .map( u -> u.getNombre().toUpperCase() + " " +
                    u.getApellido().toUpperCase())
                .flatMap( nombre -> {
                    if( nombre.contains("gael".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .forEach(System.out::println);

    }
}

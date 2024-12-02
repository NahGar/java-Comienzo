package org.ngarcia.api.stream;

import java.util.List;
import java.util.stream.*;
import org.ngarcia.api.stream.models.Usuario;

public class EjecutarMap {
    public static void main(String[] args) {
        /*
        Stream<String> nombres = Stream
                .of("pato","paco","juan","mica","evan","gael")
                .map( String::toUpperCase )
                //peek en este caso muestra los valores luego del upper
                .peek( e -> System.out.print(e+" - "))
                .map( String::toLowerCase);
        
        //nombres.forEach( e -> System.out.print(e+ " - "));
        
        List<String> lista = nombres.collect(Collectors.toList());
                
        System.out.println();
        lista.forEach(System.out::println);
        */
        
        Stream<Usuario> nombres = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García","Gael García")
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                //peek en este caso muestra los valores luego del upper
                .peek( e -> System.out.print(e+" - "))
                .map( usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    String apellido = usuario.getApellido().toLowerCase();
                    usuario.setNombre(nombre);
                    usuario.setApellido(apellido);
                    return usuario;
                });
        
        //nombres.forEach( e -> System.out.print(e+ " - "));
        
        List<Usuario> lista = nombres.collect(Collectors.toList());
                
        System.out.println();
        lista.forEach( e -> System.out.println(e));
        
        
    }
}

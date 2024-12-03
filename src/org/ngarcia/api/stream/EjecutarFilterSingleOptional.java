package org.ngarcia.api.stream;

import java.util.Optional;
import java.util.stream.*;
import org.ngarcia.api.stream.models.Usuario;

public class EjecutarFilterSingleOptional {
    public static void main(String[] args) {
        
        Stream<Usuario> nombres = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández")
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                //peek en este caso muestra hasta que se encuentra el primer Juan
                //por findFirst()
                .peek( e -> System.out.print(e + " - "))
                .filter( e -> e.getNombre().equals("JuanBBB"));
        
        
        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println("");
        //si no existe el usuario que se filtra da error
        //System.out.println(usuario.get());
        //una forma de tratarlo es con orElse que devuelve otro objeto si no hay
        //System.out.println(usuario.orElse(new Usuario("El","suplente")));
        //otra forma con exp lambda
        //System.out.println(usuario.orElseGet( () -> new Usuario("El","suplente")));
        if(usuario.isPresent()) {
            System.out.println(usuario.get());
        }
        else {
            System.out.println("No se encontró");
        }
        
        
    }
}

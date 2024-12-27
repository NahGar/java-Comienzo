package org.ngarcia.optional;

import org.ngarcia.optional.models.Computador;
import org.ngarcia.optional.repositorio.ComputadorRepositorio;
import org.ngarcia.optional.repositorio.Repositorio;

import java.util.Optional;

public class EjecutarRepositorioMetodoOrElseThrow {
    public static void main(String[] args) {
        
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //devuelve NoSuchElementException o se puede indicar una excepcion como parametro
        Computador pc = repositorio.filtrar("asus").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter( a -> a.contains("."))
                .map( a -> a.substring( archivo.lastIndexOf(".") + 1 ) )
                .orElseThrow();

        System.out.println(extension);

    }
}

package org.ngarcia.optional;

import org.ngarcia.optional.models.Computador;
import org.ngarcia.optional.models.Fabricante;
import org.ngarcia.optional.models.Procesador;
import org.ngarcia.optional.repositorio.ComputadorRepositorio;
import org.ngarcia.optional.repositorio.Repositorio;

public class EjecutarRepositorioMapFilter {
    public static void main(String[] args) {
        
        Repositorio<Computador> repositorio = new ComputadorRepositorio();


        String fabricante = repositorio.filtrar("macbook")
                .map(Computador::getProcesador)
                .map(Procesador::getFabricante)
                //si no es intel es desconocido
                .filter( f -> "intel".equalsIgnoreCase(f.getNombre()))
                .map(Fabricante::getNombre)
                //.map( c -> c.getProcesador().getFabricante().getNombre() )
                .orElse("Desconocido");
        System.out.println(fabricante);


        fabricante = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesadorOptional)
                .flatMap(Procesador::getFabricanteOptional)
                //si no es intel es desconocido
                .filter( f -> "intel".equalsIgnoreCase(f.getNombre()))
                .map(Fabricante::getNombre)
                //.map( c -> c.getProcesador().getFabricante().getNombre() )
                .orElse("Desconocido");
        System.out.println(fabricante);


    }
}

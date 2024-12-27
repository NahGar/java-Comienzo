package org.ngarcia.optional;

import org.ngarcia.optional.models.Computador;
import org.ngarcia.optional.repositorio.ComputadorRepositorio;
import org.ngarcia.optional.repositorio.Repositorio;

public class EjecutarRepositorioMetodoOrElse {
    public static void main(String[] args) {
        
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("por","defecto");
        //orElse devuelve un obj si no encuentra
        Computador pc = repositorio.filtrar("asus").orElse(defecto);
        System.out.println(pc);

        //orElseGet utiliza exp lambda para retornar el obj si no encuentra
        pc = repositorio.filtrar("macbook").orElseGet( () -> defecto);
        System.out.println(pc);
    }
}

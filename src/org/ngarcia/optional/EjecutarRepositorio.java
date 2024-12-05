package org.ngarcia.optional;

import java.util.Optional;
import org.ngarcia.optional.models.Computador;
import org.ngarcia.optional.repositorio.*;

public class EjecutarRepositorio {
    public static void main(String[] args) {
        
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        //Computador pc = repositorio.filtrar("Asu12s");
        //if(pc != null) {
        //    System.out.println(pc);
        //}
        //else {
        //    System.out.println("No se encontró");
        //}
        
        //Optional<Computador> pc = repositorio.filtrar("Asus");
        //if(pc.isPresent()) {
        //    System.out.println(pc.get());
        //}
        //else {
        //    System.out.println("No se encontró");
        //}
        
        repositorio.filtrar("Asus").ifPresentOrElse(System.out::println, 
                () -> System.out.println("No se encontró"));
            
        
    }
}

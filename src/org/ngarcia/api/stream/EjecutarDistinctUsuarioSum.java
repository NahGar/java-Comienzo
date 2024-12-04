package org.ngarcia.api.stream;

import org.ngarcia.api.stream.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjecutarDistinctUsuarioSum {
    public static void main(String[] args) {
        
        IntStream largoNombres = Stream
                .of("Pato Ruiz","Paco Lopez","Juan Mena","Mica Nieves","Evan García",
                        "Gael García","Juan Hernández","Gael García","Gael García")
                //.distinct()
                .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]) )
                //al aplicar distinct luego de map hay que implementar equals() y hashcode() en Usuario
                .distinct()
                .mapToInt( u -> u.toString().length() );

        //largoNombres.forEach(System.out::println);
        //System.out.println(largoNombres.sum());
        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println(stats);

    }
}

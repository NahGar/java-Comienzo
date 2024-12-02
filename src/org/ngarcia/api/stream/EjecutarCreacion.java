package org.ngarcia.api.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjecutarCreacion {
    public static void main(String[] args) {
        
        Stream<String> nombres = Stream.of("pato","paco","juan","mica","evan","gael");
        System.out.println();
        nombres.forEach( e -> System.out.print(e+ " - "));
        
        String[] arr = {"pepe","hugo","paco","luis"};
        nombres = Arrays.stream(arr);
        System.out.println();
        nombres.forEach( e -> System.out.print(e+ " - "));
        
        nombres = Stream.<String>builder().add("rico").add("pepa").add("lolo").build();
        System.out.println();
        nombres.forEach( e -> System.out.print(e+ " - "));
        
        List<String> lista = new ArrayList<>();
        lista.add("marcos");
        lista.add("luis");
        lista.add("klye");
        
        nombres = lista.stream();
        System.out.println();
        nombres.forEach( e -> System.out.print(e+ " - "));
        System.out.println();
        //o también
        lista.stream().forEach( e -> System.out.print(e+ " - "));
    }
}

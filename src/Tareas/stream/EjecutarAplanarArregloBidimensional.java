package Tareas.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjecutarAplanarArregloBidimensional {
    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Stream<String> lenguaje2 = Arrays.stream(lenguajes) // Convertimos el array bidimensional en un stream
                .flatMap( lenguaje -> Arrays.stream(lenguaje)) // Aplanamos la estructura (String[][] -> Stream<String>)
                .distinct();

        lenguaje2.forEach(lenguaje -> System.out.println(lenguaje));
        
        /*
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(e -> System.out.println(e));
        */
        
        /*
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        
        Function<String[][], List<String>> flatten = arr ->  Arrays.stream(arr).flatMap(a -> Arrays.stream(a))
                .distinct()
                .collect(Collectors.toList());
        
        flatten.apply(lenguajes).forEach(e -> System.out.println(e));
        */
    }
}

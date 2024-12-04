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
    }
}

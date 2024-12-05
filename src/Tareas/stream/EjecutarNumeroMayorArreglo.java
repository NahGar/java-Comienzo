package Tareas.stream;

import java.util.function.BiFunction;
import java.util.stream.*;

public class EjecutarNumeroMayorArreglo {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> compara = (a, b) -> a > b ? a : b;

        Integer numeroMayor = Stream.of(5, 98, 145 ,2 , 989, 24 ,7 ,8 ,55, 58)
                .reduce(0, (a,b) -> compara.apply(a,b) );
        System.out.println(numeroMayor);
        
        /*
        // la función lambda que obtiene el numero mayor del arreglo usando api stream en su implementación
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (ac, e) -> ac > e? ac: e);

        int resultado = max.apply(new Integer[]{1, 78, -1700, 2500, 0, 2000, 54, 2});
        System.out.println(resultado);
        */

    }
}

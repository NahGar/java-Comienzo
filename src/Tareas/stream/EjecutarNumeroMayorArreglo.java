package Tareas.stream;

import java.util.function.BiFunction;
import java.util.stream.*;

public class EjecutarNumeroMayorArreglo {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> compara = (a, b) -> a > b ? a : b;

        Integer numeroMayor = Stream.of(5, 98, 145 ,2 , 989, 24 ,7 ,8 ,55, 58)
                .reduce(0, (a,b) -> compara.apply(a,b) );
        System.out.println(numeroMayor);

    }
}

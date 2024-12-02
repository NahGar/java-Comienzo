package org.ngarcia.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjecutarFunction {
    public static void main(String[] args) {

        //recibe un valor y devuelve un valor
        Function<Integer,String> f1 = param -> "Recibí: " + param;
        System.out.println(f1.apply(15));

        //Function<String,String> f2 = param -> param.toUpperCase();
        Function<String,String> f2 = String::toUpperCase;
        System.out.println(f2.apply("pepito"));

        BiFunction<String,String,String> f3 = (a,b) ->
                a.toUpperCase().concat(b.toUpperCase());
        System.out.println(f3.apply("pepito"," sabe cosas"));

        //BiFunction<String,String,Integer> f4 = (a,b) -> a.compareTo(b);
        BiFunction<String,String,Integer> f4 = String::compareTo;
        System.out.println(f4.apply("A","B"));
        
        BiFunction<String,String,String> f5 = String::concat;
        System.out.println(f5.apply("A","B"));
    }
}

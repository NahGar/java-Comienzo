package org.ngarcia.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjecutarTreeSet {
    public static void main(String[] args) {
        
        //son ordenados de modo alfabético o numérico
        //no se repiten valores
        //los objetos utilizados deben implementar Comparables (compareTo)
        
        //Set<String> ts = new TreeSet<>();
        //para ordenar descendente
        //Set<String> ts = new TreeSet<>( (a, b) -> b.compareTo(a));
        //otra forma
        Set<String> ts = new TreeSet<>( Comparator.reverseOrder());
        ts.add("a");
        ts.add("b");
        ts.add("c");
        ts.add("c");
        ts.add("f");
        ts.add("z");
        System.out.println(ts);
        
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(1);
        System.out.println(numeros);
    }
}

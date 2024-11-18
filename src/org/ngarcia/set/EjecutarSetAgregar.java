package org.ngarcia.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjecutarSetAgregar {
    
    public static void main(String[] args) {
        
        //Set no permite elementos duplicados
        //devuelve true o false si pudo agregar el elemento
        //no quedan ordenados los elementos ni se pueden ordenar
        
        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println(hs.add("tres")); //no permite duplicados
        System.out.println(hs);
        
        System.out.println("---ordenada---");
        //si necesito ordenar hay que convertir a ArrayList
        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);
        System.out.println(lista);
    }
}

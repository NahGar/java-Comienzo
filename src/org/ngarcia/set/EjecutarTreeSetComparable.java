package org.ngarcia.set;

import java.util.Set;
import java.util.TreeSet;
import org.ngarcia.set.modelo.Alumno;

public class EjecutarTreeSetComparable {

    public static void main(String[] args) {
        
        //TreeSet requiere clase que implemente comparable
        //Set<Alumno> sa = new TreeSet<>();
        //sobreescribir la forma de comparar (por nota)
        Set<Alumno> sa = new TreeSet<>(
                (a,b) -> a.getNombre().compareTo(b.getNombre())
        );
        sa.add(new Alumno("Marcos",5));
        sa.add(new Alumno("Roberto",10));
        sa.add(new Alumno("Mica",12));
        sa.add(new Alumno("Evan",9));
        sa.add(new Alumno("Gael",7));
        sa.add(new Alumno("Zeus",1));
        //OJO: no agrega repetidos, y sabe si es repetido mediante compareTo
        //Si compara por nota, no agrega a Gustavo porque ya existe Zeus con esa nota
        sa.add(new Alumno("Gustavo",1));
        
        System.out.println(sa);
    }
}

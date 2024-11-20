package org.ngarcia.set;

import java.util.Collections;
import java.util.Comparator;
import static  java.util.Comparator.comparing;
import java.util.LinkedList;
import java.util.List;
import org.ngarcia.set.modelo.Alumno;

public class EjecutarListComparableComparator {

    public static void main(String[] args) {
        
        List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Marcos",5));
        sa.add(new Alumno("Roberto",10));
        sa.add(new Alumno("Mica",12));
        sa.add(new Alumno("Evan",9));
        sa.add(new Alumno("Gael",7));
        sa.add(new Alumno("Zeus",1));
        sa.add(new Alumno("Zeus",1));
        sa.add(new Alumno("Zeus",3));
        
        //aquí usa para ordenar lo indicado en compareTo del objeto
        Collections.sort(sa);
        
        //se especifica que ordene por nombre asc
        Collections.sort(sa, (a,b) -> a.getNombre().compareTo(b.getNombre()));
        
        //se especifica que ordene por nombre desc usando sort de List
        //sa.sort((a,b) -> b.getNombre().compareTo(a.getNombre()));
        
        //otra manera de ordenar, por nombre
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()));
        //desc
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
        //equivalente a línea anterior
        //sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        //haciendo import del método static
        sa.sort(comparing(Alumno::getNombre).reversed());
        
        System.out.println(sa);
        
        System.out.println("---Iterando con stream foreach---");
        sa.forEach(System.out::println);
    }
}

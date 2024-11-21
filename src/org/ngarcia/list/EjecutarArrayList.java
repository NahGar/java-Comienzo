package org.ngarcia.list;

import org.ngarcia.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjecutarArrayList {

    public static void main(String[] args) {
        
        List<Alumno> ar = new ArrayList<>();

        System.out.println("isEmpty:"+ar.isEmpty());

        ar.add(new Alumno("Marcos",5));
        ar.add(new Alumno("Roberto",10));
        ar.add(new Alumno("Mica",12));
        ar.add(new Alumno("Evan",9));
        ar.add(2, new Alumno("Gael",7)); //Gael desplaza a Mica
        ar.add(new Alumno("Zeus",1));
        ar.set(0,new Alumno("Marcos2",6)); //con SET, Marcos2 sustituye a Marcos

        System.out.println(ar+"\nsize:"+ar.size());
        System.out.println("isEmpty:"+ar.isEmpty());

        System.out.println("---remove---");
        ar.remove(new Alumno("Marcos2",6)); //borra a Marcos2 (utiliza equals de Alumno)
        ar.remove(1); //borra a Gael porque Roberto queda con id cero y Gael 1
        System.out.println(ar+"\nsize:"+ar.size());

        System.out.println("Contiene a Evan = " + ar.contains(new Alumno("Evan",9)));
        System.out.println("Contiene a Marcos2 = " + ar.contains(new Alumno("Marcos2",6)));

        System.out.println("---toArray---");
        Object a[] = ar.toArray();
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}

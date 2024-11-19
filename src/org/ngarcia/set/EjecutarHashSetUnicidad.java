package org.ngarcia.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.ngarcia.set.modelo.Alumno;

public class EjecutarHashSetUnicidad {

    public static void main(String[] args) {
        
        //Nota: Para este ejemplo se implementó equals es Alumno para
        //que considere nombre y nota para determinar si son iguales
        Set<Alumno> sa = new HashSet<>();
        //List<Alumno> sa = new ArrayList<>();
        //List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Marcos",5));
        sa.add(new Alumno("Roberto",10));
        sa.add(new Alumno("Mica",12));
        sa.add(new Alumno("Evan",9));
        sa.add(new Alumno("Gael",7));
        sa.add(new Alumno("Zeus",1));
        sa.add(new Alumno("Zeus",1));
        sa.add(new Alumno("Zeus",3));
        
        System.out.println(sa);
        
        /*
        System.out.println("---Utilizando for (solo ArrayList)---");
        for(int i=0; i<sa.size(); i++) {
            System.out.println(sa.get(i).getNombre());
        }
        */
        
        System.out.println("---Iterando foreach---");
        for(Alumno a: sa) {
            System.out.println(a.getNombre());
        }
        
        System.out.println("---Iterando con while y iterator---");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        
        System.out.println("---Iterando con stream foreach---");
        sa.forEach( a -> System.out.println(a.getNombre()) );
        //sa.forEach(System.out::println);
    }
}

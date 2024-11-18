package org.ngarcia.set;

import java.util.HashSet;
import java.util.Set;
import org.ngarcia.set.modelo.Alumno;

public class EjecutarHashSetUnicidad {

    public static void main(String[] args) {
        
        //Nota: Para este ejemplo se implementó equals es Alumno para
        //que considere nombre y nota para determinar si son iguales
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Marcos",5));
        sa.add(new Alumno("Roberto",10));
        sa.add(new Alumno("Mica",12));
        sa.add(new Alumno("Evan",9));
        sa.add(new Alumno("Gael",7));
        sa.add(new Alumno("Zeus",1));
        sa.add(new Alumno("Zeus",1));
        sa.add(new Alumno("Zeus",3));
        
        System.out.println(sa);
    }
}

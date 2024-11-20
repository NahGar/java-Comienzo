package org.ngarcia.set;

import org.ngarcia.set.modelo.Alumno;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjecutarLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> linked = new LinkedList<>();

        System.out.println("isEmpty:"+linked.isEmpty());

        linked.add(new Alumno("Marcos",5));
        linked.add(new Alumno("Roberto",10));
        linked.add(new Alumno("Mica",12));
        linked.add(new Alumno("Evan",9));
        linked.add(new Alumno("Gael",7)); //Gael desplaza a Mica
        linked.add(new Alumno("Zeus",1));
        linked.add(new Alumno("Pepe",6)); //con SET, Marcos2 sustituye a Marcos

        System.out.println(linked+"\nsize:"+linked.size());

        linked.addFirst(new Alumno("Lolo",6));
        linked.addLast(new Alumno("Luis",6));

        System.out.println(linked+"\nsize:"+linked.size());

        System.out.println("primero:"+linked.getFirst());
        //peek no da error si la lista está vacía
        System.out.println("primero peek:"+linked.peekFirst());
        System.out.println("ultimo:"+linked.getLast());
        //peek no da error si la lista está vacía
        System.out.println("ultimo peek:"+linked.peekLast());
        System.out.println("indice 2:"+linked.get(2));

        Alumno borrado = linked.removeFirst();
        linked.addLast(borrado);

        borrado = linked.pollLast(); //poll no da error si la lista está vacía
        linked.addFirst(borrado);

        //pop es equivalente a removeFirst() retorna excepción si List vacía
        //Alumno borrado = linked.pop();

        System.out.println(linked+"\nsize:"+linked.size());

        System.out.println("indice Pepe " + linked.indexOf(new Alumno("Pepe",6)) );

        System.out.println("---set(editar)---");

        linked.set(0,new Alumno("Lolo2",9));

        System.out.println(linked+"\nsize:"+linked.size());

        System.out.println("---ListIterator---");
        ListIterator<Alumno> li = linked.listIterator();

        while(li.hasNext()) {
            System.out.print(" " + li.next());
        }
        System.out.println("\n---Previous---");
        while(li.hasPrevious()) {
            System.out.print(" " + li.previous());
        }
    }
}

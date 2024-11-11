package org.ngarcia.poo.genericsClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }
    
    public Camion add(T objeto) {
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        }
        else {
            throw new RuntimeException("No hay más espacio");
        }
        return this;
    }
    
    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}

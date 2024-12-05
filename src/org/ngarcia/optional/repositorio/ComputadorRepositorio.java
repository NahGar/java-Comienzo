package org.ngarcia.optional.repositorio;

import java.util.*;
import org.ngarcia.optional.models.Computador;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;
    
    public ComputadorRepositorio() {
        this.dataSource = new ArrayList<>();
        this.dataSource.add(new Computador("Asus","SXR 457"));
        this.dataSource.add(new Computador("Macbook","MDJOCE 1"));
    }
    
    @Override
    public Optional<Computador> filtrar(String nombre) {
        /*
        for(Computador c: this.dataSource) {
            if(c.getNombre().equalsIgnoreCase(nombre)) {
                //return c;
                return Optional.of(c);
            }
        }
        //return null;
        return Optional.empty();
        */
        return dataSource.stream()
                .filter( c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }
    
}

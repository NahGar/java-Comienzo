package org.ngarcia.optional.repositorio;

import java.util.*;
import org.ngarcia.optional.models.Computador;
import org.ngarcia.optional.models.Fabricante;
import org.ngarcia.optional.models.Procesador;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;
    
    public ComputadorRepositorio() {
        this.dataSource = new ArrayList<>();

        Computador computador = new Computador("Asus","SXR 457");
        computador.setProcesador(new Procesador("i5", new Fabricante("Intel")));
        this.dataSource.add(computador);
        computador = new Computador("Macbook","MDJOCE 1");
        computador.setProcesador(new Procesador("a4", new Fabricante("Apple")));
        this.dataSource.add(computador);
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
                .filter( c -> c.getNombre().toLowerCase().equalsIgnoreCase(nombre.toLowerCase()))
                .findFirst();
    }
    
}

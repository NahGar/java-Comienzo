package org.ngarcia.poo.interfaces.repositorio;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T> implements FullRepositorio<T> {

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
    
    @Override
    public List<T> listar() {
        return this.dataSource;
    }
    /*
    @Override
    public Cliente getPorId(Integer id) {
        Cliente cliente = null;
        for(Cliente cli: this.dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)) {
                cliente = cli;
                break;
            }
        }
        return cliente;
    }
    */
    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.getPorId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

}


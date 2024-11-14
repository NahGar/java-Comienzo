package org.ngarcia.poo.interfaces.repositorio;

import org.ngarcia.poo.interfaces.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;
import org.ngarcia.poo.interfaces.repositorio.excepciones.LecturaAccesoDatoException;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements FullRepositorio<T> {

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
    
    @Override
    public List<T> listar() {
        return this.dataSource;
    }

    @Override
    //LecturaAccesoDatoException es hija de AccesoDatoException, definida
    //en la interface CrudRepositorio
    public T getPorId(Integer id) throws LecturaAccesoDatoException {
        if(id == null || id <= 0) {
            throw new LecturaAccesoDatoException("Id inválido");
        }
        T obj = null;
        for(T t: this.dataSource) {
            if(t.getId() != null && t.getId().equals(id)) {
                obj = t;
                break;
            }
        }
        return obj;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
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


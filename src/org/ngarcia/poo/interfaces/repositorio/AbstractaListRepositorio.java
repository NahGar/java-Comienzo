package org.ngarcia.poo.interfaces.repositorio;

import java.util.ArrayList;
import java.util.List;
import org.ngarcia.poo.interfaces.modelo.BaseEntity;
import org.ngarcia.poo.interfaces.repositorio.excepciones.*;

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
        if(obj == null) {
            throw new LecturaAccesoDatoException("No existe el id " + id);
        }
        return obj;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException {
        if(t == null) {
            throw new EscrituraAccesoDatoException("El objeto a crear es null");
        }
        if(this.dataSource.contains(t)) {
            throw new RegistroDuplicadoAccesoDatoException("El objeto con el id " + t.getId() + " ya existe");
        }
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


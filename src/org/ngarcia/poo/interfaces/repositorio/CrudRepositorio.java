package org.ngarcia.poo.interfaces.repositorio;

import java.util.List;
import org.ngarcia.poo.interfaces.repositorio.excepciones.AccesoDatoException;
import org.ngarcia.poo.interfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.ngarcia.poo.interfaces.repositorio.excepciones.LecturaAccesoDatoException;

//import org.ngarcia.poo.interfaces.modelo.Cliente;
/*
public interface CrudRepositorio {

    List<Cliente> listar();
    Cliente getPorId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
*/
public interface CrudRepositorio<T> {

    List<T> listar();
    //se define AccesoDatoException por ser la más genérica
    T getPorId(Integer id) throws AccesoDatoException;
    void crear(T obj) throws AccesoDatoException;
    void editar(T obj) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;
}
package org.ngarcia.poo.interfaces.repositorio;

import java.util.List;
import org.ngarcia.appfacturas.modelo.Cliente;

public interface CrudRepositorio {

    List<Cliente> listar();
    Cliente getPorId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Cliente cliente);
}

package org.ngarcia.poo.interfaces.repositorio;

import java.util.List;
import org.ngarcia.appfacturas.modelo.Cliente;

public interface PaginableRepositorio {
    
    List<Cliente> listar(int desde, int hasta);
}

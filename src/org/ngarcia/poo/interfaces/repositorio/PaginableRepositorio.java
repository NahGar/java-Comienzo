package org.ngarcia.poo.interfaces.repositorio;

import java.util.List;
import org.ngarcia.poo.interfaces.modelo.Cliente;

public interface PaginableRepositorio {
    
    List<Cliente> listar(int desde, int hasta);
}

package org.ngarcia.poo.interfaces.repositorio;

import java.util.List;
import org.ngarcia.poo.interfaces.modelo.Cliente;

public interface OrdenableRepositorio {
    
    List<Cliente> listar(String campoOrdenar, EnumDireccion dir);

}
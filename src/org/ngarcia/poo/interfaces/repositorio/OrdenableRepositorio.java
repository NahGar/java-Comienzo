package org.ngarcia.poo.interfaces.repositorio;

import java.util.List;
import org.ngarcia.appfacturas.modelo.Cliente;

public interface OrdenableRepositorio {
    
    List<Cliente> listar(String campo, EnumDireccion dir);
}

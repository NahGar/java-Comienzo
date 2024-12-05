package org.ngarcia.optional.repositorio;

import java.util.Optional;
import org.ngarcia.optional.models.Computador;

public interface Repositorio<T> {
    //Computador filtrar(String nombre);
    Optional<Computador> filtrar(String nombre);
}

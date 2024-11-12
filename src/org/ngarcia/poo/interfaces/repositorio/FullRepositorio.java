package org.ngarcia.poo.interfaces.repositorio;
/*
public interface FullRepositorio extends
        OrdenableRepositorio,
        PaginableRepositorio,
        CrudRepositorio,
        ContableRepositorio {
}
*/
public interface FullRepositorio<T> extends
        OrdenableRepositorio<T>,
        PaginableRepositorio<T>,
        CrudRepositorio<T>,
        ContableRepositorio {
}
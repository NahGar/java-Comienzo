package org.ngarcia.poo.interfaces.repositorio.lista;

import java.util.ArrayList;
import java.util.List;
import org.ngarcia.poo.interfaces.modelo.Producto;
import org.ngarcia.poo.interfaces.repositorio.*;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {


    @Override
    public void editar(Producto producto) {
        Producto prod = this.getPorId(producto.getId());
        prod.setDescripcion(producto.getDescripcion());
        prod.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campoOrdenar, EnumDireccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);

        //como Coparator es @FunctionalInterface se pueden usar
        //expresiones lambda (porque tiene un único método)
        listaOrdenada.sort((prod1, prod2) -> {

            int resultado = 0;
            if(dir == EnumDireccion.ASC) {
                resultado = ordenar(campoOrdenar, prod1, prod2);
            }
            else if(dir == EnumDireccion.DESC) {
                resultado = ordenar(campoOrdenar, prod2, prod1);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    public static int ordenar(String campoOrdenar, Producto prod1, Producto prod2) {
        int resultado = 0;
        switch (campoOrdenar) {
            case "id" ->
                    resultado = prod1.getId().compareTo(prod2.getId());
            case "descripción" ->
                    resultado = prod1.getDescripcion().compareTo(prod2.getDescripcion());
            case "precio" ->
                    resultado = prod1.getPrecio().compareTo(prod2.getPrecio());
        }
        return resultado;
    }

}

package org.ngarcia.poo.interfaces;

import org.ngarcia.poo.interfaces.modelo.Cliente;
import org.ngarcia.poo.interfaces.modelo.Producto;
import org.ngarcia.poo.interfaces.repositorio.EnumDireccion;
import org.ngarcia.poo.interfaces.repositorio.FullRepositorio;
import org.ngarcia.poo.interfaces.repositorio.lista.ClienteListRepositorio;
import org.ngarcia.poo.interfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjecutarProductos {

    public static void main(String[] args) {

        FullRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("caja herramientas",85.0));
        repo.crear(new Producto("zapatos",72.0));
        repo.crear(new Producto("camiseta",10.0));
        repo.crear(new Producto("coca cola",15.0));
        repo.crear(new Producto("pan de molde",5.0));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);

        System.out.println("------------------------------------------");

        //El desde y hasta son las posiciones [0,1,2,3] y se incluye desde y excluye hasta
        List<Producto> paginable = repo.listar(2,4);
        paginable.forEach(System.out::println);

        System.out.println("------------------------------------------");

        List<Producto> ordenAsc = repo.listar("apellido",EnumDireccion.ASC);
        ordenAsc.forEach(System.out::println);

        System.out.println("-----------------UPD----------------------");

        Producto producto = repo.getPorId(1);
        producto.setDescripcion("Caña de pescar");
        repo.editar(producto);

        List<Producto> ordenDesc = repo.listar("descripcion",EnumDireccion.DESC);
        ordenDesc.forEach(System.out::println);

        System.out.println("-----------------ADD----------------------");

        Producto agregar = new Producto("Nuevito",44.0);
        repo.crear(agregar);
        ordenDesc.forEach(System.out::println);

        System.out.println("-----------------DLT----------------------");

        repo.eliminar(5);

        List<Producto> ordenAsc2 = repo.listar("descripcion",EnumDireccion.ASC);
        ordenAsc2.forEach(System.out::println);

        System.out.println("Total: "+ repo.total());

    }
}

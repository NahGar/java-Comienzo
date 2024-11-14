package org.ngarcia.poo.interfaces;

import java.util.List;
import org.ngarcia.poo.interfaces.modelo.*;
import org.ngarcia.poo.interfaces.repositorio.*;
import org.ngarcia.poo.interfaces.repositorio.lista.ClienteListRepositorio;
import org.ngarcia.poo.interfaces.repositorio.excepciones.*;

public class EjecutarClientes {

    public static void main(String[] args) {

        try {
        
            FullRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Pedro","Rodríguez"));
            repo.crear(new Cliente("Micaela","Nieves"));
            repo.crear(new Cliente("Evan","Garcia"));
            repo.crear(new Cliente("Gael","Garcia"));

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println("------------------------------------------");

            //El desde y hasta son las posiciones [0,1,2,3] y se incluye desde y excluye hasta
            List<Cliente> paginable = repo.listar(2,4);
            paginable.forEach(System.out::println);

            System.out.println("------------------------------------------");

            List<Cliente> ordenAsc = repo.listar("apellido",EnumDireccion.ASC);
            ordenAsc.forEach(System.out::println);

            System.out.println("-----------------UPD----------------------");

            Cliente cliente = repo.getPorId(1);
            cliente.setNombre("Alexis");
            repo.editar(cliente);

            List<Cliente> ordenDesc = repo.listar("nombre",EnumDireccion.DESC);
            ordenDesc.forEach(System.out::println);

            System.out.println("-----------------ADD----------------------");

            Cliente agregar = new Cliente("Nuevo","Nuevecito");
            repo.crear(agregar);
            ordenDesc.forEach(System.out::println);

            System.out.println("-----------------DLT----------------------");

            repo.eliminar(5);
            ordenDesc.forEach(System.out::println);

            System.out.println("Total: "+ repo.total());
        }
        catch(LecturaAccesoDatoException e) {
            System.out.println("Error: "+ e.getMessage());
            e.printStackTrace();
        }
        catch(AccesoDatoException e) {
            System.out.println("Error: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}

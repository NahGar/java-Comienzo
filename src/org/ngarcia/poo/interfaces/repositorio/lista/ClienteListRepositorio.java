package org.ngarcia.poo.interfaces.repositorio.lista;

import java.util.ArrayList;
import java.util.List;
import org.ngarcia.poo.interfaces.modelo.Cliente;
import org.ngarcia.poo.interfaces.repositorio.*;
import org.ngarcia.poo.interfaces.repositorio.excepciones.*;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    //se implementa en BaseEntity (padre de AbstractaListRepositorio)
    /*
    @Override
    public Cliente getPorId(Integer id) {
        Cliente cliente = null;
        for(Cliente cli: this.dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)) {
                cliente = cli;
                break;
            }
        }
        return cliente;
    }
    */

    @Override
    public void editar(Cliente cliente) {
        try {
            Cliente cli = this.getPorId(cliente.getId());
            cli.setNombre(cliente.getNombre());
            cli.setApellido(cliente.getApellido());
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

    @Override
    public List<Cliente> listar(String campoOrdenar, EnumDireccion dir) {

        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
  
        //como Coparator es @FunctionalInterface se pueden usar
        //expresiones lambda (porque tiene un único método)
        listaOrdenada.sort((cli1, cli2) -> {

            int resultado = 0;
            if(dir == EnumDireccion.ASC) {
                resultado = ordenar(campoOrdenar, cli1, cli2);
            }
            else if(dir == EnumDireccion.DESC) {
                resultado = ordenar(campoOrdenar, cli2, cli1);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    public static int ordenar(String campoOrdenar, Cliente cli1, Cliente cli2) {
        int resultado = 0;
        switch (campoOrdenar) {
            case "id" ->
                    resultado = cli1.getId().compareTo(cli2.getId());
            case "nombre" ->
                    resultado = cli1.getNombre().compareTo(cli2.getNombre());
            case "apellido" ->
                    resultado = cli1.getApellido().compareTo(cli2.getApellido());
        }
        return resultado;
    }

}

/*
public class ClienteListRepositorio implements FullRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
    
    @Override
    public List<Cliente> listar() {
        return this.dataSource;
    }

    @Override
    public Cliente getPorId(Integer id) {
        Cliente cliente = null;
        for(Cliente cli: this.dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)) {
                cliente = cli;
                break;
            }
        }
        return cliente;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.getPorId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.getPorId(id));
    }

    @Override
    public List<Cliente> listar(String campoOrdenar, EnumDireccion dir) {

        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        
        //listaOrdenada.sort(new Comparator<Cliente>() {
        //    @Override
        //    public int compare(Cliente cli1, Cliente cli2) {
        //        int resultado = 0;
        //        if(dir == EnumDireccion.ASC) {
        //            resultado = this.ordenar(cli1, cli2);
        //        }
        //        else if(dir == EnumDireccion.DESC) {
        //            resultado = this.ordenar(cli2, cli1);
        //        }
        //        return resultado;
        //    }

        //    private int ordenar(Cliente cli1, Cliente cli2) {
        //        int resultado = 0;
        //        switch (campoOrdenar) {
        //            case "id" ->
        //                resultado = cli1.getId().compareTo(cli2.getId());
        //            case "nombre" ->
        //                resultado = cli1.getNombre().compareTo(cli2.getNombre());
        //            case "apellido" ->
        //                resultado = cli1.getApellido().compareTo(cli2.getApellido());
        //        }
        //        return resultado;
        //    }
        //});

        //como Coparator es @FunctionalInterface se pueden usar
        //expresiones lambda (porque tiene un único método)
        listaOrdenada.sort((cli1, cli2) -> {

            int resultado = 0;
            if(dir == EnumDireccion.ASC) {
                resultado = ordenar(campoOrdenar, cli1, cli2);
            }
            else if(dir == EnumDireccion.DESC) {
                resultado = ordenar(campoOrdenar, cli2, cli1);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

    public static int ordenar(String campoOrdenar, Cliente cli1, Cliente cli2) {
        int resultado = 0;
        switch (campoOrdenar) {
            case "id" ->
                    resultado = cli1.getId().compareTo(cli2.getId());
            case "nombre" ->
                    resultado = cli1.getNombre().compareTo(cli2.getNombre());
            case "apellido" ->
                    resultado = cli1.getApellido().compareTo(cli2.getApellido());
        }
        return resultado;
    }

}
*/
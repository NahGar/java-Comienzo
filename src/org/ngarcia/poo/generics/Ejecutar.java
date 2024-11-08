package org.ngarcia.poo.generics;

import org.ngarcia.poo.interfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejecutar {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Micaela","Nieves"));
        Cliente mica1 = clientes.get(0);
        Cliente mica2 = clientes.iterator().next(); //obtiene el primer elemento

        Cliente[] clientesArreglo = {mica1,
                new Cliente("Nahuel","Garcia"),
                new Cliente("Evan","Cito")};

        Integer[] enterosArreglo = {1,2,3,4};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        clientesLista.forEach(System.out::println);

        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        enterosLista.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayToList(T[] clientes) {
        return Arrays.asList(clientes);
    }

    //recibe 2 parametros T y G genéricos
    public static <T, G> List<T> fromArrayToList(T[] clientes, G[] g) {
        for(G elem: g) {
            System.out.println(elem);
        }
        return Arrays.asList(clientes);
    }
}

package org.ngarcia.poo.generics;

import org.ngarcia.poo.interfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.ngarcia.poo.interfaces.modelo.ClientePremium;

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

        //Cliente no implementa Comparable y utiliza la sobrecarga 1
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        clientesLista.forEach(System.out::println);

        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        enterosLista.forEach(System.out::println);
        
        List<String> nombres = fromArrayToList(new String[] {"Pepe","Juan",
            "Mica","Bea"}, enterosArreglo );
        nombres.forEach(System.out::println);
        
        //ClientePremium implementa Comparable y utiliza la sobrecarga 3
        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[] { new ClientePremium("Pedro", "Márquez") });
        
        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        //para que se pueda pasar una lista de ClientePremiun se
        //modifica el parametro que recibe List<? extends Cliente> clientes
        imprimirClientes(clientesPremiumList);
        
        
        System.out.println(maximo(1,9,4)); 
        System.out.println(maximo("A","1","r")); 
        System.out.println(maximo(3.9,5.7,-8.0)); 
    }
    
    //sobrecarga 1
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
    
    //sobrecarga 2
    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
    
    //sobrecarga 3
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    //recibe 2 parametros T y G genéricos
    public static <T, G> List<T> fromArrayToList(T[] clientes, G[] g) {
        for(G elem: g) {
            System.out.println(elem);
        }
        return Arrays.asList(clientes);
    }
    
    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }
    
    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        
        T max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}

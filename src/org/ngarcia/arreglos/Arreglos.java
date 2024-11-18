package org.ngarcia.arreglos;

import java.util.Arrays;

public class Arreglos {

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        for(int i=0; i < total/2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
        }
    }

    public static void main(String[] args) {

        String[] productos = new String[5]; //arreglo de 4 valores en null

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD externo";
        productos[3] = "Chromecast";
        productos[4] = "Notebook Asus";

        Arrays.sort(productos);

        for(String producto: productos) {
            System.out.println(producto);
        }

        int[] numeros = new int[4]; //arreglo con 4 valores en cero

        numeros[1] = 4;
        numeros[2] = Integer.valueOf("2");
        numeros[3] = 9; //al ultimo valor le carga 9

        Arrays.sort(numeros);

        for(int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int i = 0;
        while (i < productos.length) {
            System.out.println(productos[i]);
            i++;
        }

        System.out.println("** ordenar al revés");
        arregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos));

        for(String producto: productos) {
            System.out.println(producto);
        }
    }
}

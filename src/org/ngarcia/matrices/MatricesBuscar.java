package org.ngarcia.matrices;

public class MatricesBuscar {

    public static void main(String[] args) {

        int[][] matriz = {
                {35,90,3,1978},
                {15,2020,10,5},
                {677,127,32767,1999}
        };

        int elementoBuscar = 32767, i=0, j=0;
        boolean encontrado = false;

        buscar: for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado) {
            System.out.println("Encontrado en i="+i+" j="+j);
        }
    }
}

package org.ngarcia.matrices;

public class MatricesColsVariables {

    public static void main(String[] args) {

        int[][] matriz = new int[3][];

        matriz[0] = new int[4]; //row 1 tiene 4 columnas
        matriz[1] = new int[2]; //row 2 tiene 2 columnas
        matriz[2] = new int[6]; //row 3 tiene 6 columnas

        for (int row = 0; row < matriz.length; row++) {

            for (int col = 0; col < matriz[row].length; col++) {
                System.out.print(matriz[row][col]);
            }
            System.out.println();
        }


    }
}

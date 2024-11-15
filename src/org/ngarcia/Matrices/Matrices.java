package org.ngarcia.Matrices;

public class Matrices {

    public static void main(String[] args) {

        /*int[][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;
        numeros[1][0] = 5;
        numeros[1][1] = 6;
        numeros[1][2] = 7;
        numeros[1][3] = 8;
        */
        int[][] numeros = { {1,2,3,4}, {5,6,7,8} };

        System.out.println("Cant rows " + numeros.length);
        System.out.println("Cant cols " + numeros[0].length); //puede  variar por row

        System.out.println("Primer elemento " + numeros[0][0]);
        System.out.println("Ultimo elemento " + numeros[numeros.length-1][numeros[1].length-1]); //fila 2, col 4

        for(int row = 0; row < numeros.length; row++) {
            for(int col = 0; col < numeros[row].length; col++) {
                System.out.println("["+row+","+col+"] " + numeros[row][col]);
            }
        }

        int rowId = 0;
        int colId = 0;
        for(int[] row: numeros) {
            for(int col: row) {
                System.out.println("["+rowId+","+colId+"] " + col);
                colId++;
            }
            rowId++;
            colId=0;
        }
    }
}

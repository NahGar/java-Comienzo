package Tareas;

public class TareaImprimirSilla {

    public static void main(String[] args) {

        int n = 10;

        if(n == 0) {
            System.out.println("Tamaño de matriz no puede ser cero");
            System.exit(1);
        }

        int[][] matriz = new int[n][n];

        int asiento = n / 2;

        for (int row = 0; row < matriz.length ; row++) {

            for (int col = 0; col < matriz[row].length ; col++) {

                if( col == 0 || row == asiento || col == n - 1 && row > asiento) {
                    matriz[row][col] = 1;
                }

            }
        }

        for (int row = 0; row < matriz.length ; row++) {

            for (int col = 0; col < matriz[row].length ; col++) {

                System.out.print(matriz[row][col]);
            }
            System.out.println();
        }

    }
}

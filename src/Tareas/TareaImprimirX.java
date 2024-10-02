package Tareas;

public class TareaImprimirX {

    public static void main(String[] args) {

        int n = 6;

        if(n == 0) {
            System.out.println("Tamaño de matriz no puede ser cero");
            System.exit(1);
        }

        String[][] matriz = new String[n][n];

        for (int row = 0; row < matriz.length ; row++) {

            for (int col = 0; col < matriz[row].length ; col++) {

                matriz[row][col] = "_";
                if(col == row || col == n - 1 - row ) {
                    matriz[row][col] = "X";
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

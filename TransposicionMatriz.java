// Transposición de matrices: Imprime por consola la transposición de una matriz. La transposición es una nueva matriz donde las filas
// de la matriz original se convierten en columnas y viceversa.
// Por ejemplo:

// [1, 2, 3] [1, 4, 7]

// [4, 5, 6] → [2, 5, 8]

// [7, 8 ,9] [3, 6 , 9]


public class TransposicionMatriz {
    public static void main(String[] args) {
        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Crear matriz de transposicion
        int[][] matrizTranspuesta = new int[columnas][filas];

        // Realizar la transposición
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        // Imprimir la matriz transpuesta
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }

    }
}

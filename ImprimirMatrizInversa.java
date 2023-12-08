// Imprimir una matriz en orden inverso: Imprime los elementos de una matriz en orden inverso.
// Por ejemplo:

// [5, 3, 2] [6, 5, 9]
// [8, 1, 5] →   [5, 1, 8]
// [9, 5, 6]   [2, 3, 5]


public class ImprimirMatrizInversa {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 3, 2},
            {8, 1, 5},
            {9, 5, 6}

        };

        // Imprimir la matriz en order inverso
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }            
}

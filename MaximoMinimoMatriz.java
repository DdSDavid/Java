// Encontrar el elemento máximo y mínimo en una matriz.

public class MaximoMinimoMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 3, 2},
            {8, 1, 5},
            {4, 7, 9}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int maximo = matriz[0][0];
        int minimo = matriz[0][0];

        // Encontrar el máximo y mínimo
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int elemento = matriz[i][j];
                if (elemento > maximo) {
                    maximo = elemento;
                }
                if (elemento < minimo) {
                    minimo = elemento;
                }
            }
        }

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}

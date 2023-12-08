// Sumar dos matrices de la misma dimensión: La suma de dos matrices se realiza sumando cada elemento correspondiente
// en las dos matrices. Por ejemplo, si tienes dos matrices A y B, el elemento en la primera fila y la primera columna
// de la matriz sumada C sería la suma del elemento en la primera fila y la primera columna de A y el mismo elemento de B.

// [1,  2, 3] [10,  20, 30]  [11,   22, 33]

// [4, 5, 6]  + [40, 50, 60] = [44, 55, 66]

// [7, 8, 9] [70, 80, 90] [77,  88, 99]


public class SumaMatrices {
    public static void main(String[] args) {
        int [][] matrizA = {
            {1, 2, 3},
            {10, 20, 30}
        };

        int [][] matrizB = {
            {4, 5, 6},
            {40, 50, 60}
        };

        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        // Crear la matriz para la suma
        int[][] matrizSuma = new int[filas][columnas];

        // Realizar la suma de las matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        // Imprimir suma
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }    
    }
}

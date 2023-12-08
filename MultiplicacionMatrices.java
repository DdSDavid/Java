// Multiplicar dos matrices: La multiplicación de matrices es un poco más complicada que la suma. Para multiplicar dos matrices, 
// necesitas seguir estos pasos para cada elemento de la matriz resultante:

//     Multiplica cada elemento de una fila de la primera matriz por el elemento correspondiente de una columna de la segunda matriz.

//     Suma todos esos productos.

//     Ese es el valor del elemento en la fila y columna correspondientes de la matriz resultante.

// Por ejemplo:

// [1, 2] [5, 6] [(1*5 + 2*7),  (1*6 + 2*8)] [19, 22]

// [3, 4] [7, 8] [(3*5 + 4*7), (3*6 + 4*8)] [43, 50]


public class MultiplicacionMatrices {
    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrizB = {
            {5, 6},
            {7, 8}
        };

        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        // Crear la matriz para el resultado de la multiplicación
        int[][] matrizResultado = new int[filasA][columnasB];

        // Realizar la multiplicación de las matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int suma = 0;
                for (int k = 0; k < columnasA; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                matrizResultado[i][j] = suma;
            }
        }

        // Imprimir la matriz resultado
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

// Matriz mágica

// Escribir un programa que determine si una matriz es una matriz mágica. 

// 💡En matemáticas, una matriz mágica es una matriz cuadrada de números enteros donde los números no se repiten y la suma de los números
//   en cada fila, columna y ambas diagonales principales es igual. 

// En este caso, se utilizará una matriz de tamaño 3x3, con números enteros del 1 al 9.

// Aquí te compartimos dos ejemplos de matrices mágicas para verificar el algoritmo:

// Matriz 1:

// 8 1 6

// 3 5 7

// 4 9 2

// Matriz 2:

// 2 7 6

// 9 5 1

// 4 3 8

// El programa verificará si cada matriz cumple con las condiciones de una matriz mágica.


public class MatrizMagica {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        int[][] matriz2 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        boolean esMatrizMagica1 = esMatrizMagica(matriz1);
        boolean esMatrizMagica2 = esMatrizMagica(matriz2);

        System.out.println("La matriz 1 es una matriz mágica: " + esMatrizMagica1);
        System.out.println("La matriz 2 es una matriz mágica: " + esMatrizMagica2);
    }

    private static boolean esMatrizMagica(int[][] matriz) {
        // Verificar que los números sean distintos
        boolean[] numerosUtilizados = new boolean[10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero = matriz[i][j];
                if (numero < 1 || numero > 9 || numerosUtilizados[numero]) {
                    return false;
                }
                numerosUtilizados[numero] = true;
            }
        }

        // Calcular la suma objetivo
        int sumaObjetivo = matriz[0][0] + matriz[0][1] + matriz[0][2];

        // Verificar filas
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaObjetivo) {
                return false;
            }
        }

        // Verificar columnas
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaObjetivo) {
                return false;
            }
        }

        // Verificar diagonales principales
        int sumaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (sumaDiagonalPrincipal != sumaObjetivo || sumaDiagonalSecundaria != sumaObjetivo) {
            return false;
        }

        return true;
    }
}


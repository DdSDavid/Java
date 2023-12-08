// Matriz espiralada: Pedir al usuario dos números para crear una matriz “tamaño1 x tamaño2” y luego rellenarla de
// forma espiralada en sentido horario, comenzando desde (0,0). Por ejemplo, una matriz 3x4 se llenaría de la siguiente
// manera:

// [1, 2, 3, 4]

// [10, 11 , 12 ,5]

// [9, 8, 7, 6]

import java.util.Scanner;

public class MatrizEspiralada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el tamaño de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        int valor = 1;
        int inicioFila = 0;
        int finFila = filas - 1;
        int inicioColumna = 0;
        int finColumna = columnas - 1;

        while (valor <= filas * columnas) {
            // Llenar la fila superior
            for (int i = inicioColumna; i <= finColumna; i++) {
                matriz[inicioFila][i] = valor++;
            }
            inicioFila++;

            // Llenar la columna derecha
            for (int i = inicioFila; i <= finFila; i++) {
                matriz[i][finColumna] = valor++;
            }
            finColumna--;

            // Llenar la fila inferior
            for (int i = finColumna; i >= inicioColumna; i--) {
                matriz[finFila][i] = valor++;
            }
            finFila--;

            // Llenar la columna izquierda
            for (int i = finFila; i >= inicioFila; i--) {
                matriz[i][inicioColumna] = valor++;
            }
            inicioColumna++;
        }

        // Imprimir la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

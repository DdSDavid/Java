// Buscaminas
// Escribir un programa que implemente el clásico juego del Buscaminas. A continuación, se detalla el funcionamiento del programa:

//     Generar mapa: El programa crea una matriz aleatoria que representa el mapa del buscaminas. En esta matriz, se colocan de
//     manera aleatoria las minas ("M") y las celdas sin minas ("O").

//     Imprimir mapa: El programa muestra por consola el mapa generado, mostrando las minas y las celdas sin minas.

//     Calcular el número de minas: El programa modifica el mapa para calcular el número de minas que hay alrededor de cada celda.
//     En las celdas sin minas, se muestra el número de minas circundantes.


import java.util.Random;

public class Buscaminas {
    private static final int FILAS = 8;
    private static final int COLUMNAS = 8;
    private static final int MINAS = 10;

    private static char[][] mapa;
    private static int[][] minasAlrededor;

    public static void main(String[] args) {
        generarMapa();
        imprimirMapa();
        calcularMinasAlrededor();
        imprimirMapaConMinasAlrededor();
    }

    private static void generarMapa() {
        mapa = new char[FILAS][COLUMNAS];
        Random random = new Random();

        // Inicializar mapa con celdas sin minas
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                mapa[i][j] = 'O';
            }
        }

        // Colocar minas en posiciones aleatorias
        int minasColocadas = 0;
        while (minasColocadas < MINAS) {
            int fila = random.nextInt(FILAS);
            int columna = random.nextInt(COLUMNAS);
            if (mapa[fila][columna] != 'M') {
                mapa[fila][columna] = 'M';
                minasColocadas++;
            }
        }
    }

    private static void imprimirMapa() {
        System.out.println("Mapa del Buscaminas:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void calcularMinasAlrededor() {
        minasAlrededor = new int[FILAS][COLUMNAS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (mapa[i][j] != 'M') {
                    int count = 0;
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            int newRow = i + k;
                            int newColumn = j + l;
                            if (newRow >= 0 && newRow < FILAS && newColumn >= 0 && newColumn < COLUMNAS) {
                                if (mapa[newRow][newColumn] == 'M') {
                                    count++;
                                }
                            }
                        }
                    }
                    minasAlrededor[i][j] = count;
                }
            }
        }
    }

    private static void imprimirMapaConMinasAlrededor() {
        System.out.println("Mapa del Buscaminas con minas alrededor:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (mapa[i][j] == 'M') {
                    System.out.print("M ");
                } else {
                    System.out.print(minasAlrededor[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}


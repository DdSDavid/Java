// Solucionador de Sudoku

// El objetivo de este ejercicio es desarrollar un programa que pueda verificar si un número dado es una solución posible para una casilla
// en un juego de Sudoku. 
// El juego de Sudoku se representa en un tablero de 9x9 celdas, dividido en 9 bloques de 3x3 celdas. El desafío del juego consiste en 
// completar todas las celdas vacías del tablero de manera que cada fila, columna y bloque contenga todos los números del 1 al 9 exactamente
// una vez. 

// En este caso, tu programa no debe resolver automáticamente el juego, sino permitir al usuario elegir una casilla y luego ingresar un número 
// para calcular si esa opción es válida para la casilla seleccionada.

// A continuación, te proporcionamos un juego de Sudoku que puedes utilizar como base:
// int[][] sudoku = {
//         {0, 4, 5,  0, 2, 0,  1, 7, 0},
//         {7, 2, 6,  0, 5, 0,  9, 0, 3},
//         {0, 9, 1,  0, 7, 3,  6, 0, 2},

//         {4, 0, 9,  0, 0, 5,  2, 0, 0},
//         {1, 0, 0,  7, 0, 0,  0, 9, 0},
//         {5, 0, 8,  2, 1, 0,  4, 0, 0},

//         {9, 1, 0,  0, 0, 8,  0, 0, 4},
//         {0, 8, 0,  0, 4, 2,  5, 0, 0},
//         {2, 0, 4,  0, 9, 7,  3, 0, 0}

// };

// Tu programa debe tener un menú con las siguientes opciones:
// 1.  Mostrar sudoku: Imprime por consola la cuadrícula del Sudoku.
// 2. Probar valor: Permite al usuario ingresar las coordenadas de una celda (verificando su validez) y luego solicitar un número para validar.
// Para que el número sea válido, debe cumplir con las siguientes condiciones simultáneamente:
//     Debe que ser un número entre 1 y 9.
//     No debe existir ese número en la fila de la celda objetivo.
//     No debe existir ese número en la columna de la celda objetivo.
//     No debe existir ese número en el bloque 3x3 de la celda objetivo.
// Si el valor es válido, el programa debe imprimir: 
// “El número ”+valor+” es una solución posible para la celda [”+i+”,”+j+”]”
// Si el valor es inválido, el programa debe imprimir:
//  “El número ”+valor+” no es una solución posible para la celda [”+i+”,”+j+”]”.
// A continuación, te mostramos las soluciones posibles de algunas celdas para que puedas verificar el correcto funcionamiento de tu programa:
//     Celda [0,0]: 3
//     Celda [2,0]: 8
//     Celda [0,3]: 6, 8 y 9
//     Celda [0,5]: 6 y 9
// Una vez que hayas comprobado que las características mencionadas anteriormente funcionan correctamente, puedes mejorar el programa con 
// las siguientes opciones adicionales:

// 3. Sobreescribir borrador: Permite ingresar un valor en una celda de una matriz "borrador" basada en una copia del Sudoku original. 
//     Si la celda que se desea cambiar ya tiene un valor en la matriz original del Sudoku, se debe mostrar un mensaje de error indicando que la
//    celda no se puede modificar. 
//     Si la celda se puede modificar, se debe verificar si ese valor es válido en esta nueva matriz e imprimir un mensaje indicando si la
//    modificación fue exitosa o no.

// 4. Mostrar Borrador y Sudoku: Imprime por consola tanto la matriz "borrador" como el Sudoku original
// 5. Resetear Borrador: Restablece la matriz "borrador" para que vuelva a tener los mismos valores que el Sudoku original.
// 6. Mostrar Valores Posibles de una Celda: Permite ingresar las coordenadas de una celda e imprime por pantalla los valores posibles tanto 
// en la matriz "borrador" como en el Sudoku original:
// “Borrador: soluciones posibles para la celda [“+i+”, ”+j+”]: ”+solucionesBorrador

// “Sudoku: soluciones posibles para la celda [“+i+”, ”+j+”]: ”+solucionesSudoku

// Si la matriz borrador no admite valores posibles para una celda se de mostrar el siguiente mensaje:

// “La configuración actual del borrador no admite soluciones posibles para la celda [“+i+”, ”+j+”]” “Sudoku: soluciones posibles para la 
// celda [“+i+”, ”+j+”]: ”+solucionesSudoku.

import java.util.Scanner;

public class SudokuSolver {

    // Sudoku original
    private static int[][] sudoku = {
        {0, 4, 5, 0, 2, 0, 1, 7, 0},
        {7, 2, 6, 0, 5, 0, 9, 0, 3},
        {0, 9, 1, 0, 7, 3, 6, 0, 2},
        {4, 0, 9, 0, 0, 5, 2, 0, 0},
        {1, 0, 0, 7, 0, 0, 0, 9, 0},
        {5, 0, 8, 2, 1, 0, 4, 0, 0},
        {9, 1, 0, 0, 0, 8, 0, 0, 4},
        {0, 8, 0, 0, 4, 2, 5, 0, 0},
        {2, 0, 4, 0, 9, 7, 3, 0, 0}
    };

    // Borrador para guardar las modificaciones
    private static int[][] borrador = new int[9][9];

    // Constantes
    private static final int VACIO = 0;
    private static final int MIN_VALOR = 1;
    private static final int MAX_VALOR = 9;
    private static final int FILAS = 9;
    private static final int COLUMNAS = 9;
    private static final int BLOQUE_FILAS = 3;
    private static final int BLOQUE_COLUMNAS = 3;

    // Scanner para leer la entrada del usuario
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicializar el borrador con el Sudoku original
        for (int i = 0; i < FILAS; i++) {
            System.arraycopy(sudoku[i], 0, borrador[i], 0, COLUMNAS);
        }

        // Menú principal
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    mostrarSudoku(sudoku);
                    break;
                case 2:
                    probarValor();
                    break;
                case 3:
                    sobreescribirBorrador();
                    break;
                case 4:
                    mostrarBorradorYSudoku();
                    break;
                case 5:
                    resetearBorrador();
                    break;
                case 6:
                    mostrarValoresPosiblesCelda();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 7);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Mostrar Sudoku");
        System.out.println("2. Probar valor");
        System.out.println("3. Sobreescribir borrador");
        System.out.println("4. Mostrar Borrador y Sudoku");
        System.out.println("5. Resetear Borrador");
        System.out.println("6. Mostrar Valores Posibles de una Celda");
        System.out.println("7. Salir");
        System.out.print("Ingresa el número de opción: ");
    }

    private static void mostrarSudoku(int[][] sudoku) {
        System.out.println("\n--- Sudoku ---");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void probarValor() {
        System.out.print("\nIngresa la fila (0-8): ");
        int fila = scanner.nextInt();
        System.out.print("Ingresa la columna (0-8): ");
        int columna = scanner.nextInt();
        System.out.print("Ingresa el valor (1-9): ");
        int valor = scanner.nextInt();

        if (!esCeldaValida(fila, columna)) {
            System.out.println("Coordenadas de celda inválidas.");
            return;
        }

        if (!esValorValido(valor)) {
            System.out.println("Valor inválido. Debe ser un número entre 1 y 9.");
            return;
        }

        if (existeEnFila(sudoku, fila, valor) ||
            existeEnColumna(sudoku, columna, valor) ||
            existeEnBloque(sudoku, fila, columna, valor)) {
            System.out.println("El número " + valor + " no es una solución posible para la celda [" + fila + "," + columna + "].");
        } else {
            System.out.println("El número " + valor + " es una solución posible para la celda [" + fila + "," + columna + "].");
        }
    }

    private static void sobreescribirBorrador() {
        System.out.print("\nIngresa la fila (0-8): ");
        int fila = scanner.nextInt();
        System.out.print("Ingresa la columna (0-8): ");
        int columna = scanner.nextInt();
        System.out.print("Ingresa el valor (1-9): ");
        int valor = scanner.nextInt();

        if (!esCeldaValida(fila, columna)) {
            System.out.println("Coordenadas de celda inválidas.");
            return;
        }

        if (!esValorValido(valor)) {
            System.out.println("Valor inválido. Debe ser un número entre 1 y 9.");
            return;
        }

        if (sudoku[fila][columna] != VACIO) {
            System.out.println("La celda [" + fila + "," + columna + "] no se puede modificar.");
            return;
        }

        if (existeEnFila(borrador, fila, valor) ||
            existeEnColumna(borrador, columna, valor) ||
            existeEnBloque(borrador, fila, columna, valor)) {
            System.out.println("El número " + valor + " no es una solución posible para la celda [" + fila + "," + columna + "].");
        } else {
            borrador[fila][columna] = valor;
            System.out.println("Se ha modificado la celda [" + fila + "," + columna + "] correctamente.");
        }
    }

    private static void mostrarBorradorYSudoku() {
        System.out.println("\n--- Sudoku ---");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--- Borrador ---");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(borrador[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void resetearBorrador() {
        for (int i = 0; i < FILAS; i++) {
            System.arraycopy(sudoku[i], 0, borrador[i], 0, COLUMNAS);
        }
        System.out.println("El borrador ha sido restablecido.");
    }

    private static void mostrarValoresPosiblesCelda() {
        System.out.print("\nIngresa la fila (0-8): ");
        int fila = scanner.nextInt();
        System.out.print("Ingresa la columna (0-8): ");
        int columna = scanner.nextInt();

        if (!esCeldaValida(fila, columna)) {
            System.out.println("Coordenadas de celda inválidas.");
            return;
        }

        int[] solucionesBorrador = valoresPosibles(borrador, fila, columna);
        int[] solucionesSudoku = valoresPosibles(sudoku, fila, columna);

        if (solucionesBorrador.length == 0) {
            System.out.println("La configuración actual del borrador no admite soluciones posibles para la celda [" + fila + "," + columna + "]");
        } else {
            System.out.print("Borrador: soluciones posibles para la celda [" + fila + "," + columna + "]: ");
            imprimirValores(solucionesBorrador);
            System.out.print("Sudoku: soluciones posibles para la celda [" + fila + "," + columna + "]: ");
            imprimirValores(solucionesSudoku);
        }
    }

    private static boolean esCeldaValida(int fila, int columna) {
        return fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS;
    }

    private static boolean esValorValido(int valor) {
        return valor >= MIN_VALOR && valor <= MAX_VALOR;
    }

    private static boolean existeEnFila(int[][] matriz, int fila, int valor) {
        for (int j = 0; j < COLUMNAS; j++) {
            if (matriz[fila][j] == valor) {
                return true;
            }
        }
        return false;
    }

    private static boolean existeEnColumna(int[][] matriz, int columna, int valor) {
        for (int i = 0; i < FILAS; i++) {
            if (matriz[i][columna] == valor) {
                return true;
            }
        }
        return false;
    }

    private static boolean existeEnBloque(int[][] matriz, int fila, int columna, int valor) {
        int bloqueFilaInicio = fila - fila % BLOQUE_FILAS;
        int bloqueColumnaInicio = columna - columna % BLOQUE_COLUMNAS;

        for (int i = bloqueFilaInicio; i < bloqueFilaInicio + BLOQUE_FILAS; i++) {
            for (int j = bloqueColumnaInicio; j < bloqueColumnaInicio + BLOQUE_COLUMNAS; j++) {
                if (matriz[i][j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] valoresPosibles(int[][] matriz, int fila, int columna) {
        boolean[] numeros = new boolean[MAX_VALOR + 1];
        for (int i = 1; i <= MAX_VALOR; i++) {
            numeros[i] = true;
        }

        for (int j = 0; j < COLUMNAS; j++) {
            numeros[matriz[fila][j]] = false;
        }

        for (int i = 0; i < FILAS; i++) {
            numeros[matriz[i][columna]] = false;
        }

        int bloqueFilaInicio = fila - fila % BLOQUE_FILAS;
        int bloqueColumnaInicio = columna - columna % BLOQUE_COLUMNAS;

        for (int i = bloqueFilaInicio; i < bloqueFilaInicio + BLOQUE_FILAS; i++) {
            for (int j = bloqueColumnaInicio; j < bloqueColumnaInicio + BLOQUE_COLUMNAS; j++) {
                numeros[matriz[i][j]] = false;
            }
        }

        int count = 0;
        for (int i = 1; i <= MAX_VALOR; i++) {
            if (numeros[i]) {
                count++;
            }
        }

        int[] valoresPosibles = new int[count];
        int index = 0;
        for (int i = 1; i <= MAX_VALOR; i++) {
            if (numeros[i]) {
                valoresPosibles[index++] = i;
            }
        }

        return valoresPosibles;
    }

    private static void imprimirValores(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
    }
}


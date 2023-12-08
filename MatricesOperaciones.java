// Menú de operaciones sobre dos matrices
// Crear un programa que presente un menú de opciones para realizar diversas acciones sobre dos matrices. 
//Se deben implementar todos los métodos necesarios para cada acción. 

// Las opciones del menú son las siguientes:
// 1. Generar matrices (deben tener el mismo tamaño).
// 2. Mostrar matrices.
// 3. Imprimir matriz resultante de la suma de ambas matrices.
// 4. Imprimir matriz resultante de la multiplicación de ambas matrices.
// 5. Salir.

// ❗Recuerda crear los métodos necesarios para cada una de estas acciones y el programa debe mostrar el menú
// de opciones para que el usuario pueda elegir la acción deseada. Además, las matrices deben tener el mismo 
// tamaño para realizar las operaciones de suma y multiplicación. 


import java.util.Scanner;

public class MatricesOperaciones {
    private static int[][] matrizA;
    private static int[][] matrizB;
    private static int filas;
    private static int columnas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de operaciones sobre dos matrices");
            System.out.println("1. Generar matrices");
            System.out.println("2. Mostrar matrices");
            System.out.println("3. Imprimir matriz resultante de la suma");
            System.out.println("4. Imprimir matriz resultante de la multiplicación");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    generarMatrices(scanner);
                    break;
                case 2:
                    mostrarMatrices();
                    break;
                case 3:
                    imprimirMatrizSuma();
                    break;
                case 4:
                    imprimirMatrizMultiplicacion();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void generarMatrices(Scanner scanner) {
        System.out.print("Ingrese el número de filas: ");
        filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        columnas = scanner.nextInt();

        matrizA = new int[filas][columnas];
        matrizB = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz A:");
        llenarMatriz(scanner, matrizA);

        System.out.println("Ingrese los elementos de la matriz B:");
        llenarMatriz(scanner, matrizB);

        System.out.println("Matrices generadas exitosamente.");
    }

    public static void llenarMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void mostrarMatrices() {
        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirMatrizSuma() {
        if (matrizA == null || matrizB == null) {
            System.out.println("No se han generado las matrices.");
            return;
        }

        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            System.out.println("Las matrices deben tener el mismo tamaño para realizar la operación de suma.");
            return;
        }

        int[][] matrizSuma = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz resultante de la suma:");
        mostrarMatriz(matrizSuma);
    }

    public static void imprimirMatrizMultiplicacion() {
        if (matrizA == null || matrizB == null) {
            System.out.println("No se han generado las matrices.");
            return;
        }

        if (matrizA[0].length != matrizB.length) {
            System.out.println("El número de columnas de la matriz A debe ser igual al número de filas de la matriz B para realizar la operación de multiplicación.");
            return;
        }

        int[][] matrizMultiplicacion = new int[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    matrizMultiplicacion[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Matriz resultante de la multiplicación:");
        mostrarMatriz(matrizMultiplicacion);
    }
}

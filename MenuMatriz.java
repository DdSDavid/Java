// Menú de operaciones sobre una matriz

// Crear un programa que presente un menú de opciones para realizar diversas
// acciones sobre una matriz. Se deben implementar todos los métodos necesarios para cada acción. 

// Las opciones del menú son las siguientes:
// 1. Generar matriz.
// 2. Mostrar matriz.
// 3. Sumar todos los elementos de la matriz.
// 4. Imprimir número más grande.
// 5. Imprimir número más pequeño.
// 6. Imprimir cantidad de números pares.
// 7. Imprimir cantidad de números impares.
// 8. Imprimir una matriz en orden inverso.
// 9. Imprimir transposición de la matriz.
// 10. Salir.
// ❗Recuerda que se deben crear los métodos necesarios para cada una de estas acciones y el programa debe mostrar el menú de
// opciones para que el usuario pueda elegir la acción deseada.


import java.util.Scanner;

public class MenuMatriz {
    private static int[][] matriz;
    private static int filas;
    private static int columnas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    generarMatriz(scanner);
                    break;
                case 2:
                    mostrarMatriz();
                    break;
                case 3:
                    sumarElementosMatriz();
                    break;
                case 4:
                    imprimirNumeroMasGrande();
                    break;
                case 5:
                    imprimirNumeroMasPequeno();
                    break;
                case 6:
                    imprimirCantidadNumerosPares();
                    break;
                case 7:
                    imprimirCantidadNumerosImpares();
                    break;
                case 8:
                    imprimirMatrizEnOrdenInverso();
                    break;
                case 9:
                    imprimirTransposicionMatriz();
                    break;
                case 10:
                    salir = true;
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("========== MENÚ DE OPCIONES ==========");
        System.out.println("1. Generar matriz");
        System.out.println("2. Mostrar matriz");
        System.out.println("3. Sumar todos los elementos de la matriz");
        System.out.println("4. Imprimir número más grande");
        System.out.println("5. Imprimir número más pequeño");
        System.out.println("6. Imprimir cantidad de números pares");
        System.out.println("7. Imprimir cantidad de números impares");
        System.out.println("8. Imprimir una matriz en orden inverso");
        System.out.println("9. Imprimir transposición de la matriz");
        System.out.println("10. Salir");
        System.out.print("Ingrese una opción: ");
    }

    public static void generarMatriz(Scanner scanner) {
        System.out.print("Ingrese la cantidad de filas: ");
        filas = scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        columnas = scanner.nextInt();

        matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento en la posición (" + i + ", " + j + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz generada exitosamente.");
    }

    public static void mostrarMatriz() {
        if (matriz == null) {
            System.out.println("No se ha generado ninguna matriz.");
            return;
        }

        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumarElementosMatriz() {
        if (matriz == null) {
            System.out.println("No se ha generado ninguna matriz.");
            return;
        }

        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }

    public static void imprimirNumeroMasGrande() {
        if (matriz == null) {
            System.out.println("No se ha generado ninguna matriz.");
            return;
        }

        int maximo = matriz[0][0];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }

        System.out.println("El número más grande de la matriz es: " + maximo);
    }

    public static void imprimirNumeroMasPequeno() {
        if (matriz == null) {
            System.out.println("No se ha generado ninguna matriz.");
            return;
        }

        int minimo = matriz[0][0];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
        }

        System.out.println("El número más pequeño de la matriz es: " + minimo);
    }

    public static void imprimirCantidadNumerosPares() {
        if (matriz == null) {
            System.out.println("No se ha generado ninguna matriz.");
            return;
        }

        int cantidadPares = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    cantidadPares++;
                }
            }
        }

        System.out.println("La cantidad de números pares en la matriz es: " + cantidadPares);
    }

    public static void imprimirCantidadNumerosImpares() {
        if (matriz == null) {
            System.out.println("No se ha generado ninguna matriz.");
            return;
        }

        int cantidadImpares = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 != 0) {
                    cantidadImpares++;
                }
            }
        }

        System.out.println("La cantidad de números impares en la matriz es: " + cantidadImpares);
    }

    public static void imprimirMatrizEnOrdenInverso() {
        if (matriz == null) {
            System.out.println("No se ha generado ninguna matriz.");
            return;
        }

        System.out.println("Matriz en orden inverso:");
        for (int i = filas - 1; i >= 0; i--) {
            for (int j = columnas - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirTransposicionMatriz() {
        if (matriz == null) {
            System.out.println("No se ha generado ninguna matriz.");
            return;
        }

        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        System.out.println("Transposición de la matriz:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

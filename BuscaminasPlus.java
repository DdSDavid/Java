// Buscaminas plus

// Basándote en el ejercicio previo del buscaminas, el objetivo del siguiente ejercicio es completar el desarrollo del juego. 

// 1. Has desarrollado la lógica para crear un mapa, y ahora debes trasladarla a un método llamado "generarMapa()",
// el cual recibirá una matriz como parámetro y no retornará nada. En este método, no es necesario imprimir el mapa.
// Tu objetivo es asegurarte de que la matriz contenga celdas con "M" (representando las minas) y celdas con números 
// (en formato de "String") que indiquen cuántas minas hay alrededor. En caso de que una celda no tenga minas adyacentes,
// puedes colocar una "O" o un "0".

// 2. Luego, debes crear un método llamado "empezarJuego()", que también recibirá como parámetro la matriz del mapa y no devolverá nada.
// Este método contendrá la lógica para crear una matriz de juego del mismo tamaño que el mapa, pero rellenada con "X". Además, imprimirá
// en pantalla la matriz para que el jugador pueda verla, junto con los números de fila y columna en los bordes para facilitar la identificación
// de las coordenadas.

// 3. A continuación, se deben solicitar unas coordenadas al jugador. Estas coordenadas se compararán con la matriz del mapa y, dependiendo
// del contenido de la celda, ocurrirá lo siguiente:

//     Si la celda contiene una mina, el juego imprimirá el mensaje "¡Has explotado una mina! ¡Perdiste!".

//     Si la celda contiene un número, se modificará la celda correspondiente en la matriz de juego, reemplazando la "X" por el número 
//     encontrado en la matriz del mapa. Luego, se imprimirá la matriz de juego en pantalla.

//     Si la celda contiene una "O", se modificará la matriz de juego y se sobrescribirán todas las "X" correspondientes.

// ❗Es importante destacar que, en el buscaminas, cuando se selecciona una celda vacía, esto revela todas las celdas vacías a su alrededor 
// hasta encontrar celdas con números. Por ejemplo, si el jugador ingresa las coordenadas [03:09], se puede imprimir la siguiente matriz de
// juego:

//  - 01 02 03 04 05 06 07 08 09 10
// 01  X  X  X  X  X  X  X  X  X  X
// 02  X  X  X  X  X  X  X  3  2  1
// 03  X  X  X  X  X  X  2  1  O  O
// 04  X  X  X  X  X  X  2  O  O  O
// 05  X  X  X  X  X  X  3  1  2  1
// 06  X  X  X  X  X  X  X  X  X  X
// 07  X  X  X  X  X  X  X  X  X  X
// 08  X  X  X  X  X  X  X  X  X  X
// 09  X  X  X  X  X  X  X  X  X  X
// 10  X  X  X  X  X  X  X  X  X  X

// 4. Después de imprimir la matriz, se debe verificar si las únicas "X" que quedan corresponden a las ubicaciones de las minas. Si es así,
// se imprimirá un mensaje que diga "Descubriste todas las celdas sin explotar una mina. ¡Felicitaciones!" y el juego terminará.

// Si aún quedan "X" por descubrir que no son minas, se volverá a solicitar coordenadas al jugador hasta que pierda o gane.

// 5. Una vez que hayas completado el desarrollo anterior, puedes agregar un menú de configuración previo para seleccionar el tamaño del mapa
// y la cantidad de minas que deseas. También agrega las opciones "Empezar juego" y "Salir" al menú.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaminasPlus {
    private static int filas;
    private static int columnas;
    private static int[][] mapa;
    private static String[][] juego;
    private static int minas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones");
            System.out.println("1. Configuración");
            System.out.println("2. Empezar juego");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    configurarJuego(scanner);
                    break;
                case 2:
                    if (mapa == null || juego == null) {
                        System.out.println("Por favor, configure el juego antes de empezar.");
                    } else {
                        empezarJuego(scanner);
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void configurarJuego(Scanner scanner) {
        System.out.print("Ingrese el número de filas: ");
        filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        columnas = scanner.nextInt();
        System.out.print("Ingrese el número de minas: ");
        minas = scanner.nextInt();

        mapa = new int[filas][columnas];
        juego = new String[filas][columnas];
        reiniciarJuego();

        generarMapa();

        System.out.println("Configuración completada.");
    }

    public static void generarMapa() {
        Random random = new Random();

        // Colocar minas en el mapa
        int minasGeneradas = 0;
        while (minasGeneradas < minas) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);

            if (mapa[fila][columna] == 0) {
                mapa[fila][columna] = -1; // Marcar mina
                minasGeneradas++;
            }
        }

        // Calcular números alrededor de las minas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (mapa[i][j] == 0) {
                    int count = contarMinasAlrededor(i, j);
                    mapa[i][j] = count;
                }
            }
        }
    }

    public static int contarMinasAlrededor(int fila, int columna) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;

                if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas) {
                    if (mapa[nuevaFila][nuevaColumna] == -1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void empezarJuego(Scanner scanner) {
        reiniciarJuego();
        imprimirJuego();

        while (true) {
            System.out.print("Ingrese las coordenadas (fila y columna): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (fila < 1 || fila > filas || columna < 1 || columna > columnas) {
                System.out.println("Coordenadas inválidas. Intente nuevamente.");
                continue;
            }

            int i = fila - 1;
            int j = columna - 1;

            if (mapa[i][j] == -1) {
                System.out.println("¡Has explotado una mina! ¡Perdiste!");
                break;
            } else if (mapa[i][j] > 0) {
                juego[i][j] = String.valueOf(mapa[i][j]);
                imprimirJuego();
            } else if (mapa[i][j] == 0 && juego[i][j].equals("X")) {
                descubrirCeldasVacias(i, j);
                imprimirJuego();
            }

            if (esVictoria()) {
                System.out.println("Descubriste todas las celdas sin explotar una mina. ¡Felicitaciones!");
                break;
            }
        }
    }

    public static void descubrirCeldasVacias(int fila, int columna) {
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
            return;
        }

        if (mapa[fila][columna] == 0 && juego[fila][columna].equals("X")) {
            juego[fila][columna] = "O";

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    descubrirCeldasVacias(fila + i, columna + j);
                }
            }
        } else if (mapa[fila][columna] > 0 && juego[fila][columna].equals("X")) {
            juego[fila][columna] = String.valueOf(mapa[fila][columna]);
        }
    }

    public static void reiniciarJuego() {
        for (String[] row : juego) {
            Arrays.fill(row, "X");
        }
    }

    public static void imprimirJuego() {
        System.out.print(" ");
        for (int i = 0; i < columnas; i++) {
            System.out.print(String.format("%2d", i + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < filas; i++) {
            System.out.print(String.format("%2d", i + 1) + " ");
            for (int j = 0; j < columnas; j++) {
                System.out.print(juego[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean esVictoria() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (mapa[i][j] != -1 && juego[i][j].equals("X")) {
                    return false;
                }
            }
        }
        return true;
    }
}


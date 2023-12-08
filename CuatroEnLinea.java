// Juego de "4 en línea" contra la computadora

// El objetivo del juego de "4 en línea" es ser el primero en conectar cuatro fichas del mismo color en línea vertical, 
// horizontal o diagonal en un tablero de seis filas por siete columnas. En nuestro caso, utilizaremos las letras "J" 
// para representar al jugador y "C" para representar a la computadora.

// Para desarrollar este juego, debes crear los métodos necesarios para generar la matriz y replicar la lógica del juego. 

// Además, deberás imprimir el tablero en pantalla, incluyendo un borde superior con los números de las columnas. La primera 
// ficha de la computadora deberá ser colocada en la columna central.

// 1 2 3 4 5 6 7 
// O O O O O O O
// O O O O O O O
// O O O O O O O
// O O O O O O O
// O O O O O O O
// O O O C O O O

// 💡Recuerda que en el juego de "4 en línea", el tablero se coloca perpendicular al piso, y las fichas caen ocupando la fila más baja
// disponible hasta toparse con otra ficha.

// A continuación, se solicitará al jugador que elija en qué columna desea colocar su ficha, y se actualizará la matriz de juego en consecuencia.

// Después de cada movimiento, se verificará si las fichas del jugador o de la computadora forman una línea de 4 en línea, ya sea en posición
// horizontal, vertical o diagonal:

//     Si se encuentra una línea de cuatro, se mostrará un mensaje de victoria para el jugador correspondiente. 

//     En caso contrario, el juego continuará hasta que uno de los dos jugadores gane o ya no haya más espacios disponibles en el tablero,
//     en cuyo caso se imprimirá un mensaje de empate.

// Durante el turno de la computadora, deberás implementar la siguiente lógica: primero, se debe detectar si en el próximo turno alguno de
// los dos jugadores tiene la oportunidad de hacer un cuatro en línea:

//     En caso afirmativo, la computadora deberá colocar su ficha en la columna correspondiente para ganar o evitar que el jugador gane. 

//     Si no se detecta una oportunidad de victoria inmediata, la computadora deberá analizar cuál es la línea propia más cercana a completarse
//     y colocar su ficha en la columna correspondiente.


import java.util.Arrays;
import java.util.Scanner;

public class CuatroEnLinea {

    private static final int FILAS = 6;
    private static final int COLUMNAS = 7;
    private static final char VACIO = 'O';
    private static final char JUGADOR = 'J';
    private static final char COMPUTADORA = 'C';

    private static char[][] tablero;

    public static void main(String[] args) {
        tablero = new char[FILAS][COLUMNAS];
        reiniciarTablero();

        Scanner scanner = new Scanner(System.in);

        boolean juegoTerminado = false;
        char ganador = VACIO;

        while (!juegoTerminado) {
            imprimirTablero();
            int columna = obtenerColumnaJugador(scanner);
            soltarFicha(JUGADOR, columna);

            if (hayGanador(JUGADOR)) {
                ganador = JUGADOR;
                juegoTerminado = true;
                break;
            }

            if (tableroCompleto()) {
                juegoTerminado = true;
                break;
            }

            columna = obtenerColumnaComputadora();
            soltarFicha(COMPUTADORA, columna);

            if (hayGanador(COMPUTADORA)) {
                ganador = COMPUTADORA;
                juegoTerminado = true;
                break;
            }

            if (tableroCompleto()) {
                juegoTerminado = true;
                break;
            }
        }

        imprimirTablero();

        if (ganador == JUGADOR) {
            System.out.println("¡Has ganado!");
        } else if (ganador == COMPUTADORA) {
            System.out.println("¡La computadora ha ganado!");
        } else {
            System.out.println("¡Empate!");
        }
    }

    public static void reiniciarTablero() {
        for (char[] fila : tablero) {
            Arrays.fill(fila, VACIO);
        }
    }

    public static void imprimirTablero() {
        System.out.println("1 2 3 4 5 6 7");
        for (char[] fila : tablero) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int obtenerColumnaJugador(Scanner scanner) {
        int columna;
        while (true) {
            System.out.print("Elige una columna (1-7): ");
            columna = scanner.nextInt();
            if (columna < 1 || columna > COLUMNAS || !columnaDisponible(columna - 1)) {
                System.out.println("Columna inválida. Inténtalo de nuevo.");
            } else {
                break;
            }
        }
        return columna - 1;
    }

    public static boolean columnaDisponible(int columna) {
        return tablero[0][columna] == VACIO;
    }

    public static void soltarFicha(char jugador, int columna) {
        for (int fila = FILAS - 1; fila >= 0; fila--) {
            if (tablero[fila][columna] == VACIO) {
                tablero[fila][columna] = jugador;
                break;
            }
        }
    }

    public static boolean hayGanador(char jugador) {
        // Verificar líneas horizontales
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna <= COLUMNAS - 4; columna++) {
                if (tablero[fila][columna] == jugador &&
                    tablero[fila][columna + 1] == jugador &&
                    tablero[fila][columna + 2] == jugador &&
                    tablero[fila][columna + 3] == jugador) {
                    return true;
                }
            }
        }

        // Verificar líneas verticales
        for (int columna = 0; columna < COLUMNAS; columna++) {
            for (int fila = 0; fila <= FILAS - 4; fila++) {
                if (tablero[fila][columna] == jugador &&
                    tablero[fila + 1][columna] == jugador &&
                    tablero[fila + 2][columna] == jugador &&
                    tablero[fila + 3][columna] == jugador) {
                    return true;
                }
            }
        }

        // Verificar diagonales ascendentes
        for (int fila = 3; fila < FILAS; fila++) {
            for (int columna = 0; columna <= COLUMNAS - 4; columna++) {
                if (tablero[fila][columna] == jugador &&
                    tablero[fila - 1][columna + 1] == jugador &&
                    tablero[fila - 2][columna + 2] == jugador &&
                    tablero[fila - 3][columna + 3] == jugador) {
                    return true;
                }
            }
        }

        // Verificar diagonales descendentes
        for (int fila = 3; fila < FILAS; fila++) {
            for (int columna = 3; columna < COLUMNAS; columna++) {
                if (tablero[fila][columna] == jugador &&
                    tablero[fila - 1][columna - 1] == jugador &&
                    tablero[fila - 2][columna - 2] == jugador &&
                    tablero[fila - 3][columna - 3] == jugador) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean tableroCompleto() {
        for (char[] fila : tablero) {
            for (char c : fila) {
                if (c == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int obtenerColumnaComputadora() {
        // Verificar si la computadora puede ganar en el próximo turno
        for (int columna = 0; columna < COLUMNAS; columna++) {
            if (columnaDisponible(columna)) {
                soltarFicha(COMPUTADORA, columna);
                if (hayGanador(COMPUTADORA)) {
                    tablero[FILAS - 1][columna] = VACIO;  // Deshacer el movimiento
                    return columna;
                }
                tablero[FILAS - 1][columna] = VACIO;  // Deshacer el movimiento
            }
        }

        // Verificar si el jugador puede ganar en el próximo turno y bloquearlo
        for (int columna = 0; columna < COLUMNAS; columna++) {
            if (columnaDisponible(columna)) {
                soltarFicha(JUGADOR, columna);
                if (hayGanador(JUGADOR)) {
                    tablero[FILAS - 1][columna] = VACIO;  // Deshacer el movimiento
                    return columna;
                }
                tablero[FILAS - 1][columna] = VACIO;  // Deshacer el movimiento
            }
        }

        // Si no hay oportunidad de ganar en el próximo turno, colocar la ficha en una columna aleatoria
        while (true) {
            int columnaAleatoria = (int) (Math.random() * COLUMNAS);
            if (columnaDisponible(columnaAleatoria)) {
                return columnaAleatoria;
            }
        }
    }
}


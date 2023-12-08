// Juego Othello

// Te invitamos a crear un programa que te permita disfrutar del emocionante juego de Othello contra la computadora. En este juego, podrás
// enfrentarte al desafío de seguir las reglas del juego y utilizar métodos para imprimir el tablero en cada ronda.
// El objetivo en Othello es lograr tener más fichas de tu color en el tablero que tu oponente al final del juego. Para lograrlo, deberás 
// colocar tus fichas estratégicamente en el tablero, volteando las fichas del oponente y convirtiéndolas a tu color.
// Reglas del juego:
// El juego se desarrolla en un tablero cuadrado de 8x8, donde cada jugador tiene fichas de un color, generalmente blanco y negro.

// - 1 2 3 4 5 6 7 8
// 1 O O O O O O O O
// 2 O O O O O O O O
// 3 O O O O O O O O
// 4 O O O O O O O O
// 5 O O O O O O O O
// 6 O O O O O O O O
// 7 O O O O O O O O
// 8 O O O O O O O O

// El juego comienza con cuatro fichas en el centro del tablero: dos fichas blancas y dos fichas negras, colocadas en un patrón alternado.
// - 1 2 3 4 5 6 7 8
// 1 O O O O O O O O
// 2 O O O O O O O O
// 3 O O O O O O O O
// 4 O O O B N O O O
// 5 O O O N B O O O
// 6 O O O O O O O O
// 7 O O O O O O O O
// 8 O O O O O O O O

// En cada turno, los jugadores colocan una ficha de su color en una posición vacía del tablero, siempre y cuando encierren al menos una ficha
// del oponente entre la ficha colocada y otra ficha del mismo color. Esta captura se puede realizar en direcciones vertical, horizontal o 
// diagonal. Todas las fichas del oponente atrapadas entre las fichas del jugador serán volteadas y convertidas al color del jugador.

// Es importante destacar que si un jugador no tiene ninguna celda en la que pueda encerrar una ficha del oponente, perderá su turno.

// El juego continúa alternando los turnos hasta que ningún jugador pueda realizar un movimiento válido o el tablero esté lleno. En ese momento,
// se cuentan las fichas de cada jugador y el que tenga más fichas de su color en el tablero será el ganador.
// A continuación, te presentamos un ejemplo ilustrativo de una partida en la que juegan las fichas blancas. Observa el tablero donde se muestran
// las celdas válidas representadas por el símbolo “O” (con fondo gris) , indicando los lugares en los que puedes colocar una ficha
// blanca estratégicamente:

// Test
// Después de que el jugador coloca su ficha en la posición 3:6, el tablero se modifica de la siguiente manera:
// Test
// Luego, es el turno de las fichas negras y solo tienen una opción válida para mover, por lo tanto, están obligados a realizarlo. 



import java.util.Scanner;

public class Othello {
    private static final int FILAS = 8;
    private static final int COLUMNAS = 8;
    private static final char VACIO = 'O';
    private static final char BLANCO = 'B';
    private static final char NEGRO = 'N';

    private static char[][] tablero = new char[FILAS][COLUMNAS];
    private static char turno = BLANCO;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarTablero();
        imprimirTablero();

        while (!juegoTerminado()) {
            if (hayMovimientosDisponibles()) {
                if (turno == BLANCO) {
                    turnoJugador();
                } else {
                    turnoComputadora();
                }
                imprimirTablero();
            } else {
                System.out.println("No hay movimientos disponibles. El turno pasa al siguiente jugador.");
                cambiarTurno();
            }
        }

        char ganador = determinarGanador();
        if (ganador == BLANCO) {
            System.out.println("¡Felicidades! ¡Has ganado!");
        } else if (ganador == NEGRO) {
            System.out.println("La computadora ha ganado. ¡Inténtalo de nuevo!");
        } else {
            System.out.println("El juego ha terminado en empate.");
        }
    }

    private static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = VACIO;
            }
        }

        tablero[3][3] = BLANCO;
        tablero[3][4] = NEGRO;
        tablero[4][3] = NEGRO;
        tablero[4][4] = BLANCO;
    }

    private static void imprimirTablero() {
        System.out.print("  ");
        for (int i = 1; i <= COLUMNAS; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < FILAS; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean juegoTerminado() {
        return !hayMovimientosDisponibles() || tableroLleno();
    }

    private static boolean hayMovimientosDisponibles() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (esMovimientoValido(i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean esMovimientoValido(int fila, int columna) {
        if (tablero[fila][columna] != VACIO) {
            return false;
        }

        int[] deltas = {-1, 0, 1};
        for (int deltaFila : deltas) {
            for (int deltaColumna : deltas) {
                if (deltaFila == 0 && deltaColumna == 0) {
                    continue;
                }

                int nuevaFila = fila + deltaFila;
                int nuevaColumna = columna + deltaColumna;

                if (esCoordenadaValida(nuevaFila, nuevaColumna) && tablero[nuevaFila][nuevaColumna] == turnoOpuesto()) {
                    nuevaFila += deltaFila;
                    nuevaColumna += deltaColumna;

                    while (esCoordenadaValida(nuevaFila, nuevaColumna)) {
                        if (tablero[nuevaFila][nuevaColumna] == turno) {
                            return true;
                        } else if (tablero[nuevaFila][nuevaColumna] == VACIO) {
                            break;
                        }

                        nuevaFila += deltaFila;
                        nuevaColumna += deltaColumna;
                    }
                }
            }
        }
        return false;
    }

    private static boolean esCoordenadaValida(int fila, int columna) {
        return fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS;
    }

    private static char turnoOpuesto() {
        return (turno == BLANCO) ? NEGRO : BLANCO;
    }

    private static void turnoJugador() {
        System.out.print("Es tu turno. Ingresa la posición (fila columna): ");
        int fila = scanner.nextInt() - 1;
        int columna = scanner.nextInt() - 1;

        if (esMovimientoValido(fila, columna)) {
            tablero[fila][columna] = turno;
            voltearFichas(fila, columna);
            cambiarTurno();
        } else {
            System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            turnoJugador();
        }
    }

    private static void turnoComputadora() {
        System.out.println("Turno de la computadora.");
        int mejorFila = -1;
        int mejorColumna = -1;
        int mejorCantidadVolteadas = -1;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (esMovimientoValido(i, j)) {
                    int cantidadVolteadas = contarFichasVolteadas(i, j);
                    if (cantidadVolteadas > mejorCantidadVolteadas) {
                        mejorFila = i;
                        mejorColumna = j;
                        mejorCantidadVolteadas = cantidadVolteadas;
                    }
                }
            }
        }

        if (mejorFila != -1 && mejorColumna != -1) {
            tablero[mejorFila][mejorColumna] = turno;
            voltearFichas(mejorFila, mejorColumna);
        }

        cambiarTurno();
    }

    private static void voltearFichas(int fila, int columna) {
        int[] deltas = {-1, 0, 1};
        for (int deltaFila : deltas) {
            for (int deltaColumna : deltas) {
                if (deltaFila == 0 && deltaColumna == 0) {
                    continue;
                }

                int nuevaFila = fila + deltaFila;
                int nuevaColumna = columna + deltaColumna;

                if (esCoordenadaValida(nuevaFila, nuevaColumna) && tablero[nuevaFila][nuevaColumna] == turnoOpuesto()) {
                    nuevaFila += deltaFila;
                    nuevaColumna += deltaColumna;

                    while (esCoordenadaValida(nuevaFila, nuevaColumna)) {
                        if (tablero[nuevaFila][nuevaColumna] == turno) {
                            while (nuevaFila != fila || nuevaColumna != columna) {
                                tablero[nuevaFila][nuevaColumna] = turno;
                                nuevaFila -= deltaFila;
                                nuevaColumna -= deltaColumna;
                            }
                            break;
                        }

                        nuevaFila += deltaFila;
                        nuevaColumna += deltaColumna;
                    }
                }
            }
        }
    }

    private static int contarFichasVolteadas(int fila, int columna) {
        int contador = 0;

        int[] deltas = {-1, 0, 1};
        for (int deltaFila : deltas) {
            for (int deltaColumna : deltas) {
                if (deltaFila == 0 && deltaColumna == 0) {
                    continue;
                }

                int nuevaFila = fila + deltaFila;
                int nuevaColumna = columna + deltaColumna;

                if (esCoordenadaValida(nuevaFila, nuevaColumna) && tablero[nuevaFila][nuevaColumna] == turnoOpuesto()) {
                    nuevaFila += deltaFila;
                    nuevaColumna += deltaColumna;

                    while (esCoordenadaValida(nuevaFila, nuevaColumna)) {
                        if (tablero[nuevaFila][nuevaColumna] == turno) {
                            contador++;
                            break;
                        } else if (tablero[nuevaFila][nuevaColumna] == VACIO) {
                            break;
                        }

                        nuevaFila += deltaFila;
                        nuevaColumna += deltaColumna;
                    }
                }
            }
        }
        return contador;
    }

    private static boolean tableroLleno() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }

    private static char determinarGanador() {
        int contadorBlanco = 0;
        int contadorNegro = 0;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] == BLANCO) {
                    contadorBlanco++;
                } else if (tablero[i][j] == NEGRO) {
                    contadorNegro++;
                }
            }
        }

        if (contadorBlanco > contadorNegro) {
            return BLANCO;
        } else if (contadorNegro > contadorBlanco) {
            return NEGRO;
        } else {
            return VACIO;
        }
    }

    private static void cambiarTurno() {
        turno = (turno == BLANCO) ? NEGRO : BLANCO;
    }
}




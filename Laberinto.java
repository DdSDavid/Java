// Laberintos

// El objetivo de este ejercicio es desarrollar un programa que resuelva laberintos con la salida siempre ubicada en el lado derecho. 

// En la representación de los laberintos, los "1" representan paredes, los "0" representan pasillos, la "X" representa tu ubicación 
// actual, los "-" representan las ubicaciones ya visitadas y la "S" representa la salida.

// El programa debe actualizar y mostrar en la consola la matriz cada vez que se mueva la "X" a la siguiente posición. El programa debe
// terminar cuando, después de mover la "X", el siguiente casillero sea la letra "S".
// El primer laberinto a resolver es el siguiente:

// String[][] laberinto1 = {

// {"1", "1", "1", "1", "1"},

// {"1", "X", "0", "0", "S"},

// {"1", "1", "1", "1", "1"},

// };


import java.util.LinkedList;
import java.util.Queue;

public class Laberinto {
    //private static final char PARED = '1';
    private static final char PASILLO = '0';
    private static final char UBICACION_ACTUAL = 'X';
    private static final char UBICACION_VISITADA = '-';
    private static final char SALIDA = 'S';

    private static class Coordenada {
        int fila;
        int columna;

        public Coordenada(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }
    }

    public void imprimeLaberinto(char[][] laberinto) {
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[0].length; j++) {
                System.out.print(laberinto[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void resolverLaberinto(char[][] laberinto) {
        int filaInicial = -1;
        int columnaInicial = -1;

        // Buscar la ubicación inicial de la "X"
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[0].length; j++) {
                if (laberinto[i][j] == UBICACION_ACTUAL) {
                    filaInicial = i;
                    columnaInicial = j;
                    break;
                }
            }
        }

        // Verificar si se encontró la ubicación inicial
        if (filaInicial == -1 || columnaInicial == -1) {
            System.out.println("No se encontró la ubicación inicial.");
            return;
        }

        Queue<Coordenada> cola = new LinkedList<>();
        cola.add(new Coordenada(filaInicial, columnaInicial));

        while (!cola.isEmpty()) {
            Coordenada actual = cola.poll();
            int filaActual = actual.fila;
            int columnaActual = actual.columna;

            // Verificar si se alcanzó la salida
            if (laberinto[filaActual][columnaActual] == SALIDA) {
                System.out.println("Laberinto resuelto:");
                imprimeLaberinto(laberinto);
                return;
            }

            // Marcar la posición actual como visitada
            laberinto[filaActual][columnaActual] = UBICACION_VISITADA;

            // Moverse hacia arriba
            if (esPosicionValida(laberinto, filaActual - 1, columnaActual)) {
                cola.add(new Coordenada(filaActual - 1, columnaActual));
            }

            // Moverse hacia abajo
            if (esPosicionValida(laberinto, filaActual + 1, columnaActual)) {
                cola.add(new Coordenada(filaActual + 1, columnaActual));
            }

            // Moverse hacia la izquierda
            if (esPosicionValida(laberinto, filaActual, columnaActual - 1)) {
                cola.add(new Coordenada(filaActual, columnaActual - 1));
            }

            // Moverse hacia la derecha
            if (esPosicionValida(laberinto, filaActual, columnaActual + 1)) {
                cola.add(new Coordenada(filaActual, columnaActual + 1));
            }
        }

        System.out.println("No se encontró una solución al laberinto.");
    }

    private boolean esPosicionValida(char[][] laberinto, int fila, int columna) {
        // Verificar si la posición está dentro de los límites del laberinto
        if (fila >= 0 && fila < laberinto.length && columna >= 0 && columna < laberinto[0].length) {
            // Verificar si la posición es un pasillo válido
            return laberinto[fila][columna] == PASILLO;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] laberinto = {
            {'1', '1', '1', '1', '1'},
            {'1', 'X', '0', '0', 'S'},
            {'1', '1', '1', '1', '1'}
        };

        Laberinto laberintoSolver = new Laberinto();
        System.out.println("Laberinto generado:");
        laberintoSolver.imprimeLaberinto(laberinto);
        System.out.println("Resolviendo laberinto...");
        laberintoSolver.resolverLaberinto(laberinto);
    }
}
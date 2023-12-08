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


public class LaberintoSolver {

    //private static final String PARED = "1";
    private static final String PASILLO = "0";
    private static final String UBICACION_ACTUAL = "X";
    private static final String UBICACION_VISITADA = "-";
    private static final String SALIDA = "S";

    private static final int[] DESPLAZAMIENTO_FILA = {0, 0, 1, -1};
    private static final int[] DESPLAZAMIENTO_COLUMNA = {1, -1, 0, 0};

    public static void main(String[] args) {
        String[][] laberinto = {
                {"1", "1", "1", "1", "1"},
                {"1", "X", "0", "0", "S"},
                {"1", "1", "1", "1", "1"}
        };

        System.out.println("Laberinto inicial:");
        imprimirLaberinto(laberinto);

        resolverLaberinto(laberinto);

        System.out.println("Laberinto resuelto:");
        imprimirLaberinto(laberinto);
    }

    public static void resolverLaberinto(String[][] laberinto) {
        int filaInicial = -1;
        int columnaInicial = -1;

        // Buscar la ubicación inicial de la "X"
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[0].length; j++) {
                if (laberinto[i][j].equals(UBICACION_ACTUAL)) {
                    filaInicial = i;
                    columnaInicial = j;
                    break;
                }
            }
        }

        if (filaInicial == -1 || columnaInicial == -1) {
            System.out.println("No se encontró la ubicación inicial.");
            return;
        }

        if (resolverRecursivo(laberinto, filaInicial, columnaInicial)) {
            System.out.println("Laberinto resuelto.");
        } else {
            System.out.println("No se encontró la salida del laberinto.");
        }
    }

    public static boolean resolverRecursivo(String[][] laberinto, int fila, int columna) {
        // Verificar si se alcanzó la salida
        if (laberinto[fila][columna].equals(SALIDA)) {
            return true;
        }

        // Marcar la ubicación actual como visitada
        laberinto[fila][columna] = UBICACION_VISITADA;

        // Explorar las posibles direcciones
        for (int i = 0; i < 4; i++) {
            int nuevaFila = fila + DESPLAZAMIENTO_FILA[i];
            int nuevaColumna = columna + DESPLAZAMIENTO_COLUMNA[i];

            // Verificar si la nueva posición es válida
            if (esPosicionValida(laberinto, nuevaFila, nuevaColumna)) {
                // Moverse a la nueva posición
                laberinto[nuevaFila][nuevaColumna] = UBICACION_ACTUAL;
                imprimirLaberinto(laberinto);

                // Resolver recursivamente desde la nueva posición
                if (resolverRecursivo(laberinto, nuevaFila, nuevaColumna)) {
                    return true;
                }

                // Retroceder si no se encontró la salida desde la nueva posición
                laberinto[nuevaFila][nuevaColumna] = UBICACION_VISITADA;
                imprimirLaberinto(laberinto);
            }
        }

        // No se encontró la salida desde la posición actual
        return false;
    }

    public static boolean esPosicionValida(String[][] laberinto, int fila, int columna) {
        int filas = laberinto.length;
        int columnas = laberinto[0].length;

        return (fila >= 0 && fila < filas && columna >= 0 && columna < columnas
                && (laberinto[fila][columna].equals(PASILLO) || laberinto[fila][columna].equals(SALIDA)));
    }

    public static void imprimirLaberinto(String[][] laberinto) {
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[0].length; j++) {
                System.out.print(laberinto[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
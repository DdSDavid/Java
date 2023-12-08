public class LaberintoPlus {

    private static final String PARED = "1";
    private static final String INICIO = "S";
    private static final String SALIDA = "X";
    private static final int FILAS = 17;
    private static final int COLUMNAS = 15;

    private static final String[][] laberinto = {
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"1", "X", "0", "0", "0", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"1", "1", "1", "0", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"1", "0", "0", "0", "0", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"1", "0", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"1", "0", "0", "0", "0", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"1", "1", "1", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"1", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "0", "0", "0", "1"},
            {"1", "0", "0", "0", "0", "0", "1", "1", "1", "1", "0", "1", "1", "1", "1"},
            {"1", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "1"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "0", "1", "1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "0", "0", "0", "1"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "1", "1", "1"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "1", "0", "0", "S"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "0", "0", "1", "1"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "0", "0", "0", "1"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}
    };

    public static void main(String[] args) {
        resolverLaberinto();
    }

    private static void resolverLaberinto() {
        int[] posicionInicio = encontrarInicio();
        int filaInicio = posicionInicio[0];
        int columnaInicio = posicionInicio[1];

        boolean[][] visitado = new boolean[FILAS][COLUMNAS];
        boolean encontrado = buscarSalida(filaInicio, columnaInicio, visitado);

        if (encontrado) {
            System.out.println("Se encontró una ruta hacia la salida.");
        } else {
            System.out.println("No se encontró una ruta hacia la salida.");
        }
    }

    private static boolean buscarSalida(int fila, int columna, boolean[][] visitado) {
        if (!esCoordenadaValida(fila, columna) || visitado[fila][columna]) {
            return false;
        }

        visitado[fila][columna] = true;

        if (laberinto[fila][columna].equals(SALIDA)) {
            return true;
        }

        if (laberinto[fila][columna].equals(PARED)) {
            return false;
        }

        boolean encontrado = buscarSalida(fila - 1, columna, visitado) || // Arriba
                buscarSalida(fila + 1, columna, visitado) || // Abajo
                buscarSalida(fila, columna - 1, visitado) || // Izquierda
                buscarSalida(fila, columna + 1, visitado); // Derecha

        return encontrado;
    }

    private static boolean esCoordenadaValida(int fila, int columna) {
        return fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS;
    }

    private static int[] encontrarInicio() {
        int[] posicionInicio = new int[2];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (laberinto[i][j].equals(INICIO)) {
                    posicionInicio[0] = i;
                    posicionInicio[1] = j;
                    return posicionInicio;
                }
            }
        }

        return posicionInicio;
    }
}


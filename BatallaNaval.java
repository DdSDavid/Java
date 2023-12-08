// Batalla Naval

// El objetivo del siguiente ejercicio es poner en práctica tus habilidades de programación mientras te enfrentas a la 
// tarea de hundir los barcos enemigos. Deberás crear un programa que simule el emocionante juego de la Batalla Naval 
// contra la computadora.
// 1. El primer paso consiste en generar dos matrices de tamaño 4x4: "Computadora" y "Jugador". Estas matrices se llenarán
// de forma aleatoria con símbolos. Los símbolos "~" representarán espacios vacíos, mientras que los símbolos "=" 
// simbolizarán los barcos enemigos. Cada matriz deberá contener cinco barcos. 
// Por ejemplo:
// ~ ~ ~ ~ = ~ ~ = ~ ~ = ~ ~ = ~ =

// 2. El jugador deberá ingresar las coordenadas de fila y columna que desea atacar en el mapa de la computadora.

// 3. El programa imprimirá en la consola la matriz de la computadora sin revelar la ubicación exacta de los barcos
// enemigos, utilizando el símbolo "~". Además, se colocará una "X" en las coordenadas ingresadas por el jugador. 
// Si el ataque fue exitoso, en lugar de la "X" se mostrará una "A".

// Ejemplo de resultado:
// ~ X ~ ~ ~ ~ ~ A ~ X A ~ ~ ~ ~ ~

// 4. Luego, el programa seleccionará de forma aleatoria las coordenadas para que la computadora ataque al jugador.

// 5. Se imprimirá en pantalla el mapa del jugador, revelando los barcos enemigos representados por el símbolo "=" en
// su ubicación correspondiente. Al igual que antes, se colocará una "X" en las coordenadas atacadas por la computadora,
// o una "A" si el ataque fue certero.

// Ejemplo de resultado:

//  ~ ~ ~ ~

//  A X ~ =

//  X ~ = X

//  ~ = ~ A

// 6. Los pasos 2 al 5 se repetirán hasta que uno de los dos mapas tenga cinco "A" en lugar de los cinco "=" originales.
// En ese caso, se imprimirán ambos mapas y se declarará al ganador de la partida.

// 7. Una vez completado el punto 6, puedes mejorar el juego agregando referencias de coordenadas al mapa impreso.
// Utiliza letras para representar las filas y números para las columnas, de manera que sea más fácil para el jugador identificar las coordenadas de ataque.
// Ejemplo:
// -  1 2 3 4

// A| ~ ~ ~ ~

// B| = ~ ~ A

// C| ~ X = ~

// D| ~ = ~ =
// El jugador podrá ingresar las coordenadas en formato de cadena, por ejemplo, "B2", y el programa deberá traducirlas
// a [1, 1]. De la misma manera, cuando la computadora imprima las coordenadas de ataque, estas deberán aparecer en
// formato de texto, como "B2".

// 8. Como siguiente paso opcional, puedes aumentar el tamaño del mapa a 10x10. Además, cuando el ataque del jugador
// esté a una celda de distancia de un "=" enemigo, el programa puede imprimir "¡Casi me das!" en la consola. Si el 
//ataque se encuentra a dos celdas de distancia, se mostrará el mensaje "Estuvo cerca". Y si el ataque está a tres celdas
// de distancia, el programa imprimirá "Sigue intentándolo".

// 💡Recuerda que el jugador sigue ingresando las coordenadas en formato de cadena, por ejemplo, "B2", y el programa se
// encarga de realizar la traducción a la notación de coordenadas [1, 1]. De igual manera, cuando la computadora imprime
// las coordenadas de su ataque, estas aparecen en formato de texto, como "B2".

import java.util.Random;
import java.util.Scanner;

public class BatallaNaval {
    public static void main(String[] args) {
        char[][] mapaComputadora = generarMapa();
        char[][] mapaJugador = generarMapa();

        int barcosEnemigos = 5;
        int barcosJugador = 5;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (barcosEnemigos > 0 && barcosJugador > 0) {
            System.out.println("Ataque del jugador:");
            imprimirMapa(mapaComputadora, false);

            int[] coordenadasJugador = obtenerCoordenadas(scanner);
            int filaJugador = coordenadasJugador[0];
            int columnaJugador = coordenadasJugador[1];

            if (mapaComputadora[filaJugador][columnaJugador] == '=') {
                mapaComputadora[filaJugador][columnaJugador] = 'A';
                barcosEnemigos--;
                System.out.println("¡Has hundido un barco enemigo!");
            } else {
                mapaComputadora[filaJugador][columnaJugador] = 'X';
            }

            System.out.println("Ataque de la computadora:");
            int filaComputadora = random.nextInt(4);
            int columnaComputadora = random.nextInt(4);

            System.out.println("La computadora atacó la posición: " + obtenerCoordenadasTexto(filaComputadora, columnaComputadora));

            if (mapaJugador[filaComputadora][columnaComputadora] == '=') {
                mapaJugador[filaComputadora][columnaComputadora] = 'A';
                barcosJugador--;
                System.out.println("¡La computadora ha hundido uno de tus barcos!");
            } else {
                mapaJugador[filaComputadora][columnaComputadora] = 'X';
            }

            System.out.println("Estado actual del mapa del jugador:");
            imprimirMapa(mapaJugador, true);
        }

        System.out.println("¡Fin del juego!");

        System.out.println("Mapa del jugador:");
        imprimirMapa(mapaJugador, false);

        System.out.println("Mapa de la computadora:");
        imprimirMapa(mapaComputadora, true);

        if (barcosEnemigos == 0) {
            System.out.println("¡Has ganado la partida!");
        } else {
            System.out.println("¡La computadora ha ganado la partida!");
        }

        scanner.close();
    }

    public static char[][] generarMapa() {
        char[][] mapa = new char[4][4];
        Random random = new Random();

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = '~';
            }
        }

        int barcosGenerados = 0;

        while (barcosGenerados < 5) {
            int fila = random.nextInt(4);
            int columna = random.nextInt(4);

            if (mapa[fila][columna] == '~') {
                mapa[fila][columna] = '=';
                barcosGenerados++;
            }
        }

        return mapa;
    }

    public static void imprimirMapa(char[][] mapa, boolean revelarBarcos) {
        System.out.println("-  1 2 3 4");
        char letraFila = 'A';

        for (int i = 0; i < mapa.length; i++) {
            System.out.print(letraFila + "| ");

            for (int j = 0; j < mapa[i].length; j++) {
                if (revelarBarcos && mapa[i][j] == '=') {
                    System.out.print("= ");
                } else {
                    System.out.print(mapa[i][j] + " ");
                }
            }

            System.out.println();
            letraFila++;
        }
    }

    public static int[] obtenerCoordenadas(Scanner scanner) {
        System.out.print("Ingresa las coordenadas de ataque (ejemplo: A2): ");
        String coordenadas = scanner.nextLine().toUpperCase();

        int fila = coordenadas.charAt(0) - 'A';
        int columna = Integer.parseInt(coordenadas.substring(1)) - 1;

        return new int[] { fila, columna };
    }

    public static String obtenerCoordenadasTexto(int fila, int columna) {
        char letraFila = (char) ('A' + fila);
        int numeroColumna = columna + 1;

        return letraFila + Integer.toString(numeroColumna);
    }
}

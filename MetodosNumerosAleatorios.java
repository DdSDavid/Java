// Generación de números aleatorios: En base al ejercicio que ya has realizado, crea un método "numeroAleatorio()" que no requiera parámetros
// y devuelva un "int" dentro del rango especificado.

import java.util.Random;

public class MetodosNumerosAleatorios {
    public static void main(String[] args) {
        int numeroAleatorio = numeroAleatorio(1, 100);
        System.out.println("Número aleatorio: " + numeroAleatorio);
    }

    public static int numeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }
}

// Adivinar el número: Escribir un programa que genere un número aleatorio entre 1 y 100,
// y le pida al usuario adivinar ese número utilizando un bucle do-while. El programa debe
// mostrar un mensaje indicando si el número ingresado es mayor o menor que el número aleatorio,
// y continuar pidiendo al usuario que adivine hasta que lo haga correctamente.

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;// Genera un número aleatorio entre 1 y 100
        int intentos = 0;
        int numeroIngresado;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Advina el número (entre 1 y 100)");
            numeroIngresado = scanner.nextInt();
            intentos++;

            if (numeroIngresado > numeroAleatorio) {
                System.out.println("El número ingresado es mayor que el número aleatotio.");

            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número aleatorio.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número " + intentos + " intendos.");
            }
        } while (numeroIngresado != numeroAleatorio);

scanner.close();
    }
}

// Ejercicio de extracción de subcadena: Escribir un programa que solicite al usuario una frase y dos números
// enteros, representando un índice inicial y un índice final. Utilizar el método substring() de la clase String
// para extraer la subcadena que se encuentra entre los índices ingresados por el usuario, y mostrar la subcadena
// resultante en pantalla.

import java.util.Scanner;

public class ExtraccionSubcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese el índice inicial: ");
        int indiceInicial = scanner.nextInt();

        System.out.print("Ingrese el índice final: ");
        int indiceFinal = scanner.nextInt();

        // Validar que los índices estén dentro del rango válido
        if (indiceInicial >= 0 && indiceFinal <= frase.length() && indiceInicial <= indiceFinal) {
            String subcadena = frase.substring(indiceInicial, indiceFinal);
            System.out.println("La subcadena extraída es: " + subcadena);
        } else {
            System.out.println("Los índices ingresados no son válidos.");
        }

        scanner.close();
    }
}
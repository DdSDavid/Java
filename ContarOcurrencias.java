// Contar ocurrencias: Escribir un programa que recorra un array de caracteres y solicite al usuario un carácter objetivo, y cuente cuántas veces aparece 
// el carácter objetivo en el array y lo imprima por consola.

import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int contador = 0;

        // Solicitar al usuario un carácter objetivo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un carácter objetivo: ");
        char caracterObjetivo = scanner.next().charAt(0);

        // Recorrer el array y contar los caracteres objetivo
        for (char c : array) {
            if(c == caracterObjetivo) {
                contador++;
            }
        }

        // Imprimir el resultado
        System.out.println("El caracter '" + caracterObjetivo + "' aparece " + contador + " veces en el array.");

        // Cerrar el objeto Scanner
        scanner.close();        

    }
}

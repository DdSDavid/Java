// Ordenar elementos: Escribir un programa que solicite al usuario 4 nombres, lo cuales 
// debes ordenar alfabeticamente y luego imprimirlos en consola, sin usar el bucle for. 

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[4];

        // Solicitar al usuario los 4 nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Ordenar los nombres alfabéticamente
        Arrays.sort(nombres);

        // Imprimir los nombres ordenados en consola
        System.out.println("Nombres ordenados:");
        imprimirArray(nombres);

        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método auxiliar para imprimir el contenido de un array
    private static void imprimirArray(String[] array) {
        imprimirElemento(array, 0);
    }

    // Método auxiliar recursivo para imprimir los elementos del array
    private static void imprimirElemento(String[] array, int index) {
        if (index < array.length) {
            System.out.println(array[index]);
            imprimirElemento(array, index + 1);
        }
    }
}
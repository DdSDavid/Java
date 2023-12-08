// Rellenar un arreglo: Escribir un programa que solicite al usuario el tamaño para un arreglo y 
// un entero con el cual quiera rellanarlo, crear el arreglo y usar Arrays.fill(). Luego, imprime
//  el arreglo resultante.

import java.util.Arrays;
import java.util.Scanner;

public class RellenarArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del arreglo al usuario
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        // Solicitar el número con el que se va a rellenar el arreglo
        System.out.print("Ingrese el número con el que desea rellenar el arreglo: ");
        int numero = scanner.nextInt();

        // Crear el arreglo y rellenarlo con el número dado
        int[] arreglo = new int[tamaño];
        Arrays.fill(arreglo, numero);

        // Imprimir el arreglo resultante
        System.out.println("Arreglo resultante:");
        mostrarArreglo(arreglo);

        scanner.close();
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + ": " + arreglo[i]);
        }
    }
}

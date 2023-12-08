// Búsqueda binaria: Escribir un programa que realice una búsqueda binaria en un arreglo
// ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir
// el índice del valor buscado si está presente en el arreglo.


import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};

        // Ordenar el arreglo si aún no está ordenado
        Arrays.sort(numeros);

        // Solicitar al usuario que ingrese el valor a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscado = scanner.nextInt();
        scanner.close();

        // Realizar la búsqueda binaria
        int indice = Arrays.binarySearch(numeros, valorBuscado);

        // Verificar el resultado de la búsqueda
        if (indice >= 0) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el índice " + indice + ".");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo.");
        }
    }
}
// Buscar un elemento: Escribir un programa que cree un array de 3 enteros y solicite un número al usuario, 
// e imprima por consola si está presente en el array o no, sin usar el bucle for.

import java.util.Scanner;

public class BuscarUnElemento {
    public static void main(String[] args) {
        //Crear un array de 3 enteros
        int[] array = {3, 4, 8};

        //Solicitar al usuario un número
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Buscar el número en el array
        boolean encontrado = false;
        encontrado = encontrado || (array[0] == numero);
        encontrado = encontrado || (array[1] == numero);
        encontrado = encontrado || (array[2] == numero);

        //Imprimir el resultado por consola
        if (encontrado) {
            System.out.println("El número esta presente en el array.");

        } else {

            System.out.println("El numero no está presente en el array.");
        }
        // Cerrar el objeto Scanner
        scanner.close();
    }
}

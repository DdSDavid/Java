// Ejercicio de búsqueda de caracteres: Escribir un programa que solicite al usuario una palabra y un carácter,
// y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase
// String. Mostrar un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.

import java.util.Scanner;

public class BusquedaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.nextLine().charAt(0);

        int indice = palabra.indexOf(caracter);

        if (indice != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la palabra.");
        } else {
            System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
        }

        scanner.close();
    }
}


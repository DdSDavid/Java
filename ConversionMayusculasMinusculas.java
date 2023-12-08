// Ejercicio de conversión de mayúsculas y minúsculas: Escribir un programa que solicite al usuario una cadena 
// de texto y muestre en pantalla la misma cadena, pero con todos los caracteres en mayúsculas o minúsculas. 
// Utilizar los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.

import java.util.Scanner;

public class ConversionMayusculasMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        System.out.print("¿Desea convertir a mayúsculas o minúsculas? (M/m para mayúsculas, N/n para minúsculas): ");
        char opcion = scanner.nextLine().charAt(0);

        String cadenaConvertida;

        if (opcion == 'M' || opcion == 'm') {
            cadenaConvertida = cadena.toUpperCase();
        } else if (opcion == 'N' || opcion == 'n') {
            cadenaConvertida = cadena.toLowerCase();
        } else {
            System.out.println("Opción inválida.");
            scanner.close();
            return;
        }

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena convertida: " + cadenaConvertida);

        scanner.close();
    }
}
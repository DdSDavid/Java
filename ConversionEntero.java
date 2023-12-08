// Ejercicio de conversión de cadena a entero: Escribe un programa que solicite al usuario una cadena de caracteres 
// que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena a un número entero. 
// Utiliza un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida
// a un número entero. En caso de que se produzca la excepción, muestra un mensaje adecuado en pantalla.


import java.util.Scanner;

public class ConversionEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres que represente un número entero: ");
        String cadena = scanner.nextLine();

        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("El número entero convertido es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no representa un número entero válido.");
        }

        scanner.close();
    }
}
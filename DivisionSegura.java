//Ejercicio de división segura: Escribe un programa que solicite al usuario dos números enteros y realice 
// la división del primer número entre el segundo número. Utiliza un bloque "try-catch" para manejar la 
// excepción en caso de que se intente realizar una división por cero. En caso de que se produzca la excepción,
// muestra un mensaje adecuado en pantalla.

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            double division = numero1 / (double) numero2;
            System.out.println("El resultado de la división es: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }

        scanner.close();
    }
}
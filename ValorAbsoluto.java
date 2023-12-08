// Ejercicio de cálculo del valor absoluto: Escribir un programa que solicite al usuario un número entero y 
// muestre en pantalla su valor absoluto utilizando el método abs() de la clase Math.

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int valorAbsoluto = Math.abs(numero);

        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);

        scanner.close();
    }
}
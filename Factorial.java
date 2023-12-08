// Factorial

// Escribir un programa que solicite al usuario un número y calcule su factorial utilizando un bucle do-while. 

// El factorial de un número es el producto de todos los números desde 1 hasta ese número. Te compartimos 
// algunos ejemplos:

//     El factorial de 3 es 1 * 2 * 3 = 6.

//     El factorial de 5 es 1 * 2 * 3 * 4 * 5 = 120.

//     El factorial de 7 es 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040.


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            int factorial = calcularFactorial(numero);

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }

    // Método para calcular el factorial de un número
    public static int calcularFactorial(int numero) {
        int factorial = 1;
        int contador = 1;

        do {
            factorial *= contador;
            contador++;
        } while (contador <= numero);

        return factorial;
    }
}

// Números primos plus

// Desarrollar un programa que solicite al usuario la cantidad deseada de números primos a obtener. 

// El programa debe generar y mostrar la cantidad de números primos solicitada por el usuario.

// 💡Si estás verificando si un número es divisible por todos los anteriores a él, intenta pensar 
// en formas de optimizar el algoritmo para reducir la cantidad de divisiones necesarias.

import java.util.Scanner;

public class NumerosPrimosPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números primos a obtener: ");
        int cantidad = scanner.nextInt();

        int contador = 0;
        int numero = 2;

        System.out.println("Los " + cantidad + " primeros números primos son:");

        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }

        scanner.close();
    }

    // Verifica si un número es primo al comprobar si es divisible por cualquier número desde 2 hasta la raíz cuadrada del número.

    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }

        return true;
    }
}

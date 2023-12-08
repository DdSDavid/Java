// Números primos
// Solicitar al usuario que introduzca un número y verificar si es primo utilizando un bucle do-while. 
// 💡 Un número es primo si solo tiene dos divisores: 1 y él mismo. 
// Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo.


import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;

            do {
                System.out.print("Introduce un número: ");
                numero = scanner.nextInt();

                if (esPrimo(numero)) {
                    System.out.println("¡El número " + numero + " es primo!");
                } else {
                    System.out.println("El número no es primo. Introduce otro número.");
                }
            } while (!esPrimo(numero));
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
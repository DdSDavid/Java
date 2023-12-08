// Ejercicio de divisibilidad: Escribir un programa que solicite al usuario un número y determine si es divisible
// por 5 y por 3, por ninguno de los dos o por ambos. Mostrar el resultado en pantalla.


import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            boolean divisiblePor5 = (numero % 5 == 0);
            boolean divisiblePor3 = (numero % 3 == 0);

            if (divisiblePor5 && divisiblePor3) {
                System.out.println("El número es divisible por 5 y por 3");
            } else if (divisiblePor5) {
                System.out.println("El número es divisible por 5");
            } else if (divisiblePor3) {
                System.out.println("El número es divisible por 3");
            } else {
                System.out.println("El número no es divisible ni por 5 ni por 3");
            }
        } else {
            System.out.println("Error: solo se permiten números");
        }

        scanner.close();
    }
}
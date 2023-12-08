// Ejercicio de números positivos y negativos: Escribir un programa que solicite al usuario un número y 
// determine si es positivo, negativo o cero. Mostrar el resultado en pantalla. 


import java.util.Scanner;

public class PositivoNegativoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El número es positivo");
            } else if (numero < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es cero");
            }
        } else {
            System.out.println("Error: solo se permiten números");
        }

        scanner.close();
    }
}

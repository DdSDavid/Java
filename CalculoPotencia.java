// Ejercicio de cálculo de potencia: Escribir un programa que solicite al usuario dos números enteros, 
// representando la base y el exponente, y calcular el resultado de elevar la base al exponente utilizando
// el método pow() de la clase Math. Mostrar el resultado en pantalla.


import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente: ");
        double exponente = scanner.nextDouble();

        double resultado = Math.pow(base, exponente);

        System.out.println("El resultado de " + base + " elevado a la potencia " + exponente + " es: " + resultado);

        scanner.close();
    }
}
// Ejercicio de redondeo de números: Escribir un programa que solicite al usuario un número decimal y muestre en
// pantalla su valor redondeado utilizando el método round() de la clase Math.


import java.util.Scanner;

public class RedondeoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();

        long numeroRedondeado = Math.round(numero);

        System.out.println("El número redondeado es: " + numeroRedondeado);

        scanner.close();
    }
}
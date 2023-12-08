// Ejercicio de cálculo de raíz cuadrada: Escribir un programa que solicite al usuario un número positivo y 
// calcule su raíz cuadrada utilizando el método sqrt() de la clase Math. Si el número ingresado es negativo,
// mostrar un mensaje adecuado en pantalla.


import java.util.Scanner;

public class CalculoRaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        } else {
            System.out.println("El número ingresado es negativo. No es posible calcular la raíz cuadrada.");
        }

        scanner.close();
    }
}
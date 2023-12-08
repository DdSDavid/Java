// Suma de números: Pide al usuario que ingrese un string que represente un entero, y luego un string que 
// represente un doble. Convierte cada cadena al tipo de dato correspondiente usando los métodos valueOf,
// suma sus valores e imprímelos por consola.


import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String numeroEnteroStr = scanner.nextLine();

        System.out.print("Ingrese un número decimal: ");
        String numeroDecimalStr = scanner.nextLine();

        int numeroEntero = Integer.valueOf(numeroEnteroStr);
        double numeroDecimal = Double.valueOf(numeroDecimalStr);

        double suma = numeroEntero + numeroDecimal;
        System.out.println("La suma de los números es: " + suma);

        scanner.close();
    }
}
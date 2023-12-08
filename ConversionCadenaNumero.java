// Conversión de cadena a número: Escribir un programa que lea un dato tipo cadena pero que represente un número
// entero como entrada utilizando la clase Scanner, y luego convierta la cadena en un número entero utilizando 
// la clase de envoltura Integer.


import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String numeroStr = scanner.nextLine();

        int numero = Integer.parseInt(numeroStr);

        System.out.println("El número ingresado es: " + numero);

        scanner.close();
    }
}


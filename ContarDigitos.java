// Cuenta dígitos en un número: Pide al usuario que ingrese un número. Convierte el número a una cadena y luego
//  utiliza un bucle y Character.isDigit() para contar el número de dígitos en el número.


import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        String numeroString = String.valueOf(numero);
        int contador = 0;

        for (int i = 0; i < numeroString.length(); i++) {
            if (Character.isDigit(numeroString.charAt(i))) {
                contador++;
            }
        }

        System.out.println("El número de dígitos en el número es: " + contador);

        scanner.close();
    }
}


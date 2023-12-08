// Verificar si una cadena representa un número válido: Pide al usuario que ingrese una cadena. Intenta convertir
// la cadena a un doble usando Double.valueOf(). Si la cadena no representa un número válido, Double.valueOf() 
// lanzará una excepción. Atrapa esta excepción y muestra un mensaje al usuario indicando que la entrada no es 
// un número válido.


import java.util.Scanner;

public class VerificarNumeroValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        try {
            double numero = Double.valueOf(cadena);
            System.out.println("La cadena representa el número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La cadena no representa un número válido");
        }

        scanner.close();
    }
}
// Ejercicio de longitud de cadena: Escribir un programa que solicite al usuario una cadena de texto y muestre 
// en pantalla la longitud de la cadena utilizando el método length() de la clase String.


import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es: " + longitud);
        
        scanner.close();
    }
}

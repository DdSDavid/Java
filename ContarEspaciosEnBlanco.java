// Cuenta espacios en blanco en una cadena: Pide al usuario que ingrese una cadena. Crea un bucle que recorra
//  cada carácter en la cadena y use Character.isWhitespace() para contar el número de espacios en blanco en 
// la cadena. Muestra el recuento al usuario.


import java.util.Scanner;

public class ContarEspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        int contadorEspacios = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isWhitespace(cadena.charAt(i))) {
                contadorEspacios++;
            }
        }

        System.out.println("El número de espacios en blanco es: " + contadorEspacios);

        scanner.close();
    }
}
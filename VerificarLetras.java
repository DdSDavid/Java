// Verificar si una cadena contiene solo letras: Pide al usuario que ingrese una cadena. Crea un bucle que 
// recorra cada carácter en la cadena y use Character.isLetter() para verificar si todos los caracteres son
// letras. Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.


import java.util.Scanner;

public class VerificarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        boolean contieneSoloLetras = true;

        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isLetter(cadena.charAt(i))) {
                contieneSoloLetras = false;
                break;
            }
        }

        if (contieneSoloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }

        scanner.close();
    }
}
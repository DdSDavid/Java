// Validación de contraseña: Escribir un programa que solicite al usuario ingresar una contraseña y
// la valide utilizando un bucle while. La contraseña correcta es "secreto". El programa debe seguir
// pidiendo al usuario que ingrese la contraseña hasta que sea correcta.

import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        String contrasenaCorrecta = "secreto";
        String contrasenaIngresada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");

        while (true) {
            contrasenaIngresada = scanner.nextLine();

            if (contrasenaIngresada.equals(contrasenaCorrecta)) {
               System.out.println("Contraseña correcta. Acceso concedido.");
               break;
             
            } else {
                System.out.println("Contraseña incorrecta. Intente nuevamente: ");
            }
        }

        scanner.close();
    }
}

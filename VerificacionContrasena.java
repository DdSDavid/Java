// Ejercicio de verificación de contraseña: Escribir un programa que solicite al usuario una contraseña y 
// verifique si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, mostrar un 
// mensaje de "Acceso concedido". De lo contrario, mostrar un mensaje de "Acceso denegado". 


import java.util.Scanner;

public class VerificacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenaPredefinida = "contrasena123";

        System.out.print("Ingrese la contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        if (contrasenaIngresada.equals(contrasenaPredefinida)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        scanner.close();
    }
}
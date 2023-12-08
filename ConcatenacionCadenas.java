// Ejercicio de concatenación de cadenas: Escribir un programa que solicite al usuario su nombre y apellido 
// por separado, y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.


import java.util.Scanner;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        
        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Nombre completo: " + nombreCompleto);
        
        scanner.close();
    }
    // Validación para permitir solo letras y no números en el ingreso del nombre y apellido:
       
    // private static String obtenerCadenaSoloLetras(Scanner scanner) {
    //     String cadena = scanner.nextLine();
        
    //     while (!cadena.matches("[a-zA-Z]+")) {
    //         System.out.println("Error. Solo se permiten letras. Vuelva a intentarlo.");
    //         cadena = scanner.nextLine();
    //     }
        
    //     return cadena;
    // }


}
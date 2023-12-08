// Usar una variable global: Modifica los métodos "obtenerNombre()" y "obtenerEdad()" para que no necesiten recibir el Scanner por parámetro.
//  En su lugar, utiliza una variable global para acceder al Scanner y obtener los datos necesarios.

// Ejemplo de codigo:
// public static void main(String[] args) {
//     Scanner pepe = new Scanner(System.in);
//     String nombre = obtenerNombre(pepe);
//     int edad = obtenerEdad(pepe);
//     imprimirNombreYEdad(nombre, edad);
// }




import java.util.Scanner;

public class MetodosObtenerNombreEdadII {

    private static Scanner scanner; // Variable global de tipo Scanner

    public static void main(String[] args) {
        scanner = new Scanner(System.in); // Inicializar el Scanner

        String nombre = obtenerNombre();
        int edad = obtenerEdad();

        imprimirNombreYEdad(nombre, edad);

        scanner.close();
    }

    public static String obtenerNombre() {
        System.out.println("Por favor ingrese un nombre:");
        String nombre = scanner.nextLine();
        return nombre;
    }

    public static int obtenerEdad() {
        System.out.println("Por favor ingrese una edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente después de nextInt()
        return edad;
    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}
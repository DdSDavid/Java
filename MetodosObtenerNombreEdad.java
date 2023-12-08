// Obtener datos: Crea dos métodos para obtener el nombre y la edad, respectivamente. Ambos métodos deben recibir por parámetro
// una variable de tipo "Scanner".

//Ejemplo de codigo:
// public static void main(String[] args) {
//     Scanner pepe = new Scanner(System.in);
//     System.out.println("Por favor ingrese un nombre:");
//     String nombre = pepe.nextLine();
//     System.out.println("Por favor ingrese una edad:");
//     int edad = pepe.nextInt();
//     imprimirNombreYEdad(nombre, edad);
// }

import java.util.Scanner;

public class MetodosObtenerNombreEdad {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = obtenerNombre(scanner);
        int edad = obtenerEdad(scanner);

        imprimirNombreYEdad(nombre, edad);

        scanner.close();
    }

    public static String obtenerNombre(Scanner scanner) {
        System.out.println("Por favor ingrese un nombre:");
        String nombre = scanner.nextLine();
        return nombre;
    }

    public static int obtenerEdad(Scanner scanner) {
        System.out.println("Por favor ingrese una edad:");
        int edad = scanner.nextInt();
        return edad;
    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}

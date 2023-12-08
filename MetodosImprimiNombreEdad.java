// Imprimir nombre y edad: Crea un método que reciba por parámetro el nombre y la edad, y luego imprima el 
// mensaje "Me llamo [nombre] y tengo [edad] años".

// Ejempo de codigo:
// public static void main(String[] args) {
//     Scanner pepe = new Scanner(System.in);
//     System.out.println("Por favor ingrese un nombre:");
//     String nombre = pepe.nextLine();
//     System.out.println("Por favor ingrese una edad:");
//     int edad = pepe.nextInt();
//     System.out.println("Me llamo "+nombre+" y tengo "+edad+" años");
// }

import java.util.Scanner;


public class MetodosImprimiNombreEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese un nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Por favor ingrese una edad:");
        int edad = scanner.nextInt();

        imprimirNombreEdad(nombre, edad);

        scanner.close();
    }

    public static void imprimirNombreEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}

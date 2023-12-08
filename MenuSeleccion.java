// Ejercicio de selección de opción: Escribir un programa que muestre un menú con las siguientes opciones:
// Opción 1: "Guardar"
// Opción 2: "Cargar"
// Opción 3: "Salir"  
// Solicitar al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 
// Utilizar la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente
// a la opción seleccionada.

import java.util.Scanner;

public class MenuSeleccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Guardar");
            System.out.println("2. Cargar");
            System.out.println("3. Salir");
            System.out.print("Ingrese un número del 1 al 3 para seleccionar una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción: Guardar");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción: Cargar");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción: Salir");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }
}
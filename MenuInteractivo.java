// Menú interactivo con while: Crea un menú interactivo que 
// solicite al usuario que elija una opción de un conjunto de 
// opciones. El menú debe seguir apareciendo hasta que el usuario 
// elija la opción para salir del programa. Para este ejercicio, 
// no es necesario que las opciones del menú realicen acciones 
// reales. Solo necesitas mostrar un mensaje que indique qué 
// opción eligió el usuario.

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Menu interactivo");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir del programa");
            System.out.println("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                System.out.println("Ha seleccionado la opción 1");
                break;
                case 2:
                System.out.println("Ha seleccionado la opción 2");
                break;
                case 3:
                System.out.println("Ha seleccionado la opción 3");
                break;
                case 4:
                System.out.println("Saliendo del programa...");
                break;
                default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;

            }
            System.out.println(); // Agregar línea en blanco para separar las iteraciones

        }
        // Cerrar el objeto Scanner
        scanner.close();

    }
}

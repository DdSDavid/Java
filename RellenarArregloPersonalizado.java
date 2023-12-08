// Rellenar un arreglo de manera personalizada: Escribir un programa en Java que solicite al usuario un tamaño para un arreglo. Luego, 
// debe pedirle que ingrese un número con el cual desea rellenar cierta parte del arreglo, seguido de un índice final. Esta parte del 
// arreglo deberá ser rellenada con el número proporcionado hasta el indice ingresado por el usuario. Si el índice final ingresado no
// es el último índice del arreglo, el programa debe continuar pidiendo al usuario nuevos números para rellenar el arreglo, hasta que
//  se haya proporcionado un número para cada posición. Asegúrese de validar lo siguiente:

// La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.

// El índice final siempre debe ser menor que el tamaño total del arreglo.

// Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice inicial debe ser el índice inmediatamente siguiente al 
// último índice final ingresado. El usuario solo deberá ingresar el nuevo índice final.

// Por último el programa debe imprimir por consola el arreglo completo.

import java.util.Scanner;

public class RellenarArregloPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del arreglo al usuario
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        // Crear el arreglo
        int[] arreglo = new int[tamaño];

        int indiceInicial = 0;

        while (indiceInicial < tamaño) {
            // Solicitar el número con el que se va a rellenar la parte del arreglo
            System.out.print("Ingrese el número para rellenar desde el índice " + indiceInicial + ": ");
            int numero = scanner.nextInt();

            // Solicitar el índice final
            System.out.print("Ingrese el índice final (menor que " + tamaño + "): ");
            int indiceFinal = scanner.nextInt();

            // Validar el índice final
            if (indiceFinal >= tamaño || indiceFinal < indiceInicial) {
                System.out.println("Índice final inválido. Ingrese un índice válido.");
                continue;
            }

            // Rellenar el arreglo con el número indicado en la parte correspondiente
            for (int i = indiceInicial; i <= indiceFinal; i++) {
                arreglo[i] = numero;
            }

            // Actualizar el índice inicial para la próxima iteración
            indiceInicial = indiceFinal + 1;
        }

        // Imprimir el arreglo completo
        System.out.println("Arreglo resultante:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Índice " + i + ": " + arreglo[i]);
        }

        scanner.close();
    }
}

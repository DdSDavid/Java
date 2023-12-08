// Copiar parte de un arreglo: Crear un programa en Java que declare y muestre un arreglo de enteros junto con sus 
// indices. Luego, el programa debe solicitar al usuario dos índices: un índice inicial y un índice final. Con estos
// dos índices, el programa debe copiar la parte del arreglo original comprendida entre estos dos índices (inclusive)
//  en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrese de incluir validaciones para confirmar 
// que el índice inicial es menor que el índice final y que ambos índices estén dentro del rango válido del arreglo 
// original. Finalmente, el programa debe imprimir el nuevo arreglo por consola.

import java.util.Arrays;
import java.util.Scanner;

public class CopiarParteArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Mostrar el arreglo original junto con sus índices
        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        // Solicitar los índices al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el índice inicial: ");
        int indiceInicial = scanner.nextInt();
        System.out.print("Ingrese el índice final: ");
        int indiceFinal = scanner.nextInt();

        // Validar los índices
        if (indiceInicial < indiceFinal && indiceInicial >= 0 && indiceFinal < arreglo.length) {
            // Copiar la parte del arreglo entre los índices indicados
            int[] nuevoArreglo = Arrays.copyOfRange(arreglo, indiceInicial, indiceFinal + 1);

            // Mostrar el nuevo arreglo copiado
            System.out.println("Nuevo arreglo copiado:");
            mostrarArreglo(nuevoArreglo);
        } else {
            System.out.println("Los índices ingresados no son válidos.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + ": " + arreglo[i]);
        }
    }
}
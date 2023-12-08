// Copiar elementos: Escribir un programa que cree un array de 3 enteros y cree una copia del mismo pero con un tamaño extra de 2 elementos,
// imprimiendo el contenido del nuevo array por consola, sin usar el bucle for.

public class CopiarElemento {
    public static void main(String[] args) {
        // Crear un array de 3 enteros
        int[] arrayOriginal = {2, 4, 6};

        // Crear una copia del array con tamaño extra
        int[] arrayCopia = new int[arrayOriginal.length + 2];
        System.arraycopy(arrayOriginal, 0, arrayCopia, 0, arrayOriginal.length);

        // Imprimir el contenido del nuevo array por consola
        System.out.println("Contenido del nuevo array:");
        imprimirArray(arrayCopia);
    }

    // Método auxiliar para imprimir el contenido de un array
    private static void imprimirArray(int[] array) {
        imprimirElemento(array, 0);
    }

    // Método auxiliar recursivo para imprimir los elementos del array
    private static void imprimirElemento(int[] array, int index) {
        if (index < array.length) {
            System.out.println(array[index]);
            imprimirElemento(array, index + 1);
        }
    }
}
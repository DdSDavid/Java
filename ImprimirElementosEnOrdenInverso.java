// Imprimir elementos en orden inverso: Escribir un programa que recorra un array de enteros y los 
// imprima en orden inverso, comenzando desde el último elemento.

public class ImprimirElementosEnOrdenInverso {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Recorrer el array en orden inverso y imprimir elementos
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

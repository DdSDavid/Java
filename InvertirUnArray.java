// Invertir un array: Escribir un programa que recorra un array de enteros y 
// lo invierta (es decir, el primer elemento pasa a ser el último y viceversa) y lo imprima por consola.

public class InvertirUnArray {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8};

        // Invertir el array
        int longitud = array.length;
        for (int i = 0; i < longitud / 2; i++) {
            int temp = array[i];
            array[i] = array[longitud - 1 - i];
            array[longitud - 1 - i] = temp;
        }

        // Imprimir el array invertido
        for( int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

// Imprimir elementos: Escribir un programa que recorra 
// un array de enteros e imprima cada elemento en una línea separada.

public class ImprimirElementos {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        //Recorrer el array e imprimir
        for (int elemento : array) {
            System.out.println(elemento);
        }
    }
}
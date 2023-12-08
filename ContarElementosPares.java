// Contar elementos pares: Escribir un programa que recorra un 
// array de enteros e imprima por consola sus elementos.

public class ContarElementosPares {
    public static void main(String[] args) {
       int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
       int contadorPares = 0;

       // Recorrer el array utilizando el blucle for-each
       for (int numero : array) {
        System.out.println(numero);
        
        // Contar los elementos pares
        if (numero % 2 == 0) {
            contadorPares++;
        }

       }
        
       // Imprimir el total de elementos pares
       System.out.println("Total de elementos pares: " + contadorPares);

    }
}

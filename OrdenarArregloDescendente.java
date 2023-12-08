// Ordenar en forma descendente: Escribir un programa que ordene un arreglo de 
// enteros en forma descendente utilizando el método Arrays.sort(). Y los imprima 
// ordenados en la consola.

import java.util.Arrays;

public class OrdenarArregloDescendente {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 2, 1, 9, 4, 7, 6};

        // Ordenar el arreglo en forma ascendente
        Arrays.sort(numeros);

        // Invertir el arreglo ordenado
        int[] numerosDescendentes = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            numerosDescendentes[i] = numeros[numeros.length - 1 - i];
        }

        // Imprimir el arreglo ordenado en forma descendente
        for (int numero : numerosDescendentes) {
            System.out.println(numero);
        }
    }
}

// Comparar arreglos: Escribir un programa que compare dos arreglos de enteros utilizando el método
//  Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.

import java.util.Arrays;

public class CompararArreglos {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {1, 2, 3, 4, 5};
        int[] arreglo3 = {1, 2, 3, 4, 6};

        boolean sonIguales1 = Arrays.equals(arreglo1, arreglo2);
        boolean sonIguales2 = Arrays.equals(arreglo1, arreglo3);

        if (sonIguales1) {
            System.out.println("Los arreglos 1 y 2 son iguales.");
        } else {
            System.out.println("Los arreglos 1 y 2 son diferentes.");
        }

        if (sonIguales2) {
            System.out.println("Los arreglos 1 y 3 son iguales.");
        } else {
            System.out.println("Los arreglos 1 y 3 son diferentes.");
        }
    }
}

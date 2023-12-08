//  Fibonacci 

// Escribir un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. 
// La serie de Fibonacci es una secuencia donde cada número es la suma de los dos anteriores. 

// La serie de Fibonacci comienza de la siguiente manera:
//     Posición 0: 0

//     Posición 1: 1

//     Posición 2: 1 (suma de la posición 0 y la posición 1, 0 + 1 = 1)

//     Posición 3: 2 (suma de la posición 1 y la posición 2, 1 + 1 = 2)

//     Posición 4: 3 (suma de la posición 2 y la posición 3, 1 + 2 = 3)
// Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2, 3.


public class Fibonacci {
    public static void main(String[] args) {
        int n = 8; // Cantidad de términos a imprimir
        int pos0 = 0; // Primer término
        int pos1 = 1; // Segundo término

        // Imprimir los dos primeros términos de la serie
        System.out.print(pos0 + ", ");
        System.out.print(pos1 + ", ");

        int count = 2; // Contador de términos impresos

        // Calcular y imprimir los siguientes términos de la serie
        while (count < n) {
            int nextTerm = pos0 + pos1;
            System.out.print(nextTerm + ", ");

            // Actualizar los valores de pos0 y pos1 para el siguiente cálculo
            pos0 = pos1;
            pos1 = nextTerm;

            count++;
        }
    }
}

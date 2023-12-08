// Fibonacci plus

// Basándote en el primer ejercicio, ahora crear un programa que solicite al usuario ingresar la posición de un
// número en la serie de Fibonacci y mostrar el valor correspondiente a esa posición. 

// 💡Recuerda que la serie de Fibonacci comienza con los siguientes valores:

//     Posición 0: 0

//     Posición 1: 1

//     Posición 2: 1

//     Posición 3: 2

//     Posición 4: 3



import java.util.Scanner;

public class FibonacciPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la posición de un número en la serie de Fibonacci: ");
        int posicion = scanner.nextInt();

        int resultado = fibonacci(posicion);

        System.out.println("El número en la posición " + posicion + " de la serie de Fibonacci es: " + resultado);

        scanner.close();
    }

    // Método para obtener el valor en una posición de la serie de Fibonacci
    public static int fibonacci(int posicion) {
        if (posicion == 0)
            return 0;
        else if (posicion == 1 || posicion == 2)
            return 1;

        int a = 1;
        int b = 1;
        int resultado = 0;

        for (int i = 3; i <= posicion; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }

        return resultado;
    }
}

// Generar matriz aleatoria
// Crear un programa que genere una matriz cuadrada de números aleatorios:

//     El usuario debe proporcionar el tamaño deseado de la matriz y el rango de valores a utilizar. 

//     Se debe implementar un método llamado "crearMatriz()" que acepte como parámetros el tamaño de la matriz, el valor máximo
//     permitido para los elementos y el valor mínimo permitido para los elementos. 

// A través de la consola, el usuario ingresará los valores requeridos y se generará una matriz aleatoria con números dentro del 
// rango especificado.


import java.util.Random;
import java.util.Scanner;

public class GenerarMatrizAleatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño deseado de la matriz cuadrada: ");
        int tamano = scanner.nextInt();

        System.out.print("Ingrese el valor máximo permitido para los elementos: ");
        int valorMaximo = scanner.nextInt();

        System.out.print("Ingrese el valor mínimo permitido para los elementos: ");
        int valorMinimo = scanner.nextInt();

        int[][] matriz = crearMatriz(tamano, valorMaximo, valorMinimo);

        System.out.println("Matriz generada:");
        mostrarMatriz(matriz);

        scanner.close();
    }

    public static int[][] crearMatriz(int tamano, int valorMaximo, int valorMinimo) {
        int[][] matriz = new int[tamano][tamano];
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                int numeroAleatorio = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
                matriz[i][j] = numeroAleatorio;
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        int tamano = matriz.length;

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


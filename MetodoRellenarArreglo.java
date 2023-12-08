import java.util.Scanner;

public class MetodoRellenarArreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        rellenarArray(arreglo);
        System.out.println("Arreglo completado:");
        imprimirArreglo(arreglo);
    }

    public static void rellenarArray(int[] arreglo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}

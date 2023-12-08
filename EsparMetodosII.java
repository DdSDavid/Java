// Es par: Reemplaza la lógica de pedir un número por un método llamado "solicitarNumero()" que no reciba parámetros y devuelva un entero. 
// También reemplaza la condición del if por un método llamado "esPar()" que reciba por parámetro un entero y devuelva un booleano.

// Ejemplo de codigo:
// public static void main(String[] args) {
//     Scanner pepe = new Scanner(System.in);
//     Integer numero = null;
//     System.out.println("Por favor ingrese un número:");
//     do {
//         try {
//             numero = pepe.nextInt();
//         } catch (Exception e) {
//             pepe.nextLine();
//             System.out.println("No ingresó un número, intente nuevamente:");
//         }
//     } while (numero == null);
//     if (numero % 2 == 0) {
//         System.out.println("El "+numero+" es par");
//     }
// }

import java.util.Scanner;

public class EsparMetodosII {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int numero = solicitarNumero();

        if (esPar(numero)) {
            System.out.println("El " + numero + " es par");
        }

        scanner.close();
    }

    public static int solicitarNumero() {
        Integer numero = null;

        System.out.println("Por favor ingrese un número:");

        do {
            try {
                numero = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);

        return numero;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    } 
}

// Ejercicio 1
//   Pedir al usuario que introduzca dos números, y: 

//         Comparar si número 1 es mayor a número 2.

//         Entender si número 1 es distinto a número 2.

//         Entender si número 1 es divisible por 2.

// Ejecicio 2
//         Pedir al usuario que ingrese 4 números y comparar:

//         Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.

//         Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4. 



import java.util.Scanner;

public class ScannerOperacyOper {
    public static void main(String[] args) {

//    Ejercicio1    
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Introduce el número 1: ");
//         int numero1 = scanner.nextInt();
        
//         System.out.print("Introduce el número 210: ");
//         int numero2 = scanner.nextInt();
        
//         // Comparar si número 1 es mayor a número 2
//         boolean esMayor = numero1 > numero2;
//         System.out.println("El número 1 es mayor que el número 2: " + esMayor);
        
//         // Entender si número 1 es distinto a número 2
//         boolean esDistinto = numero1 != numero2;
//         System.out.println("El número 1 es distinto al número 2: " + esDistinto);
        
//         // Entender si número 1 es divisible por 2
//         boolean esDivisible = numero1 % 2 == 0;
//         System.out.println("El número 1 es divisible por 2: " + esDivisible);
        
//         scanner.close();
//     }
 
// }

//  Ejercicio 2
    Scanner scanner = new Scanner(System.in);
            
    System.out.print("Introduce el número 1: ");
    int numero1 = scanner.nextInt();

    System.out.print("Introduce el número 2: ");
    int numero2 = scanner.nextInt();

    System.out.print("Introduce el número 3: ");
    int numero3 = scanner.nextInt();

    System.out.print("Introduce el número 4: ");
    int numero4 = scanner.nextInt();

    // Comparar si número 1 es mayor que número 2 y si número 3 es mayor que número 4
    boolean condicion1 = numero1 > numero2 && numero3 > numero4;
    System.out.println("Número 1 es mayor que número 2 y número 3 es mayor que número 4: " + condicion1);

    // Comparar si número 1 es mayor que número 2 o si número 3 es mayor que número 4
    boolean condicion2 = numero1 > numero2 || numero3 > numero4;
    System.out.println("Número 1 es mayor que número 2 o número 3 es mayor que número 4: " + condicion2);

    scanner.close();
    }

}

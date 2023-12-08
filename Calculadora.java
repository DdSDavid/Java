// El objetivo de este desafío es crear una calculadora básica en Java que 
// pueda realizar operaciones aritméticas simples, como suma, resta, multiplicación y división. 
// Vas a tener que:

//     Recibir dos números del usuario.

//     Declarar variables para almacenar los números y el resultado de la operación.

//     Permitir al usuario elegir qué operación quiere realizar.

//     Mostrar el resultado de la operación en la consola.

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        int opcion = scanner.nextInt();
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        
        scanner.close();
    }
}


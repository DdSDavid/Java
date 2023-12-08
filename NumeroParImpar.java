// El objetivo de este desafío es escribir un programa que use un operador ternario 
// para determinar si un número es par o impar.
// Vas a tener que:

//     1.Solicitar al usuario que ingrese un número y guardarlo en una variable.

//     2.Crear un programa que identifique si el número es par o impar.

//     3.Mostrar el resultado en la consola


import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
        scanner.close();
    }
}
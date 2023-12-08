// Número de dígitos: Escribe un programa que le pida al usuario un número entero y 
// utilice un bucle while para calcular el número de dígitos de ese número. Por ejemplo,
// el número 4578 tiene 4 dígitos (pensar en la lógica para el 0 que debe devolver que 
// tiene una cifra y también para que se cuenten las cifras de números negativos). 

import java.util.Scanner;

public class NumerosDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int contadorDigitos = 0;

        // Manejo del caso especial del número 0
        if (numero ==0) {
            contadorDigitos = 1;

        }
        // Manejo del caso de números negativos
        else if (numero < 0) {
            numero = Math.abs(numero);// Convertir número negativo a positivo
        }
        while (numero > 0) {
            numero = numero / 10;
            contadorDigitos++;
        }

        System.out.println("El número tiene " + contadorDigitos + " dígitos.");
    }
}

// Ejercicio de días de la semana: Escribir un programa que solicite al usuario un número del 1 al 7, 
// representando un día de la semana, y muestre en pantalla el nombre correspondiente a ese día. Utilizar
// la estructura "switch" para implementar este programa. 

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        String dia;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido";
                break;
        }

        System.out.println("El día correspondiente al número " + numero + " es: " + dia);

        scanner.close();
    }
}
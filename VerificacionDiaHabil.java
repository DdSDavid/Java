// Ejercicio de verificación de día hábil: Escribir un programa que solicite al usuario un número del 1 al 7, 
// representando un día de la semana, y determine si es un día hábil o un día no hábil. Mostrar el resultado 
// en pantalla.  Considerar que los días hábiles son del 1 al 5 (de lunes a viernes), y utilizar la estructura 
// "switch" para implementar este programa.


import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7 para representar un día de la semana: ");
        int dia = scanner.nextInt();

        String mensaje;

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                mensaje = "Es un día hábil";
                break;
            case 6:
            case 7:
                mensaje = "No es un día hábil";
                break;
            default:
                mensaje = "Número de día inválido";
                break;
        }

        System.out.println(mensaje);

        scanner.close();
    }
}
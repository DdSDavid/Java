// Ejercicio de conversión de calificaciones: Escribir un programa que solicite al usuario una calificación numérica 
// del 1 al 5 y muestre en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:
//1: "Muy deficiente"
// 2: "Deficiente"
// 3: "Suficiente"
// 4: "Notable"
// 5: "Sobresaliente". Utilizar la estructura "switch" para implementar este programa.

import java.util.Scanner;

public class ConversionCalidicaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una calificación numérica del 1 al 5: ");
        int calificacion = scanner.nextInt();

        String calificacionTexto;

        switch (calificacion) {
            case 1:
                calificacionTexto = "Muy deficiente";
                break;
            case 2:
                calificacionTexto = "Deficiente";
                break;
            case 3:
                calificacionTexto = "Suficiente";
                break;
            case 4:
                calificacionTexto = "Notable";
                break;
            case 5:
                calificacionTexto = "Sobresaliente";
                break;
            default:
                calificacionTexto = "Calificación inválida";
                break;
        }

        System.out.println("La calificación correspondiente al número " + calificacion + " es: " + calificacionTexto);

        scanner.close();
    }
}
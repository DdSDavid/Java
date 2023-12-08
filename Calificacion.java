// Ejercicio de calificación: Escribir un programa que solicite al usuario una puntuación entre 0 y 100. Luego,
// mostrar en pantalla la calificación correspondiente según la siguiente escala:
// Si la puntuación está entre 90 y 100, muestra "A".
// Si la puntuación está entre 80 y 89, muestra "B".
// Si la puntuación está entre 70 y 79, muestra "C".
// Si la puntuación está entre 60 y 69, muestra "D".
// Si la puntuación es menor a 60, muestra "F". 


import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la puntuación (entre 0 y 100): ");
        int puntuacion = scanner.nextInt();

        String calificacion;

        if (puntuacion >= 90 && puntuacion <= 100) {
            calificacion = "A";
        } else if (puntuacion >= 80 && puntuacion <= 89) {
            calificacion = "B";
        } else if (puntuacion >= 70 && puntuacion <= 79) {
            calificacion = "C";
        } else if (puntuacion >= 60 && puntuacion <= 69) {
            calificacion = "D";
        } else {
            calificacion = "F";
        }

        System.out.println("La calificación correspondiente es: " + calificacion);

        scanner.close();
    }
}
// Ejercicio de calificación: Basándote en el siguiente ejercicio que ya has realizado, crea un método "obtenerNota()" que reciba por parámetro
// un "int" y devuelva un "String". El método debe utilizar la estructura de control "switch expression". 

import java.util.Scanner;

public class MetodosCalificacion {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la puntuación: ");
        int puntuacion = scanner.nextInt();

        String calificacion = obtenerNota(puntuacion);

        System.out.println("La calificación correspondiente es: " + calificacion);

        scanner.close();
    }

    public static String obtenerNota(int puntuacion) {
        String calificacion;

        switch (puntuacion) {
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                calificacion = "A";
                break;
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                calificacion = "B";
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                calificacion = "C";
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                calificacion = "D";
                break;
            default:
                calificacion = "F";
                break;
        }

        return calificacion;
    }  
}

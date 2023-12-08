// Estadísticas de calificaciones

// Desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria.
// Estas calificaciones se deben almacenar en un arreglo de Strings.

// Una vez generado el arreglo, el programa debe generar 3 arreglos nuevos,  separando las calificaciones
// entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10).

// Necesitaras convertir los Strings a double para lograrlo.

// Luego debes calcular el promedio del arreglo original y de cada uno de los nuevos arreglos.

// Por ultimo imprime los resultado en consola.

import java.util.Random;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        int cantidadCalificaciones = 10; // Cantidad de calificaciones

        // Generar el arreglo de calificaciones aleatorias
        String[] calificaciones = generarCalificacionesAleatorias(cantidadCalificaciones);

        // Imprimir el arreglo original de calificaciones
        System.out.println("Calificaciones originales:");
        imprimirArreglo(calificaciones);

        // Convertir las calificaciones a tipo double
        double[] calificacionesNumericas = convertirCalificaciones(calificaciones);

        // Separar las calificaciones en arreglos de desaprobado, aprobado y excelente
        double[] calificacionesDesaprobadas = separarCalificaciones(calificacionesNumericas, "< 4");
        double[] calificacionesAprobadas = separarCalificaciones(calificacionesNumericas, ">= 4");
        double[] calificacionesExcelentes = separarCalificaciones(calificacionesNumericas, ">= 10");

        // Calcular el promedio de las calificaciones
        double promedioCalificaciones = calcularPromedio(calificacionesNumericas);
        double promedioDesaprobadas = calcularPromedio(calificacionesDesaprobadas);
        double promedioAprobadas = calcularPromedio(calificacionesAprobadas);
        double promedioExcelentes = calcularPromedio(calificacionesExcelentes);

        // Imprimir los resultados
        System.out.println("Promedio de todas las calificaciones: " + promedioCalificaciones);
        System.out.println("Promedio de calificaciones desaprobadas: " + promedioDesaprobadas);
        System.out.println("Promedio de calificaciones aprobadas: " + promedioAprobadas);
        System.out.println("Promedio de calificaciones excelentes: " + promedioExcelentes);
    }

    // Método para generar un arreglo de calificaciones aleatorias
    public static String[] generarCalificacionesAleatorias(int cantidad) {
        String[] calificaciones = new String[cantidad];
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            double calificacion = random.nextDouble() * 20; // Generar calificación entre 0 y 20
            calificaciones[i] = String.valueOf(calificacion);
        }
        return calificaciones;
    }

    // Método para imprimir un arreglo
    public static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Método para convertir las calificaciones a tipo double
    public static double[] convertirCalificaciones(String[] calificaciones) {
        double[] calificacionesNumericas = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            calificacionesNumericas[i] = Double.parseDouble(calificaciones[i]);
        }
        return calificacionesNumericas;
    }

    // Método para separar las calificaciones según un criterio dado
    public static double[] separarCalificaciones(double[] calificaciones, String criterio) {
        double[] resultado = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            if (criterio.equals("< 4") && calificaciones[i] < 4) {
                resultado[i] = calificaciones[i];
            } else if (criterio.equals(">= 4") && calificaciones[i] >= 4 && calificaciones[i] < 10) {
                resultado[i] = calificaciones[i];
            } else if (criterio.equals(">= 10") && calificaciones[i] >= 10) {
                resultado[i] = calificaciones[i];
            }
        }
        return resultado;
    }

    // Método para calcular el promedio de un arreglo de calificaciones
    public static double calcularPromedio(double[] calificaciones) {
        if (calificaciones.length == 0) {
            return 0.0;
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
}
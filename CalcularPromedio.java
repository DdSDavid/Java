// Calcular promedio: Sumar todos los elementos de un array de números 
// reales y calcular su promedio e imprimirlo en consola.

public class CalcularPromedio {
    public static void main(String[] args) {
        double[] numeros = {1.5, 2.7, 3.8, 4.2, 5.1};
        double suma = 0;

        // Sumar todos los elementos del array
        for (double numero : numeros) {
            suma += numero;
        }

        // Calcular el promedio
        double promedio = suma / numeros.length;

        // Imprimir el promedio en consola
        System.out.println("El promedio es: " + promedio);

    }
}

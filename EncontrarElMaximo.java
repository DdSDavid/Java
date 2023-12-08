// Encontrar el máximo: Escribir un programa que cree un array de 3 enteros y devuelva el valor máximo presente en el array,
// sin usar el bucle for.

public class EncontrarElMaximo {
    public static void main(String[] args) {
        // Crear un array de 3 enteros
        int[] array = {5, 7, 9};

        // Encontrar el valos máximo del array
        int maximo = Math.max(array[0], Math.max(array[1], array[2]));

        // Imprimir el valor máximo por consola
        System.out.println("El valor máximo del array es: " + maximo);

    }
}

// Promedio de elementos: Escribir un programa que cree un array de 3 enteros e
// imprima por consola el promedio de todos sus elementos, sin usar el bucle for.



public class PromedioDeElementos {
    public static void main(String[] args) {
        // Crear un array de 3 enteros
        int[] array = {2, 4, 6};

        // Calcular el promedio de los elementos del array
        int suma = array[0] + array[1] + array[2];
        double promedio = (double) suma / array.length;

        //Imprimir el promedio por consola
        System.out.println("El promedio de los elementos es: " + promedio);

    }
}

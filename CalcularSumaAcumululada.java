// Calcular suma acumulada: Escribir un programa que recorra un array de enteros y calcule la suma acumulada 
// de los elementos, reemplazando cada elemento por la suma acumulada hasta ese punto.


public class CalcularSumaAcumululada {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sumaAcumulada = 0;

        // Recorrer el array y calcular la suma acumulada
        for (int i = 0; i < array.length; i++) {
            sumaAcumulada += array[i];
            array[i] = sumaAcumulada;
        }

        // Imprimir el array con la suma acumulada
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

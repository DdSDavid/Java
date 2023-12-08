// Encontrar el valor mínimo: Escribir un programa que recorra un array de 
// enteros y encuentre el valor mínimo presente en el array.


public class EncontrarElValorMinimo {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        
        // Se asume que el primer elemento es el minimo
        int minimo = array[0];

        // Recorrer el array y encontrar el valor minimo
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        System.out.println("El valor mínimo es: " + minimo);
    }
}

// Suma de los elementos de una matriz: Calcula e imprime la suma de todos los elementos de la matriz.


public class SumaMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 3, 2},
            {8, 1, 5}
        };

        int suma = 0;

        // Calcular la sumade los elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
               // System.out.print("|" + matriz[i][j] + "|");
            }   
        }

        // Imprimir por consola la suma de la matriz
        System.out.println("La suma de todos los elementos de la matriz es: " + suma);

    }
}

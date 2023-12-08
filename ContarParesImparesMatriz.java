// Contar los números pares e impares en una matriz: Cuenta y muestra cuántos números pares e impares hay en una matriz.


public class ContarParesImparesMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 3, 2},
            {8, 1, 5}

        };

        int pares = 0;
        int impares = 0;

        // Contador de los numeros pares e impares
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                pares++;
                } else {
                    impares++;
                }

            }
        }
        // Mostrar el resultado por consola
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}

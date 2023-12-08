// Matriz de elementos: Crea una matriz de 3x3 con enteros y muestra su contenido por consola en formato de
// matriz. Luego, muestra el mismo contenido en formato de arreglo. 
// Por ejemplo:

// Matriz original:

//     [5, 3, 2]

//     [8, 1, 5]

// Arreglo:

//     [5] [3] [2]

//     [8] [1] [5]


public class MatrizDeElementos {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 3, 2},
            {8, 1, 5}
        };

        // Mostrar matriz en consola
        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }

        // Mostrar el arreglo de la matriz
        System.out.println("\nArreglo: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
        }
    }
}

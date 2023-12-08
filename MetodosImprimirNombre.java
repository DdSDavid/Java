// Imprimir nombre: Crea un método que reciba por parámetro un nombre y luego imprima el mensaje 
// "Mi nombre es [nombre]".
// Ejemplo:

// public static void main(String[] args) {
//     System.out.println("Mi nombre es Elias");
// }


public class MetodosImprimirNombre {
    public static void main(String[] args) {
        imprimirNombre("David");
    }

    public static void imprimirNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre + ".");
    }
}

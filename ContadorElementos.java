// Concatenar elementos: Concatenar todos los elementos de un array de 
// cadenas en una sola cadena separada por espacios e imprimirlo en consola. 

public class ContadorElementos {
    public static void main(String[] args) {
        String[] palabras = {"Hola", "mundo", "este", "es", "un", "for each"};

        // Concatenar los elementos del array en una sola cadena
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            resultado.append(palabra).append(" ");
        }

        //Imprimir la cadena resultante
        System.out.println(resultado.toString());

    }
}

// Ejercicio de generación de números aleatorios: Escribir un programa que genere y muestre en pantalla un número
// aleatorio en el rango del 1 al 100 utilizando el método random() de la clase Math. Puedes utilizar el método 
//floor() para redondear el número aleatorio hacia abajo.

public class NumeroAleatorio {
    public static void main(String[] args) {
        double numeroAleatorio = Math.random() * 100; // Genera un número aleatorio entre 0 y 100
        int numeroRedondeado = (int) Math.floor(numeroAleatorio); // Redondea hacia abajo

        System.out.println("El número aleatorio es: " + numeroRedondeado);
    }
}

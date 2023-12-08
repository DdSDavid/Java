// Ejercicio de cálculo de descuento: Escribir un programa que solicite al usuario el precio de un producto y 
// determine si tiene derecho a un descuento. Si el precio es mayor o igual a $100, aplicar un descuento del 10% 
// y mostrar el nuevo precio. De lo contrario, mostrar el precio original sin descuento. 

import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        if (precio >= 100) {
            double descuento = precio * 0.1;
            double precioConDescuento = precio - descuento;
            System.out.println("Nuevo precio con descuento: $" + precioConDescuento);
        } else {
            System.out.println("Precio original sin descuento: $" + precio);
        }

        scanner.close();
    }
}
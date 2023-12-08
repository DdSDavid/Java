// Ejercicio de selección de figura geométrica: Escribir un programa que solicite al usuario un número del 1 al 3
// para seleccionar una figura geométrica (1: círculo, 2: cuadrado, 3: triángulo). Luego, mostrar en pantalla el 
// área correspondiente a la figura seleccionada. Utilizar la estructura "switch" para implementar este programa. 


import java.util.Scanner;

public class SeleccionFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1: Círculo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triángulo");
        System.out.print("Ingrese un número del 1 al 3: ");
        int opcion = scanner.nextInt();

        double area;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        scanner.close();
    }
}
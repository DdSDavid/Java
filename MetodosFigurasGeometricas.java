//  Figuras geométricas: Crea un un programa que calcule las áreas y los perímetros de un círculo, un triángulo o un paralelogramo. 
// Debe tener dos menús: uno para elegir la figura geométrica y otro para elegir qué calcular. 

// En cada opción se deben solicitar los datos necesarios para aplicar la fórmula correspondiente:
// Perímetro del círculo = 2 * π * radio
// Área del círculo = π * radio ^2 
// Perímetro del triángulo =  a + b + c (donde a, b y c son las longitudes de los lados del triángulo)
// Área del triángulo =  (base * altura) / 2
// Perímetro del paralelogramo = 2* (a + b) (donde a y b son las longitudes de los lados adyacentes del paralelogramo)
// Área del paralelogramo  = base * altura

import java.util.Scanner;


public class MetodosFigurasGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionFigura;
        do {
            mostrarMenuFiguras();
            opcionFigura = scanner.nextInt();
            switch (opcionFigura) {
                case 1: // Círculo
                    calcularCirculo(scanner);
                    break;
                case 2: // Triángulo
                    calcularTriangulo(scanner);
                    break;
                case 3: // Paralelogramo
                    calcularParalelogramo(scanner);
                    break;
                case 0: // Salir
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcionFigura != 0);

        scanner.close();
    }

    public static void mostrarMenuFiguras() {
        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Paralelogramo");
        System.out.println("0. Salir");
    }

    public static void mostrarMenuCalculo() {
        System.out.println("Seleccione qué calcular:");
        System.out.println("1. Perímetro");
        System.out.println("2. Área");
    }

    public static void calcularCirculo(Scanner scanner) {
        mostrarMenuCalculo();
        int opcionCalculo = scanner.nextInt();

        switch (opcionCalculo) {
            case 1: // Perímetro
                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();
                double perimetro = 2 * Math.PI * radio;
                System.out.println("El perímetro del círculo es: " + perimetro);
                break;
            case 2: // Área
                System.out.println("Ingrese el radio del círculo:");
                radio = scanner.nextDouble();
                double area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static void calcularTriangulo(Scanner scanner) {
        mostrarMenuCalculo();
        int opcionCalculo = scanner.nextInt();

        switch (opcionCalculo) {
            case 1: // Perímetro
                System.out.println("Ingrese las longitudes de los lados del triángulo:");
                double ladoA = scanner.nextDouble();
                double ladoB = scanner.nextDouble();
                double ladoC = scanner.nextDouble();
                double perimetro = ladoA + ladoB + ladoC;
                System.out.println("El perímetro del triángulo es: " + perimetro);
                break;
            case 2: // Área
                System.out.println("Ingrese la base y altura del triángulo:");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                double area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static void calcularParalelogramo(Scanner scanner) {
        mostrarMenuCalculo();
        int opcionCalculo = scanner.nextInt();

        switch (opcionCalculo) {
            case 1: // Perímetro
                System.out.println("Ingrese las longitudes de los lados adyacentes del paralelogramo:");
                double ladoA = scanner.nextDouble();
                double ladoB = scanner.nextDouble();
                double perimetro = 2 * (ladoA + ladoB);
                System.out.println("El perímetro del paralelogramo es: " + perimetro);
                break;
            case 2: // Área
                System.out.println("Ingrese la base y altura del paralelogramo:");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                double area = base * altura;
                System.out.println("El área del paralelogramo es: " + area);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}

// Calculadora: Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un método llamado "menu()" que no reciba ningún parámetro y
// se encargue de generar la lógica de mostrar el menú de opciones y producir el bucle para seguir mostrando el menú hasta seleccionar la opción
// de "salir". Solicita dos números al usuario y realiza la operación matemática seleccionada, teniendo en cuenta las validaciones necesarias 
// como la división por cero.


import java.util.Scanner;


public class MetodosCalculadora {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("------ Calculadora ------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("-------------------------");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }

    public static void realizarSuma() {
        double num1 = solicitarNumero("Ingrese el primer número: ");
        double num2 = solicitarNumero("Ingrese el segundo número: ");
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void realizarResta() {
        double num1 = solicitarNumero("Ingrese el primer número: ");
        double num2 = solicitarNumero("Ingrese el segundo número: ");
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void realizarMultiplicacion() {
        double num1 = solicitarNumero("Ingrese el primer número: ");
        double num2 = solicitarNumero("Ingrese el segundo número: ");
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void realizarDivision() {
        double num1 = solicitarNumero("Ingrese el primer número: ");
        double num2;
        do {
            num2 = solicitarNumero("Ingrese el segundo número (distinto de cero): ");
            if (num2 == 0) {
                System.out.println("Error: No se puede dividir entre cero. Intente nuevamente.");
            }
        } while (num2 == 0);

        double resultado = num1 / num2;
        System.out.println("El resultado de la división es: " + resultado);
    }

    public static double solicitarNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}

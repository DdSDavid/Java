import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Ingrese la unidad de medida C para Celsius, F para Fahrenheit: ");
        String unidad = scanner.next();

        if (unidad.equalsIgnoreCase("C")) {
            //Celsius a Fahreheit
            double resultado = (temperatura * 9 / 5) + 32;
            System.out.println("La temperatura equivalente en Fahrenheit es: " + resultado + " °F");

        } else if (unidad.equalsIgnoreCase("F")) {
            // Farenheit a Celsius
            double resultado = (temperatura - 32) * 5 / 9;
            System.out.println("La temperatura equivalente en Celsius es: " + resultado + " °C");
        
        } else {
            System.out.println("Unidad de medida inválida.");
        }

        scanner.close();
    }
}

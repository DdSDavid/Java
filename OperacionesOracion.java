// Escribir un programa en Java que permita al usuario realizar diversas operaciones con una oración. 

// El programa debe cumplir con los siguientes requisitos:

// 1. Mostrar un menú de opciones al usuario donde podrá:

// a) "Crear oración" o "Borrar oración": Si la oración está vacía, mostrar el mensaje "Crear oración". 
// Si la oración tiene contenido, mostrar el mensaje "Borrar oración".

// b) "Cantidad de caracteres de la oración": Calcular y mostrar la cantidad total de caracteres en la 
// oración (incluyendo espacios).

// c) "Cantidad de palabras de la oración": Calcular y mostrar la cantidad de palabras en la oración.

// d) "Mostrar palabras ordenadas alfabéticamente": Mostrar las palabras de la oración ordenadas alfabéticamente.

// e) "Ingresar un número y devolver la palabra correspondiente": Solicitar al usuario ingresar un número y
// mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango 
// de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. 
// Intente nuevamente".

// f) "Buscar palabra dentro de la oración": Solicitar al usuario ingresar una palabra y verificar si esa palabra
// se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que 
// se encuentra.

// g) "Modificar palabra dentro de la oración": Solicitar al usuario ingresar la palabra que se quiere cambiar, 
// mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, 
// solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada 
// (recordar validar que solo contenga letras y espacios).

// h) "Agregar contenido a la oración": Solicitar al usuario ingresar contenido y agregar ese contenido al final
// de la oración.

// i) "Salir": Terminar el programa.

// 2. Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir
// otra acción, excepto cuando elija "Salir". 

import java.util.Scanner;
import java.util.Arrays;

public class OperacionesOracion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oracion = "";
        String[] palabras = {}; // Inicializar la variable palabras

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Crear oración");
            System.out.println("2. Borrar oración");
            System.out.println("3. Cantidad de caracteres de la oración");
            System.out.println("4. Cantidad de palabras de la oración");
            System.out.println("5. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("6. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("7. Buscar palabra dentro de la oración");
            System.out.println("8. Modificar palabra dentro de la oración");
            System.out.println("9. Agregar contenido a la oración");
            System.out.println("10. Salir");

            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer la opción

            System.out.println();

            switch (opcion) {
                case 1:
                    if (oracion.isEmpty()) {
                        System.out.print("Ingrese la oración: ");
                        oracion = scanner.nextLine();
                        System.out.println("Oración creada exitosamente.");
                    } else {
                        System.out.println("La oración ya existe. Use la opción 'Borrar oración' para crear una nueva.");
                    }
                    break;

                case 2:
                    if (!oracion.isEmpty()) {
                        oracion = "";
                        System.out.println("Oración borrada exitosamente.");
                    } else {
                        System.out.println("La oración no existe. Use la opción 'Crear oración' para crear una nueva.");
                    }
                    break;

                case 3:
                    int cantidadCaracteres = oracion.length();
                    System.out.println("La oración tiene " + cantidadCaracteres + " caracteres.");
                    break;

                case 4:
                    palabras = oracion.split("\\s+");
                    int cantidadPalabras = palabras.length;
                    System.out.println("La oración tiene " + cantidadPalabras + " palabras.");
                    break;

                case 5:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración está vacía. Ingrese una oración primero.");
                    } else {
                        palabras = oracion.split("\\s+");
                        Arrays.sort(palabras);
                        System.out.println("Palabras ordenadas alfabéticamente: ");
                        for (String palabra : palabras) {
                            System.out.println(palabra);
                        }
                    }
                    break;

                case 6:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración está vacía. Ingrese una oración primero.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int numeroPalabra = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea después de leer el número

                        if (numeroPalabra >= 1 && numeroPalabra <= palabras.length) {
                            String palabraSeleccionada = palabras[numeroPalabra - 1];
                            System.out.println("La palabra correspondiente al número ingresado es: " + palabraSeleccionada);
                        } else {
                            System.out.println("Número inválido. Intente nuevamente.");
                        }
                    }
                    break;

                case 7:
                    System.out.print("Ingrese una palabra a buscar: ");
                    String palabraBuscar = scanner.nextLine();

                    if (oracion.contains(palabraBuscar)) {
                        int posicion = oracion.indexOf(palabraBuscar) + 1;
                        System.out.println("La palabra '" + palabraBuscar + "' fue encontrada en la posición " + posicion + ".");
                    } else {
                        System.out.println("La palabra '" + palabraBuscar + "' no fue encontrada en la oración.");
                    }
                    break;

                case 8:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración está vacía. Ingrese una oración primero.");
                    } else {
                        System.out.print("Ingrese la palabra que desea cambiar: ");
                        String palabraAnterior = scanner.nextLine();

                        if (oracion.contains(palabraAnterior)) {
                            System.out.print("Ingrese la nueva palabra o frase: ");
                            String nuevaPalabra = scanner.nextLine();

                            if (nuevaPalabra.matches("[a-zA-Z\\s]+")) {
                                oracion = oracion.replace(palabraAnterior, nuevaPalabra);
                                System.out.println("Oración modificada exitosamente.");
                                System.out.println("Nueva oración: " + oracion);
                            } else {
                                System.out.println("La nueva palabra o frase solo puede contener letras y espacios.");
                            }
                        } else {
                            System.out.println("La palabra '" + palabraAnterior + "' no fue encontrada en la oración.");
                        }
                    }
                    break;

                case 9:
                    System.out.print("Ingrese el contenido a agregar: ");
                    String contenido = scanner.nextLine();
                    oracion += " " + contenido;
                    System.out.println("Contenido agregado exitosamente.");
                    break;

                case 10:
                    System.out.println("¡Hasta luego!");
                    scanner.close(); // Cerrar el objeto Scanner antes de salir del programa
                    System.exit(0);

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }
    }
}
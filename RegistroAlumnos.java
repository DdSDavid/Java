// Escribir un programa en Java que permita llevar un registro de alumnos. 

// El programa debe cumplir con los siguientes requisitos:

// 1. Mostrar un menú de opciones al usuario, donde podrá seleccionar una de las siguientes acciones:

// a) "Registrar alumno": Permitir al usuario registrar un nuevo alumno ingresando su nombre y nota.

// 💡Para lograr esto, te recomendamos utilizar un array de tipo String para almacenar los nombres de los alumnos
// y un array de tipo Double para guardar las notas correspondientes. De esta manera, podrás asociar los nombres
// con las notas utilizando los índices de los arrays.

// b) "Mostrar todos los alumnos": Mostrar en pantalla el nombre y la nota de todos los alumnos registrados hasta
// el momento.

// c) "Mostrar promedio de notas": Calcular y mostrar en pantalla el promedio de las notas de todos los alumnos
// registrados hasta el momento.

// d) "Buscar alumno por nombre": Solicitar al usuario ingresar el nombre de un alumno y mostrar en pantalla su
// nota si el alumno existe.

// e) "Modificar nota por nombre": Solicitar al usuario ingresar el nombre de un alumno y permitir modificar su
// nota si el alumno existe.

// f) "Eliminar alumno por nombre": Solicitar al usuario ingresar el nombre de un alumno y eliminar al alumno si
// existe.

// g) "Salir": Terminar el programa.

// 2. El programa debe validar que el nombre no esté vacío y que la nota sea un número válido entre 0.00 y 10.00.

// 3. El programa debe utilizar las estructuras de control adecuadas (if, switch, for, while, do-while) según
// corresponda para implementar las diferentes opciones del menú.

// 4. El programa debe manejar excepciones utilizando bloques try-catch para manejar posibles excepciones al leer
// datos de entrada del usuario.

// 5. Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir
// otra acción hasta que elija la opción "Salir".

import java.util.Scanner;

public class RegistroAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[100]; // Array para almacenar los nombres de los alumnos
        double[] notas = new double[100]; // Array para almacenar las notas de los alumnos
        int contadorAlumnos = 0; // Contador para llevar el registro del número de alumnos registrados

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");

            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer la opción

            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();

                    if (nombre.isEmpty()) {
                        System.out.println("Error: el nombre no puede estar vacío.");
                        break;
                    }

                    System.out.print("Ingrese la nota del alumno: ");
                    double nota;

                    try {
                        nota = scanner.nextDouble();
                        scanner.nextLine(); // Consumir el salto de línea después de leer la nota

                        if (nota < 0 || nota > 10) {
                            System.out.println("Error: la nota debe ser un número válido entre 0.00 y 10.00.");
                            break;
                        }

                        nombres[contadorAlumnos] = nombre;
                        notas[contadorAlumnos] = nota;
                        contadorAlumnos++;

                        System.out.println("Alumno registrado exitosamente.");
                    } catch (Exception e) {
                        System.out.println("Error: entrada inválida. La nota debe ser un número válido.");
                        scanner.nextLine(); // Limpiar el buffer del scanner
                    }
                    break;

                case 2:
                    if (contadorAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        System.out.println("Alumnos registrados:");
                        for (int i = 0; i < contadorAlumnos; i++) {
                            System.out.println("Nombre: " + nombres[i] + ", Nota: " + notas[i]);
                        }
                    }
                    break;

                case 3:
                    if (contadorAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        double sumaNotas = 0;

                        for (int i = 0; i < contadorAlumnos; i++) {
                            sumaNotas += notas[i];
                        }

                        double promedio = sumaNotas / contadorAlumnos;
                        System.out.println("Promedio de notas: " + promedio);
                    }
                    break;

                case 4:
                    if (contadorAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombreBusqueda = scanner.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < contadorAlumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreBusqueda)) {
                                System.out.println("Alumno encontrado. Nota: " + notas[i]);
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    break;

                case 5:
                    if (contadorAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombreModificacion = scanner.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < contadorAlumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreModificacion)) {
                                System.out.print("Ingrese la nueva nota del alumno: ");
                                double nuevaNota;

                                try {
                                    nuevaNota = scanner.nextDouble();
                                    scanner.nextLine(); // Consumir el salto de línea después de leer la nueva nota

                                    if (nuevaNota < 0 || nuevaNota > 10) {
                                        System.out.println("Error: la nota debe ser un número válido entre 0.00 y 10.00.");
                                        encontrado = true;
                                        break;
                                    }

                                    notas[i] = nuevaNota;
                                    System.out.println("Nota modificada exitosamente.");
                                } catch (Exception e) {
                                    System.out.println("Error: entrada inválida. La nota debe ser un número válido.");
                                    scanner.nextLine(); // Limpiar el buffer del scanner
                                }

                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    break;

                case 6:
                    if (contadorAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombreEliminacion = scanner.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < contadorAlumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreEliminacion)) {
                                for (int j = i; j < contadorAlumnos - 1; j++) {
                                    nombres[j] = nombres[j + 1];
                                    notas[j] = notas[j + 1];
                                }

                                contadorAlumnos--;
                                System.out.println("Alumno eliminado exitosamente.");
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    scanner.close(); // Cerrar el Scanner
                    System.exit(0);

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }
    }
}


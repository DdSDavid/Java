// Matriz de nombres y puntajes 
// Crear un programa que tenga una matriz de nombres, puntajes y cursos de estudiantes. 
// Los usuarios deberían poder ver el siguiente menú:

//     Mostrar estudiantes: Esta opción muestra por pantalla la lista de estudiantes junto con su nombre, puntaje y curso.

//     Agregar estudiante: Permite al usuario ingresar un nuevo estudiante proporcionando su nombre, puntaje y curso como strings.
//     Se realiza una validación para asegurar que el puntaje sea un string válido convertible a Double y esté dentro del rango de
//     0.00 a 10.00.

//     Mostrar promedio general: Calcula y muestra el promedio general de todos los estudiantes.
//     Mostrar promedio por curso: Calcula y muestra el promedio de los puntajes en cada curso.
//     Mostrar cantidad de estudiantes por curso: Calcula y muestra la cantidad de estudiantes en cada curso.
//     “Salir”: Esta opción permite terminar el programa.
// Después de cada selección, se muestra nuevamente el menú para que el usuario pueda realizar más acciones, 
// excepto en el caso de seleccionar "Salir". 



import java.util.Scanner;

public class EstudiantesPrograma {
    private static String[] nombres;
    private static double[] puntajes;
    private static String[] cursos;
    private static int cantidadEstudiantes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.print("Ingrese la cantidad máxima de estudiantes: ");
        int capacidad = scanner.nextInt();

        nombres = new String[capacidad];
        puntajes = new double[capacidad];
        cursos = new String[capacidad];

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarEstudiantes();
                    break;
                case 2:
                    agregarEstudiante(scanner);
                    break;
                case 3:
                    mostrarPromedioGeneral();
                    break;
                case 4:
                    mostrarPromedioPorCurso();
                    break;
                case 5:
                    mostrarCantidadEstudiantesPorCurso();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("------ Menú ------");
        System.out.println("1. Mostrar estudiantes");
        System.out.println("2. Agregar estudiante");
        System.out.println("3. Mostrar promedio general");
        System.out.println("4. Mostrar promedio por curso");
        System.out.println("5. Mostrar cantidad de estudiantes por curso");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void mostrarEstudiantes() {
        System.out.println("------ Estudiantes ------");
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.println("Estudiante " + (i + 1) + ":");
                System.out.println("Nombre: " + nombres[i]);
                System.out.println("Puntaje: " + puntajes[i]);
                System.out.println("Curso: " + cursos[i]);
                System.out.println("-------------------------");
            }
        }
    }

    private static void agregarEstudiante(Scanner scanner) {
        System.out.print("Ingrese el nombre del estudiante: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();

        double puntaje;
        do {
            System.out.print("Ingrese el puntaje del estudiante: ");
            String puntajeStr = scanner.nextLine();
            try {
                puntaje = Double.parseDouble(puntajeStr);
                if (puntaje < 0.00 || puntaje > 10.00) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Puntaje inválido. Debe ser un número entre 0.00 y 10.00.");
            }
        } while (true);

        System.out.print("Ingrese el curso del estudiante: ");
        String curso = scanner.nextLine();

        nombres[cantidadEstudiantes] = nombre;
        puntajes[cantidadEstudiantes] = puntaje;
        cursos[cantidadEstudiantes] = curso;
        cantidadEstudiantes++;

        System.out.println("Estudiante agregado correctamente.");
    }

    private static void mostrarPromedioGeneral() {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            double sumaPuntajes = 0;
            for (int i = 0; i < cantidadEstudiantes; i++) {
                sumaPuntajes += puntajes[i];
            }
            double promedio = sumaPuntajes / cantidadEstudiantes;
            System.out.println("Promedio general: " + promedio);
        }
    }

    private static void mostrarPromedioPorCurso() {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            double sumaPuntajesMatematicas = 0;
            double sumaPuntajesFisica = 0;
            double sumaPuntajesQuimica = 0;
            int contadorMatematicas = 0;
            int contadorFisica = 0;
            int contadorQuimica = 0;

            for (int i = 0; i < cantidadEstudiantes; i++) {
                if (cursos[i].equalsIgnoreCase("Matematicas")) {
                    sumaPuntajesMatematicas += puntajes[i];
                    contadorMatematicas++;
                } else if (cursos[i].equalsIgnoreCase("Fisica")) {
                    sumaPuntajesFisica += puntajes[i];
                    contadorFisica++;
                } else if (cursos[i].equalsIgnoreCase("Quimica")) {
                    sumaPuntajesQuimica += puntajes[i];
                    contadorQuimica++;
                }
            }

            System.out.println("Promedio por curso:");
            if (contadorMatematicas > 0) {
                double promedioMatematicas = sumaPuntajesMatematicas / contadorMatematicas;
                System.out.println("Matematicas: " + promedioMatematicas);
            }
            if (contadorFisica > 0) {
                double promedioFisica = sumaPuntajesFisica / contadorFisica;
                System.out.println("Fisica: " + promedioFisica);
            }
            if (contadorQuimica > 0) {
                double promedioQuimica = sumaPuntajesQuimica / contadorQuimica;
                System.out.println("Quimica: " + promedioQuimica);
            }
        }
    }

    private static void mostrarCantidadEstudiantesPorCurso() {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            int contadorMatematicas = 0;
            int contadorFisica = 0;
            int contadorQuimica = 0;

            for (int i = 0; i < cantidadEstudiantes; i++) {
                if (cursos[i].equalsIgnoreCase("Matematicas")) {
                    contadorMatematicas++;
                } else if (cursos[i].equalsIgnoreCase("Fisica")) {
                    contadorFisica++;
                } else if (cursos[i].equalsIgnoreCase("Quimica")) {
                    contadorQuimica++;
                }
            }

            System.out.println("Cantidad de estudiantes por curso:");
            System.out.println("Matematicas: " + contadorMatematicas);
            System.out.println("Fisica: " + contadorFisica);
            System.out.println("Quimica: " + contadorQuimica);
        }
    }
}

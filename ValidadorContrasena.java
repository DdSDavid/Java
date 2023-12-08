import java.util.Scanner;

public class ValidadorContrasena {
    public static void main(String[] srgs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        boolean cumpleLongitud = verificarLongitud(contrasena);
        boolean cumpleMayusculaMinuscula = verificadorMayusculaMinuscula(contrasena);
        boolean cumpleNumero = verificarNumero(contrasena);
        boolean cumpleCaracterEspecial = verificarCaracterEspecial(contrasena);

        if (cumpleLongitud && cumpleMayusculaMinuscula && cumpleNumero && cumpleCaracterEspecial) {
           System.out.println("¡Contraseña segura! Cumple con todos los criterios.");

        } else {
            System.out.println("Contraseña insegura. No cumple con todos los criterios.");
        }

        scanner.close();
    }
    
    public static boolean verificarLongitud(String contrasena) {
        return contrasena.length() >= 8;
    }
    
    public static boolean verificadorMayusculaMinuscula(String contrasena) {
        return !contrasena.equals(contrasena.toLowerCase()) && !contrasena.equals(contrasena.toUpperCase());
    }

    public static boolean verificarNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*()-_=+[{]};:',<.>/?";
        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

}

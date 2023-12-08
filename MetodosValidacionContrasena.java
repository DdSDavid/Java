// Validación de contraseña: En base al ejercicio que ya has realizado, crea un método "esSegura()" 
// que reciba por parámetro un "String" y devuelva un booleano para comprobar que la contraseña cumple
// con los criterios establecidos. También, crea los métodos: "tieneLongitudCorrecta()", "tieneMayuscula()",
// "tieneMinuscula()", "tieneNumero()" y "tieneCaracterEspecial()", que reciban por parámetro un "String" y
// devuelvan un "booleano".


public class MetodosValidacionContrasena {
    public static void main(String[] args) {
    String contrasena = "Abc123!@#";
    boolean esSegura = esSegura(contrasena);
    if (esSegura) {
        System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
    } else {
        System.out.println("Contraseña no segura. Debe tener al menos una letra mayúscula y un carácter especial.");
    }
}

public static boolean esSegura(String contrasena) {
    return tieneLongitudCorrecta(contrasena)
            && tieneMayuscula(contrasena)
            && tieneMinuscula(contrasena)
            && tieneNumero(contrasena)
            && tieneCaracterEspecial(contrasena);
}

public static boolean tieneLongitudCorrecta(String contrasena) {
    return contrasena.length() >= 8;
}

public static boolean tieneMayuscula(String contrasena) {
    return contrasena.matches(".*[A-Z].*");
}

public static boolean tieneMinuscula(String contrasena) {
    return contrasena.matches(".*[a-z].*");
}

public static boolean tieneNumero(String contrasena) {
    return contrasena.matches(".*\\d.*");
}

public static boolean tieneCaracterEspecial(String contrasena) {
    return contrasena.matches(".*[!@#$%^&*()].*");
}
}

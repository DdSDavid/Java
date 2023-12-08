// Incluyendo el uso de arrays, bucles for, while, do-while, clase Arrays y envoltura (wrappers).

// Generador de contraseñas: Desarrollar un programa en Java que genere una contraseña aleatoria. 
// Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. 
// La contraseña deberá ser almacenada en un arreglo de Character.

//     Para la generación de la contraseña, utilice un bucle for que repita la operación tantas veces como la 
//     longitud de la contraseña que haya especificado el usuario.

//     Para comprobar que la contraseña generada contiene al menos una letra mayúscula, una letra minúscula y
//     un dígito, utilice bucles do-while y while con los métodos isUpperCase, isLowerCase y isDigit de la clase
//     Character.

//     Finalmente, convierta el arreglo de caracteres en un String con un for  y luego imprima la contraseña 
//     generada en la consola.

import java.util.Random;

public class GeneradorContraseñas {
    public static void main(String[] args) {
        int longitudContraseña = 8; // Longitud de la contraseña

        // Definir los caracteres permitidos para la contraseña
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Crear un arreglo de caracteres para almacenar la contraseña
        Character[] contraseña = new Character[longitudContraseña];

        // Generar la contraseña aleatoria
        Random random = new Random();
        for (int i = 0; i < longitudContraseña; i++) {
            int indiceCaracter = random.nextInt(caracteresPermitidos.length());
            contraseña[i] = caracteresPermitidos.charAt(indiceCaracter);
        }

        // Comprobar que la contraseña contiene al menos una letra mayúscula, una letra minúscula y un dígito
        boolean contieneMayuscula = false;
        boolean contieneMinuscula = false;
        boolean contieneDigito = false;

        int i = 0;
        do {
            if (Character.isUpperCase(contraseña[i])) {
                contieneMayuscula = true;
            } else if (Character.isLowerCase(contraseña[i])) {
                contieneMinuscula = true;
            } else if (Character.isDigit(contraseña[i])) {
                contieneDigito = true;
            }
            i++;
        } while (i < longitudContraseña && !(contieneMayuscula && contieneMinuscula && contieneDigito));

        // Si la contraseña no cumple los requisitos, generar una nueva contraseña
        while (!(contieneMayuscula && contieneMinuscula && contieneDigito)) {
            for (int j = 0; j < longitudContraseña; j++) {
                int indiceCaracter = random.nextInt(caracteresPermitidos.length());
                contraseña[j] = caracteresPermitidos.charAt(indiceCaracter);
            }

            i = 0;
            contieneMayuscula = false;
            contieneMinuscula = false;
            contieneDigito = false;

            do {
                if (Character.isUpperCase(contraseña[i])) {
                    contieneMayuscula = true;
                } else if (Character.isLowerCase(contraseña[i])) {
                    contieneMinuscula = true;
                } else if (Character.isDigit(contraseña[i])) {
                    contieneDigito = true;
                }
                i++;
            } while (i < longitudContraseña && !(contieneMayuscula && contieneMinuscula && contieneDigito));
        }

        // Convertir el arreglo de caracteres en un String
        StringBuilder contraseñaString = new StringBuilder();
        for (Character c : contraseña) {
            contraseñaString.append(c);
        }

        // Imprimir la contraseña generada
        System.out.println("Contraseña generada: " + contraseñaString.toString());
    }
}
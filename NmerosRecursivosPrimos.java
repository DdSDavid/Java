// Números primos y recursividad: Crea un método llamado "esPrimo()" que reciba por parámetro un "int" y devuelva un valor booleano
//  que verifique si el número es primo o no. Luego, intenta modificar la lógica para resolverlo utilizando recursividad.


public class NmerosRecursivosPrimos {
    public static void main(String[] args) {
        int numero = 17;
        boolean esPrimo = esPrimo(numero);
        if (esPrimo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    
}

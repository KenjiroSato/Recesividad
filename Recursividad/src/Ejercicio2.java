public class Ejercicio2 {

    public static boolean esPalindromo(String palabra) {
        // Caso base: si la palabra tiene 0 o 1 letras, es palíndromo
        if (palabra.length() <= 1) {
            return true;
        }
        // Compara la primera y última letra
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        }
        // Llama recursivamente sin la primera y última letra
        return esPalindromo(palabra.substring(1, palabra.length() - 1));
    }

    public static void main(String[] args) {
        String palabra = "reconocer";
        System.out.println(esPalindromo(palabra)); // true
    }
}

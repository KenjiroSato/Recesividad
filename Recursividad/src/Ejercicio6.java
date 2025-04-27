public class Ejercicio6 {

    public static int contarCaracter(String cadena, char caracter) {
        if (cadena.isEmpty()) {
            return 0; // Caso base: cadena vacía
        }
        // Verifica si el primer carácter coincide y suma 1 si es así
        int conteo = (cadena.charAt(0) == caracter) ? 1 : 0;
        // Llama recursivamente con el resto de la cadena
        return conteo + contarCaracter(cadena.substring(1), caracter);
    }

    public static void main(String[] args) {
        // Ejemplo: contar cuántas veces aparece 'o' en "programacion"
        String cadena = "programacion";
        char caracter = 'o';
        System.out.println(contarCaracter(cadena, caracter)); // 2
    }
}

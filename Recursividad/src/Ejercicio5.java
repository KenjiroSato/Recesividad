public class Ejercicio5 {
    
    public static String invertirCadena(String cadena) {
        if (cadena.length() <= 1) {
            return cadena; // Caso base: una cadena vacía o de un solo carácter no cambia
        }
        // Caso recursivo: toma el último carácter y llama al método con el resto
        return cadena.charAt(cadena.length() - 1) + invertirCadena(cadena.substring(0, cadena.length() - 1));
    }

    public static void main(String[] args) {
        // invertir la cadena "hola"
        String cadena = "hola";
        System.out.println(invertirCadena(cadena)); // "aloh"
    }
}

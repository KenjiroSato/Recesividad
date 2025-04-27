public class Ejercicio3 {
    public static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero; // Caso base
        }
        return (numero % 10) + sumaDigitos(numero / 10); // Caso recursivo
    }

    public static void main(String[] args) {
        int numero = 1234;
        System.out.println(sumaDigitos(numero)); // resultado 10
    }
}

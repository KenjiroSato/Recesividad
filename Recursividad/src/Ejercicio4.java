public class Ejercicio4 {
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Caso base: el término 0 es 0
        }
        if (n == 1) {
            return 1; // Caso base: el término 1 es 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Caso recursivo
    }

    public static void main(String[] args) {
        // calcula el 6 término de la serie de Fibonacci
        int n = 6;
        System.out.println(fibonacci(n)); // 8
    }
}

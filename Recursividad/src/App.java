public class App {
    
    public static void imprimirDescendente(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        imprimirDescendente(n - 1);
    }

    public static void main(String[] args) {
        imprimirDescendente(100);
    }
}

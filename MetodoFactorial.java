public class MetodoFactorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void metodoFactorial(int n) {
        System.out.println("Factorial de la dimensión de la matriz (" + n + "): " + factorial(n));
    }
}

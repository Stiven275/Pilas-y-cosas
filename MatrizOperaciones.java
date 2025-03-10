import java.util.*;

public class MatrizOperaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la dimensión de la matriz
        System.out.print("Ingrese la dimensión de la matriz (n x n): ");
        int n = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[n][n];

        // Llenar la matriz con valores
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            System.out.print("Fila " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar el menú de opciones
        System.out.println("\nSeleccione una opción:");
        System.out.println("1: Método pila con la suma de las filas");
        System.out.println("2: Método cola con la suma de las columnas");
        System.out.println("3: Factorial de la dimensión de la matriz");
        System.out.println("4: Cola ordenada de mayor a menor");

        // Solicitar al usuario que seleccione una opción
        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();

        // Ejecutar la opción seleccionada
        switch (opcion) {
            case 1:
                MetodoPila.metodoPila(matriz);
                break;
            case 2:
                MetodoCola.metodoCola(matriz);
                break;
            case 3:
                MetodoFactorial.metodoFactorial(n);
                break;

            case 4:
                // Crear una cola con números de ejemplo
                Queue<Integer> cola = new LinkedList<>();
                for (int i = 1; i <= n; i++) {
                    cola.offer(i);
                }
                MetodoColaOrdenada.metodoColaOrdenada(cola);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

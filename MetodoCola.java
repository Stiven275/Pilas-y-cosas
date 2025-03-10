import java.util.LinkedList;
import java.util.Queue;

public class MetodoCola {

    public static void metodoCola(int[][] matriz) {
        int n = matriz.length;
        Queue<Integer> cola = new LinkedList<>();

        // Sumar las columnas
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            cola.offer(sumaColumna);
        }

        // Mostrar los resultados de la cola
        System.out.println("Suma de las columnas (cola): " + cola);
    }
}

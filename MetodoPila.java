import java.util.Stack;

public class MetodoPila {

    public static void metodoPila(int[][] matriz) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            pila.push(sumaFila);
        }

        System.out.println("Suma de las filas (pila): " + pila);
    }
}


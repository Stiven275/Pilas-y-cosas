import java.util.*;

public class MetodoColaOrdenada {

    public static void metodoColaOrdenada(Queue<Integer> cola) {
        // Convertimos la cola en una lista
        List<Integer> lista = new ArrayList<>(cola);
        // Ordenamos de mayor a menor
        lista.sort(Comparator.reverseOrder());

        // Vaciamos la cola original
        cola.clear();

        // Reinsertamos los elementos ordenados en la cola
        cola.addAll(lista);

        System.out.println("Cola ordenada de mayor a menor: " + cola);
    }
}

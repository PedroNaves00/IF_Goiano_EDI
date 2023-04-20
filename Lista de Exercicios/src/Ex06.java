import java.util.*;
public class Ex06 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        // Sorteia 1000 números positivos e adiciona na fila
        for (int i = 0; i < 1000; i++) {
            fila.add((int) (Math.random() * 1000));
        }
        // Sorteia 1000 números negativos e adiciona na fila
        for (int i = 0; i < 1000; i++) {
            fila.add((int) (Math.random() * -1000));
        }

        // Enquanto houver elementos na fila
        while (!fila.isEmpty()) {
            Integer numero = fila.remove();
            if (numero >= 0) {
                // Se o número for positivo, empilha na pilha
                pilha.push(numero);
            } else {
                // Se o número for negativo e a pilha não estiver vazia, desempilha e imprime
                if (!pilha.isEmpty()) {
                    Integer topo = pilha.pop();
                    System.out.println("Topo da pilha: " + topo);
                }
            }
        }
    }
}

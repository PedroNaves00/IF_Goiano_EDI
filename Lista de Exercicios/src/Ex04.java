import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Ex04 {
    public static Queue<Integer> inverteFila(Queue<Integer> fila) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 100; i++) {
            stack.push(fila.remove());
        }
        while (!stack.isEmpty()) {
            fila.add(stack.pop());
        }
        return fila;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Queue<Integer> f1 = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(101);
            f1.add(numero);
        }
        System.out.println(f1);
        System.out.println(inverteFila(f1));

    }
}

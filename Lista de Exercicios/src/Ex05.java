import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Ex05 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(0, 1001);
            if (!queue.contains(num)) queue.add(num);
            else stack.add(num);
        }
        System.out.println(queue);
        System.out.println(stack);
    }
}

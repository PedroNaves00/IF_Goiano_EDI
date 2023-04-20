import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Ex07 {
    public static Queue inverte(Queue queue) {
        Stack stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
    }
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(1, 30);
            queue.add(num);
        }
        System.out.println(queue.size());
        System.out.println(queue);
        System.out.println(inverte(queue));
    }
}

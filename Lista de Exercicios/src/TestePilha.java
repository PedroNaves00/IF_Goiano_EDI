import java.util.Random;
import java.util.Stack;

public class TestePilha {
        public static void main(String[] args) {
            Random random = new Random();
            Stack<Object> n = new Stack<>();
            Stack<Object> p = new Stack<>();

            for (int i = 0; i < 1000; i++) {
                int num = random.nextInt(-100, 100);
                if (num > 0){
                    p.push(num);
                } else if (num < 0) {
                    n.push(num);
                } else {
                    System.out.println("Numero da pilha n: "+n.pop());
                    System.out.println("Numero da pilha p: "+p.pop());
                }
            }
        }
}

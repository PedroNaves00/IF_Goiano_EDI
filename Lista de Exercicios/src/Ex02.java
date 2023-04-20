import java.util.Stack;
public class Ex02 {
        public static void removeItem(Stack<Integer> pilha, int c) {
            Stack<Integer> aux = new Stack<>();

            // Remove todos os elementos da pilha até encontrar o item com chave c
            while (!pilha.isEmpty()) {
                int item = pilha.pop();
                if (item == c) {
                    break;
                }
                aux.push(item);
            }
            // Remove o item com chave c da pilha
            pilha.pop();

            // Empilha os elementos removidos de volta na pilha original
            while (!aux.isEmpty()) {
                pilha.push(aux.pop());
            }
        }
        public static void main(String[] args) {
            Stack<Integer> pilha = new Stack<>();
            pilha.push(1);
            pilha.push(2);
            pilha.push(3);
            pilha.push(4);

            System.out.println("Pilha original: " + pilha);

            removeItem(pilha, 2);

            System.out.println("Pilha após remoção do item com chave 2: " + pilha);
        }
    }

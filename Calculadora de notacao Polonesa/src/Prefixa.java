import java.util.Stack;
public class Prefixa {
    Prefixa(){

    }

    public static int calcularPrefixa(String expressaoPrefixa) {
        Stack<Integer> operandos = new Stack<>();

        String[] tokens = expressaoPrefixa.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (token.equals("+")) {
                int op1 = operandos.pop();
                int op2 = operandos.pop();
                operandos.push(op1 + op2);
            } else if (token.equals("-")) {
                int op1 = operandos.pop();
                int op2 = operandos.pop();
                operandos.push(op1 - op2);
            } else if (token.equals("*")) {
                int op1 = operandos.pop();
                int op2 = operandos.pop();
                operandos.push(op1 * op2);
            } else if (token.equals("/")) {
                int op1 = operandos.pop();
                int op2 = operandos.pop();
                operandos.push(op1 / op2);
            } else {
                int operando = Integer.parseInt(token);
                operandos.push(operando);
            }
        }

        if (operandos.isEmpty()) {
            throw new IllegalArgumentException("Expressão prefixa inválida: faltam operandos");
        }

        return operandos.pop();
    }

    public static String convertePrefixaInfixa(String prefixa) {
        Stack<String> stack = new Stack<String>();
        String[] tokens = prefixa.split("\\s+"); // divide a string prefixa em tokens

        for (int i = tokens.length - 1; i >= 0; i--) { // percorre os tokens da direita para a esquerda
            String token = tokens[i];
            if (token.matches("\\d+")) { // se o token for um número, empilha
                stack.push(token);
            } else { // se o token for um operador, desempilha dois números e concatena em uma expressão infixa
                String num2 = stack.pop();
                String num1 = stack.pop();
                String infixa = "(" + num1 + " " + token + " " + num2 + ")";
                stack.push(infixa); // empilha a expressão infixa resultante
            }
        }
        return stack.pop(); // a última expressão infixa na pilha é a expressão completa
    }

    public static String convertePrefixaPosfixa(String prefixa) {
        Stack<String> stack = new Stack<String>();
        String[] tokens = prefixa.split("\\s+"); // divide a string prefixa em tokens

        for (int i = tokens.length - 1; i >= 0; i--) { // percorre os tokens da direita para a esquerda
            String token = tokens[i];
            if (token.matches("\\d+")) { // se o token for um número, empilha
                stack.push(token);
            } else { // se o token for um operador, desempilha dois números e concatena em uma expressão posfixa
                String num2 = stack.pop();
                String num1 = stack.pop();
                String posfixa = num1 + " " + num2 + " " + token;
                stack.push(posfixa); // empilha a expressão posfixa resultante
            }
        }
        return stack.pop(); // a última expressão posfixa na pilha é a expressão completa
    }


}

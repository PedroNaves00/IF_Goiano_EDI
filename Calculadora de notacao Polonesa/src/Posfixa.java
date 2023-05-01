import java.util.Stack;
public class Posfixa {
    Posfixa() {
    }
    public static double calcularPosfixa(String expressao) {
        Stack<Double> pilha = new Stack<>(); // criando uma pilha para armazenar os valores

        for (int i = 0; i < expressao.length(); i++) { // percorrendo a expressão
            char c = expressao.charAt(i);

            if (Character.isDigit(c)) { // se o caractere é um dígito, empilha na pilha
                pilha.push(Double.parseDouble(Character.toString(c)));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') { // se o caractere é um operador, desempilha dois valores da pilha e realiza a operação
                if (pilha.size() < 2) { // verifica se há pelo menos dois elementos na pilha
                    throw new IllegalArgumentException("Expressão inválida: número insuficiente de operandos.");
                }

                double a = pilha.pop();
                double b = pilha.pop();

                switch (c) {
                    case '+':
                        pilha.push(b + a);
                        break;
                    case '-':
                        pilha.push(b - a);
                        break;
                    case '*':
                        pilha.push(b * a);
                        break;
                    case '/':
                        pilha.push(b / a);
                        break;
                    default: // se o caractere não é um operador válido, lança uma exceção
                        throw new IllegalArgumentException("Expressão inválida: operador inválido.");
                }
            }
        }

        if (pilha.size() != 1) { // verifica se sobrou exatamente um elemento na pilha (o resultado final)
            throw new IllegalArgumentException("Expressão inválida: número inválido de operandos.");
        }

        return pilha.pop(); // o resultado final é o valor restante na pilha
    }

    public static String convertePosfixaPrefixa(String expressao) {
        Stack<String> pilha = new Stack<>(); // criando uma pilha para armazenar os valores

        for (int i = 0; i < expressao.length(); i++) { // percorrendo a expressão
            char c = expressao.charAt(i);

            if (Character.isDigit(c)) { // se o caractere é um dígito, empilha na pilha
                pilha.push(Character.toString(c));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') { // se o caractere é um operador, desempilha dois valores da pilha e monta uma nova expressão com o operador e os dois valores
                if (pilha.size() < 2) { // verifica se há pelo menos dois elementos na pilha
                    throw new IllegalArgumentException("Expressão inválida: número insuficiente de operandos.");
                }

                String a = pilha.pop();
                String b = pilha.pop();

                String novaExpressao = c + b + a; // monta a nova expressão com o operador e os dois valores
                pilha.push(novaExpressao); // empilha a nova expressão na pilha
            }
        }

        if (pilha.size() != 1) { // verifica se sobrou exatamente um elemento na pilha (a expressão prefixa resultante)
            throw new IllegalArgumentException("Expressão inválida: número inválido de operandos.");
        }

        return pilha.pop(); // a expressão prefixa resultante é o valor restante na pilha
    }

    public static String convertePosfixaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>(); // criando uma pilha para armazenar os valores

        for (int i = 0; i < expressao.length(); i++) { // percorrendo a expressão
            char c = expressao.charAt(i);

            if (Character.isDigit(c)) { // se o caractere é um dígito, empilha na pilha
                pilha.push(Character.toString(c));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') { // se o caractere é um operador, desempilha dois valores da pilha e monta uma nova expressão com os dois valores e o operador
                if (pilha.size() < 2) { // verifica se há pelo menos dois elementos na pilha
                    throw new IllegalArgumentException("Expressão inválida: número insuficiente de operandos.");
                }

                String a = pilha.pop();
                String b = pilha.pop();

                String novaExpressao = "(" + b + " " + c + " " + a + ")"; // monta a nova expressão com os dois valores e o operador
                pilha.push(novaExpressao); // empilha a nova expressão na pilha
            }
        }

        if (pilha.size() != 1) { // verifica se sobrou exatamente um elemento na pilha (a expressão infixa resultante)
            throw new IllegalArgumentException("Expressão inválida: número inválido de operandos.");
        }

        return pilha.pop(); // a expressão infixa resultante é o valor restante na pilha
    }

}

import java.util.Stack;

public class Infixa {
    public Infixa() {
    }

    public static int calcularPrecedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
    public static int calcularInfixa(String expressao) {
        Stack<Integer> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;

                while (i < expressao.length() && Character.isDigit(expressao.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(expressao.charAt(i));
                    i++;
                }
                numeros.push(num);
                i--;
            } else if (c == '(') {
                operadores.push(c);
            } else if (c == ')') {
                while (operadores.peek() != '(') {
                    int resultadoParcial = calcular(operadores.pop(), numeros.pop(), numeros.pop());
                    numeros.push(resultadoParcial);
                }

                operadores.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operadores.isEmpty() && calcularPrecedencia(operadores.peek()) >= calcularPrecedencia(c)) {
                    int resultadoParcial = calcular(operadores.pop(), numeros.pop(), numeros.pop());
                    numeros.push(resultadoParcial);
                }

                operadores.push(c);
            }
        }

        while (!operadores.isEmpty()) {
            int resultadoParcial = calcular(operadores.pop(), numeros.pop(), numeros.pop());
            numeros.push(resultadoParcial);
        }

        return numeros.pop();
    }

    private static int calcular(char operador, int b, int a) {
        switch (operador) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

    public static String converteInfixaPrefixa(String expressao) {
        Stack<Character> operadores = new Stack<>();
        Stack<String> operandos = new Stack<>();
        StringBuilder expressaoPrefixa = new StringBuilder();

        // Varre sobre a expressão infixa de trás para frente
        for (int i = expressao.length() - 1; i >= 0; i--) {
            char c = expressao.charAt(i);

            // Se o caractere é um dígito, adiciona o número à pilha de operandos
            if (Character.isDigit(c)) {
                int num = 0;
                // Continua lendo os dígitos enquanto houver mais números
                while (i >= 0 && Character.isDigit(expressao.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(expressao.charAt(i));
                    i--;
                }
                // Adiciona o número convertido em string à pilha de operandos
                operandos.push(Integer.toString(num));
                i++;
            }
            // Se o caractere é um parêntese de fechamento, adiciona-o à pilha de operadores
            else if (c == ')') {
                operadores.push(c);
            }
            // Se o caractere é um parêntese de abertura, desempilha operadores e operandos até encontrar o parêntese de fechamento correspondente
            else if (c == '(') {
                while (operadores.peek() != ')') {
                    // Desempilha dois operandos e um operador, e adiciona a expressão resultante à pilha de operandos
                    String operando1 = operandos.pop();
                    String operando2 = operandos.pop();
                    char operador = operadores.pop();

                    String expressaoResultante = operador + operando1 + operando2;
                    operandos.push(expressaoResultante);
                }

                // Desempilha o parêntese de fechamento
                operadores.pop();
            }
            // Se o caractere é um operador, desempilha operadores e operandos até encontrar um operador com precedência menor ou igual
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operadores.isEmpty() && calcularPrecedencia(operadores.peek()) >= calcularPrecedencia(c)) {
                    // Desempilha dois operandos e um operador, e adiciona a expressão resultante à pilha de operandos
                    String operando1 = operandos.pop();
                    String operando2 = operandos.pop();
                    char operador = operadores.pop();

                    String expressaoResultante = operador + operando1 + operando2;
                    operandos.push(expressaoResultante);
                }

                // Empilha o operador atual
                operadores.push(c);
            }
        }

        // Desempilha operadores e operandos até esvaziar a pilha de operadores
        while (!operadores.isEmpty()) {
            String operando1 = operandos.pop();
            String operando2 = operandos.pop();
            char operador = operadores.pop();

            String expressaoResultante = operador + operando1 + operando2;
            operandos.push(expressaoResultante);
        }
        // A expressão resultante é o único elemento na pilha de operandos
        expressaoPrefixa.append(operandos.pop());
        // Inverte a ordem dos caracteres na expressão resultante
        return expressaoPrefixa.reverse().toString();
    }

    public static String converteInfixaPosfixa(String expressao) {
        Stack<Character> operadores = new Stack<>();
        StringBuilder expressaoPosfixa = new StringBuilder();

        // Itera sobre cada caractere da expressão infixa
        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            // Se o caractere é um dígito, adiciona o número à expressão posfixa
            if (Character.isDigit(c)) {
                int num = 0;
                // Continua lendo os dígitos enquanto houver mais números
                while (i < expressao.length() && Character.isDigit(expressao.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(expressao.charAt(i));
                    i++;
                }

                // Adiciona o número à expressão posfixa e volta para o caractere anterior
                expressaoPosfixa.append(num);
                i--;
            }
            // Se o caractere é um parêntese de abertura, adiciona-o à pilha de operadores
            else if (c == '(') {
                operadores.push(c);
            }
            // Se o caractere é um parêntese de fechamento, desempilha operadores e adiciona à expressão posfixa até encontrar o parêntese de abertura correspondente
            else if (c == ')') {
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    expressaoPosfixa.append(operadores.pop());
                }

                // Remove o parêntese de abertura da pilha de operadores
                if (!operadores.isEmpty() && operadores.peek() == '(') {
                    operadores.pop();
                }
            }
            // Se o caractere é um operador, desempilha operadores com precedência maior ou igual e adiciona à expressão posfixa
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operadores.isEmpty() && calcularPrecedencia(operadores.peek()) >= calcularPrecedencia(c)) {
                    expressaoPosfixa.append(operadores.pop());
                }

                // Empilha o operador atual
                operadores.push(c);
            }
        }

        // Desempilha operadores restantes e adiciona à expressão posfixa
        while (!operadores.isEmpty()) {
            expressaoPosfixa.append(operadores.pop());
        }
        return expressaoPosfixa.toString();
    }
}

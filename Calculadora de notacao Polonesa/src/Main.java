import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Infixa infixa = new Infixa();
        Prefixa prefixa = new Prefixa();
        Posfixa posfixa = new Posfixa();

        double result = 0;

        System.out.print("Digite a expressão: ");
        String expressao = sc.nextLine();

        System.out.print("Digite o tipo de notação (1-infixa, 2-prefixa, 3-posfixa): ");

        int tipoNotacao = sc.nextInt();

        switch (tipoNotacao) {
            case 1:
                result = infixa.calcularInfixa(expressao);
                System.out.println("Expressão infixa: " + expressao);
                System.out.println("Expressão prefixa: " + infixa.converteInfixaPrefixa(expressao));
                System.out.println("Expressão posfixa: " + infixa.converteInfixaPosfixa(expressao));
                break;
            case 2:
                result = prefixa.calcularPrefixa(expressao);
                System.out.println("Expressão prefixa: " + expressao);
                System.out.println("Expressão infixa: " + prefixa.convertePrefixaInfixa(expressao));
                System.out.println("Expressão posfixa: " + prefixa.convertePrefixaPosfixa(expressao));
                break;
            case 3:
                result = posfixa.calcularPosfixa(expressao);
                System.out.println("Expressão posfixa: " + expressao);
                System.out.println("Expressão prefixa: " + posfixa.convertePosfixaPrefixa(expressao));
                System.out.println("Expressão posfixa: " + posfixa.convertePosfixaInfixa(expressao));
                break;
        }
        System.out.println("Resultado: " + result);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Pilha parenteses = new Pilha();
        Pilha colchetes = new Pilha();
        Pilha chaves = new Pilha();
        boolean op = true;

        System.out.println("Digite a expressão:");
        String palavra = scan.next();
        String vetor[] = palavra.split("");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals("(")) {
                parenteses.empilhar(vetor[i]);
            }
            if (vetor[i].equals(")")) {
                if (parenteses.estaVazia()) {
                    op = false;
                    break;
                } else
                    parenteses.desempilhar();
            }

            if (vetor[i].equals("[")) {
                colchetes.empilhar(vetor[i]);
            }
            if (vetor[i].equals("]")) {
                if (colchetes.estaVazia()) {
                    op = false;
                    break;
                } else
                    colchetes.desempilhar();
            }

            if (vetor[i].equals("{")) {
                chaves.empilhar(vetor[i]);
            }
            if (vetor[i].equals("}")) {
                if (chaves.estaVazia()) {
                    op = false;
                    break;
                } else
                    chaves.desempilhar();
            }
        }
        if (chaves.estaVazia()) {
            if (parenteses.estaVazia() && colchetes.estaVazia() && chaves.estaVazia() && op) {
                System.out.println("A expressão esta correta");
            } else {
                System.out.println("A expressão não esta correta");
            }
        }
    }
}
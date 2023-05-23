import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        Pilha pilha3 = new Pilha();

        // Fase 1
        for (int i = 0; i < 101; i++) {
            int num = random.nextInt(1, 10);
            if (num <= 3) {
                pilha1.empilhar(num);
            } else if (num <= 6) {
                pilha2.empilhar(num);
            } else pilha3.empilhar(num);
        }

        System.out.print("Pilha 1: ");
        pilha1.imprimirPilha();
        System.out.print("Pilha 2: ");
        pilha2.imprimirPilha();
        System.out.print("Pilha 3: ");
        pilha3.imprimirPilha();

        // Fase 2
        for (int i = 0; i < 101; i++) {
            int num = random.nextInt(1, 4);
            if (num == 1) {
                if (pilha2.estaVazia()) {
                    System.out.println("Programa foi encerrado porque a pilha 2 está vazia");
                    break;
                } else if (pilha3.estaVazia()) {
                    System.out.println("Programa foi encerrado porque a pilha 3 está vazia");
                    break;
                }
                System.out.println("Empilhando os numeros " + pilha2.getTopo() + " e " + pilha3.getTopo() + " na pilha 1");
                pilha1.empilhar(pilha2.getTopo());
                pilha2.desempilhar();
                pilha1.empilhar(pilha3.getTopo());
                pilha3.desempilhar();
            } else if (num == 2) {
                if (pilha1.estaVazia()) {
                    System.out.println("Programa foi encerrado porque a pilha 1 está vazia");
                    break;
                } else if (pilha3.estaVazia()) {
                    System.out.println("Programa foi encerrado porque a pilha 3 está vazia");
                    break;
                }
                System.out.println("Empilhando os numeros " + pilha1.getTopo() + " e " + pilha2.getTopo() + " na pilha 2");
                pilha2.empilhar(pilha1.getTopo());
                pilha1.desempilhar();
                pilha2.empilhar(pilha3.getTopo());
                pilha3.desempilhar();
            } else {
                if (pilha1.estaVazia()) {
                    System.out.println("Programa foi encerrado porque a pilha 1 está vazia");
                    break;
                } else if (pilha2.estaVazia()) {
                    System.out.println("Programa foi encerrado porque a pilha 2 está vazia");
                    break;
                }
                System.out.println("Empilhando os numeros " + pilha1.getTopo() + " e " + pilha2.getTopo() + " na pilha 3");
                pilha3.empilhar(pilha1.getTopo());
                pilha1.desempilhar();
                pilha3.empilhar(pilha2.getTopo());
                pilha2.desempilhar();
            }
            if (i == 100) System.out.println("Programa encerrado por ter sorteado os 100 números");
        }
        System.out.print("Pilha 1: ");
        pilha1.imprimirPilha();
        System.out.print("Pilha 2: ");
        pilha2.imprimirPilha();
        System.out.print("Pilha 3: ");
        pilha3.imprimirPilha();
    }
}


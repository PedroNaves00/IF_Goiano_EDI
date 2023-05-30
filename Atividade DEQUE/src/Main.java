import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criação do deque para armazenar as pessoas a serem atendidas
        Deque<Pessoa> filaAtendimento = new Deque<>();

        // Criação do deque para armazenar as pessoas não atendidas
        Deque<Pessoa> filaNaoAtendidas = new Deque<>();

        // Gerar aleatoriamente os dados das pessoas
        Random random = new Random();
        for (int i = 1; i <= 200; i++) {
            String id = "P" + i;
            int idade = random.nextInt(80) + 1; // Idade entre 1 e 80
            boolean gestante = random.nextBoolean();
            boolean lactante = random.nextBoolean();
            boolean necessidadeEspecial = random.nextBoolean();
            int prioridade = 0;

            if (idade > 60) {
                prioridade = 1;
            } else if (necessidadeEspecial) {
                prioridade = 2;
            } else if (gestante || lactante) {
                prioridade = 3;
            }

            Pessoa pessoa = new Pessoa(id, idade, gestante, lactante, necessidadeEspecial, prioridade);

            // Adicionar a pessoa à fila de atendimento
            filaAtendimento.addRear(pessoa);
        }

        // Realizar os atendimentos
        int pessoasAtendidas = 0;
        int grupo = 1;

        while (pessoasAtendidas < 100) {
            int numeroPessoasAtendimento = Math.min(grupo, filaAtendimento.size());

            System.out.println("Atendendo grupo " + grupo);

            // Atender as pessoas do grupo atual
            for (int i = 0; i < numeroPessoasAtendimento; i++) {
                if (pessoasAtendidas < 100) {
                    Pessoa pessoaAtendida = filaAtendimento.removeFront();
                    System.out.println("Pessoa: " + pessoaAtendida.getId() + "- Prioridade: " + pessoaAtendida.getPrioridade());
                    pessoasAtendidas++;
                }
            }
            grupo++;
        }
            // Remover as pessoas não atendidas do grupo atual e adicionar à fila de não atendidas
            for (int i = 0; i < filaAtendimento.size(); i++) {
                if (!filaAtendimento.isEmpty()) {
                    Pessoa pessoaNaoAtendida = filaAtendimento.removeFront();
                    filaNaoAtendidas.addRear(pessoaNaoAtendida);
            }
        }

        // Mostrar as pessoas que não foram atendidas
        System.out.println("\n--- Pessoas não atendidas ---");
        while (!filaNaoAtendidas.isEmpty()) {
            Pessoa pessoaNaoAtendida = filaNaoAtendidas.removeFront();
            System.out.println("Pessoa " + pessoaNaoAtendida.getId() + " - Prioridade: " + pessoaNaoAtendida.getPrioridade());
        }
    }
}

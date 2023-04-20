package Ex03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Avioes> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean finalizar = false;
        while (!finalizar){
            System.out.println("Controle de pista de aviões:\n" +
                    "1- Listar o número de avioes\n" +
                    "2- Autorizar a decolagem do primeiro avião da fila\n" +
                    "3- Adicionar um aviao a fila de espera\n" +
                    "4- Listar todos os avioes na fila de espera\n" +
                    "5- Listar as caracteristicas do primeiro aviao da fila\n" +
                    "6- Finalizar\n");

            System.out.println("Opcao: ");
            int opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.print("Numero de avioes aguardando na fila de decolagem: ");
                System.out.println(queue.size());
            } else if (opcao == 2) {
                System.out.println("Autorizando a decolagem do primeiro aviao da fila: ");
                queue.remove();
            } else if (opcao == 3) {
                System.out.println("Adicionando um aviao a lista de espera: ");
                System.out.println("Nome do aviao: ");
                String nome = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Numero do aviao: ");
                int numero = scanner.nextInt();
                queue.add(new Avioes(nome, numero));
            } else if (opcao == 4) {
                System.out.println("Avioes da lista de espera: ");
                for (int i = 0; i < queue.size(); i++) {
                    Avioes aviao = queue.poll();
                    System.out.println("Nome: "+ aviao.getNome());
                }
            } else if (opcao == 5) {
                System.out.println("Caracteristicas do primeiro aviao da fila: ");
                    System.out.println("Primeiro Aviao: ");
                    scanner.nextLine();
                    Avioes aviao = queue.remove();
                    System.out.println("Nome: "+ aviao.getNome());
                    System.out.println("Numero: "+ aviao.getNumero());

            } else if (opcao == 6) {
                finalizar = true;
            }else System.out.println("Opcao incorreta, tente novamente!");
        }
    }
    }


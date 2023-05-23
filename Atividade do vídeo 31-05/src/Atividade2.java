import java.util.LinkedList;
import java.util.Random;

public class Atividade2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] sequence = {1, 15, 16, 25, 32, 36};
        int totOrderSequence = 0;
        int totNoOrderSequence = 0;

        Random random = new Random();

        // Gerando os números
        for (int i = 0; i < 51000000; i++) {
            int num = random.nextInt(1,20);
            list.add(num);
        }
        System.out.println(list);
        // Percorrendo a lista em ordem direta
        System.out.println("Iterando em sequencia direta:");
        for (int i = 0; i <= list.size() - sequence.length; i++) {
            boolean sequenceFound = true;
            for (int j = 0; j < sequence.length; j++) {
                if (list.get(i+j) != sequence[j]) {
                    sequenceFound = false;
                    break;
                }
            }
            if (sequenceFound) {
                totOrderSequence++;
                for (int j = 0; j < sequence.length; j++) {
                    System.out.println("Numero "+ sequence[j] + " encotrado na posiçao "+ (i+j));
                }
            }
        } System.out.println("Sequencia encontrada " + totOrderSequence + " vezes");


        // Percorrendo a lista em ordem inversa
        System.out.println("\nIterando em sequencia inversa:");
        int totSequenceFound=0;
        for (int i = list.size() - 1; i >= sequence.length - 1; i--) {
            boolean sequenceFound = true;
            for (int j = 0; j < sequence.length; j++) {
                if (list.get(i - j) != sequence[j]) {
                    sequenceFound = false;
                    break;
                }
            }
            if (sequenceFound) {
                totNoOrderSequence++;
                for (int j = 0; j < sequence.length; j++) {
                    System.out.println("Numero "+ sequence[j] + " encotrado na posiçao "+ (i+j));
                }
            }
        }System.out.println("Sequencia encontrada " + totNoOrderSequence + " vezes");
        }
    }

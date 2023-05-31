import java.util.LinkedList;
import java.util.Random;
import java.util.Iterator;
public class Atividade02 {
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            int[] sequence = {1, 15, 16, 25, 32, 36};
            int totOrderSequence = 0;
            int totNoOrderSequence = 0;

            Random random = new Random();

            // Gerando os números
            for (int i = 0; i < 51000000; i++) {
                int num = random.nextInt(1, 20);
                list.add(num);
            }
            System.out.println(list);

            int sequenceLength = sequence.length;
            int maxIndex = list.size() - sequenceLength;

            // Percorrendo a lista em ordem direta
            System.out.println("Iterando em sequencia direta:");
            Iterator<Integer> iterator = list.iterator();
            int i = 0;

            while (iterator.hasNext() && i <= maxIndex) {
                boolean sequenceFound = true;
                int j = 0;
                while (sequenceFound && j < sequenceLength) {
                    int currentSequenceElement = sequence[j];
                    if (iterator.next() != currentSequenceElement) {
                        sequenceFound = false;
                    }
                    j++;
                }
                if (sequenceFound) {
                    totOrderSequence++;
                    for (int k = 0; k < sequenceLength; k++) {
                        System.out.println("Numero " + sequence[k] + " encontrado na posicao " + (i + k));
                    }
                }
                i++;
            }
            System.out.println("Sequencia encontrada " + totOrderSequence + " vezes");

            // Percorrendo a lista em ordem inversa
            System.out.println("\nIterando em sequencia inversa:");
            Iterator<Integer> reverseIterator = list.descendingIterator();
            i = list.size() - sequenceLength;
            while (i >= 0) {
                boolean sequenceFound = true;
                int j = 0;
                int currentElement = reverseIterator.next();
                while (sequenceFound && j < sequenceLength) {
                    int currentSequenceElement = sequence[j];
                    if (currentElement != currentSequenceElement) {
                        sequenceFound = false;
                    }
                    j++;
                }
                if (sequenceFound) {
                    totNoOrderSequence++;
                    for (int k = 0; k < sequenceLength; k++) {
                        System.out.println("Numero " + sequence[k] + " encontrado na posicao " + (i + k));
                    }
                }
                i--;
            }
            System.out.println("Sequencia encontrada " + totNoOrderSequence + " vezes");
        }
    }


